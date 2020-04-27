package fredsLunch;
import java.util.Set;
import java.util.HashSet;

public class MemberList {
/**
 * <pre>
 *           0..*     0..*
 * MemberList ------------------------- Data
 *           memberList        &lt;       data
 * </pre>
 */
private Set<Data> data;

public Set<Data> getData() {
   if (this.data == null) {
this.data = new HashSet<Data>();
   }
   return this.data;
}

}
