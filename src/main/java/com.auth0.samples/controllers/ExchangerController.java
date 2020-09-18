package com.auth0.samples.controllers;

import com.auth0.samples.Currency;
import com.auth0.samples.Exchanger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")

// @adress
// localhost:8080/exchange?from=&to=&amount=

public class ExchangerController
{
    Exchanger exchanger = new Exchanger();

    @GetMapping
    public String exchange(@RequestParam Currency from,
                           @RequestParam Currency to,
                           @RequestParam int amount)
    {
        return amount + " " + from + " is " + exchanger.exchange(from, to, amount) + " " + to;
    }
}
