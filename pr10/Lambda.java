package pr10;

public class Lambda{
    public static void main(String[] args){
//        Consumer<String> printTheParts = sentence -> {
//                String[] parts = sentence.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//        };

        SecondChar everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length() ; i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        printResult(everySecondChar);
    }
    public static void printResult(SecondChar s){
        System.out.println(s.print("1234567890"));
    }
}
