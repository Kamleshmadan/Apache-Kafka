package net.Sprigboot.KafkaApache.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic kakfaTopic() {
		return TopicBuilder.name("Normalmsg")
				.build();
	}
	
	@Bean
	public NewTopic JsonkakfaTopic() {
		return TopicBuilder.name("JsonMsg")
				.build();
	}
}
