package javapackage;

public class Customer {
	String name;
	String sex;
	String SSN;
	String fee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj= new Customer();
				obj.name= "Joyce";
				obj.sex= "Female";
				obj.SSN= "123-45-6789";	
				obj.fee= "$650";
				
				System.out.println("Name of customer1 "+obj.name);
				System.out.println("Sex of customer1 "+obj.sex);
				System.out.println("customer1 SSN "+obj.SSN);
				System.out.println("Fee of customer1 "+obj.fee);
			
		
				Customer obj2= new Customer();
				obj2.name= "Roland";
				obj2.sex= "Male";
				obj2.SSN= "322-45-6789";	
				obj2.fee= "$850";
				
				System.out.println("Name of customer2 "+obj2.name);
				System.out.println("Sex of customer2 "+obj2.sex);
				System.out.println("customer2 SSN "+obj2.SSN);
				System.out.println("Fee of customer2 "+obj2.fee);	

		Customer obj3= new Customer();
				obj3.name= "Ravi";
				obj3.sex= "Male";
				obj3.SSN= "321-00-6789";	
				obj3.fee= "$750";
				
				System.out.println("Name of customer3 "+obj3.name);
				System.out.println("Sex of customer3 "+obj3.sex);
				System.out.println("customer3 SSN "+obj3.SSN);
				System.out.println("Fee of customer3 "+obj3.fee);
				
	}

}
