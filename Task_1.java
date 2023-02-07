package Home_Work;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_1 {

    public static void main(String[] args) {
        
        FileWriter fileWriter = null;
        FileReader reader = null;

        try{

            fileWriter = new FileWriter("db.sql");
            fileWriter.append("Привет мир!\n");
            fileWriter.append("Hello world!");
            fileWriter.flush();    
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        String text = " ";
        try{
            reader = new FileReader("db.sql");

            while (reader.ready()){
                text += (char) reader.read();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(text);
    
    }
    
}
