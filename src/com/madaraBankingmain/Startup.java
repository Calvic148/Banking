package com.madaraBankingmain;
import java.util.Scanner;


public class Startup {

    public static void run(){
        Clientaccount cl= new Clientaccount();
        double deposit;



        Scanner uinput;
        boolean exit = false;
        do {
            System.out.println("Welcome");
            System.out.println("Please select one of the following");
            System.out.println("For Employees type 'e' ");
            System.out.println("For Clients type 'c' ");
            System.out.println("To exit type 'quit' ");

            // start to chose type of login employee or client

            uinput = new Scanner(System.in);
            String emporcli = uinput.nextLine();




                if (emporcli != null && emporcli.isEmpty()) {
                    System.out.println("please make a choice");
                } else if ("quit".equals(emporcli)) {
                    exit = true;
                    System.exit(0);
                } else {
                    System.out.println("You chose: " + emporcli);
                }


            if (emporcli.equals("e")) {



                System.out.println("Welcome trusty employee, please enter your login name");
                String lgname = uinput.nextLine();
                if("quit".equals(lgname)){
                    System.exit(0);
                }
                else{
                    System.out.println("Now please enter password");
                }

                String passw = uinput.nextLine();
                System.out.println("security password check ");

                // after logging in to as employee select to create, view a client or exit

                System.out.println("what would you like to do?");
                System.out.println("to create a new client type : new client");
                System.out.println("to view existing client type: view client");
                System.out.println("to exit type: quit");
                String echoice1 = uinput.nextLine();



                boolean isstring = false;
                do {

                    if (echoice1 != null && echoice1.isEmpty()) {

                        System.out.println("please make a choice");
                    }
                    else if ("quit".equals(echoice1)) {
                            System.exit(0);
                            isstring = true;
                    }
                    else if (echoice1.equals("new client")) {
                            System.out.println("you chose to create a new client");
                            isstring = true;

                    }
                    else if (echoice1.equals("view client")) {
                            System.out.println("you chose to view client account");
                            isstring = true;
                    }

                     else {
                            System.out.println("please make a valid choice");

                            echoice1 = uinput.nextLine();
                     }

                }
                while (!isstring );


            } else if (emporcli.equals("c")) {
                System.out.println("Welcome to the client login");
                System.out.println("please enter your login name");
                String lgname = uinput.nextLine();
                System.out.println("security name check ");
                System.out.println("please enter your password");
                String passw = uinput.nextLine();
                System.out.println("security password check ");

            }

            System.out.println("Type 'q' to exit or press any key to start over from beginng");

        } while (!exit);
        uinput.close();



    }



}
