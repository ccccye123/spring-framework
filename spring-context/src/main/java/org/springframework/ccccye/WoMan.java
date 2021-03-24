package org.springframework.ccccye;


//@Service
public class WoMan implements Person{
    @Override
    public void eat() {
        System.out.println("woman:eat");
    }

    @Override
    public void say() {
        System.out.println("woman:say");
    }
}
