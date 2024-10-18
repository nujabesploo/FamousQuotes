package com.pluralsight;
import java.util.Scanner;
import java.io.*;
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the name of a story: ");
        String name = read.nextLine();

        switch(name)
        {
            case "goldilocks":
                try
                {

                    FileInputStream file = new FileInputStream("src/main/resources/goldilocks.txt");
                    Scanner in = new Scanner(file);

                    int count = 1;
                    while(in.hasNextLine())
                    {
                        System.out.println(count++ + "." + in.nextLine());

                    }
                    in.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
                break;
            case "hansel_and_gretel":
                System.out.println();
            case "mary_had_a_little_lamb":
                System.out.println();
        }

    }
}
