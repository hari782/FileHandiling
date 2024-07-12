import java.io.*;
import java.util.*;
public class FileOutputStream {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\HP\\Downloads\\Java\\result.txt");
            FileWriter fw = new FileWriter(f);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the text: ");
            String a = s.nextLine();
            s.nextLine();
            String[] b = { "small","caps","symbol","num" };
            
            if(b.equals("small")){
                for(int i=0;i<a.length();i++){
                    char ch = a.charAt(i);
                    if(isAlphabetic(ch)){
                        fw.write(ch);
                    }
                }
            }
            fw.close();
            System.out.print("Sucess..");
        } catch(Exception obj){
            obj.printStackTrace();
        }
    }
}
