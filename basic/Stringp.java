package basic;

public class Stringp {
    public static void main(String[] args) {
        //Sting decleration and initilaization
        String Greey = "Hello";

        String tet = "finmejpomoijeg656enpoe";
        System.out.println("String length "+tet.length());

        //Change String to upper or lower case
        String sample = " meet My brother";

        System.out.println(sample.toLowerCase());
        System.out.println(sample.toUpperCase());

        //example of indexOf() method 
        String findiex = "Please locate where 'locate' occurs!";

        System.out.println(findiex.indexOf("l"));

        //String concatinate using + oprater
        System.out.println(findiex+tet);

        System.out.println(findiex.concat(sample));

        String scaString = "ineinpom insdf \"onnidnf\" anfinpn ofnefo ojfejof\\feio ioenfenofn";

        System.out.println(scaString);

    }
}
