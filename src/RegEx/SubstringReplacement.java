package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringReplacement {
    public static void main(String[] args) {
        System.out.println("Input some string");
        Scanner st1 = new Scanner(System.in); //input string
        String st = st1.nextLine(); //assignment to the variable st of the entered string
        Scanner scan = new Scanner(System.in); //that's substring is need replacement
        String scan1 = scan.nextLine();
        Scanner scan2 = new Scanner(System.in); //new substring
        String scan3 = scan2.nextLine();
        //create the pattern
        Pattern pattern = Pattern.compile(scan1);
        Matcher m = pattern.matcher(st);
        st = m.replaceAll(scan3);
        System.out.println(st);


    }
}
