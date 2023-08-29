package fredsLunch;
import java.util.Set;
import java.util.HashSet;


/* ****************************************************************************************************************************************************************
 * CRC Card: FredsLunch:LunchCSV
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Responsibilities:                                                     		| Collaborators:
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 	Locate the data file for the lunch group									| 
 * 																				| Data
 * 	Read the CSV file.															|
 * 																				| 
 * 	Find the header row with names of Columns									| 
 * 	Parse the lines into rows.													| 
 * 	Provide the headers, rows as list of cells to the rest of the app			| 
 * 	Save the data file.															|
 *****************************************************************************************************************************************************************/


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
