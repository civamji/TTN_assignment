// Java code for adding elements in Set
import java.sql.SQLOutput;
import java.util.*;
public class q2unique_char {
    public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<String>();
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find unique characters");
        String string = scanner.nextLine();


        String[] chars = string.split("");

        for (String s : chars) {
            hash_Set.add(s);
        }
        System.out.println("Total no: " + hash_Set.size()+ " values are: "+hash_Set);

    }
}
