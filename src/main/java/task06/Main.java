package task06;


public class Main {
    public static void main(String[] args) {
        String srt = creatorString();
        System.out.println(srt);
        deleteSymbol("3",srt);
        String newDeleteSymbol =  stringBuilderDeleteSymbol('3',srt);
        System.out.println(newDeleteSymbol);

    }
        public static String stringBuilderDeleteSymbol(char symbol, String str){

            int firstIndex = str.indexOf(symbol);
            StringBuilder newSequence = new StringBuilder(str.substring(0, firstIndex + 1));
            for (int i = firstIndex + 1; i < str.length(); i++) {

                if (symbol != str.charAt(i)) {
                    newSequence.append(str.charAt(i));
                }
            }
            return newSequence.toString();
        }

    public static String deleteSymbol(String symbol, String srt){

        int firstIndex = srt.indexOf(symbol);
        String newSequence = srt.substring(0, firstIndex + 1);
        String tempString = srt.substring(firstIndex +1,srt.length());
        String newString = tempString.replace(symbol,"");
        System.out.println(newSequence + newString);

        return newString;
    }
    public static String creatorString() {
        String str = "123".repeat(5);
        return str;
    }

}
