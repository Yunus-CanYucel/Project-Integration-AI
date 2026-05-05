package se.iths.yunuscan.projectintegrationai.service;


import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.*;

import java.net.URL;

@Service
public class AIService {
    public String aiPrompt(String prompt) {
        Client client = new  Client();

        GenerateContentResponse response = client.models.generateContent(
                "gemini-3-flash-preview",
                prompt,
                null
        );
        return response.text();
    }
}
