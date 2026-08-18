import java.util.Scanner;

public class Main{
  
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("===== SIMPLE CALCULATOR =====");
System.out.println("Enter First number : "); 

int firstNumber = input.nextInt(); 

System.out.println("Enter Second number : "); 

int secondNumber = input.nextInt(); 

System.out.println("First number : "+firstNumber);

System.out.println("Secondt number : "+secondNumber);
System.out.println("Choose operation :");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
int choice = input.nextInt();
System.out.println("You choose "+ choice);
if (choice ==1){
System.out.println("Result : "+ (firstNumber + secondNumber));
}
else if(choice ==2){
System.out.println("Result : "+ (firstNumber - secondNumber));
}
else if(choice ==3){
System.out.println("Result : "+ (firstNumber * secondNumber));
}
else if(choice ==4){
if (secondNumber==0){
System.out.println("Cannot divide by zero.");
}
else {

System.out.println("Result : "+ (firstNumber/ secondNumber));
}
}
else {
System.out.println("Invalid choice.");
}

input.close();

}

}
