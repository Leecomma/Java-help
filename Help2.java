package com.company;
    class Demo7{
        public static void main(String [] args)
                throws java.io.IOException {

            char choice, ignore;
            for (; ;) {
                do {
                    System.out.println("Instruction: ");
                    System.out.println("1. if");
                    System.out.println("2. switch");
                    System.out.println("Choice: ");
                    System.out.println("Press q exit");

                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                } while (choice < '1' | choice > '7' & choice != 'q');
                if (choice == 'q') break;
                System.out.println("\n");

                switch (choice) {
                    case '1' -> {
                        System.out.println(" Instruction if:\n");
                        System.out.println(" if(equation) instruction;");
                        System.out.println(" else instruction;");
                    }
                    case '2' -> {
                        System.out.println(" Instruction switch:\n");
                        System.out.println(" Switch(equation) {");
                        System.out.println(" case constanta:");
                        System.out.println(" Subsequence instruction");
                        System.out.println(" Break;");
                        System.out.println(" // ...");
                        System.out.println("}");
                    }
                    default -> System.out.println("Request not found");
                }
            }
        }
    }
