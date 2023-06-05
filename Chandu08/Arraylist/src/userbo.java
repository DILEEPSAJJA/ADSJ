import java.util.Scanner;
public class userbo{
	int idx=0;
	public int addUser(user[] userArray,user userIns,int noOfUsers)
	{
		userArray[idx++]=userIns;
	}
	public void displayAll(user[] userArray) {
		for(int i=0;i<idx;i++)
		{
			System.out.println("userArray" +(i+1));
			System.out.println(userArray[i].toString());
		}
	}
public void sortUsers(user[] userArray)
{
	int i,j;
	user temp;
	for(i=0;i<idx-1;i++) 
	{
		for(j=0;j<idx-i-1;j++)
		{	
	
		   if(userArray[j].getName().compareTo(userArray[j+1].getName())>0)
		   {
			   temp=userArray[j];
			   userArray[j]=userArray[j+1];
			   userArray[j+1]=temp;
		   }
		}
	}	
}
public boolean deleteuser(user[] userArray,String name,int noOfUsers)
{
	   for(int i=0;i<idx;i++)
	   {
		   if(userArray[i].getName().contentEquals(name)==true)
		   {
			   for(int k=i;k<idx-1;k++)
			   {
			     userArray[k]=userArray[k+1];
			     
		     }
			   idx--;
			   userArray[idx]=null;
			   return true;
	   }
  }
	return false;
}
	   

 


