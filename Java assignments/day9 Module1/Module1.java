import java.io.File;
import java.util.*;
import java.util.regex.*;

public class Module1{
   private String fileName; //file to search for
   static private List<String> result = new ArrayList<String>();

   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public List<String> getResult() {
      return result;
   }

   public static void main(String[] args) {

      Module1 fileSearch = new Module1();
      Scanner input = new Scanner(System.in);

      while(true){ // user input
         result.clear(); //clear out previously filled out results for previous inputs
         int count = 0;
         String name=input.next();
         
         fileSearch.searchDirectory(new File("/home"), name);

         count = fileSearch.getResult().size();

         if(count == 0){
            System.out.println("\nNo result found!");
         }
         else{
            System.out.println("\nFound " + count + " result!\n");
            for(String matched : fileSearch.getResult()){
               System.out.println("Found : " + matched);
            }
         }
      }//while
   }

   //checks whether directory is legal or not
   public void searchDirectory(File directory, String fileName){
      setFileName(fileName);
      if (directory.isDirectory()) {
         search(directory);
      }
      else{
         System.out.println(directory.getAbsoluteFile() + " is not a directory!");
      }
   }

   //Search for the files in directory recursively
   private void search(File file){
      if (file.isDirectory()){
         if (file.canRead()){
            for (File temp : file.listFiles()){
               if (temp.isDirectory()) {
                  search(temp);
               }
               //if it's a file and not a directory
               else {
                  //check regex, if true, then add it to results
                  String g = getFileName();
                  Pattern p = Pattern.compile(g);
                  Matcher m = p.matcher(temp.getName());  
                  boolean b = m.matches();  
                  if (b){
                     result.add(temp.getAbsoluteFile().toString());
                  }
               }
            }
         }
         else{
            System.out.println(file.getAbsoluteFile() + "Permission Denied");
         }
      }
   }
}