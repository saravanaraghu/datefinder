package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String getDate(){
        LocalDate Now = LocalDate.now();
        LocalDate futureDate = Now.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String strDate = futureDate.format(format1);
        return strDate;
    }
}
