import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] name = {"Айдай","Анель","Дильназ"};
//        for(String a: name){
//            System.out.println(a+" - Мен сени жакшы кором");
//        }
//






    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
System.out.println(method(s));

}
    static String method(String soz) {
        String soz1 = soz.toUpperCase();
        soz1.trim();
        if (soz1.contains("A")) {
            return soz1.substring(soz1.indexOf("A"));
        } else {
            return "JOK";
        }


    }
}





