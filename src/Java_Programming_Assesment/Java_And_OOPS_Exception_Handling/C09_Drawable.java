package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Drawable Interface Implementation
Create an interface "Drawable" with a method "draw()".
Implement this interface in classes "Circle" and "Rectangle".*/

//Input:
//Create Circle and Rectangle objects, call draw() method

/*Output:
Drawing a Circle Drawing a Rectangle*/

interface C09_Drawable {

    public void draw();
}

class C09_Circle implements C09_Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class C09_Rectangle implements C09_Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Main_09{
    public static void main(String[] args) {
        C09_Circle c= new C09_Circle() ;
        c.draw();

        C09_Rectangle r=new C09_Rectangle();
        r.draw();
    }
}