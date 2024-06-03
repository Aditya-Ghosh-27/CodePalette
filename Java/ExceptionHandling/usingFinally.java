// Java supports another statement known as finally statement that can be used to handle an exception that is not caught by any of the previous catch statements. finally block can be used to handle any exception generated within a try block. It may be added immidiately after try block or after the last catch block.

public class usingFinally {
    public static void main(String[] args) {
        int a[] = {5, 10};
        int b = 5;

        try{
            int x = a[2] / b - a[1];
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
        catch(ArrayStoreException e){
            System.out.println("Wrong data type");
        }
        finally{
            int y = a[1] / a[0];
            System.out.println("y = " + y);
        }
    }
}

