package com.example.magic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class mainController {

    @RequestMapping("/magicNumber")
    public String magicNumber() {
        String storeNumbers = " ";
        Integer startNumber = 0;
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please Input your number.");
        startNumber = numberInput.nextInt();
        int magicNumber = startNumber;
        do {
            storeNumbers = storeNumbers + " " + magicNumber + " ";
            if (magicNumber % 2 == 0) {
                magicNumber = (magicNumber/2);
            }else{
                magicNumber = (3*magicNumber)+1;
            }
        }while (magicNumber != 1);
        System.out.println(storeNumbers + " 1");
    return null;

    }
}