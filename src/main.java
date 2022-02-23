import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myStr = in.next();

        System.out.print(myStr.toLowerCase().contains("ant"));

        String carNumber = in.next();

        String regex = "^[A-Z][0-9]{3}[A-Z]{2}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(carNumber);
        System.out.println(matcher.matches());

        String capitalStr = in.next();

        capitalStr = capitalStr.replaceAll("[^a-z]", "");

        System.out.println(capitalStr);

        in.nextLine();
        ArrayList<String> reversed = new ArrayList<>();
        String seq = in.nextLine();
        String[] seq_part = seq.split(" ");
        for (String word : seq_part) {
            word = new StringBuffer(word).reverse().toString();
            reversed.add(word);
        }

        System.out.println(String.join(" ", reversed));


        String new_seq = in.nextLine();
        int char_3 = 0;
        String[] seq_part2 = new_seq.split(", ");
        for (String word : seq_part2) {
            if (word.length() == 3) {
                char_3 += 1;
            }
        }

        System.out.println(char_3);

        String sorted_s = in.nextLine();

        String[] list_sort = sorted_s.split(" ");

        Arrays.sort(list_sort, new java.util.Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        // TODO: Argument validation (nullity, length)
                        return s1.length() - s2.length();
                    }
                });

        System.out.println(Arrays.toString(list_sort));

        in.close();
        }
    }
