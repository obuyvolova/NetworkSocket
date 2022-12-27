import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

           // out.println("Netology");
            String response = in.readLine();
            System.out.println(response);

            String response2 = in.readLine();
            System.out.println(response2);

            String name = sc.nextLine();

            out.println(name);
            String response3 = in.readLine();
            System.out.println(response3);

            String age = sc.nextLine();

            out.println(age);
            String response4 = in.readLine();
            System.out.println(response4);
            String response5 = in.readLine();
            System.out.println(response5);

            String cocktail = sc.nextLine();
            out.println(cocktail);

            String response6 = in.readLine();
            System.out.println(response6);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
