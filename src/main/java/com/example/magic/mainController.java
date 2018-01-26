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
        String storeNumbers = " ";                                               /*Creates a string to add numbers to (gets published at end)*/
        int magicNumber = startNumber;                                           /*Stores the starting value for final output*/
        do {
            storeNumbers = storeNumbers + " " + magicNumber + " ";               /*Adds the current number to the string along with proper formatting*/
            if (magicNumber % 2 == 0) {                                          /*Checks if current number is even and divides that number by two if it is*/
                magicNumber = (magicNumber / 2);
            } else {                                                             /*if the number isn't even, then it must be odd and this is multiplied by 3 and then has one added to it.*/
                magicNumber = (3 * magicNumber) + 1;
            }
        } while (magicNumber != 1);                                              /*Closes out the loop when the current number is equal to 1*/
        return ("Your starting number: " + startNumber + "<br/>" + storeNumbers + " 1");  /*returns the string of numbers with correct formating, and adds one to the end of it as one ends the loop and is thus not added to the string*/
    }


}