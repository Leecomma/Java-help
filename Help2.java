///Хелпер по Инструкциям 
package com.company;
    class Demo7{
        public static void main(String [] args)
                throws java.io.IOException {

            char choice, ignore;
            for (; ;) {
                do {
                    System.out.println("Справка: ");
                    System.out.println("1. if");
                    System.out.println("2. switch");
                    System.out.println("Выберите: ");
                    System.out.println("press q exit");

                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                } while (choice < '1' | choice > '7' & choice != 'q');
                if (choice == 'q') break;
                System.out.println("\n");

                switch (choice) {
                    case '1' -> {
                        System.out.println("Инструкция if:\n");
                        System.out.println("if(условие) инструкция;");
                        System.out.println("else инструкция;");
                    }
                    case '2' -> {
                        System.out.println("Инструкция switch:\n");
                        System.out.println("switch(выражение) {");
                        System.out.println(" case константа:");
                        System.out.println(" последовательность инструкций");
                        System.out.println(" break;");
                        System.out.println(" // ...");
                        System.out.println("}");
                    }
                    default -> System.out.println("Запрос не найден");
                }
            }
        }
    }
