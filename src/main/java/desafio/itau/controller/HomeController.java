package desafio.itau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api")
    public String apiRoot() {
        return "🚀 API funcionando!";
    }
}
