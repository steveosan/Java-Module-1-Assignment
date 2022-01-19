package edu.wctc;

import java.util.Scanner;

public class Main {

    static void prefMethod() {
        System.out.println("Enter 0 for the option on the Left");
        System.out.println("Enter 1 for the option on the Right");
        System.out.print("User input:");
    }
    static void errorMessage(){
        System.out.println("***Something went terribly wrong!***\n");
    }

    public static void main(String[] args) {

        boolean useQuiz;

        String[] prompts = {"Mild","Spicy","Tea","Coffee","Breakfast","Brunch","Summer","Winter","Paper","Plastic"};
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        do {

            int[] myChoice = new int[5];

            System.out.println("\n\n\n-------------------------------");
            System.out.println("Welcome to the Preference Quiz!");
            System.out.println("-------------------------------\n");

            try {
                do {
                    System.out.println("\nDo you prefer " + prompts[0] + " or " + prompts[1] + "?");
                    prefMethod();

                    myChoice[0] = Integer.parseInt(sc.nextLine());
                } while (myChoice[0] != 1 && myChoice[0] != 0);

            } catch (Exception e) {
                errorMessage();
            }

            try {
                do {
                    System.out.println("\nDo you prefer " + prompts[2] + " or " + prompts[3] + "?");
                    prefMethod();
                    myChoice[1] = Integer.parseInt(sc.nextLine());
                } while (myChoice[1] != 1 && myChoice[1] != 0);
            } catch (Exception e) {
                errorMessage();
            }

            try {
                do {
                    System.out.println("\nDo you prefer " + prompts[4] + " or " + prompts[5] + "?");
                    prefMethod();
                    myChoice[2] = Integer.parseInt(sc.nextLine());
                } while (myChoice[2] != 1 && myChoice[2] != 0);
            } catch (Exception e) {
                errorMessage();
            }

            try {
                do {
                    System.out.println("\nDo you prefer " + prompts[6] + " or " + prompts[7] + "?");
                    prefMethod();
                    myChoice[3] = Integer.parseInt(sc.nextLine());
                } while (myChoice[3] != 1 && myChoice[3] != 0);
            } catch (Exception e) {
                errorMessage();
            }

            try {
                do {
                    System.out.println("\nDo you prefer " + prompts[8] + " or " + prompts[9] + "?");
                    prefMethod();
                    myChoice[4] = Integer.parseInt(sc.nextLine());
                } while (myChoice[4] != 1 && myChoice[4] != 0);
            } catch (Exception e) {
                errorMessage();
            }

            for (int j : myChoice) {
                sum = sum + j;
            }
            System.out.println("\n******************************************");
            System.out.println("Your Total points: " + sum);

            if (sum < 3){
                System.out.println("You prefer life to be calm and organized.");
            }else if (sum > 3) {
                System.out.println("You prefer life to be spontaneous and active.");
            }else if (sum == 3){
                System.out.println("You prefer a good balance in life.");
            }
            System.out.println("******************************************");

            sum = 0;
            System.out.println("\nTake the Quiz again?");
            System.out.println("1) Yes");
            System.out.println("2) Exit");
            System.out.print("User input:");

            int goAgain = Integer.parseInt(sc.nextLine());
            useQuiz = goAgain != 2;

        }while (useQuiz);
    }
}

