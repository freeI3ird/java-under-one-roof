/*
    INHERITANCE via MEMBER FUNCTION 
    1. 'this' variable got auto TYPE-CAST when it goes inside the CONSTRUCTOR OR MEMBER FUNCTION
        of Parent Class. 
        - 'this' ==> type cast to Parent Ref-var ((Parent)this) 
    2. For every function call  "ob.function_name();" 
        - Late binding is done i.e member function of the class same as object will be called,
          doesn't depend upon the type of Reference-Variable.
          E.g:  Child ob = new Child();
                ((Parent)ob).show() : Child class 'show()' will run.
        - Compiler check unique existence of function according to the TYPE of Reference-Variable.
          E.g:  In above e.g: Child class 'show()' will run, but Parent class must have 'show()' function
                otherwise throw error. 
        - Unique existence
            Unique:    Can't have function with everthing same just return type different
            Existence: Function with that Name must exist in the class and class is decided by
                       Type of Reference variable.
    3. 'super' is different from ((Parent)ob) type cast object
        - super.show(); run the method of Parent class 
        - ((Parent)ob).show(); run the method depending on the object which is of Child class
    
    4. Non-static can override only Non-static and static method can overide only static. No cross category overiding is allowd.
       In case of static method, this is not called overiding but 'function hiding'.
    5. What about Static Member functions
        - They are functions not method because they are not related to object
        - Can't use 'this', 'super' inside static.
        - Best way to call static func. is by 'class-name', corresponding class function is called
            E.g: <class-name>.staticFunction();
        - Static func. call depends on 'Type of Reference variable' same as Data Members. 
        - In INHERITANCE, Behaviour of Static functions is same as of Data Members.       
*/
class GrandParent
{
    String name;
    String surname;
    static int pension = 2000;
    static String category = "senior-citizen";
    GrandParent()
    {
        System.out.println("Inside the default constructor of GrandParent");
    }
    GrandParent(String name, String tmp_surname)
    {
        System.out.println("Inside the Parameterized constructor of GrandParent");
        this.name = name;
        surname = tmp_surname;
    }
    static void showStaticDetails()
    {
        System.out.println("pension and category of Grandfather:" + pension + " " + category);
    }
    void showDetailsGrandParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + ((Parent)this).name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        System.out.println("Grandfather's name:"+ name + " "+ surname);
        System.out.println("Grandfather's category:"+ category);
    }
    void display()
    {
        // this.tellyourname(); Error, type of <ref-var> for 'this' is 'GrandParent' and GrandParent doesn't have 'tellyourname()' function
        // ((Parent)this).tellyourname(); // check unique existence in Parent class 
        ((Child)this).tellyourname();  // Check unique existence in Child class and run function according to the object
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
    Parent(String name, String grandparent_name, String surname)
    {
        super(grandparent_name, surname);
        System.out.println("Inside the Parameterized constructor of Parent");
        this.name = name;
    }
    static void showStaticDetails()
    {
        System.out.println("Category of Parent:" + category);
    }
    void showDetailsParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + name + " " + surname);
        System.out.println("Father's category:"+ category);
        System.out.println("Grandfather's name:"+ super.name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
    void display()
    {
        super.display();   // call the Base class function
    }
    // void tellyourname()
    // {
    //     System.out.println("I am Parent");
    // }
}
class Child extends Parent
{
    String name;
    static String category = "youngster";
    Child()
    {
        System.out.println("Inside the default constructor of Child class");
    }
    Child(String name, String parent_name, String grandparent_name, String surname)
    {
        super(parent_name, grandparent_name, surname);
        System.out.println("Inside the Parameterized constructor of Child class");
        this.name = name;
    }
    // static void showStaticDetails()
    // {
    //     System.out.println("Child category:" + category);
    //     // 'super', 'this' can't be used inside the static function.
    //     // super.showStaticDetails();    ERROR
    //     // ((Parent)this).showStaticDetails(); ERROR
    //     // ((GrandParent)this).showStaticDetails(); ERROR
    //     // Parent.showStaticDetails();   Parent's function is called
    //     // GrandParent.showStaticDetails(); GrandParent's function is called
    // }
    void showDetails()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Class-name:"+ this.getClass());
        System.out.println("Child name : " + name + " " + surname);
        System.out.println("Child category:" + category);
        System.out.println("Father's name:" + super.name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        System.out.println("Grandfather's name:"+ ((GrandParent)this).name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
    void display()
    {
        super.display();
        // this.tellyourname();
        // super.tellyourname();//  call the Parent class function and unique existence in Parent Class
        // ((Parent)this).tellyourname(); call the Child class function but unique existence in Parent class
        // ((GrandParent)this).tellyourname(); call the Child class function but unique existence in GrandParent class
    }
    void tellyourname()
    {
        System.out.println("I am Child");
    }
}
class InheritanceMemberFunctions
{
    public static void main (String[] args) {
        Child ob = new Child("zabar", "ram", "gopal", "das");
        // ob.display();
        // ob.showStaticDetails();
        // ((Parent)ob).showStaticDetails();
        // ((GrandParent)ob).showStaticDetails();
        
    }
}