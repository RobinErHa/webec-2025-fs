package ch.fhnw.webec.converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class TimeController {
    @GetMapping("time")
    public String time(Model model) {
        var time = LocalTime.now();
        model.addAttribute("time", time);
        return "time-view";
    }
}