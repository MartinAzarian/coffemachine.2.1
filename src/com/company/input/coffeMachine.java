package com.company.input;

import com.company.drink.Coffe;
import com.company.drink.Drink;
import com.company.drink.Tea;

import java.util.Scanner;

public class coffeMachine {
    private String order;

    public Drink makeDrink(Command command) {
        if (command.getDrink().equals("TEA")) {
            command.getSugar();
            Tea tea = new Tea();
            return tea;
        } else {

            Coffe coffe = new Coffe();
            command.getSugar();
            return coffe;
        }
    }


}
