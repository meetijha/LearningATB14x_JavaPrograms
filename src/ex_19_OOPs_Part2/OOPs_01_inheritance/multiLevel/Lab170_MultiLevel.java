package ex_19_OOPs_Part2.OOPs_01_inheritance.multiLevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son meeti = new Son();
        meeti.home();
        meeti.bhk3();
        meeti.gf();
        meeti.extra();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        GrandFather gf =  new GrandFather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();// this will Access child class method in case of method overriding
        Father f1  = new Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();


    }
}
