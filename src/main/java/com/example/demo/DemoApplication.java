package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController

public class DemoApplication {
    @GetMapping("/tests")
    public String test() {
        return "I am listening...";
    }

    @GetMapping("/")

    public String doTest() {
        return "Satish bhai party denge ";
    }

    @GetMapping("/hi")
    public String getTest() {
        return "hi";
    }

    @GetMapping("/add")

    public String doAdd(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s +  %s = %s", a, b, a + b);
    }

    @GetMapping("/sub")

    public String doSub(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s -  %s = %s", a, b, a - b);
    }

    @GetMapping("/mul")
    public String Mul(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s*%s=%s", a, b, a * b);
    }

    @GetMapping("/div")
    public String Div(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        return String.format("%s/%s=%s", a, b, a / b);
    }

    @GetMapping("/arr")

    public String arr(@RequestParam(value = "n", defaultValue = "0") int n) {
        String[] names = {"Virendra Sehwag", "Sachin Tendulkar", "Rahul Dravid", "Sourav Ganguly"};
        if (n < 1)
            return "Not found";
        if (n >= names.length)
            return "Not Found";
        return names[n - 1];
    }

    @GetMapping(value = {"/dosub", "/dosub/{a}"})
    public String App(@PathVariable Optional<Integer> a) {
        String[] names = {"Virendra Sehwag", "Sachin Tendulkar", "Rahul Dravid", "Sourav Ganguly"};
        int n = 0;
        if (a.isPresent()) {
            n = a.get();
        }
        if (n < 1)
            return "Not found";
        if (n >= names.length)
            return "Not Found";
        return names[n - 1];
    }

    @GetMapping(value = {"/doadd", "/doadd/{a}", "/doadd/{a}/{b}"})

    public String getBook(@PathVariable Optional<Integer> a, @PathVariable Optional<Integer> b) {
        int x = 0, y = 0;
        if (a.isPresent()) {
            x = a.get();
        }
        if (b.isPresent()) {
            y = b.get();
        }

        return String.format("%s+%s=%s", x, y, x + y);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }
}

