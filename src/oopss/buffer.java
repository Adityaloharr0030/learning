package oopss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ur age: ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("age : "+age);

    }
}
