package pr10;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Lambda{
    public static void main(String[] args){

//        Consumer<String> printTheParts = sentence -> {
//                String[] parts = sentence.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//        };

        //////////////////////////////////////////////////////////////////

//        SecondChar everySecondChar = source -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length() ; i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//
//        printResult(everySecondChar);
//        everySecondCharacter(everySecondChar, "1234567890");

        /////////////////////////////////////////////////////////////////////

//        Supplier<String> iLoveJava = () -> "I love java";
//        String supplierResult = iLoveJava.get();
//
//        System.out.println(supplierResult);

    }
//    public static void everySecondCharacter(SecondChar s, String line){
//        System.out.println(s.print(line));
//    }
//    public static void printResult(SecondChar s){
//        System.out.println(s.print("1234567890"));
//    }
}
