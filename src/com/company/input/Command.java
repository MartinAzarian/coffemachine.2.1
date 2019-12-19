package com.company.input;

public class Command {
    private DrinkType drink;
    private boolean spoon = false;
    private int sugar = 0;

    public DrinkType getDrink() {
        return drink;
    }

    public boolean isSpoon() {
        return spoon;
    }

    public void setSpoon(boolean spoon) {
        this.spoon = spoon;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setDrink(DrinkType drink) {

        this.drink = drink;
    }

    public boolean checkSugar(char[] array) {
        for (int i = 3; i >= 0; i--) {
            if ("0".equals(array[2])) {
                sugar = 0;
                spoon = false;
                return spoon;
            } else if ("1".equals(array[2])) {
                sugar = 1;
                spoon = true;
                return spoon;
            } else if ("2".equals(array[2])) {
                sugar = 2;
                spoon = true;
                return spoon;
            } else if ("3".equals(array[2])) {
                this.sugar = 3;
                spoon = true;
                return spoon;
            } else return spoon;
        }
        return spoon;
    }


}
