import java.util.Scanner;

import static java.lang.System.out;
public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = 5;
        int ans =0;
        while(div<=n){
            ans+=n/div;
            div*=5;
        }
        out.println(ans);


    }

}
