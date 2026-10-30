import java.io.*;

public class TestFinally {
    public static void main(String[] args) {
        System.out.println("entrer votre code ");

        try {
            int x = System.in.read();
            System.out.println("Code lu : " + x);
        } catch (IOException exception) {
            System.out.println("Une erreur de lecture s'est produite.");
        } finally {
            System.out.println("Merci de votre visite");
        }
    }
}
