package day3;
interface Cycle {
       String getString();
}
// Concrete Unicycle Class
class Unicycle implements Cycle {
       public String getString() {
              return "In Unicycle subInterface";
       }
}

// Concrete Bicycle class
class Bicycle implements Cycle {
       public String getString() {
              return "In Bicycle subInterface";
       }
}

// Concrete Tricycle class
class Tricycle implements Cycle {
       public String getString() {
              return "In Tricycle subInterface";
       }
}


//Unicycle factory which returns unicycle object only if client passes unicycle keyword
class Unicyclefactory {
       public static Cycle getCycle(String unicyclename){
              if(unicyclename.equalsIgnoreCase("unicycle")){
                     return new Unicycle();
              }
              else throw new IllegalArgumentException("Unicycle Factory works with uncycle keyword only.");

       }
}

//Bicycle factory which returns unicycle object only if client passes bicycle keyword
class Bicyclefactory {
       public static Cycle getCycle(String bicyclename){
              if(bicyclename.equalsIgnoreCase("bicycle")){
                     return new Bicycle();
              }
              else throw new IllegalArgumentException("Bicycle Factory works with bicycle keyword only.");

       }
}

//Tricycle factory which returns unicycle object only if client passes tricycle keyword
class Tricyclefactory {
       public static Cycle getCycle(String tricyclename){
              if(tricyclename.equalsIgnoreCase("tricycle")){
                     return new Tricycle();
              }
              else throw new IllegalArgumentException("Tricycle Factory works with tricycle keyword only.");

       }
}


public class assign4 {
       public static void main(String args[]) {
             String cycletype1 = "unicycle";
             String cycletype2 = "Bicycle";
             String cycletype3 = "triCYcle";
             String string1 = Unicyclefactory.getCycle(cycletype1).getString();
             String string2 = Bicyclefactory.getCycle(cycletype2).getString();
             String string3 = Tricyclefactory.getCycle(cycletype3).getString();
             System.out.println(string1);
             System.out.println(string2);
             System.out.println(string3);
       }
}
