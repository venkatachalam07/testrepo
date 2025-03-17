package Selenium_Practice;




import java.util.Scanner;




public class ttt {
	


			public static void toReverseAndSplitSentence(String inputSentence) {
				String outputString = "";
				inputSentence = inputSentence.toLowerCase().trim();
				
				String[] inputArray = inputSentence.split(" ");
				String[] outputArray = new String[inputArray.length];
				int j = 0;
				for (int ctr = inputArray.length - 1; ctr >= 0; ctr--) {
						if(inputArray[ctr].length() == 1 ) {
							outputArray[j] = inputArray[ctr];
						}
						else {
							StringBuilder sb = new StringBuilder(inputArray[ctr]);
							sb.reverse();
							outputArray[j] = sb.toString();
						}
						j++;	
				}
				StringBuilder os = new StringBuilder();
				for(String word : outputArray){
					os.append(word); // += word;
				}
				outputString = os.toString();
				System.out.println(outputString);
				StringBuilder sbnew = new StringBuilder();
				int k = 0; // access outputsentence index
				for(int i = 0; i < inputSentence.length(); i++) {
					if (inputSentence.charAt(i) == ' ') {
		                sbnew.append(' '); 
		                // Add space where it appeared in the original sentence
		            } else {
		                sbnew.append(outputString.charAt(k));
		                // Append the next reversed word
		                k++;
		                // Skip over any consecutive spaces in the original input
		                while (i + 1 < inputSentence.length() && inputSentence.charAt(i + 1) == ' ') {
		                    i++;
		                    sbnew.append(' '); 
		                    // Add spaces as they appear in the input
		                }}}
				System.out.println("output sentence ::: " + sbnew.toString());
			}
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the sentence to be reversed and split :::: ");
				String inputSentence = scan.nextLine();
				toReverseAndSplitSentence(inputSentence);
				}}
		
	


