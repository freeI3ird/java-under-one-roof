/*
    INHERITANCE via DATA MEMBERS 
    NON-STATIC:
        If Child and base class both has data member with same name then this is data hiding.
        Preference given to the Child class if accessed from inside child.
        To access data member of Parent class from inside child
            - Use super: super.<var-name>
            - TypeCast: ((<par-class>)<child-object>).<var-name>
        To access data member of Parent class from anywhere
            - TypeCast: ((<par-class>)<child-object>).<var-name>
    STATIC:
        Same concepts applied as in NON-STATIC
        To access static data member of Parent class from inside child in case of Data hiding
            - super.<var-name>
            - TypeCast: ((<par-class>)<child-object>).<var-name>
            - **Use Class Name: <par-class>.<var-name> 
        To access static data member of Parent class from anywhere in case of Data hiding
            - TypeCast: ((<par-class>)<child-object>).<var-name>
            - **Use Class Name: <par-class>.<var-name> 
    Note: When 'this' of child class goes to Parent Class CONSTRUCTOR or FUNCTION, then it is 
          Implicitly TYPE-CAST to parent class.
    Note: Which Data member get accessed it depends on the "TYPE OF REFERENCE VARIABLE".
            - Parent ob = new Child(),  ob.<var-name> : Parent class data member <var-name> is accessed
            - Child ob = new Child(), ob.<var-name>: Child class data member <var-name> is accessed
            - If the <var-name> is not present in that class then error is thrown( checks unique existence).
            - ((Parent)this).<var-name> : Parent class <var-name> is accessed and Parent class must have it
*/
class GrandParent
{
    String name ="Gopal";
    String surname = "Das";
    static int pension = 2000;
    static String category = "senior-citizen";
    void showDetailsGrandParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + ((Parent)this).name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        System.out.println("Grandfather's name:"+ name + " "+ surname);
        System.out.println("Grandfather's category:"+ category);
    }
}
class Parent extends GrandParent
{
    String name = "Ram";
    static String category = "mature-group";
    void showDetailsParent()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Child name : " + ((Child)this).name + " " + surname);
        System.out.println("Child category:" + ((Child)this).category);
        System.out.println("Father's name:" + name + " " + surname);
        System.out.println("Father's category:"+ category);
        System.out.println("Grandfather's name:"+ super.name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
}
class Child extends Parent
{
    String name = "Zabar";
    static String category = "youngster";
    void showDetails()
    {
        System.out.println("Reference-id:"+ this);
        System.out.println("Child name : " + name + " " + surname);
        System.out.println("Child category:" + category);
        System.out.println("Father's name:" + super.name + " " + surname);
        System.out.println("Father's category:"+ ((Parent)this).category);
        System.out.println("Grandfather's name:"+ ((GrandParent)this).name + " "+ surname);
        System.out.println("Grandfather's category:"+((GrandParent)this).category);
    }
}
class InheritanceDataMembers
{
    public static void main (String[] args) {
        Child ob = new Child();
        ob.showDetails();
        ob.showDetailsParent();
        ob.showDetailsGrandParent();
    }
}