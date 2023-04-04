What is Inheritance in Java?
Ans:  The technique of creating a new class by using an existing class functionality is called inheritance in Java. 
In other words, inheritance is a process where a child class acquires all the properties and behaviours of the 
parent class.

2. What is superclass and subclass??
Ans: A class from where a subclass inherits features is called superclass. It is also called base class or parent 
class.
--A class that inherits all the members (fields, method, and nested classes) from another class is called a 
subclass. It is also called a derived class, child class, or extended class.

3. How is Inheritance implemented/achieved in Java?
Ans: Inheritance can be implemented or achieved by using two keywords:
extends: extends is a keyword that is used for developing the inheritance between two classes and two 
interfaces.
implements: implements keyword is used for developing the inheritance between a class and interface.

4. What is polymorphism?
Ans: Polymorphism in OOP is the ability of an entity to take several forms. In other words, it refers to the ability of
an object (or a reference to an object) to take different forms of objects. It allows a common data-gathering
message to be sent to each class. Polymorphism encourages what is called ‘extendibility’ which means an
object or a class can have its uses extended.

5. Differentiate between method overloading and method overriding.
Ans:What is method overloading and method overriding with example?
Overloading vs Overriding: Difference between Method Overloading and Method Overriding
       Method Overloading	                                                   Method Overriding
--Is an example of compile-time polymorphism	                           --  It is an example of runtime polymorphism
--Return type can be different but you must change                         --  Return type must be same in overriding
 the parameters as well.	                               
-- Method overloading is generally performed in the same class.            --Method overriding is performed in two classes through inheritance (Is-A relationship).


6. What is an abstraction explained with an Example?
Ans: Abstraction is nothing but the quality of dealing with ideas rather than events. It basically deals with hiding
the internal details and showing the essential things to the user.
Abstract class Sports { // abstract class sports
Abstract void jump(); // abstract method

7. What is the difference between an abstract method and final method in Java?Explain with an example
Ans: The abstract method is incomplete while the final method is regarded as complete. The only way to use
an abstract method is by overriding it, but you cannot override a final method in Java.

8. What is the final class in Java?
Ans: A class declared with the final keyword is known as the final class. A final class can’t be inherited by
subclasses. By using the final class, we can restrict the inheritance of the class. We can create a class as a final
class only if it is complete in nature, which means it must not be an abstract class. In java, all the wrapper
classes are final classes like String, Integer, etc.
If we try to inherit a final class, then the compiler throws an error at compilation time. We can’t create a class as
immutable without the final class.

final class ParentClass
{
void showData()
{
System.out.println("This is a method of final Parent class");
}
}
//It will throw compilation error
class ChildClass extends ParentClass
{
void showData()
{
System.out.println("This is a method of Child class");
}
}
class MainClass
{
public static void main(String arg[])
{
ParentClass obj = new ChildClass();
obj.showData();
}
}

9. Differentiate between abstraction and encapsulation.
Ans.	Abstraction	                                                                        Encapsulation
   --Abstraction solves the problem and issues that arise at the design stage.	      -- Encapsulation solves the problem and issue that arise at the implementation stage.
   --Abstraction allows you to focus on what the object does                          --Encapsulation enables you to hide the code and data into a single unit to
        instead of how it does it	                                                         secure the data from the outside world                                                                                      
I  --You can use abstraction using Interface and Abstract Class.	               --You can implement encapsulation using Access Modifiers (Public, Protected & Private.)
   --Focus mainly on what should be done.	                                       --Focus primarily on how it should be done.
   --During design level.	                                                       --During the Implementation level                                                              

10. Difference between Runtime and compile time polymorphism explain with an example
Ans.Compile-time polymorphism                                                          	Runtime polymorphism
--Compile time polymorphism means binding is occuring at compile time          --R un time polymorphism where at run time we came to know which method is going to invoke
--It can be achieved through static binding                                    --It can be achieved through dynamic binding
--Inheritance is not involved                                                  --Inheritance is involved
--Method overloading is  an example of compile time polymorphism               --Method overriding is an example of runtime polymorphism







