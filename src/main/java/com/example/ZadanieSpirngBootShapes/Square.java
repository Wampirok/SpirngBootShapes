package com.example.ZadanieSpirngBootShapes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty(name = "shape.type", havingValue = "square")
public class Square implements Shape{

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a ");
        Integer a = scanner.nextInt();
        System.out.println("pole kwadratu dla boku a " + a + "wynosi = " + a*a);
    }
}
