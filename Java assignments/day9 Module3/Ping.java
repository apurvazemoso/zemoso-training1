package ping;
import java.io.*;  
import java.io.IOException;
import java.util.Vector;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Collections;


class Ping {

    /*finds median*/
    public static void FindMedian(Vector<Double>myVector){
         Collections.sort(myVector);
         Double median;
         int len = myVector.size();
         if(len % 2 == 0) median = (myVector.get(len/2)+myVector.get((len/2) - 1))/2;
         else median = myVector.get(len/2);
         System.out.println("Median is "+ median);
    }

    public static void main(String[] args) {
        Scanner readerIP = new Scanner(System.in);
        System.out.println("Enter IP - ");
        String ip = readerIP.next();
        System.out.println("Enter number of times you want to ping - ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        String pingCmd = "ping "+ ip  + " -c "+n;
        //ping www.google.com -c 5
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);
            Vector<Double> myVector=new Vector<Double>(n,200);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String inputLine;
            //System.out.println(in.readLine());
            while ((inputLine=in.readLine()) != null) {
               String[] line = inputLine.split("time=");
               //int[] times  = new int[n];

                if(line.length > 1){
                    String temp = line[1].split(" ")[0];
                    double foo = Double.parseDouble(temp);
                    myVector.add(new Double(foo));
                }
            }
            FindMedian(myVector);
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
