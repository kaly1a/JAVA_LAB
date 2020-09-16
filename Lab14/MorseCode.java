/*
Write a class called “MorseCode” with two public variables String code,Character alpha.
Write a parameterised constructor for the same. Create another class called “testmorsecode” which would have a arraylist of type”MorseCode” insert objects into it.
Write code in the “testmorsecode” class to encode a given string into morse code and vice-versa.
*/
import java.util.*;
class MorseCode{
	public String code;
	public char alpha;
	MorseCode(String str){
		this.code = str;
//		this.alpha = c;
	}
	public void strToMorse(){
		StringBuilder res = new StringBuilder("");
		code = code.toUpperCase();
		int l=code.length();
		for(int i=0;i<l;i++){
			char c=code.charAt(i);
			switch(c){
				case 'A' : res.append(" .-    ");
							break;
				case 'B' : res.append(" -...  ");
							break;
				case 'C' : res.append(" -.-.  ");
							break;
				case 'D' : res.append(" -..   ");
							break;
				case 'E' : res.append(" .     ");
							break;
				case 'F' : res.append(" ..-.  ");
							break;
				case 'G' : res.append(" --.   ");
							break;
				case 'H' : res.append(" ....  ");
							break;
				case 'I' : res.append(" ..    ");
							break;
				case 'J' : res.append(" .---  ");
							break;
				case 'K' : res.append(" -.-   ");
							break;
				case 'L' : res.append(" .-..  ");
							break;
				case 'M' : res.append(" --    ");
							break;
				case 'N' : res.append(" -.    ");
							break;
				case 'O' : res.append(" ---   ");
							break;
				case 'P' : res.append(" .--.  ");
							break;
				case 'Q' : res.append(" --.-  ");
							break;
				case 'R' : res.append(" .-.   ");
							break;
				case 'S' : res.append(" ...   ");
							break;
				case 'T' : res.append(" -     ");
							break;
				case 'U' : res.append(" ..-   ");
							break;
				case 'V' : res.append(" ...-  ");
							break;
				case 'W' : res.append(" .--   ");
							break;
				case 'X' : res.append(" -..-  ");
							break;
				case 'Y' : res.append(" -.--  ");
							break;
				case 'Z' : res.append(" --..  ");
							break;
				case '0' : res.append(" ----- ");
							break;
				case '1' : res.append(" .---- ");
							break;
				case '2' : res.append(" ..--- ");
							break;
				case '3' : res.append(" ...-- ");
							break;
				case '4' : res.append(" ....- ");
							break;
				case '5' : res.append(" ..... ");
							break;
				case '6' : res.append(" -.... ");
							break;
				case '7' : res.append(" --... ");
							break;
				case '8' : res.append(" ---.. ");
							break;
				case '9' : res.append(" ----. ");
							break;
				case ':' : res.append(" ---...");
							break;
				case '-' : res.append(" ..--.-");
							break;
				case '@' : res.append(" .--.-.");
							break;
			}
		}
		String result = res.toString();
		System.out.println("The string in Morse code is "+result);
	}
public char morseToStr(){
	if(code.equals(".-"))
		return 'A';
	else if(code.equals("-..."))
		return 'B';
	else if(code.equals("-.-."))
		return 'C';
	else if(code.equals("-.."))
		return 'D';
	else if(code.equals("."))
		return 'E';
	else if(code.equals("..-."))
		return 'F';
	else if(code.equals("--."))
		return 'G';
	else if(code.equals("...."))
		return 'H';
	else if(code.equals(".."))
		return 'I';
	else if(code.equals(".---"))
		return 'J';
	else if(code.equals("-.-"))
		return 'K';
	else if(code.equals(".-.."))
		return 'L';
	else if(code.equals("--"))
		return 'M';
	else if(code.equals("-."))
		return 'N';
	else if(code.equals("---"))
		return 'O';
	else if(code.equals(".--."))
		return 'P';
	else if(code.equals("--.-"))
		return 'Q';
	else if(code.equals(".-."))
		return 'R';
	else if(code.equals("..."))
		return 'S';
	else if(code.equals("-"))
		return 'T';
	else if(code.equals("..-"))
		return 'U';
	else if(code.equals("...-"))
		return 'V';
	else if(code.equals(".--"))
		return 'W';
	else if(code.equals("-..-"))
		return 'X';
	else if(code.equals("-.--"))
		return 'Y';
	else if(code.equals("--.."))
		return 'Z';
	else if(code.equals(".----"))
		return '1';
	else if(code.equals("..---"))
		return '2';
	else if(code.equals("...--"))
		return '3';
	else if(code.equals("....-"))
		return '4';
	else if(code.equals("....."))
		return '5';
	else if(code.equals("-...."))
		return '6';
	else if(code.equals("--..."))
		return '7';
	else if(code.equals("---.."))
		return '8';
	else if(code.equals("----."))
		return '9';
	else if(code.equals("-----"))
		return '0';
	else if(code.equals("---..."))
		return ':';
	else if(code.equals("..--.-"))
		return '-';
	else if(code.equals(".--.-."))
		return '@';
	else
		return '*';
}
}
public class testmorsecode{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	ArrayList<MorseCode> obj = new ArrayList<MorseCode>();
	System.out.println("Enter any string to be Morse coded");
	String input = sc.nextLine();
	MorseCode obj1 = new MorseCode(input);
	obj1.strToMorse();
	obj.add(obj1);
	System.out.println("Enter the size of the morse code string you want to decode");
	int len = sc.nextInt();
	ArrayList<MorseCode> decode = new ArrayList<MorseCode>();
	StringBuilder dec = new StringBuilder("");
	for(int i=0;i<len;i++){
		System.out.println("Enter the morse code to be decoded");
		String s = sc.next();
		MorseCode d = new MorseCode(s);
		decode.add(d);
		dec.append(d.morseToStr());
	}
	String decoderes = dec.toString();
	System.out.println(decoderes);
	}
}
