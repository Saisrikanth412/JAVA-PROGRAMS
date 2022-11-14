/*2.A write a java program to implement  the List ADT using Arrays*/


import java.util.*;  
public class ALExample 
{  
        public static void main(String[] args) 
        {  
            List<String> l = new ArrayList(); //List Implementation  
            l.add("Sam");  //adding objects to list  
            l.add("Sandy");  
            l.add("Joe");  
            l.add("Arya");  
            l.add("Nik");  
            System.out.println("List objects are:  " +l); // printing the list  
            l.remove("Nik"); //removing objects from list  
            System.out.println("After Removing Nik, List Objects are" +l);  
        }  
}  




/*OUTPUT


List objects are:  [Sam, Sandy, Joe, Arya, Nik]
After Removing Nik, List Objects are[Sam, Sandy, Joe, Arya]


 */

