package Task1;

public class Main {

    public static void main(String[] args) {
        String info = "Молоко: 256 rub, масло: 321 rub; печенье: 54rub, Шоколад: 32rub";

        System.out.println("Тастовая строка:                                " + info);

        System.out.println("Результат работы \"info.replaceAll(\"\\\\s\", \"*\")\": " + info.replaceAll("\\s", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\d\", \"*\")\": " + info.replaceAll("\\d", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\d+\", \"*\")\": " + info.replaceAll("\\d+", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\w\", \"*\")\": " + info.replaceAll("\\w", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\S\", \"*\")\": " + info.replaceAll("\\S", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\D\", \"*\")\": " + info.replaceAll("\\D", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"\\\\W\", \"*\")\": " + info.replaceAll("\\W", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]\", \"*\")\": " + info.replaceAll("[АЁ-яё]", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]*\", \"*\")\": " + info.replaceAll("[АЁ-яё]*", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]?\", \"*\")\": " + info.replaceAll("[АЁ-яё]?", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]{3}\", \"*\")\": " + info.replaceAll("[АЁ-яё]{3}", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]{3,}\", \"*\")\": " + info.replaceAll("[АЁ-яё]{3,}", "*"));
        System.out.println("Результат работы \"info.replaceAll(\"[АЁ-яё]{3,5}\", \"*\")\": " + info.replaceAll("[АЁ-яё]{3,5}", "*"));
        /*
        replaceAll - меняет символы на выбранное значение.
        Регулярные выражения:
        \\s - Все пробельные символы
        \\d - Все цифры
        \\w - Слово. Цифры и Буквы английские.
        \\S - Всё, КРОМЕ пробельных символов.
        \\D - Всё, КРОМЕ цифр.
        \\W - Всё, КРОМЕ слов. Т.е. кроме цифр и английских букв.
        [] [А-я] [АЁ-яё] [АЁ-яё:,;.] - Перечисления
        Квантеры:
        * - 0 или больше вхождений
        + - Одно или более вхождений.
        ? - 0 или 1 вхождение.
        {цифра} - количество "цифра".
        {цифра,} - количество "цифра" и более.
        {цифра,цифра} - количество от "цифра" до "цифра".
         */




//        String info = "Молоко: 256, Масло: 321, Печенье: 54";
//
//        int price1 = Integer.parseInt(info.substring(info.indexOf(' '), info.indexOf(',')).trim());
//        String temp = info.substring(info.indexOf(','), info.lastIndexOf(',')).trim();
//        int price2 = Integer.parseInt(temp.substring(temp.lastIndexOf(' ')).trim());
//
//        int price3 = Integer.parseInt(info.substring(info.lastIndexOf(' ')).trim());
//
//        System.out.println(price1 + price2 + price3);
    }
}
