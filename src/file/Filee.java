package file;
import java.util.Scanner;
public class Filee {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("enter  your Fullname_with_initial:");
		String Fullname_with_initial=input.nextLine();
		System.out.println("enter your RollNo:");
        String RollNo=input.nextLine();
        System.out.println("enter your grade");
        String Grade=input.nextLine();
        System.out.println("enter your Percentage:");
        int Percentage=input.nextInt();
        System.out.println(Fullname_with_initial);
        System.out.println(RollNo);
        System.out.println(Grade);
        System.out.println(Percentage);
        input.close();
	}

}
