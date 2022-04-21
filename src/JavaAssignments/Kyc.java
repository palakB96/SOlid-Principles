package JavaAssignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Kyc {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        System.out.println("Enter no. of inputs : ");
        int noOfInputs = s.nextInt();
        while(noOfInputs-- > 0) {
            System.out.println("Enter register date in (dd-mm-yyyy) format : ");
            String registerDate = s.next().trim();

            System.out.println("Enter the Current date in (dd-mm-yyyy) format: ");
            String currDate = s.next().trim();


            findSolution(registerDate, currDate, result);

        }
        System.out.println("Output is: ");
        for(String res : result)
            System.out.println(res);


        }

    private static void findSolution(String registerDate, String currDate, ArrayList<String> result) {
        String[] registerDateArr1 = registerDate.split("-");
        String[] currDateArr1 = currDate.split("-");

        if(currDateArr1.length != 3 || registerDateArr1.length != 3) // if date format is not correct
        {
            result.add("Enter date format is not correct");
            return;
        }

        if(registerDateArr1[2].length() != 4 || currDateArr1[2].length() != 4 || registerDateArr1[1].length() != 2 || currDateArr1[1].length() != 2 || registerDateArr1[0].length() != 2 || currDateArr1[0].length() != 2)
        {
            result.add("Enter date format is not correct");
            return;
        }

        String[] registerDateArr = new String[3]; // year, month, day
        registerDateArr[0] = registerDateArr1[2];
        registerDateArr[1] = registerDateArr1[1];
        registerDateArr[2] = registerDateArr1[0];

        String[] currDateArr = new String[3]; // year, month, day
        currDateArr[0] = currDateArr1[2];
        currDateArr[1] = currDateArr1[1];
        currDateArr[2] = currDateArr1[0];


    // 15 april 2020 register ><>< 14 april 2020
        if(Integer.parseInt(registerDateArr[1]) >= Integer.parseInt(currDateArr[1]) && Integer.parseInt(registerDateArr[2]) >= Integer.parseInt(currDateArr[2]) && Integer.parseInt(registerDateArr[0]) >= Integer.parseInt(currDateArr[0])) // if current month is less than equal && current date && current year is less than registered date (not valid)
    {
        result.add("No range");
        return;
    }

        if(registerDate.equals(currDate))
    {
        // registration and current date is same
        result.add("No range");
        return;
    }

        if(Integer.parseInt(registerDateArr[1]) - Integer.parseInt(currDateArr[1]) == 1 || Integer.parseInt(registerDateArr[1]) - Integer.parseInt(currDateArr[1]) == 0)
    {
        String year = currDateArr[0];
        String month = registerDateArr[1];
        String day = registerDateArr[2];

        String requiredDate = year + "-" + month + "-" + day;
        LocalDate date = LocalDate.parse(requiredDate);
        String res1 = date.minusDays(30).toString();
        String[] result1 = res1.split("-");
        result.add(result1[2] + "-" + result1[1] + "-" + result1[0] + "   " + currDate);
        return;
    }

    String year = currDateArr[0];
    String month = registerDateArr[1];
    String day = registerDateArr[2];

    String requiredDate = year + "-" + month + "-" + day;
    LocalDate date = LocalDate.parse(requiredDate);

    String res1 = date.minusDays(30).toString();
    String[] result1 = res1.split("-");

    String res2 = date.plusDays(30).toString();
    String[] result2 = res2.split("-");
        result.add(result1[2] + "-" + result1[1] + "-" + result1[0] + "   " + result2[2] + "-" + result2[1] + "-" + result2[0]);
}

}




