package com.company.input;

import com.company.drink.Coffe;
import com.company.drink.Drink;
import com.company.drink.Tea;

import java.util.Scanner;

public class coffeMachine {
    private String order;

    public Drink makeDrink(Command command) {
        if (command.getDrink().equals("TEA")) {
            System.out.println("Input sughar");

            Scanner scanner = new Scanner(System.in);
            int sugharinput = scanner.nextInt();

            Tea tea = new Tea();
            tea.setSugar(sugharinput);
            return tea;
        } else {
            System.out.println("Input sughar");

            Coffe coffe = new Coffe();
            Scanner scanner = new Scanner(System.in);
            int sugharinput = scanner.nextInt();
            coffe.setSugar(sugharinput);
            return coffe;
        }
    }


}
