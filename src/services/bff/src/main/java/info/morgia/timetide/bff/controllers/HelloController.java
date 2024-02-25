package info.morgia.timetide.bff.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(produces = "application/json")
    public HelloResponseGetDto getHello() {
        return new HelloResponseGetDto("ok 2",1);
    }
}