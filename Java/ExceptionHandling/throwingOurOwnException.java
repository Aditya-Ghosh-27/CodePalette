// There maybe sometimes when we would like to throw our own exception. We can do this by using the keyword throws as follows
            // throw new Throwable_subclass;
    // Example:
            // throw new ArithmeticException();
            // throw new NumberFormatException();

import java.lang.Exception;
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
class throwingOurOwnException{
    public static void main(String[] args) {
        int x = 5, y = 1000;
        try{
            float z = (float)x / (float)y;
            if(z < 0.01){
                throw new MyException("Number is too small");
            }
        }
        catch(MyException e){
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I am always here");
        }
    }
}
