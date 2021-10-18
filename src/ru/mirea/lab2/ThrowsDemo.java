package ru.mirea.lab2;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
       try {
           if (key == null) {
               throw new NullPointerException("null key in getDetails");

           }
       }catch (NullPointerException e) {
            return "null";
       }
        return "data for " + key;
    }

    /*
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            System.out.println("рассмотрели исключение");
        }
        // do something with the key
    }

     */
}


