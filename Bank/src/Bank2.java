import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args){
		Bank1 bank=new Bank1(50,0);
		System.out.println("1.account1수정 2.account2수정 3.출력 4.종료");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		while(true){
			if(num1==1){
				System.out.println("1.입금 2.출금");
				int num2=input.nextInt();
				if(num2==2){
					bank.withdrawal1();
				}
				if(num2==1){
					bank.credit1();
				}
			}
			else if(num1==2){
				System.out.println("1.입금 2.출금");
				int num2=input.nextInt();
				if(num2==2){
					bank.withdrawal2();
				}
				if(num2==1){
					bank.credit2();
				}
				
			}
			else if(num1==3){
				System.out.printf("account1 :%d account2:%d\n",bank.getaccount1(),bank.getaccount2());
			}
			else if(num1==4){
				break;
			}
			System.out.println("1.account1수정 2.account2수정 3.출력 4.종료");
			num1=input.nextInt();
		}
		
	}
}
