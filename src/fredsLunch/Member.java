package fredsLunch;
import java.util.Set;
import java.util.HashSet;
/* Testing 1 2 3 */

public class Member {
/**
 * <pre>
 *           0..*     1..1
 * FredsLunchMember ------------------------- FredsLunchMemberList
 *           fredsLunchMember        &lt;       fredsLunchMemberList
 * </pre>
 */
   
/**
 * <pre>
 *           0..*     0..*
 * FredsLunchMember ------------------------- FredsLunchParticipant
 *           fredsLunchMember        &lt;       fredsLunchParticipant
 * </pre>
 */
   
private MemberList memberList;
   
   public void setMemberList(MemberList value) {
      this.memberList = value;
   }

public MemberList getMemberList() {
   return this.memberList;
}

/**
 * <pre>
 *           0..*     0..*
 * FredsLunchMember ------------------------- FredsLunchParticipant
 *           fredsLunchMember        &lt;       fredsLunchParticipant
 * </pre>
 */
private Set<Participant> participant;
   
   public Set<Participant> getParticipant() {
      if (this.participant == null) {
         this.participant = new HashSet<Participant>();
      }
      return this.participant;
   }

}
