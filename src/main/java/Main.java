import java.util.*;

public class Main {
    static HashMap<String, Integer> rim2arab = new HashMap<>();
    static HashMap<Integer, String> arab2rim = new HashMap<>();
    public static void main(String[] args) {
        convertRim2Arab();
        convertArab2Rim();
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));
    }
    public static String calc(String input) {
        String[] elements = input.split(" ");
        if (elements.length > 3) {
            throw new IllegalStateException("Unexpected value");
        }
        String operator = elements[1];
        if (rim2arab.containsKey(elements[0]) && rim2arab.containsKey(elements[2])) {
            int c = rim2arab.get(elements[0]);
            int d = rim2arab.get(elements[2]);
            int value = switch (operator) {
                case "+" -> c + d;
                case "-" -> c - d;
                case "*" -> c * d;
                case "/" -> c / d;
                default -> throw new IllegalStateException("Unexpected value");
            };
            if (value < 1) {
                throw new IllegalStateException("Unexpected value");
            }
            return arab2rim.get(value);
        } else if (Integer.parseInt(elements[0]) > 0 && Integer.parseInt(elements[0]) <= 10 &&
                Integer.parseInt(elements[2]) > 0 && Integer.parseInt(elements[2]) <= 10) {
            int a = Integer.parseInt(elements[0]);
            int b = Integer.parseInt(elements[2]);
            int value = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new IllegalStateException("Unexpected value");
            };
            return String.valueOf(value);
        } else {
            throw new IllegalStateException("Unexpected value");
        }
    }
    public static void convertArab2Rim() {
        arab2rim.put(1, "I");
        arab2rim.put(2, "II");
        arab2rim.put(3, "III");
        arab2rim.put(4, "IV");
        arab2rim.put(5, "V");
        arab2rim.put(6, "VI");
        arab2rim.put(7, "VII");
        arab2rim.put(8, "VIII");
        arab2rim.put(9, "IX");
        arab2rim.put(10, "X");
        arab2rim.put(11, "XI");
        arab2rim.put(12, "XII");
        arab2rim.put(13, "XIII");
        arab2rim.put(14, "XIV");
        arab2rim.put(15, "XV");
        arab2rim.put(16, "XVI");
        arab2rim.put(17, "XVII");
        arab2rim.put(18, "XVIII");
        arab2rim.put(19, "XIX");
        arab2rim.put(20, "XX");
        arab2rim.put(21, "XXI");
        arab2rim.put(24, "XXIV");
        arab2rim.put(25, "XXV");
        arab2rim.put(27, "XXVII");
        arab2rim.put(28, "XXVIII");
        arab2rim.put(30, "XXX");
        arab2rim.put(32, "XXXII");
        arab2rim.put(36, "XXXVI");
        arab2rim.put(40, "XL");
        arab2rim.put(35, "XXXV");
        arab2rim.put(45, "XLV");
        arab2rim.put(50, "L");
        arab2rim.put(42, "XLII");
        arab2rim.put(48, "XLVIII");
        arab2rim.put(54, "LIV");
        arab2rim.put(60, "LX");
        arab2rim.put(49, "XLIX");
        arab2rim.put(56, "LVI");
        arab2rim.put(63, "LXIII");
        arab2rim.put(70, "LXX");
        arab2rim.put(64, "LXIV");
        arab2rim.put(72, "LXXII");
        arab2rim.put(80, "LXXX");
        arab2rim.put(81, "LXXXI");
        arab2rim.put(90, "XC");
        arab2rim.put(100, "C");
    }
    public static void convertRim2Arab() {
        rim2arab.put("I", 1);
        rim2arab.put("II", 2);
        rim2arab.put("III", 3);
        rim2arab.put("IV", 4);
        rim2arab.put("V", 5);
        rim2arab.put("VI", 6);
        rim2arab.put("VII", 7);
        rim2arab.put("VIII", 8);
        rim2arab.put("IX", 9);
        rim2arab.put("X", 10);
    }
}
