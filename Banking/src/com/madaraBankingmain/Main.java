package com.madaraBankingmain;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner uinput;
        do {
            System.out.println("Welcome");
            System.out.println("Please select one of the following");
            System.out.println("For Employees type 'e' ");
            System.out.println("For Clients type 'c' ");
            System.out.println("To exit type 'q' ");

            uinput = new Scanner(System.in);
            String emporcli = uinput.nextLine();


            try() {

                if (emporcli != null && emporcli.isEmpty()) {
                    System.out.println("please make a choice");
                } else if ("q".equals(emporcli)) {
                    System.exit(0);
                } else {
                    System.out.println("You chose: " + emporcli);
                }
            }
            catch (){
                
            }

            if (emporcli.equals("e")) {



                System.out.println("Welcome trusty employee, please enter your login name");
                String lgname = uinput.nextLine();
                if("q".equals(lgname)){
                    System.exit(0);
                }
                else{
                System.out.println("Now please enter password");
                }

                String passw = uinput.nextLine();
                System.out.println("security password check ");

            } else if (emporcli.equals("c")) {
                System.out.println("Welcome to the client login");
                System.out.println("please enter your login name");
                String lgname = uinput.nextLine();
                System.out.println("security name check ");
                System.out.println("please enter your password");
                String passw = uinput.nextLine();
                System.out.println("security password check ");

            }

            System.out.println("Type 'q' to exit or 'r' return to start");

        } while (!"q".equals(uinput.nextLine()));
            uinput.close();


    }

}
