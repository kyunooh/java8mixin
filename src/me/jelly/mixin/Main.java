package me.jelly.mixin;

/**
 * Created by jelly on 10/20/16.
 */
public class Main {
    public static void main(String args[]) {
        Jelly jelly = new Jelly();
        jelly.walk();
        jelly.bark();


        jelly.drink();
        System.out.println("after get drink");
        jelly.bark();
    }
}
