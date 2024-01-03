public class strings {
    public static void main(String[] args) {

        String quote = "To be or not to be";

        //STRING METHODS

        //Print 
        System.out.println(quote);

        //Find the length
        System.out.println(quote.length());

        //Convert to lower case
        System.out.println(quote.toLowerCase());

        //Convert to upper case
        System.out.println(quote.toUpperCase());

        //Removes all the spaces
        System.out.println(quote.trim());

        //Returns a substring from start to the end.
        System.out.println(quote.substring(8));

        //Returns a substring from the start index to the end index
        System.out.println(quote.substring(2, 12));

        //Returns a new string after replacing not with yes
        System.out.println(quote.replace("not", "yes"));

        //Returns true if the name starts with the string “To”.
        System.out.println(quote.startsWith("To"));

        //Returns true if the name ends with the string “be”
        System.out.println(quote.endsWith("be"));

        //Returns the character at a given index position
        System.out.println(quote.charAt(4));

        //Returns the index of the first occurrence of specified character.
        System.out.println(quote.indexOf("e"));

        //Returns the last index of the specified character
        System.out.println(quote.lastIndexOf("e"));

        //Returns true if the given string is equal to quote
        System.out.println(quote.equals("To be or not to be"));

        //Returns true if two strings are equal, ignoring the case of characters.
        System.out.println(quote.equalsIgnoreCase("to be or not to be"));

    }
    
}
