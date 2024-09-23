import java.util.*;
public class practice1 {
    public static void main(String args[]){
        Scanner db = new Scanner(System.in);
    //     int a = db.nextInt();
    //     int b = db.nextInt();
    //     int c = db.nextInt();
    //     int ave = (a + b + c) / 3 ;
    //     System.out.println("ave is :" + ave);

            //  int side = db.nextInt();
             
            //  int area = side * side ;
            //  System.out.println("area :" + area);

            // System.out.println(area);

               float pencil = db.nextFloat();
               float pen = db.nextFloat();
               float eraser = db.nextFloat();
               float total = pencil + pen +eraser ;
            
               System.out.println("Bill is  :" + total);


               float newtotal = total +(0.18f * total);
               System.out.println("Bill with 18% tax :"  + newtotal);


     }
}
