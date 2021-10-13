package com.softwareinstitute.training.orr.kyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean enterAgain = true;
        do {
            Scanner HeightScan = new Scanner(System.in);
            System.out.println("Enter Wall Height: ");
            double heightinput = HeightScan.nextDouble();

            Scanner WidthScan = new Scanner(System.in);
            System.out.println("Enter Wall width: ");
            double widthinput = WidthScan.nextDouble();

            String Height = HeightScan.nextLine();
            System.out.println("Wall Height is: " + heightinput);

            String Width = WidthScan.nextLine();
            System.out.println("Wall Width is: " + widthinput);

            double wallsize = heightinput * widthinput;
            System.out.println("Wall size is: " + wallsize);

            Scanner PaintPotVl = new Scanner(System.in);
            System.out.println("How much paint is in the pot in litres: ");
            double paintpotinput = PaintPotVl.nextDouble();

            double PaintPotCover;
            PaintPotCover = paintpotinput / 6; //Assumption that one litre covers 6 metres squared!

            double NumberOfCans;
            NumberOfCans = Math.ceil(wallsize / PaintPotCover);
            System.out.println("Number of cans needed is: " + NumberOfCans);


            System.out.println("Paints Available are: ");
            String[] paints = new String[5];
            paints[0] = "Matte";
            paints[1] = "Gloss";
            paints[2] = "Metallic";
            paints[3] = "Oil";
            paints[4] = "Acrylic";

            for (String s : paints) {
                System.out.println(s);
            }

            System.out.println("Brushes Available are: ");

            String[][] brushType = new String[2][3];
            brushType[0][0] = "Small ";
            brushType[0][1] = "Medium ";
            brushType[0][2] = "Large ";

            brushType[1][0] = "Coarse ";
            brushType[1][1] = "Soft ";
            brushType[1][2] = "Fine ";

            int count = 0;
            for (int i = 0; i < brushType.length; i++) {
                for (int j = 0; j < brushType[i].length; j++) {
                    System.out.print(brushType[i][j]);
                }
                System.out.println();
            }


            ArrayList<String> ColourChoice = new ArrayList<>(10);
            ColourChoice.add("Red");
            ColourChoice.add("Green");
            ColourChoice.add("Blue");
            ColourChoice.add("Yellow");
            ColourChoice.add("White");
            ColourChoice.add("Black");

            System.out.println("Colours Available are: "+ ColourChoice);


            Scanner PaintChoice = new Scanner(System.in);
            System.out.println("What kind of paint have you chosen? (0 for Matte, 1 for Gloss, 2 for Metallic, 3 for Oil, 4 for acrylic) ");
            int paintchoiceinput = PaintChoice.nextInt();

            int choice = 1;
            String message;
            message = switch (paintchoiceinput) {
                case 0 -> "Matte";
                case 1 -> "Gloss";
                case 2 -> "Metallic";
                case 3 -> "Oil Paint";
                default -> "Acrylic";
            };
            System.out.println(message);

            Scanner CostScan = new Scanner(System.in);
            System.out.println("What is the cost of the can: (£) ");
            double costinput = CostScan.nextDouble();

            double CostToPaint;
            CostToPaint = costinput * NumberOfCans;
            System.out.println("The cost to paint is: £" + CostToPaint);

            Scanner enterScan = new Scanner(System.in);
            System.out.println("Do you wish to continue? ");
            String cont = enterScan.next();
            if (cont.equals("no")) {
                enterAgain = false;
            }
            if (cont.equals("No")) {
                enterAgain = false;
            }
            if (cont.equals("NO")) {
                enterAgain = false;
            }
            if (cont.equals("No!")) {
                enterAgain = false;
            }
            if (cont.equals("YES")) {
                enterAgain = true;
            }
            if (cont.equals("Yes!")) {
                enterAgain = true;
            }
        }while (enterAgain);
    }
}