package fredsLunch;
import java.util.Set;
import java.util.HashSet;

public class LunchCSV {
/**
 * <pre>
 *           0..*     0..*
 * LunchCSV ------------------------- Main
 *           lunchCSV        &lt;     main
 * </pre>
 */
/**
 * <pre>
 *           0..*     0..*
 * LunchCSV ------------------------- Main
 *           lunchCSV        &lt;     main
 * </pre>
 */
   
private Set<Main> main;
   
   public Set<Main> getMain() {
      if (this.main == null) {
         this.main = new HashSet<Main>();
      }
      return this.main;
   }

}
