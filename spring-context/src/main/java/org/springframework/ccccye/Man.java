package org.springframework.ccccye;

//@Service
public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("man:eat");
    }

    @Override
    public void say() {
        System.out.println("man:say");
    }
}
