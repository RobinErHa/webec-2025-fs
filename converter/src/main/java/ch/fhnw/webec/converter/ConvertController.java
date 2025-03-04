package ch.fhnw.webec.converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvertController {
    @GetMapping({"/convert", "/input"})
    public String convert(double inches, Model model){
        String converted = String.valueOf(inches *2.54);
        model.addAttribute("convert", converted);
        model.addAttribute("input", inches);
        return "converter-view";
    }
}
