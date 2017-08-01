/*Write an application to implement the basic functions for the Online 
Banking Application (Hint: -Use synchronized).  */
  
package asst8_3;

public class Account   //Creating the class to store the account details. 
{
	int balanceAmt;   //int variable to store the balance of the Acoount.
	
	//Constructor.
	public Account(int balanceAmt)
	{
		//Initializing instance variable of class by parameter passed in the constructor.
		this.balanceAmt=balanceAmt;
	}
	
	//Method to deposit amount in the bank.
	public void depositMoney(int depositAmt)
	{
		balanceAmt = balanceAmt + depositAmt ;   //We are increasing balanceAmt by adding depositAmt.
		
		System.out.println("Rs "+depositAmt+"/- is successfully deposited in your Account.");   //Printing Statement.
		System.out.println("Your available balance is Rs. "+balanceAmt);     //Printing Statement.
	}
	
	//Method to withdraw money in the bank.
	public void withdrawMoney(int withdrawnAmt)
	{
		//Checking that there is sufficient balance or not.
		if(balanceAmt < withdrawnAmt)
		{
			System.out.println("Sorry, you have Insufficient Balance in your Account.");   //Printing Statement.
		}
		else
		{
			balanceAmt = balanceAmt - withdrawnAmt;    //Reducing amount balance by withdrawnAmt.
			
			System.out.println("You have withdrawn Rs. "+withdrawnAmt);      //Printing Statement.
			System.out.println("Your remaining balance in your account is Rs. "+balanceAmt);     //Printing Statement.
		}
	}
	
}     //End of class.