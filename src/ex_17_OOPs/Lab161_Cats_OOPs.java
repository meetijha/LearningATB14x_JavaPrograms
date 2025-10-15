package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;// no object created so far as c1 is object reference
        Cat c2;// no object
        Cat c23 = new Cat();// first object created
        Cat c24 = new Cat("Lucy");
        Cat c25 = new Cat("Spicy");
        Cat c26 = new Cat("Mirchi");
        /*   new Cat();*/


        System.out.println(c24.name);
        System.out.println(c25.name);

//        c24.running();
        c25.running();
        c26.running();
    }
}

class Cat {
    String name; // instance variable

    Cat() {
        name = "Kitty";
    }

    Cat(String nameParam) {
        this.name = nameParam;
    }


    void running() {
        int local_var = 10; // Local varaible
        System.out.println("Who is running -> " + this.name);
    }
}
