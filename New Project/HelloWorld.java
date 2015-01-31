import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HelloWorld{
    
     public static void main(String []args){
        Set<String> names = new HashSet<String>();
        names.add("Romeo");
        names.add("Juliet");
        names.add("Don Rodrigo");
        if(names.contains("Dono"))
            System.out.println("c'e'");
        else
            System.out.println("non c'e'");
        
        for (String ciccio: names)
        {
            System.out.println(ciccio);
        }
        
        Iterator<String> iter = names.iterator();        
        while(iter.hasNext())
        {
            String name = iter.next();
            System.out.println(name);
        }
     }
}
