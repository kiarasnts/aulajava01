package br.com.accenture.customer.controller;

import br.com.accenture.customer.domain.CustomerModel;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;
import java.util.logging.Logger;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass().getName());

    @GetMapping
    public String index() {
        return "It Works!";
    }

    @GetMapping("/{name}")
    public String greetings(@PathVariable String name) {
        return String.format("Hello %s", name);
    }



    @PostMapping
    public CustomerModel save(@RequestBody @Valid CustomerModel model) {
        model.setCreatedAt(new Date());
        log.info(model.toString());
        return model;
    }




}