package core.basesyntax;

import java.time.LocalDate;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello("Hi!");
        System.out.println("Even numbers: " + helloWorld.getFromOneToTen());
        helloWorld.initializeVariables();
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        for (String s : Arrays.asList(
                "Hello, Mate! I am happy to see you!",
                "This class looks weird!",
                "Your task is to fix the checkstyle in this file.",
                "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message"
        )) {
            System.out.println(s);
        }
    }

    private void initializeVariables() {
        String greeting = "Hello mates!";
        System.out.println(greeting);
        int currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("The size is " + size);
    }
}
