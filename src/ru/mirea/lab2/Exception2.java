package ru.mirea.lab2;
import java.util.Scanner;

public class Exception2 {
    //после "отлова" какой-либо ошибки выполнится блок finally Для этой ошибки
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println("General Exception");
        } finally {
            System.out.println("выполнился блок finally");
        }
    }

    /*
//при использовании общего исключения мы проверяем все дочерние классы (все виды исключений). Проверка исключений должна идти от частного до более общего!!!
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println("General Exception");
        }
    }
    */

    //использование нескольких блоков try catch для генерации опредяемых исключений
    /*
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Incorrect data format");
        }
    }
    */


/*
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );  //при вводе нуля генерируется исключение о делении на ноль
        //при вводе 1.2 генерируется исключение об неправильном формате данных для преобразования в int
        //при вводе 1 исключений нет
    }

 }

 */

}