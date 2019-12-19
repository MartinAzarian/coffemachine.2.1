package com.company;

import com.company.input.Command;
import com.company.input.Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myComand = "";
        myComand = scan.nextLine();

        Converter converter = new Converter();
        Command command = converter.convertInputToCommant(myComand);

        command.getDrink();
    }
}
