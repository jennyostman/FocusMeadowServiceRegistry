package exarb.fmserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FmserviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmserviceRegistryApplication.class, args);
	}

}
