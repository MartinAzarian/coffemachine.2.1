package com.company.input;

public class Converter {
    private Command comand = new Command();
    DrinkType drink;

    public Command convertInputToCommant(String input) {
        if (input == "t" || input == "T") {
            comand.setDrink(drink.TEA);
            return comand;
        } else if (input == "c" || input == "C") {
            comand.setDrink(drink.COFFE);
            return comand;
        } else return comand;
    }

}
