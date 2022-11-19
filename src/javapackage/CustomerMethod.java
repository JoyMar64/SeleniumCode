package javapackage;

public class CustomerMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj= new Customer();
		obj.name= "Joyce";
		obj.sex= "Female";
		obj.SSN= "123-45-6789";	
		obj.fee= "$650";
		
		System.out.println("Fee amount for customer 1 is "+obj.fee);
		
		Customer obj2= new Customer();
		obj2.name= "Roland";
		obj2.sex= "Male";
		obj2.SSN= "321-45-6789";	
		obj2.fee= "$750";
		
		System.out.println("Fee amount for customer 2 is "+obj2.fee);
		
		Customer obj3= new Customer();
		obj3.name= "Ravi";
		obj3.sex= "Male";
		obj3.SSN= "321-00-6789";	
		obj3.fee= "$850";
		
		System.out.println("Fee amount for customer 3 is "+obj3.fee);
	}

}
