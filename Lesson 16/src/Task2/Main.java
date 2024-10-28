package Task2;

public class Main {

    public static void main(String[] args) {
        String info = "Молоко: 256 rub, масло: 321 rub; печенье: 54rub, Шоколад: 32rub";

        info = info.replaceAll("\\D+", " ").trim();
//        System.out.println(info);
        String[] split = info.split("\\s");
        int sum = 0;
        for(String e: split) {
            sum += Integer.parseInt(e);
//            System.out.println(e);
        }

        System.out.println(sum);
    }
}
