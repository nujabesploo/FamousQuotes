package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] conciseQuotes = {
                "Carpe diem.", // Seize the day.
                "Hakuna matata.", // No worries.
                "YOLO.", // You only live once.
                "Live life to the fullest.",
                "Dream big.",
                "Never give up.",
                "Believe in yourself.",
                "Stay positive.",
                "Be grateful.",
                "Make a difference."
        };


        String name_one = "yes";
        while (name_one.equalsIgnoreCase("yes")) {
            try {
                System.out.print("Please Enter a number between 1 and 10: ");
                int number = in.nextInt();
                in.nextLine();
                if (number < 10) {
                    System.out.println(conciseQuotes[number - 1]);
                }
            } catch (Exception e) {
                System.out.println("Error 101");
            }
            System.out.println("Please Re-enter Yes or No: ");
            name_one = in.nextLine();
        }
    }
}