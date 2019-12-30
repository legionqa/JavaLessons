package lesson3;

public class Lesson3Main {
    public static void main(String[] args) {

        String text = "12345";
        Lesson3Main lesson3Main = new Lesson3Main();
        int result = lesson3Main.getStringLength(text);
        System.out.println("The length of text is: " + result);
        lesson3Main.compareTwoStrings("cat is a nice animal", "cat");
        lesson3Main.isTheTextPartOf("cat is a nice animal", "cat");
        lesson3Main.castVariables();
        lesson3Main.stringFunctionality();

        String res = lesson3Main.stringReverse("automation");
        System.out.println(String.format("the reverse is: %s", res));

    }

    //This method will receive text and return it`s length
    public int getStringLength(String txt) {

        boolean checkNotEmpty = checkIfTheTextEmpty(txt);

        if (checkNotEmpty) {
            int length = txt.length();
            return length;
        } else {
            return 0;
        }

    }

    //This method will receive text and return if it`s null/empty or not
    public boolean checkIfTheTextEmpty(String txt) {
        if (txt != null && txt.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //This method will receive two Strings and compare it
    public void compareTwoStrings(String txt1, String txt2) {

        if (txt1.equalsIgnoreCase(txt2)) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");

        }
    }

    //This method will check if the String is a part of another String
    public void isTheTextPartOf(String fullText, String textChunk) {

        if (fullText != null && textChunk != null) {

            if (fullText.contains(textChunk)) {
                System.out.println("Text was found");
            } else {
                System.out.println("Text was not found");
            }
        }
    }

    //this method is demonstrating conversions and castings of variables
    public void castVariables() {
        int i = 94854;
        String numTxt = String.valueOf(i);
        System.out.println(numTxt.length());

        int numFromString = Integer.parseInt(numTxt);
        System.out.println(numFromString * 2);
        double myDouble = 3.55;
        int myInt = (int) myDouble;

        System.out.println("double: " + myDouble);
        System.out.println("int: " + myInt);
    }

    //this method is demonstrating basic Strings functionality

    public void stringFunctionality() {
        System.out.println("example".toUpperCase());
        System.out.println("EXAMPLE".toLowerCase());
        System.out.println("example".replace("le", "les"));

        System.out.println("example".endsWith("ex"));
        System.out.println("example".endsWith("le"));

        String text = "example";

        System.out.println(text.charAt(text.length() - 1));


        String error = "Null pointer exception";
        int errorCode = 500;

//        String fullText= "The error is " + error + " The error code is " + errorCode;
        String fullText = String.format("The error is \"%s\", The error code is %d", error, errorCode);
        System.out.println(fullText);
    }

    //This method will receive String and reverse it
    public String stringReverse(String text) {
        if (text == null || text.length() < 1) {
            System.out.println("Text is null or empty");
            return null;
        } else {
            String result = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                result = result + text.charAt(i);
            }
            return result;

        }

    }


}
