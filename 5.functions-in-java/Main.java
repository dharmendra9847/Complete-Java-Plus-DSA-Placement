class Temp {
        int myVar = 10;
    }


public class Main {

    
    public static void main(String[] args) {
        // System.out.println(calculateAreaofSqaure(12)); 
        Main st = new Main();
    
        Temp obj1 = new Temp();
        Temp obj2 = new Temp();

        obj1.myVar = 10;
        obj2.myVar = 20;

        st.swapNumberReference(obj1, obj2);
        System.out.println("Call by reference: "+obj1.myVar+","+obj2.myVar); //Pass by Reference

        // System.out.println(st.calculateAreaofSqaure(12));
        // System.out.println(st.calculateAreaofRectangle(10, 12));
        // int result = st.calculateAreaofTriangle(5, 5);
        // System.out.println(result);

        /* Swapping of two number */
        // int num1 = 10;
        // int num2 = 20;
        // st.swapNumber(num1, num2); // Actual Arguments: {Argument definition: lists of parameter} pass by value
        // System.out.println(num1+" "+num2);


        
    }

    public int calculateAreaofSqaure(int side) {
        int area = side * side;
        return area;
    }

    public int calculateAreaofRectangle(int length, int width) {
        int area = length * width;
        return area;
    }

    public int calculateAreaofTriangle(int b, int h) {
        int area = 1 / 2 * (b * h);
        return area;
    }

    /* Swapping of two number */
    public void swapNumber(int a, int b) { //// Formal Argument
        int temp = a;
        a = b;
        b = temp;
        // System.out.println(a + " " + b);
    }

    /* Swapping of two number by reference */
    public void swapNumberReference(Temp obj1, Temp obj2) {
        
        /* New Instance */
        obj1 = new Temp();
        obj1.myVar = 10;

        obj2 = new Temp();
        obj2.myVar = 20;

        System.out.println("New Instance: "+obj1.myVar + " " + obj2.myVar);
        
        int temp = obj1.myVar;
        obj1.myVar = obj2.myVar;
        obj2.myVar = temp;
        System.out.println(obj1.myVar+" "+obj2.myVar);
    }
    
}
