package com.przemolec;

import java.io.*;
import java.util.Scanner;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects... ");
        try (ObjectInputStream os =
                     new ObjectInputStream
                             (new FileInputStream
                                     ("people.bin"/*new Scanner(System.in).nextLine()*/))) {


            /*try {
                while (true) {
                    Person person = (Person) os.readObject();
                    System.out.println(person);
                }
            } catch (EOFException e) {

            }*/

            while (true) {
                try {
                    Person person = (Person) os.readObject();
                    System.out.println(person);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
