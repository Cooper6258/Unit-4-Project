import java.util.Scanner;

import java.io.*;

class Main {

  public static void main(String[] args) {

    Scanner a = new Scanner(System.in);


    String ANSI_RESET = "\u001B[0m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_GREEN = "\u001B[32m";

    String str = ("the quick fox jumps over the lazy dog.");
    System.out.println(str);
    int count = 0;
    String nstr = "";
    String nstr2 = "";
   

    while (count==0){
      System.out.println("Would you like to edit the statement? yes or no?");
      String a2 = a.nextLine().toLowerCase();
     
      if(a2.equals("yes")){
        System.out.println("Would you like to find, replace or leave?");
        String a1 = a.nextLine();

        while (a1.equals("find")){
          System.out.println("What would you like to find?");
          String find = a.nextLine().toLowerCase();
          int len = find.length();

          for (int d = 0; d <= str.length()-len; d++){

            if (str.substring(d, d +len).equals(find)){
              nstr += ANSI_YELLOW + find + ANSI_RESET;
              d = len + d - 1;
            }

            else{
              nstr += str.substring(d, d +1);
            }

          }
          System.out.println(nstr + str.substring(str.length()-len+1));
          nstr = "";
        }

        while (a1.equals("replace")){
          System.out.println("What would you like to replace?");
          String replace = a.nextLine().toLowerCase();
          int len2 = replace.length();

          for (int e = 0; e <= str.length()-len2; e++){
            
            if (str.substring(e, e +len2).equals(replace)){
              nstr2 += ANSI_YELLOW + replace + ANSI_RESET;
              e = len2 + e-1 ;
              
          }

          else{
            nstr2 += str.substring(e, e+1);
          }
        }
          
          System.out.println(nstr2 + str.substring(str.length()-len2+1));
          System.out.println("What would you like to replace " + replace + " with");
          String a3 = a.nextLine().toLowerCase();
          nstr2 = "";

          System.out.println("Would you like to replace one of them or all of them?");
          String a4 = a.nextLine().toLowerCase();
          if (a4.equals("all")){
            for (int f = 0; f <= str.length()-len2; f++){
              
              if (str.substring(f, f +len2).equals(replace)){
                nstr2 += ANSI_YELLOW + a3 + ANSI_RESET;
                f = len2 + f-1 ;
                
            }

            else{
              nstr2 += str.substring(f, f+1);
            }
          }
          System.out.println(nstr2 + str.substring(str.length()-len2+1));
    }
        else if (a4.equals("one")){
          boolean rep = false;
          for (int f = 0; f <= str.length()-len2; f++){
                
                if (rep==false&&str.substring(f, f +len2).equals(replace)){
                  nstr2 += ANSI_YELLOW + a3 + ANSI_RESET;
                  f = len2 + f-1 ;
                  rep = true;
              }

              else{
                nstr2 += str.substring(f, f+1);
              }
            }
            System.out.println(nstr2 + str.substring(str.length()-len2+1));
        }
    }
    }
    else{

      count++;

    }

    }
  
 

  
  }
}