import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of times a 6 sided die should be rolled");
	int number = scan.nextInt();
	double[] rolls = new double[number];
	if(number >= 1) {
		for(int i = 0; i < number; i ++)
		{
		double x = (Math.round(Math.random()*((6-1)+1))+1);
		System.out.println(x + " was rolled");
		rolls[i] = x;
		}
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		for(int i = 0; i < number; i ++)
		{
		if(rolls[i] == 1) {
			ones++;
		}
		if(rolls[i] == 2) {
			twos++;
		}
		if(rolls[i] == 3) {
			threes++;
		}
		if(rolls[i] == 4) {
			fours++;
		}
		if(rolls[i] == 5) {
			fives++;
		}
		if(rolls[i] == 6) {
			sixes++;
		}
		}
		System.out.println("One: " + ones);
		System.out.println("Two: " + twos);
		System.out.println("Three: " + threes);
		System.out.println("Four: " + fours);
		System.out.println("Five: " + fives);
		System.out.println("Six: " + sixes);
	}
	else{
		System.out.println("No silly, that's not possible!");
		}
	}
}
