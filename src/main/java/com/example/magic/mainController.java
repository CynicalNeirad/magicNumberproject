package com.example.magic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping(value = "/magicNumber" , method = RequestMethod.GET)
    public String magicNumber(
        @RequestParam("startNumber") int startNumber) {
        String storeNumbers = " ";
        int magicNumber = startNumber;
        do {
            storeNumbers = storeNumbers + " " + magicNumber + " ";
            if (magicNumber % 2 == 0) {
                magicNumber = (magicNumber / 2);
            } else {
                magicNumber = (3 * magicNumber) + 1;
            }
        } while (magicNumber != 1);
        return ("Your starting number: " + startNumber + "<br/>" + storeNumbers + " 1");
    }
}