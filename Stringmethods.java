public class Stringmethods {
    public static void main(String[] args){
        String a = "Ruchi";
        System.out.println(a);
        String a1 = new String("ruchi");
        System.out.println(a1);

        int value = a.length();
        System.out.println(value); //5

        String ls = a.toLowerCase();
        System.out.println(ls); //ruchi

        String us = a.toUpperCase();
        System.out.println(us); //RUCHI

        String nonTrimmedString = "                    ruchi                       ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(a.substring(3)); //hi
        System.out.println(a.substring(2,5)); //chi

        System.out.println(a.replace('c', 'u')); //Ruuhi
        System.out.println(a.replace("Ru", "Su")); //Suuchi

        System.out.println(a.startsWith("Ruc")); //true
        System.out.println(a.startsWith("Suc")); //false
        System.out.println(a.endsWith("Ruc")); //false

        System.out.println(a.charAt(0)); //R
        System.out.println(a.indexOf("c")); //2
        System.out.println(a.indexOf("2")); //-1
        System.out.println(a.indexOf("c", 2)); //2

        System.out.println(a.lastIndexOf("hi")); //3
        System.out.println(a.lastIndexOf("hi", 2)); //-1
        System.out.println(a.lastIndexOf("hi", 3)); //3
        System.out.println(a.lastIndexOf("hi", 5)); //3

        System.out.println(a.equals("Ruchi"));
        System.out.println(a.equals("ruchi"));
        System.out.println(a.equalsIgnoreCase("RuChI"));

        //Escape Sequence
        System.out.println("Its a Escape Sequence \" double quote");
        // \t, \n, \b, \r, \f, \*, \" 
    }
}
