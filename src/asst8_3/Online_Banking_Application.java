/*Show deposit and withdraw functionality for the Online Banking Application 
(Using synchronized). Also, compare your output without using synchronized.  */
package asst8_3;

public class Online_Banking_Application {

		public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.  
		{
			Account commonObject = new Account(1000);   //Creating Account object which have 1000 Rs. balance initially.
			
			//Now we are assuming that there are three persons who have created their joint account which is as above object.
			//So we need to make three objects for Customer class for three persons.
			//But we will pass same Account object for them in that constructor, because they have joint account.
			Customer firstCustomer = new Customer(commonObject , "Virat Kohli");
			Customer secondCustomer = new Customer(commonObject , "Dhoni");
			Customer thirdCustomer = new Customer(commonObject , "Yuvraj Singh");
			
			//Then we need to create three thread objects to create Threads.
			//we will pass the three objects of Customer in three Threads constructors respectively.
			Thread firstThread = new Thread(firstCustomer);
			Thread secondThread = new Thread(secondCustomer);
			Thread thirdThread = new Thread(thirdCustomer);
			
			//Now we have to start the thread.
			firstThread.start();  
			secondThread.start();  
			thirdThread.start();
		}    //End of main function. 

		//COMPARISION BETWEEN CODE WHEN SYNCHRONIZED IS USED AND WHEN IT IS NOT USED-------
		/*
		 * Here, we are using synchronized block in run method.
		 * The use of that block here is to avoid use of same content of code by two threads at a time.
		 * For example, If we have two threads both are of class Customer.
		 * And if we start executing both threads, We don't know that at which point of time, which thread will be running.
		 * If let's say, You have 1000 Rs. balance in your Account.
		 * You have made two threads ThreadA and ThreadB. 
		 * ThreadA is passed to withdraw 600 Rs and ThreadB is passed to withdraw 500 Rs.
		 * If we execute the program without synchronized block , Then at that time, both threads will be in Runnable State for the function run() 
		 * in Customer class. And condition will be satisfied that (600 < 1000) and (500 < 1000). So both will be executed.
		 * And total withdrawn money will be 1100. But we had only 1000 Rs. in our balance.
		 * This problem occurred because both threads are working on same source code at the same time.
		 * We can encounter this problem by making restriction that at a time, only one thread is allowed to work on that source code.
		 * When the work of that thread completes, then only second thread is allowed to work.
		 * This restriction is called synchronization.
		 * We can use synchronized keyword with variables, methods and we even can make synchronized blocks like above.
		 * We will not be able to say that which Thread will execute first on synchronized block,
		 * But we can say that at a time, Only one thread will be working on that block. 
		 */
		
	}    //End of class.