package workWithFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            s1 = file.readLine();
            System.out.println(s1);
            
            long position = file.getFilePointer();
            System.out.println("position = " + position);

//            file.seek(0);
//            file.writeBytes("Hello");

            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
