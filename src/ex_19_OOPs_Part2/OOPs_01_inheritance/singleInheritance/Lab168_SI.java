package ex_19_OOPs_Part2.OOPs_01_inheritance.singleInheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son meeti = new Son();
        System.out.println(meeti.gold_f);
        meeti.bhk2();
        meeti.bhk3();

        Father f1  = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        // f1.bhk3();?
    }
}
