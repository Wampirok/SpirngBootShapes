package com.example.ZadanieSpirngBootShapes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty(name = "shape.type", havingValue = "rectangle")
public class Rectangle implements Shape{
    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a ");
        Integer a = scanner.nextInt();
        System.out.println("podaj b ");
        Integer b = scanner.nextInt();
        System.out.println("pole prostokata dla boku a i b " + a + b + "wynosi = " + a*b);
    }
}
