package factoryPattern;
import java.io.*;
import java.util.Scanner;

class GenerateBill{

    public static void main(String args[])throws IOException{


        GetPlanFactory planFactory = new GetPlanFactory();



        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Scanner scanner = new Scanner(System.in);


        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);


    }
}