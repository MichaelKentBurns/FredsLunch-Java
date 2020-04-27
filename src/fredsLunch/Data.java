package fredsLunch;
import java.util.Set;
import java.util.HashSet;

public class Data {
/**
 * <pre>
 *           0..*     0..*
 * FredsLunchData ------------------------- FredsLunchMain
 *           fredsLunchData        &lt;       fredsLunchMain
 * </pre>
 */
/**
    * <pre>
    *           0..*     0..*
    * Data ------------------------- FredsLunchMain
    *           data        &lt;       fredsLunchMain
    * </pre>
    */
   
private Set<Main> main;
   
   public Set<Main> getMain() {
      if (this.main == null) {
         this.main = new HashSet<Main>();
      }
      return this.main;
   }
private Set<LunchList> lunchList;
   
   public Set<LunchList> getLunchList() {
      if (this.lunchList == null) {
         this.lunchList = new HashSet<LunchList>();
      }
      return this.lunchList;
   }
private Set<MemberList> memberList;
   
   public Set<MemberList> getMemberList() {
      if (this.memberList == null) {
         this.memberList = new HashSet<MemberList>();
      }
      return this.memberList;
   }

}
