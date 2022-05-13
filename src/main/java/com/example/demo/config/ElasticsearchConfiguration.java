package com.example.demo.config;

import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@RequiredArgsConstructor
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@EnableElasticsearchRepositories(basePackages = "com.techprimers.elastic.repository")
public class ElasticsearchConfiguration extends AbstractElasticsearchConfiguration {

//    private final ElasticsearchProperties elasticsearchProperties;

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost")
                .withConnectTimeout(1L)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }
}