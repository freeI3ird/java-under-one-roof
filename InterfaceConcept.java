/*
    INTERFACE
        Constants
            - contains 'constant' declarations 
            - e.g:  double pi = 3.14; 
            - These declarations are implicitly 'public', 'static', 'final'(that's why name constant)
            
        Method Signatures(Abstract Methods)
            - If a method in interface is not declared 'default' and 'static' then implicitly they are 
          'abstract' and 'public'.
        Default Methods
            - Have body
        Static Methods
            - Have body 
        Nested Types 
    
    1. Can't be instantiated
    2. Can be extended by other interfaces and implemented by classes 
    3. Define Standards, some-one provide the implementation of these standards,
       then these implementations(classes) are not to be exposed, simply interface can be 
       exposed to end user, end user will invoke the methods of interface.
    4. Use Interface as Type
            - We can use interface name in same way as any other Data type
            - If we define a  Reference variable whose data type is an interface, then we can 
              assign any object to that variable provided the class of that object implements 
              the interface under consideration.
*/