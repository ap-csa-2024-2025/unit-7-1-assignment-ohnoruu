import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();

    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      if (!input.equals("STOP")){
        words.add(input);
      }
    }
    System.out.println(words.size());
    System.out.println(words);

    words.add(words.get(0));

    if (words.size()>2){
      words.remove(0);
    }
    
    System.out.println(words);
  }
}
