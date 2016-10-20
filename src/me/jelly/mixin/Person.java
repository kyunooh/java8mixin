package me.jelly.mixin;

/**
 * Created by jelly on 10/20/16.
 */
public interface Person extends Animal{
    default void walk() {
        System.out.println("I'm walking now!");
    }

    default void speak() {
        System.out.println("I'm speaking now!");
    }

    default void drink() {
        setDrunken(true);
    }

    void setDrunken(boolean drunken);
}
