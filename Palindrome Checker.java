import java.util.Scanner;


public class Main {
    
    public static boolean isPalindrome(String word)
        {
            boolean palindromeChecker = false;
            //base case , word is always palindrome if length is less or equal 2
            if (word.length() <=2 ) {
                palindromeChecker =  true;
            }
            
            //other case if length is greater than 2
            if (word.length() > 2 ) {
                if (word.charAt(0) == word.charAt(word.length()-1)) { 
                    palindromeChecker = true;
                }
                else {
                    palindromeChecker = false;
                }
            }
            return palindromeChecker;
        }

    
        public static void main(String[] args)
        {
            //initializations and user input
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a string to check if it is a palindrome: ");
            String palindrome = userInput.nextLine();
            
            boolean result = isPalindrome(palindrome);

            // output
            System.out.println ("This word is a palindrome: " + result);
        }
}

