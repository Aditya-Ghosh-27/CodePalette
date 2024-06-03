// This program is syntactically correct and therefore doesn't cause any problem during compilation.However during execution, it will create an Exception
class error{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;

        int x = a/(b - c);
        System.out.println("x = "+x);

        int y = a/(b + c);
        System.out.println("y = "+y);
    }
}