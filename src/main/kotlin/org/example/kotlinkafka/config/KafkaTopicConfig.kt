package org.example.kotlinkafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig {

    @Bean
    fun topic1(): NewTopic? {
        return TopicBuilder.name("topic1").build()
    }
}
