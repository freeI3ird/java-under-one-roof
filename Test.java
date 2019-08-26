/*
    INHERITANCE via CONSTRUCTORS
    1. Constructor of Immediate Parent class is called from the very first line of Child class
       constructor.
    2. Implicitly call constructor
        - Compiler by default put 'super();' (a call to default constructor of parent) in 
          the first line of child class constructor.
          In this case Parent class must have a default constructor.
          People forget to write default constructor explicitly when they declare a Parameterized
          constructor.
    3. Explicitly call constructor
        - We can explicitly call parent constructor from first line
            super(); // default constructor call
            super(a,b,c); // Parameterized constructor call
            
    Note: When 'this' of child class goes to Parent Class CONSTRUCTOR or FUNCTION, then it is 
          Implicitly TYPE-CAST to parent class.
    
*/
class GrandParent
{
    // String name;
    String surname;
    static int pension = 2000;
    static String category = "senior-citizen";
    GrandParent()
    {
        System.out.println("Inside the default constructor of GrandParent");
    }
    GrandParent(String tmp_surname)
    {
        System.out.println("Inside the Parameterized constructor of GrandParent");
        // this.name = name;
        surname = tmp_surname;
    }
    void showDetailsGrandParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + ((Parent)this).name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        // System.out.println("Grandfather's name:"+ this.name + " "+ surname);
        System.out.println("Grandfather's category:"+ category);
    }
}
class Parent extends GrandParent
{
    String name;
    static String category = "mature-group";
    Parent()
    {
        System.out.println("Inside the default constructor of Parent");
    }
    Parent(String name, String surname)
    {
        super(surname);
        System.out.println("Inside the Parameterized constructor of Parent");
        this.name = name;
    }
    void showDetailsParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + name + " " + surname);
        System.out.println("Father's category:"+ category);
        // System.out.println("Grandfather's name:"+ super.name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
}
class Child extends Parent
{
    String name;
    static String category = "youngster";
    Child()
    {
        System.out.println("Inside the default constructor of Child class");
    }
    Child(String name, String parent_name, String surname)
    {
        super(parent_name, surname);
        System.out.println("Inside the Parameterized constructor of Child class");
        this.name = name;
    }
    void showDetails()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + name + " " + surname);
        System.out.println("Child category:" + category);
        System.out.println("Father's name:" + super.name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        // System.out.println("Grandfather's name:"+ ((GrandParent)this).name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
}
class Test
{
    public static void main (String[] args) {
        Child ob = new Child("zabar", "ram", "das");
        ob.showDetails();
        ob.showDetailsParent();
        ob.showDetailsGrandParent();
    }
}