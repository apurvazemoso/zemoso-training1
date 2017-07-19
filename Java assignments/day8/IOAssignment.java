import java.io.*;
import java.util.*;
import java.nio.charset.Charset;

public class IOAssignment {

  public static void main(String[] args) throws IOException {
      Charset encoding = Charset.defaultCharset();
      for (String filename : args) {
          File file = new File(filename);
          handleFile(file, encoding);
      }
    }

    //This method reads the file while providing for the efficient reading of characters, arrays, and lines and if everything is right, it will pass the contents to the other class handleCharacter.
  private static void handleFile(File file, Charset encoding) throws IOException {
    //InputStreamReader is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.

    try (InputStream in = new FileInputStream(file);
      Reader reader = new InputStreamReader(in, encoding); 
      Reader buffer = new BufferedReader(reader)
      ) {
        handleCharacters(buffer);
    }
    catch(IOException io){
      System.out.println("Exception - Maybe the file doesn'y exist!");
    }
  }

  /*This class makes hashmap our of characters present in file/files, and saves it like character and number of occurences. Once the full parsing of 
    the file is done, it writes the hashmap in the new file called "am.txt"*/

  private static void handleCharacters(Reader reader) throws IOException {
    int r;
    Map<Character, Integer>m = new HashMap<Character,Integer>();
    while ((r = reader.read()) != -1){
        char ch = (char) r;
        if (m.containsKey(ch))
            m.put(ch, m.get(ch)+1);
        else
            m.put(ch,1);
    }

    /*for (Map.Entry entry : m.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }*/

    try {
      PrintWriter out = new PrintWriter( new File("am.txt").getAbsoluteFile());
      try {
        out.print(m);
        }
      finally {
        out.close();
        }
      }
      catch(IOException e) {
        throw new RuntimeException(e);
      }
  }
}