import java.util.Scanner;


public class ReversedWords
{

    public static String reversedWords(String sentance)
    {
        
        String word = "";
        String newSentance = sentance;
        
      for (int i = 0; i < newSentance.length(); i++) {
          for (int j = 1; j < 20 && i + j < newSentance.length(); j++){
              if ((i == 0 || " ".equals(newSentance.substring(i, i + 1))) && 
              (" ".equals(newSentance.substring(i + j, i + j + 1)) || 
              ".".equals(newSentance.substring(i + j, i + j + 1)) ||
              "?".equals(newSentance.substring(i + j, i + j + 1))||
              "!".equals(newSentance.substring(i + j, i + j + 1)) ||
              ",".equals(newSentance.substring(i + j, i + j + 1))||
              ";".equals(newSentance.substring(i + j, i + j + 1)))) {
                  
                  if (i == 0)
                    word = newSentance.substring(i, i + j).trim();
                  else
                    word = newSentance.substring(i + 1, i + j).trim();
                    
                  int lastCharPos = word.length() - 1;
                  for (int k = 0; k < word.length(); k++) {
                      word = word.substring(0, k) + 
                      word.substring(lastCharPos) + 
                      word.substring(k, lastCharPos);
                  }
                  
                  newSentance = newSentance.substring(0, i + 1) + 
                  word + newSentance.substring(i + j);
                  i += word.length();
              }
          }
        }
        newSentance = newSentance.substring(1);
      return newSentance;
    }
  
    public static void main(String[] args)
    {
        
        // getting the review
        Scanner scan =  new Scanner(System.in);
        String review = scan.nextLine();
        System.out.println();
        
        System.out.println(reversedWords(review));
    }
}
