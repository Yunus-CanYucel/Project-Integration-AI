package se.iths.yunuscan.projectintegrationai.controller;


import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import se.iths.yunuscan.projectintegrationai.service.AIService;


@Controller
@RequestMapping("/")
public class HomeController {

    private final AIService aiService;

    public HomeController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    //@Response body används för att returnera texten direkt
    @ResponseBody
    public String prompt(@RequestParam String prompt) {
        return aiService.aiPrompt(prompt);
    }

}
