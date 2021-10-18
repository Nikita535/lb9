package ru.mirea.lab2;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {             //генерация определяемого исключения
            System.out.println("Attempted division by zero");
        }
    }
}

/*
public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );  //исключение о делении на ноль
    }
}
*/
