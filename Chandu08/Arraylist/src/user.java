import java.util.Scanner;
public class user
{
    private String name;
    private String mobileNumber;
    private String userName;
    private String password;
  
   
 public user()
{
   super();
   
}
public user(String name,String mobileNumber,String userName,String password)
{
   this.name=name;
   this.mobileNumber=mobileNumber;
   this.userName=userName;
   this.password=password;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String toString(){
   
 return "Name:"+name+ "\n mobileNumber:"+mobileNumber+ "\n userName:" +userName+ "\n password" +password;
 
 
 }
