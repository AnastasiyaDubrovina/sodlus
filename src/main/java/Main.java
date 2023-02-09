import java.util.*;

public class Main {
    static HashMap<String, Integer> rim2arab = new HashMap<>();
    public static void main(String[] args) {
        convertRim2Arab();
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
            String result = "";
            for (Map.Entry<String, Integer> entry : rim2arab.entrySet()) {
                if(entry.getValue().equals(value)) {
                    result = entry.getKey();
                }
            }
            return result;
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
        rim2arab.put("XI", 11);
        rim2arab.put("XII", 12);
        rim2arab.put("XIII", 13);
        rim2arab.put("XIV", 14);
        rim2arab.put("XV", 15);
        rim2arab.put("XVI", 16);
        rim2arab.put("XVII", 17);
        rim2arab.put("XVIII", 18);
        rim2arab.put("XIX", 19);
        rim2arab.put("XX", 20);
        rim2arab.put("XXI", 21);
        rim2arab.put("XXIV", 24);
        rim2arab.put("XXV", 25);
        rim2arab.put("XXVII", 26);
        rim2arab.put("XXVIII", 28);
        rim2arab.put("XXX", 30);
        rim2arab.put("XXXII", 32);
        rim2arab.put("XXXVI", 36);
        rim2arab.put("XL", 40);
        rim2arab.put("XXXV", 35);
        rim2arab.put("XLV", 45);
        rim2arab.put("L", 50);
        rim2arab.put("XLII", 42);
        rim2arab.put("XLVIII", 48);
        rim2arab.put("LIV", 54);
        rim2arab.put("LX", 60);
        rim2arab.put("XLIX", 49);
        rim2arab.put("LVI", 56);
        rim2arab.put("LXIII", 63);
        rim2arab.put("LXX", 70);
        rim2arab.put("LXIV", 64);
        rim2arab.put("LXXII", 72);
        rim2arab.put("LXXX", 80);
        rim2arab.put("LXXXI", 81);
        rim2arab.put("XC", 90);
        rim2arab.put("C", 100);
    }
}
