/*
    Non Access Modifier
    1. static: For creating 'static methods and variables'
               Independent of object, accessed using <class-name>, get memory once in lifetime
    2. abstract:
            abstract class: It can't be instantiated, made so that it can be inherited/extended
                            Class can't be both final and abstract. 
                            It can contain abstract and normal methods( 0 abstract methods are also possible in abstract class)
            abstract method:No body, must be overriden by subclass unless subclass is itself abstract
                            Method can't be both final and abstract
                            Class containing abstract method must be declared abstract 
                            
    3. transient:
            Value of transient variable is not saved in file during Serialization, it's default value is saved.
            Used for variables whose value can be derived from other variables
                - E.g Age and date of birth. Age can derived if DOB is known and vice versa.
            Used for variables containing the private data which we don't want to keep
            Using transient with 'final' and 'static' has no effect.
            
    4. volatile: related to synchronization and threads
    5. synchronized: related to synchronization and threads
    6. final:
            final variable: Initialized only once
            final method: cann't be overriden
            final class: can't be subclassed or derived
    Note: Local variables can't be declared static
*/
class NonAccessModifiers
{

}