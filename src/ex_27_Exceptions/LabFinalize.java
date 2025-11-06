package ex_27_Exceptions;

public class LabFinalize {
    public static void main(String[] args) {
        LabFinalize labFinalize = new LabFinalize();
        labFinalize = null;
        System.gc(); // garbage collector
        System.out.println("main method done");
    }

    // Finalize is called once gc happens
    // However it is depricated now. so in red color
    // finalize is a part of Object class
    @Override
    public void finalize(){
        System.out.println("Finalize method called before GC");
    }
}
