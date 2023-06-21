//John Gill, CS496, February 16th
public class Encyclopedia extends Book {
   private String edition;
   private int numPages;
  
   //Setters for the private fields of edition and numPages
   public void setEdition(String edition){
      this.edition = edition; 
   }
   public void setNumPages(int numPages){
      this.numPages = numPages;
   }
   //getters for the private fields of edition and numPages
   public String getEdition(){
      return edition;
   }
   public int getNumPages(){
      return numPages;  
   }
   
   //Firstly, this overrides the printInfo function in the Book class
   //Secondly, the super.printInfo() calls the printInfo in the book class so all of that book
   //information is printed out first before the edition and number of pages
   @Override
   public void printInfo(){
      super.printInfo();
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
   }
   
}