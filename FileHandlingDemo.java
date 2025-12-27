import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            // Write to file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello CODTECH Internship\n");
            writer.write("This is File Handling Task\n");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Reading File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Modify (Append) file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("File Modified Successfully\n");
            appendWriter.close();

            System.out.println("File Modified Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
