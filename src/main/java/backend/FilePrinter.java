package backend;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) throws IOException {


        FileInputStream fstream = new FileInputStream("C:\\Users\\Good\\OneDrive\\Desktop\\Coding\\SPRING-WEBSITES\\CCtest2\\src\\main\\java\\backend\\FilePrinter.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console - do what you want to do
            System.out.println (strLine);
        }

//Close the input stream
        fstream.close();

    }
}
