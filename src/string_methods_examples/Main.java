package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Brandon");
        String myLastName = "Smith";
        String anotherFirstName = new String("Brandon");
        String anotherLastName = "Smith";

        System.out.println(myFirstName == anotherFirstName);
        System.out.println(myLastName == anotherLastName);

        //to compare two objects, use .equals not ==.
        // == is only for primitives
        System.out.println(myFirstName.equals(anotherFirstName));


        //String length
        System.out.println(myFirstName.length());

        //substring method
        //first 5 chars of my name. These are at
        //indices 0,1,2,3,4 - notice we had to use 5 below
        System.out.println(myFirstName.substring(0,5));

        //Get "don"
        System.out.println(myFirstName.substring(4,7));
        System.out.println(myFirstName.substring(4,myFirstName.length()));

        //indexOf - finds location of first occurrence of String
        System.out.println(myFirstName.indexOf("d"));
        System.out.println(myFirstName.indexOf("and"));

        //compareTo
        System.out.println(myFirstName.compareTo(anotherFirstName));
        System.out.println("a".compareTo("h"));
        System.out.println("b".compareTo("a"));
        //capitals are different
        System.out.println("a".compareTo("H"));
        System.out.println((int)'a');
        System.out.println((int)'h');


    }
}
