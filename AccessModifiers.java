/*
    MODIFIER  SCOPE
  1. default: package level
  2. public: anywhere
  3. protected: package level -- child class & child class can be outside the package
  4. private: class level
  Note: By default access modifier is "default"
  Note: class and interface cannot be private
  Note: class cannot be protected
*/

public class AccessModifiers
{
    public String name;
    private String mobile_number;
    protected int salary;
    int weight;
    
    void show_details()
    {
        System.out.println(name);
        System.out.println(mobile_number);
        System.out.println(salary);
        System.out.println(weight);
        System.out.println(this);
    }
    
    public static void main (String[] args) {
        AccessModifiers ob = new AccessModifiers();
        ob.name = "Manish";
        ob.mobile_number = "9958814432";
        ob.salary = 75000;
        ob.weight = 75;
        ob.show_details();
    }
}