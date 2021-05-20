package com.example.readquote;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
        @GetMapping("/")
        public ModelAndView showQuotation() throws Exception {
            ModelAndView modelAndView = new ModelAndView("quote");
            modelAndView.addObject("quote", ReadQuoteApplication.getQuote());
           return modelAndView;
        }
}
