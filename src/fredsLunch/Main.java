package fredsLunch;
import java.util.Set;
import java.util.HashSet;

public class Main {
/**
 * <pre>
 *           1..10..*
 * Main ------------------------>Data
 *                   &gt;       data
 * </pre>
 */
private Data data = null;

public Data setData( Data data )
{
	this.data = data;
	return this.data;
}

public Data getData() {
   return this.data;
}

/**
 * <pre>
 *           0..*     0..*
 * Main ------------------------- LunchCSV
 *           main        &gt;       lunchCSV
 * </pre>
 */
private Set<LunchCSV> lunchCSV;

public Set<LunchCSV> getLunchCSV() {
   if (this.lunchCSV == null) {
       this.lunchCSV = new HashSet<LunchCSV>();
   }
   return this.lunchCSV;
}

public String accountName;
public void setAccountName( String accountName )
{
	this.accountName = accountName;
}
public String getAccountName()
{
	return this.accountName;
}



public static void main(String[] args) {
    System.out.println("The Freds are eating lunch again!"); 
    
    Main main = new Main();
    
    Data data = new Data();
    main.setData(data);
    
    for ( int i = 0; i < args.length; i++)
    {
    	String arg = args[i];
    	System.out.println(" argument " + i + "= '" + arg + "' ");
    	
    	if ( arg.equals("-account") )
    	{
    		main.accountName = args[++i];
    		System.out.println("NOTE: account name set to '" + main.accountName + "' ");
    	}
    }
}

}
