import java.util.Scanner;

public class LazyDays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = in.nextDouble();
        if(temp >= 80 && temp <=95) {
            System.out.println("swimming");
        } else {
            if(temp >= 60 && temp <80) {
                System.out.println("tennis");
            } else {
                if(temp >= 40 && temp <60) {
                    System.out.println("golf");
                } else {
                    if (temp >20 && temp <40)
                    System.out.println("skiing");
                }
            }
        }
        if(temp > 95 || temp <20) {
            System.out.println("Visit our shops!");
        }
    }

}