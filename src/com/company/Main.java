package com.company;

import com.company.input.Command;
import com.company.input.Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userComand = sc.nextLine;
        if(userComand.length > 3) {
          return 1;
        }
        char[] myComand = new char[3];
        for (int i = 0; i < 3; i++) {
            myComand[i] = userComand.charAt(i);
        }


        Converter converter = new Converter();
        Command command = converter.convertInputToCommand(userComand);

        command.getDrink();
    }
}
