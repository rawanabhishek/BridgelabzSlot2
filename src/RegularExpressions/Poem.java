package RegularExpressions;

import java.util.Scanner;

import com.bridgelabz.utility.RegularExpressionsUtility;

public class Poem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		RegularExpressionsUtility utility = new RegularExpressionsUtility();
	
		
		System.out.println("Select From the Option Below\n"
				+ "a. Chicks ­ chick\n"
				+ "b. Cat ­meow, meow\n" + 
				"c. Duck ­ quack \n"
				+ "d. Mule ­ Heehaw\n" + 
				"e. Turkey ­ gobble \n"
				+ "f. Dog ­ bow wow\n" + 
				"g. Pig ­ oink, oink\n"
				+ "h. Turtle ­ nerp, nerp\n" + 
				"i. Cow ­ moo, moo");
		
		
		String str=("Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"And on his farm he had some %ANIMAL%,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"With a %SOUND%, %SOUND% here,\n" + 
				"And a %SOUND%, %SOUND% there,\n" + 
				"Here a %SOUND%, there a %SOUND%,\n" + 
				"Everywhere a %SOUND%, %SOUND%,\n" + 
				"a");
		
		char userinput=scanner.next().charAt(0);
		
		switch (userinput) {
		case 'a':
			utility.Lyric(str,"Chicks", "chick");
			break;
		case 'b':
			utility.Lyric(str,"Duck", "quack");
			break;
		case 'c':
			utility.Lyric(str,"Turkey", "gobble");
			break;
		case 'd':
			utility.Lyric(str,"Pig", "oink");
			break;
		case 'e':
			utility.Lyric(str,"Cow", "moo");
			break;
		case 'f':
			utility.Lyric(str,"Cat", "meow");
			break;
		case 'g':
			utility.Lyric(str,"Mule", "Heehaw");
			break;
		case 'h':
			utility.Lyric(str,"Dog", "bow");
			break;
		case 'i':
			utility.Lyric(str,"Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}

		

	}

}
