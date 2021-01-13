package game;
import java.util.Scanner;
public class game {

	public static void main (String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("scissor(0), rock(1), paper(2) : ");
		int player=input.nextInt();
		int computer=(int)(Math.random()*2);
		
		if (computer==0 && player==1)
		
			
		System.out.println("The computer is scissor. You are rock you won");
		else if (computer==0 && player==2)
		
		{System.out.println("The computer is scissor. You are paper the computer won");	
		}
		else if (computer==1 && player==2)
	
	{System.out.println("The computer is rock.You are paper you won");
	}
		else if (computer==1 && player==0)
		
	{System.out.println("The computer is rock. You are scissor the computer won");
	}
		else if (computer==2 &&player ==0)
	
	{System.out.println("the computer is paper. You are scissor you won");
	}
		else if (computer==2 && player==1)
		
		{System.out.println("The computer is paper. You are rock the computer won");
				}
		
		if (player==computer && computer==0)
		{System.out.println("the computer is scissor. You are scissor too .it is a draw");}
		
		if (player==computer && computer==1)
		{System.out.println("the computer is rock .You are rock too .it is a draw");}
		
		if (player==computer && computer==2)
		{System.out.println("the computer is paper .You are paper too .it is a draw");}
			}
}
