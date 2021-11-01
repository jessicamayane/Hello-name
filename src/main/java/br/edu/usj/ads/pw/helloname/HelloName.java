package br.edu.usj.ads.pw.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller //vai receber requisições
public class HelloName {
    
    @PostMapping(value="helloName")
    public ModelAndView postHelloName( @RequestParam String nome) {
        ModelAndView modelAndView = new ModelAndView("hello-name");
        
        String mensagem = "olá, " + nome +"!!!";

        modelAndView.addObject("mensagem", mensagem);
        return modelAndView;
    }
    
}
