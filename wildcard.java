import java.util.ArrayList;
import java.util.Scanner;

public class wildcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;
        if (1 <= t && t <= 50) {
            for (int i = 0; i < t; i++) {
                String x = sc.next();
                String y = sc.next();
                for (int j = 0; j < x.length(); j++) {
                    if (x.charAt(j) == '?' || y.charAt(j) == '?' || x.charAt(j) == y.charAt(j)) {
                        c++;
                    }
                }

                if (c == x.length()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }
    }
}
