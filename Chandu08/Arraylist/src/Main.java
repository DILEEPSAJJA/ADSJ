import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String name;
String mobileNumber;
String userName;
String password;
userbo u1=new userbo();
System.out.println("enter no of users");
int noOfUsers=sc.nextInt();
boolean res;
int value=0;
user[] userArray=new user[noOfUsers];
System.out.println("1.sorting");
System.out.println("\n 2. insertion");
System.out.println("\n 3. deletion "); 
do {
	 int choice;
	 System.out.println("enter choice");
     choice=sc.nextInt();
  Switch(choice);
  {
  case1:
      System.out.println("enter  the name");
      name=sc.next();
     mobileNumber=sc.next();
     System.out.println("enter userName");
     userName=sc.next();
     value=userbo.addUser(userArray,newUser(name,mobileNumber,userName,password),noOfUsers);
     if(value==-1)
	   System.out.println("can not add");
 break;
	case2:
		u1.sortUsers(userArray);
		System.out.println("array sorted");
  break;		
  case3:
		System.out.println("users name ");
		name=sc.next();
	    res=userbo.deleteuser(userArray,name,noOfUsers);
		if(res)
			System.out.println("user deleted");
		else
			System.out.println("user not found");
		break;
	case4:
		userbo.displayAll(userArray);
		break;
	case5:
		return;
     }while(true);
   }
 }

private static void Switch(int choice) {
	// TODO Auto-generated method stub
	
}
} 
  

		
  
  







