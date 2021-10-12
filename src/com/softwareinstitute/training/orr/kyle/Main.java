package com.softwareinstitute.training.orr.kyle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
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

        double PaintPotVol = 1; //Assumption that the paint pot is 1 Litre!
        double PaintPot = 6; //Assumption that one pot covers 6 Metres Squared!

        Scanner PaintPotVl = new Scanner(System.in);
        System.out.println("How much paint is in the pot in litres: ");
        double paintpotinput = PaintPotVl.nextDouble();

        double PaintPotCover;
        PaintPotCover = paintpotinput/6; //Assumption that one litre covers 6 metres squared!

        double NumberOfCans;
        NumberOfCans = Math.ceil(wallsize/PaintPotCover);
        System.out.println("Number of cans needed is: " + NumberOfCans);

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
        System.out.println("What is the cost of the can: ");
        double costinput = CostScan.nextDouble();

        double CostToPaint;
        CostToPaint = costinput * NumberOfCans;
        System.out.println("The cost to paint is: " + CostToPaint);
    }

}

