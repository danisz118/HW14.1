package com.company;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert method: plus , minus , multiply, division  ");
        String methodEnter = scanner.nextLine();
        Math math = new Math();

        try {
            reflection(math,methodEnter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void reflection(Math math, String methodEnter) throws Exception{
        Method method= math.getClass().getMethod(methodEnter);
        method.invoke(math);

    }
}
