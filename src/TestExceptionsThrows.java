import java.io.*;

public class TestExceptionsThrows {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("Sample.jpg");
        File outputFile1 = new File("Output1.jpg");
        FileInputStream in1 = new FileInputStream(inputFile);
        FileOutputStream out1 = new FileOutputStream(outputFile1);
        int c1;

        while ((c1 = in1.read()) != -1) {
            out1.write(c1);
        }

        in1.close();
        out1.close();
    }
}
