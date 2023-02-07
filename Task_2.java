package Home_Work;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {
        
        FileReader reader = null;

        String text = "";
        List name = new ArrayList<>();
        List surname = new ArrayList<>();
        List fname = new ArrayList<>();
        List sex = new ArrayList<>();
        List age = new ArrayList<>();
        List sortt = new ArrayList<>();

        try{
            reader = new FileReader("Home_Work/db.txt");

            while (reader.ready()){
        
            text += (char) reader.read();
            
            }
           
           
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        //2.Разбить по строкам и вывести в консоль 
        String[] help = text.split("\n");

        for (int i = 0; i < help.length; i++) {

            System.out.println(help[i]);
            
        }
         //3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
        for (int index = 0; index < help.length; index++) {

            String[] x =help[index].split(" ");
            name.add(x[1]);
            surname.add(x[0]);
            fname.add(x[2]);
            sex.add(x[3]);
            int y = Integer.parseInt(x[4].trim());
            age.add(y);
            sortt.add(y);

        }

            //4.Отсортировать по возрасту используя дополнительный список индексов.

            Collections.sort(sortt);

            for (int i = 0; i < sortt.size(); i++) {

                int j = age.indexOf(sortt.get(i));
                
                StringBuilder out = new StringBuilder();
                out
                    .append(surname.get(j))
                    .append(name.get(j))
                    .append(" ")                 
                    .append(" ")
                    .append(fname.get(j))
                    .append(" ")
                    .append(sex.get(j))
                    .append(" ")
                    .append(age.get(j))
                    ;
                System.out.println(out);
            


                
            




            
        }
  
    }
    
}
