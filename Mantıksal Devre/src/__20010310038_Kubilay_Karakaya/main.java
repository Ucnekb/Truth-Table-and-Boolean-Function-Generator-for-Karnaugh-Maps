package __20010310038_Kubilay_Karakaya;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
    	  File file = new File("karnaugh.txt");
          Scanner input = new Scanner(file);
          _20010310038_fileRead fileRead = new _20010310038_fileRead(input);
      }
  }


