package InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The value of buffer reader in String Tokenizer: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        while (n-- > 0) {
            System.out.println("The value of x: ");
            int x = Integer.parseInt(br.readLine());
            if (x % k == 0) {
                count++;
            }
            System.out.println(count);
        }
        System.out.println(count);
    }
}
