/*2.B write a java program to implement  the List ADT using linked lists*/


import java.util.LinkedList;

class Main
{
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList();

    // add elements in the linked list
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // get the element from the linked list
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
	languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Java");
    System.out.println("LinkedList: " + languages);

    // change elements at index 3
    languages.set(3, "Kotlin");
    System.out.println("Updated LinkedList: " + languages);
 // remove elements from index 1
    String str1 = languages.remove(1);
    System.out.println("Removed Element: " + str1);

    System.out.println("Updated LinkedList: " + languages);
  }
}


/*

OUTPUT:

LinkedList: [Python, Java, JavaScript]
Element at index 1: JavaLinkedList: [Python, Java, JavaScript, Java, Python, JavaScript, Java]
Updated LinkedList: [Python, Java, JavaScript, Kotlin, Python, JavaScript, Java]
Removed Element: Java
Updated LinkedList: [Python, JavaScript, Kotlin, Python, JavaScript, Java]

 */