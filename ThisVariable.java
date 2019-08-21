/*
    'this' VARIABLE
        1. 'this' contains the Reference ID of the Object
        2. 'this' can't be used inside the static function.
        3. DATA SHADOWING
            If local var and class level var has same name, then local var are given preference.
            To access class level var use 'this.<var-name>'
        4. 'this' can be defined explicitly as Parameter to the function.
                a. 'this' should be first parameter in this case.
                b. No need to pass 'RID' as argument in function call.
*/
class ThisVariable
{
    String name;
    
    void dataShadow(String name)
    {
        System.out.println("local name: " +name);
        System.out.println("class level name: " + this.name);
    }
    void showName(ThisVariable this, String start)
    {
        System.out.println(start + this.name);
    }
    public static void main (String[] args) {
        ThisVariable ob = new ThisVariable();
        ob.name = "Refernce-ID";
        ob.dataShadow("pointer-to-object");
        ob.showName("I am ");
    }
}