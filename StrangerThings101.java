/*
    CONSTRUCTOR DON'T CREATE OBJECT.
    Proof: 
        -In below program method 'getY()' is executed before the CONSTRUCTOR.
        -Before CONSTRUCTOR is called class level variables are given memory.
    
    Note: All the class level variables are first given their default value.
          After every variable is given their default value, then the order in which they are
          declared, they are given the 'initialization' values.( see the program below )
*/

class StrangerThings101
{
    int x = 20;
    int y = getY(); // This 
    int z = 40;
    
    int getY()
    {
        System.out.println("Inside the getY()");
        System.out.println("value of X:" + x);
        System.out.println("value of Y:" + y);
        System.out.println("value of Z:" + z);
        return y+100;
    }
    StrangerThings101()
    {
        System.out.println("Inside the CONSTRUCTOR");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
    public static void main (String[] args) {
        StrangerThings101 ob = new StrangerThings101();
    }
}