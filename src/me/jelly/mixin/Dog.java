package me.jelly.mixin;

/**
 * Created by jelly on 10/20/16.
 */
public interface Dog extends Animal {

    Object getInstance();

    boolean isDrunken();

    default void bite() {
        if(getInstance() instanceof Person) {
            if(isDrunken()) {
                System.out.println("I am biting now!!");
                return;
            } else {
                System.out.println("What?? I don't bite!");
                return;
            }
        }
        System.out.println("I am biting ");
    }

    default void bark() {
        if(getInstance() instanceof Person) {
            if(isDrunken()) {
                System.out.println("bark bark!");
                return;
            } else {
                System.out.println("what?? i don't bark");
                return;
            }
        }
        System.out.println("bark bark!");
    }
}
