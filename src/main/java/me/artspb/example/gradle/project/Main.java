package me.artspb.example.gradle.project;

public class Main {

    public static void main(String[] args) {
        sayHello(String.format("%s, %s!", "Hello", "world"));
    }

    private static void sayHello(String message) {
        System.out.println(message);
    }
}
