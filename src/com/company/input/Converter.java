package com.company.input;

public class Converter {
    private Command comand = new Command();
    DrinkType drink;

    public Command convertInputToCommand(String userComand) {
        char[] myComand = new char[3];
        for (int i = 0; i < 3; i++) {
            myComand[i] = userComand.charAt(i);
        }
        if ("t".equals(myComand[0]) || "T".equals(myComand[0])) {
            comand.setDrink(drink.TEA);
            comand.checkSugar(myComand);
            return comand;
        } else if ("c".equals(myComand[0]) || "C".equals(myComand[0])) {
            comand.setDrink(drink.COFFE);
            comand.checkSugar(myComand);
            return comand;
        }
        return comand;
    }

}
