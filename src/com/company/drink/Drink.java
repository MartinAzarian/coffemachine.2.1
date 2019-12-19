package com.company.drink;

public abstract class Drink {
    private int sugar;
    private boolean spoon = false;

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        sugar = sugar;
    }
    public boolean checkAndGiveASpoon()
    {
        if (sugar == 0)
        {
            System.out.println("do put a spoon?");
            System.out.println("0-no");
            System.out.println("1-yes");
            int spoonImput=0;
            if(spoonImput == 1)
            {
                return spoon = true;
            }
            else return false;
        }
        else return spoon =true;
    }
}
