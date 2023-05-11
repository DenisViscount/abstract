package task10;

public class Main {
    public static void main(String[] args) {
        String str = "0215138171115";
        String symbol = "1";
        String result = lineRemover(str,3,symbol);
        System.out.println(result);

    }

    public static String lineRemover(String str, int n, String symbol) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            String currentStr = String.valueOf(str.charAt(i));

            if (currentStr.equals(symbol) && count < n) {

                count++;

            }else {
                sb.append(currentStr);
            }

        }
        return sb.toString();
        }

    }
