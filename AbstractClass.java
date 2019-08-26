/*
	ABSTRACTION
		- Show Functionality Hide Implementation.
		- Provide Standards and Implementation can Vary.
	ABSTRACT CLASS
	1. Can't be INSTANTIATED
	2. Use keyword 'abstract' to declare class and method abstract.
	3. Abstract class may/may not contain Abstract method. But a class containing 'abstract method' must be declared Abstract.
	4. Can be INHERITED but no ASSOCIATION.
		- Generally 'abstract class' used as Base class, which provide standards, then its child classes provide different implementation
		  to those standards.
		- Child class must override all the abstract methods of base class, unless the Child class itself is 'Abstract'.
	5. We can run Abstract class just like other classes if abstract class has 'main()' function.
	6. Demonstrate RUN TIME POLYMORPHISM.

	Abstract Class
		Constructor: No class can exist without constructor
			- Parameterized and Non-Parameterized
		Data Members: 
			- Static and Non-static/instance DM.
		Member Functions:
			- Instance/Non-static Methods
				Abstract: without implementation
				Normal: with implementation
			- Static Methods
				Normal: Static methods can't be overrided, so can't be made 'abstract'
*/

abstract class  Person 
{
    String name;
    String gender;
    static String species = "Human";
    Person()
    {
        name = "xyz";
        gender = "unknown";
    }
    Person(String name, String gender)
    {
        this.name = name;
        this.gender = gender;
    }
    // abstract method
    abstract void work();
    
    // overrided method of Object class 
    public String toString()
    {
        return "Name:"+this.name +"::Gender:"+this.gender;
    }
    // static method 
    static void tellYourSpecies()
    {
        System.out.println("I belong to "+species+ " species");
    }
    // Non-static method with implementation
    void describeYourBody()
    {
        System.out.println("I have 2 legs, 1 nose and a talking mouth");
    }
    public static void main (String[] args) {
        System.out.println("Abstract class can also run");
        Person.tellYourSpecies();
    }
}
class Employee extends Person 
{
    int empId;
    Employee()
    {
        empId = -1;
    }
    Employee(String name, String gender, int empId)
    {
        super(name, gender);
        this.empId = empId;
    }
    void work()
    {
        if(empId == -1)
        {
            System.out.println("Hi, I am in office and there is no work assigned to me.");
        }
        else
            System.out.println("Please don't disturb I am in office. ");
    }
}
class Student extends Person 
{
    String school_name;
    Student()
    {
        school_name = "unknown";
    }
    Student(String name, String gender, String school)
    {
        super(name, gender);
        school_name = school;
    }
    void work()
    {
        System.out.println("Hello, I am studying in "+ school_name);
    }
}
class AbstractClass
{
    public static void main (String[] args) {
        Person ob = new Employee("Manish", "Male", 1430);
        ob.work();
        ob = new Student("Avtar", "Male", "Bohra Public School");
        ob.work();
        Object ob2 = ob;
        System.out.println(ob2.toString());
    }
}