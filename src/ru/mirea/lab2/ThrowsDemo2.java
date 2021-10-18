package ru.mirea.lab2;
import java.util.Scanner;

public class ThrowsDemo2 {

        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            }catch (java.lang.Exception e){
                System.out.println(e.toString());
                getKey();
            }
        }

        public void printDetails(String key) throws java.lang.Exception{
              String message = getDetails(key);
                System.out.println( message );

        }

        private String getDetails(String key) throws java.lang.Exception{

                if (key.equals("")) {
                    throw new Exception("Key set to empty string");
                }

            return "data for " + key;
        }



}
