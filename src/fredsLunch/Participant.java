package fredsLunch;
import java.util.Set;
import java.util.HashSet;

public class Participant {
/**
 * <pre>
 *           1..11..1
 * FredsLunchParticipant ------------------------>Lunch
 *                   &lt;       lunch
 * </pre>
 */
private Lunch lunch;

public void setLunch(Lunch value) {
   this.lunch = value;
}

public Lunch getLunch() {
   return this.lunch;
}

/**
 * <pre>
 *           0..*     0..*
 * Participant ------------------------- Member
 *           participant        &gt;       member
 * </pre>
 */
private Set<Member> member;

public Set<Member> getMember() {
   if (this.member == null) {
this.member = new HashSet<Member>();
   }
   return this.member;
}

}
