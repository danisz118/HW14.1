package com.company;
/*
Написать класс в котором есть 4 метода: +-/*
Которые принимают 2 параметра типа int.
Нужно написать метод который по строковому имени метода найдет его и вызовет, при помощи Reflection.
Если такого метода нет выдать ошибку.
 */

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert method: plus , minus , multiply, division  ");
        String methodEnter = scanner.nextLine();
        if (methodEnter.equals("plus") || methodEnter.equals("minus")
                || methodEnter.equals("multiply")
                || methodEnter.equals("division")) {
            Math math = new Math();

            try {
                reflection(math, methodEnter);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("no such method");
        }

    }

    public static void reflection(Math math, String methodEnter) throws Exception {
        Method method = math.getClass().getMethod(methodEnter);
        method.invoke(math);

    }
}
