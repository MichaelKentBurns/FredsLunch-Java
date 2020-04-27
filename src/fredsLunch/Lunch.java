package fredsLunch;
import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class Lunch {
/**
 * <pre>
 *           0..*     1..1
 * FredsLunchLunch ------------------------- FredsLunchLunchList
 *           fredsLunchLunch        &lt;       fredsLunchLunchList
 * </pre>
 */
private LunchList lunchList;

public void setLunchList(LunchList value) {
   this.lunchList = value;
}

public LunchList getLunchList() {
   return this.lunchList;
}


}
