
public class Task2 {


	
	public static void main(String[] args) {
		
		String[] strArray   = new String[50];
		
		strArray[0]= "GERMANY";
		strArray[1]="RUSSIAN";
		strArray[2]="JAPAN";
		strArray[3]="KOREA";
		strArray[4]="UNITEDSTATESOFAMERICA";
		strArray[5]="AUSTRIA";
		 
		int i = 0;
		//Q2c
		for(String v:strArray) {
			System.out.print(" array{ " + i + "] " + v);
			
			//Q2d
			if(v.equals("AUSTRAIA"))
				break;
			/* 
			 if (v== null)
			 break;
			 
			 */
			//Q2e
		/*
			if(v.length()>5)
				System.out.println("More than 5 char " + v);
			i++;
		*/
		}
	
		
	}
}
 //Q2f 
/*
have error due to part 2d , to remove the error : set v equals to null.
*/