package Assignments;

import java.io.File;
import java.util.Scanner;

public class FindingRegex{
    public static void main(String args[])
    {
        File directory = new File("/home/palakb/IdeaProjects/solid-principles/");
        File[] directoryList = directory.listFiles();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter file name : ");
        String searchFile = s.nextLine().trim();
        AbsPath(directoryList,searchFile);
    }


    public static void AbsPath(File[] file,String searchFile) {

        for(int i = 0; i < file.length; i++)
        {
            String fileName = file[i].toString();
            String[] filenameArr = fileName.split("/");
            String filename = filenameArr[filenameArr.length-1];
            if(searchFile.equals(filename))
            {
                System.out.println(fileName);
            }
        }

    }}
