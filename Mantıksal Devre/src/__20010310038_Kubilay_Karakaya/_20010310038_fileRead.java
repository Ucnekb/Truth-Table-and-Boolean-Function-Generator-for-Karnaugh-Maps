package __20010310038_Kubilay_Karakaya;

import java.util.Scanner;

public class _20010310038_fileRead {
	public Scanner input;
	public String [] h;
	public int [] f=null;
	
	public _20010310038_fileRead(Scanner input){
		
		this.input=input;
		 String line =input.nextLine();
		 
		 if (line.contains("değişkenler:")) {
	         String[] parts = line.split(":");
	             String harfler = parts[1].trim();
	              h = harfler.split(",");
	         }
		 else if (line.contains("deÄŸiÅŸkenler:")) {
		         String[] parts = line.split(":");
		             String harfler = parts[1].trim();
		              h = harfler.split(",");         
		         }
		 else if (line.contains(":")) {
	         String[] parts = line.split(":");
	             String harfler = parts[1].trim();
	              h = harfler.split(",");         
	         }
		 
		 System.out.println("karnaugh.txt dosyasi okundu.");
		 if(h.length==3) {
			 _20010310038_map3 map3=new _20010310038_map3(h,input);
		 }
		 else if (h.length==4) {
			 _20010310038_map4 map4=new _20010310038_map4(h,input);
		 } 	 
	}
}

