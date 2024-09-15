package br.com.upstyle.layout.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PerguntasViewController {


    @GetMapping("/perguntasview")
    public String perguntasum () {
        return "perguntasview";
    }


}
