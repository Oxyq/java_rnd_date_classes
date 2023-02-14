package gen.oxy;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {


    public int rndValue(int origin, int bound) { // метод с 2 границами рандомного числа

        return ThreadLocalRandom.current().nextInt(origin, bound); //функция генерации рандоманых чисел

    }

    public LocalDate generate() {
        int day = rndValue(1, 20);
        int month = rndValue(1, 13);
        int year = rndValue(1900, 2023);
        return LocalDate.of(year, month, day);


    }
}
