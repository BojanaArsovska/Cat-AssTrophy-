import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCharacters {

	//declare non-changable things as constants
	//good practice
	final String EMPTY_STRING = "";
	final int MAX_INPUT_SIZE = 20;
	
	//declare common identifiers as class variables
	//good practice
	Scanner in;
	PrintStream out;
	ArrayList<Character> digitList;
	ArrayList<Character> letterList;
	int totalItems;
	
	//constructor to initialize all the class variables
	///good practice
	public ReadCharacters() {
		in = new Scanner("this is the input"); // instead of reading from console(buggy), we will hard code the input here
											   //This is for tesitng purposes, submit with "System.in"
		out = new PrintStream(System.out);
		digitList = new ArrayList<>();
		letterList = new ArrayList<>();
		totalItems = 0;
	}
	
	public static void main(String args[]) {
		//created a method start and created a new object of ReadCharacter and then called the start method.
		//this is done so that only your main method remains static, everything else does not have to be static now
		//good practice
		
		new ReadCharacters().start();
	}
	
	public void start() {
		in.useDelimiter(EMPTY_STRING);
		parseInput();
		print(digitList);
		print(letterList);
	}
	
	public void parseInput() {
		
		//keep reading while the input has more elements
		while(in.hasNext()) {
			if(totalItems > MAX_INPUT_SIZE) {
				//return extra input error
			}
			//reads the next character from input
			char nextChar = readNextChar(in);
			
			//if it is space, then skip to the next input
			if(isSpace(nextChar)) {
				continue;
			} else if(isDigit(nextChar)) {
				digitList.add(nextChar);
				totalItems++;
			} else if(isLetter(nextChar)) {
				letterList.add(nextChar);
				totalItems++;
			} else {
				//if it is not a space or a digit or a letter, that means it is a speacial character / error. Continue to next input
				continue;
			}
		}
	}
	
	//only this method should have a print statement, every other method should not deal with printing
	///good practice
	public void print(ArrayList<Character> list) {
		for(int i=0; i<list.size(); i++) {
			out.println(list.get(i));
		}
	}
	
	//made functions to do every little bit of work
	//makes your code portable
	//good practice
	
	public char readNextChar(Scanner in) {
		return in.next().charAt(0);
	}
	
	public boolean isLetter(char c) {
		return Character.isLetter(c);
	}
	
	public boolean isDigit(char c) {
		return Character.isDigit(c);
	}
	
	public boolean isSpace(char c) {
		return c == ' ';
	}
}
