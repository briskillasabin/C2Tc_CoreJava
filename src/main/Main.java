package main;

public class Main {
	public static void main(String[] args) {
		Student student =new Student();
		Commision commision =new Commision();
		commision.Acceptdetails_Employee("Sabii","1025 vlo nagar",9987543987,90000);
		double commisionAmount=commision.CalculateCommision();
		System.out.println("Commission amount:$"+commisionAmount);
	}
}
