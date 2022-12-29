package awtCrud;
class demo {
    private int m;
    private int n;
 
    demo(int x, int y) {
        m = x;
        n = y;
    }
 
    int largest() {
        if (m > n)
            return m;
        else
            return n;
    }
 
    void display()
    {
        int large=largest();
        System.out.println("The Greatest Number is : "+large);
    }
 
}
public class Nested_Methods {
    public static void main(String args[]) {
        demo o =new demo(50,20);
        o.display();
    }
 
}