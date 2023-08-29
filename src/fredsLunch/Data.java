package fredsLunch;
import java.util.Set;
import java.util.HashSet;


/* ****************************************************************************************************************************************************************
 * CRC Card: FredsLunch:Data
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Responsibilities:                                                     		| Collaborators:
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 	Anchor the lunch list and member lists.   									| 
 * 																				| LunchCSV
 *  Turn header column list into a list of members of the group.				| LunchList
 * 	Recognize incoming balance for each member.									| MemberList
 * 	Turn each row into a lunch in the lunch list.								| Member
 * 	For each lunch find the members eating and update the balances.           	| Lunch
 * 	Add or remove lunches and members											| Participant
 * 	Produce reports as needed.													|
 * 	Save the data file.															|
 *****************************************************************************************************************************************************************/


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
