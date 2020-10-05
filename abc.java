import java.util.Scanner ;
class abc
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Basic Salary : " ) ;
	double basic = scan.nextDouble () ;
	
	if ( basic < 10000 )
	{
	  double hra = 0.1 * basic ;
	  double da  = 0.9 * basic ;
	}
	else
	{
	  double hra = 2000 ;
	  double da  = 0.98 * basic ;
	}
	
	double gs = basic + hra + da ;
	System.out.println ( "Gross Salary : " +gs ) ;
  }
}