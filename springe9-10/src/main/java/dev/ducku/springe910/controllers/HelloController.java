package dev.ducku.springe910.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {


    @GetMapping("/headers")
    public String headers(HttpServletRequest request) {
        return request.getParameter("haha");
    }

    @PostMapping("/test/{name}")
    public String test(@PathVariable String name, @RequestHeader String status, @RequestHeader String age, @RequestHeader String haha, @RequestBody String body) {
        return name + " " + status + " " + age + " " + haha + " " + body;
    }
    /*
    * Bill single 18 hehe {
    "body": "this is a body"
    } result when  postman raw body is set to JSON*/
    /*
     * Bill single 18 hehe this is a body result when postman raw body is set to TEXT */

    @GetMapping("/all")
    public Map<String, String> all(@RequestHeader Map<String, String> headers) {
        return headers;
    }

    @GetMapping(value = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public byte[] pdf() {
        byte[] file = new byte[100]; //replace with pdf file here 😉
        return file;
    }
}
