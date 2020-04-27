package fredsLunch;
import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class LunchList {
/**
 * <pre>
 *           0..*     0..*
 * LunchList ------------------------- Data
 *           lunchList        &lt;       data
 * </pre>
 */
private Set<Data> data;

public Set<Data> getData() {
   if (this.data == null) {
this.data = new HashSet<Data>();
   }
   return this.data;
}

/**
 * <pre>
 *           1..1     0..*
 * FredsLunchLunchList ------------------------>Lunch
 *                   &gt;       lunches
 * </pre>
 */

public Set<Lunch> getLunches() {
   if (this.lunches == null) {
this.lunches = new HashSet<Lunch>();
   }
   return this.lunches;
}


public Lunch findLunch(Date date) {
	return null;
}

Set<Lunch> lunches = null; 
public Lunch newLunch() {
	if ( lunches == null ) {
		lunches = new HashSet<Lunch>();
	}
	Lunch aLunch = new Lunch();
	lunches.add(aLunch);
	return aLunch;
}

}
