package com.minhpham.image_processing_service;

import com.minhpham.image_processing_service.infrastructure.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ImageProcessingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageProcessingServiceApplication.class, args);
	}

}
