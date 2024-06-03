public class Autoboxing {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        // Converting primitives into objects
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        // Printing Objects
        System.out.println("---Printing object Values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + shortobj);
        System.out.println("Integer object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

        // Unboxing: Converting objects to primitives
        Byte byteValue = byteobj;
        Short shortValue = shortobj;
        Integer intValue = intobj;
        Long longValue = longobj;
        Float floatValue = floatobj;
        Double doubleValue = doubleobj;
        Character charValue = charobj;
        Boolean boolValue = boolobj;

        // Printing primitives
        System.out.println("---Printing primitive Values---");
        System.out.println("byte Value: " + byteValue);
        System.out.println("short Value: " + shortValue);
        System.out.println("int Value: " + intValue);
        System.out.println("long Value: " + longValue);
        System.out.println("float Value: " + floatValue);
        System.out.println("double Value: " + doubleValue);
        System.out.println("char Value: " + charValue);
        System.out.println("boolean Value: " + boolValue);

    }
}
