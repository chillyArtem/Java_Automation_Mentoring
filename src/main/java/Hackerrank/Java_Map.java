package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/29/2018.
 */
public class Java_Map {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> phoneBook = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            int phone = Integer.parseInt(reader.readLine());
            phoneBook.put(name, phone);
        }

        for (String s = reader.readLine(); s != null; s = reader.readLine()) {
            if (phoneBook.containsKey(s)) System.out.println(s + "=" + phoneBook.get(s));
            else System.out.println("Not found");
        }

    }
}
