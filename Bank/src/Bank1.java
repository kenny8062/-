import java.util.Scanner;
public class Bank1 {
	private int account1;
	private int account2;
	public int getaccount1(){
		return account1;
	}
	public int getaccount2(){
		return account2;
	}
	public int withdrawal1(){
		System.out.print("How much");
		Scanner input1=new Scanner(System.in);
		int much=input1.nextInt();
		while(true){
			account1 -=much;
			if(account1<0){
				System.out.println("ÀÜ¾×¾ø¾î¿ä");
				account1+=much;
				return account1;
			}
			else if(account1>=0){
				return account1;
			}
		}
	}	 
	public int withdrawal2(){
		System.out.print("How much");
		Scanner input1=new Scanner(System.in);
		int much=input1.nextInt();
		while(true){
			account1 -=much;
			if(account1<0){
				System.out.println("ÀÜ¾×¾ø¾î¿ä");
				account1+=much;
				return account1;
			}
			else if(account1>=0){
				return account1;
			}
		}
	}	 
	public int credit1(){
		System.out.print("How much");
		Scanner input3=new Scanner(System.in);
		int much=input3.nextInt();
		account1 +=much;
		return account1;

	}
	public int credit2(){
		System.out.print("How much");
		Scanner input3=new Scanner(System.in);
		int much=input3.nextInt();
		account2 +=much;
		return account2;
	}
	public Bank1(int account1_,int account2_){
		account1=account1_;
		account2=account2_;
	}

}

