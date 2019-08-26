/*
    CLASS DESIGN
    class
        Constructor:
            1. Non-Parameterized/default
                a. Use when we want to initialize different objects with same values.
            2. Parameterized Constructor
                a. Use when we want to initialize different objects with different values.
            3. If some task to be done once in life time of object than do it in constructor
                - May be starting some Thread
                - Accessing some file/resource
            4. If we don't write any constructor, Compiler will put default constructor implicitly.
            5. If we write Parameterized constructor, then we need to explicitly write default constructor.
            6. Name same as of class why?
                - Consider: ClassName ob = new ClassName()
                - 'new' operator create object but it must know the ClassName to do so and 
                  Constructor must be called right after object creation. So to handle this 
                  it is given same name as class and Constructor is called from a fixed position( next to 'new'),
                  now 'new' operator will know the ClassName and after object creation, Constructor will be called and 
                  reference-id of object is passed to constructor.
            7. Every function return something but Constructor don't.
                - Because it implicitly returns the <reference-id> of object 
                
        Data Members:
            Non-Static/Instance:
                Value different for every object 
                Can be initialized at class level(But not of much use, as value of instance variables are generally different for every object)
                    
            Static:
                Value same for every object.
                Can be initialized at class level
                Accessed using <class-name>
        
        Member Functions:
            Non-Static/Instance:
                Perform some task on object
                Need object to call them
            Static: 
                Perform some general task
                Not related to object, Non-static things are not allowed inside static method 
                If you want to use Non-static things, then first make object inside this function then use it.
                Accessed using <class-name>
*/
class CoderClassDesign 
{
    String name;
    String handle;
    int rank;
    static String community = "coding";
    
    CoderClassDesign()
    {
        name = "man-without-name";
        handle = "NA";
        rank = -1;
    }
    CoderClassDesign(String coder_name, String coder_handle, int rank)
    {
        name = coder_name;
        handle = coder_handle;
        this.rank = rank; // Due to Data Shadowing
    }
    
    void showInstanceDetails()
    {
        System.out.println(name);
        System.out.println(handle);
        System.out.println(rank);
    }
    static void showStaticDetails()
    {
        System.out.println("Community: " + community);
    }
    public static void main (String[] args) {
        
        CoderClassDesign.showStaticDetails();
        CoderClassDesign ob = new CoderClassDesign();
        ob.name = "Manish";
        ob.handle = "freebird";
        ob.rank = 1427;
        ob.showInstanceDetails();
        
        CoderClassDesign ob2 = new CoderClassDesign();
        ob2.showInstanceDetails();
        CoderClassDesign ob3 = new CoderClassDesign("Gennady", "tourist", 3300);
        ob3.showInstanceDetails();
    }
}