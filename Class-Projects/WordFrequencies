import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int wordCount = scnr.nextInt();
      String[] words = new String[wordCount];
      int[] frequency = new int[wordCount];
      //first for loop to add the inputs to the array of strings
      for(int i = 0; i < words.length; i++){
         words[i] = scnr.next();  
      }
      for(int i = 0; i < words.length; i++){
         String word = words[i];
         frequency[i] = findFrequency(words, word);
      }
      for(int i = 0; i < wordCount; i++){
         System.out.println(words[i] + " - " + frequency[i]);
      }
   }
   public static int findFrequency(String[] arrWords, String word){
      int count = 0;
      for(int i = 0; i < arrWords.length; i++){
         if(word.equals(arrWords[i])){
            count++;
      }
   }
   return count;
}
}
