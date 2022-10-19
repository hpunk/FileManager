package com.gaav.FileReceiver;

import com.gaav.FileReceiver.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileReceiverApplication.class, args);
	}

}
