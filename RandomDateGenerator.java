package utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomDateGenerator {
    //метод для определения случайной даты

    public LocalDate getRandomDate (int startYear, int endYear){       //startYear =2000, endYear=2021
        int randomDay;
        int difference = endYear - startYear;                         //difference=21
        int randomMonth = new Random().nextInt(12) +1;  //рандомный месяц(прибавляем 1, т.к. от 0)
        int randomYear = startYear + new Random().nextInt(difference+1);
        if (randomMonth == 1 ||randomMonth == 3 ||randomMonth == 5 ||randomMonth == 7 ||randomMonth ==8 ||
                randomMonth ==10 ||randomMonth ==12){
             randomDay = new  Random().nextInt(31)+1;
        } else  if (randomMonth == 4 ||randomMonth == 6 ||randomMonth == 9 ||randomMonth ==11){
                randomDay = new  Random().nextInt(30)+1;}
                 else { randomDay = new  Random().nextInt(28)+1;}


                return  LocalDate.of(randomYear, randomMonth, randomDay);
            }
}
