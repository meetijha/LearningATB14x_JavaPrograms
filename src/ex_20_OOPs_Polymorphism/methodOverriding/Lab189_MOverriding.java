package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab189_MOverriding {
    //Runtime Polymorphism
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        Meeti m1 = new Meeti();
         m1.home();

        Father f2 = new Meeti(); // Dynamic Dispatch
        f2.home();

      //  Meeti m2=new Father();
        // When father is getting born, child reference cannot be given to.
    }
}

class Father {
    void home() {
        System.out.println("3BHK");
    }
}

class Meeti extends Father
{
    @Override
    void home()
    {
        System.out.println("4BHK");
    }
}
