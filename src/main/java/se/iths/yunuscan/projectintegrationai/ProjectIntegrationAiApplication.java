package se.iths.yunuscan.projectintegrationai;

import com.google.genai.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectIntegrationAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectIntegrationAiApplication.class, args);
    }
    Client client =new Client();
}
