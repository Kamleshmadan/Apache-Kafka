package net.Sprigboot.KafkaApache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.Sprigboot.KafkaApache.kafka.KafkaProducer;
 
@RestController
@RequestMapping("/api/kafka")
public class MessageController {

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	private KafkaProducer kafkaProducer;
	
//	http://localhost:8020/api/kafka/publish?message=
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String massage){
		kafkaProducer.sendMessage(massage);
		return ResponseEntity.ok("message sent to the topic");
	}
}
