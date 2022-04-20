package Assignments;

import java.io.*;

public class FileHandling {

    public static void main(String args[]) throws IOException {
        File file = new File("/home/palakb/IdeaProjects/solid-principles/abc.txt");
        boolean fileCreated =  file.createNewFile();
        if(fileCreated == true)
            System.out.println("file created");
        else System.out.println("file not created");
        System.out.println("path of file is " +file.getAbsolutePath()); // return the path of file
        System.out.println("file name is : " +file.getName()); // return the name of file
        System.out.println("Length of file is " +file.length());
        String lastModify = file.toString();
        System.out.println("last modified :" +file.lastModified());
        BufferedReader reader = new BufferedReader(new FileReader(file)); //a class which simplifies reading text from a character input stream.
        file.renameTo(new File("soumya.txt"));
        String fileWrite = "Hello, How are you ??";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(fileWrite);
        writer.close();
        String fileRead = reader.readLine();
        if(fileRead != null)
        {
            System.out.println(fileRead);
        }
        else System.out.println("File is empty");

        boolean fileDelete = file.delete();
        if(fileDelete == true)
        {
            System.out.println("file is deleted");
        }

        else System.out.println("file is not deleted");
    }


}
