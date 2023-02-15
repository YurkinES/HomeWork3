public class Main {
    public static void main(String[] args) {
        //Task #1
        byte numberPlanetEarth = 3;
       short depthMarianaTrench = 10920;
       int populationChina = 1411750000;
       long distanceEarthToSun = 149600000L;
       float pi = 3.14F;
       double allPi = 3.1415926535;
       System.out.println("Значение переменной numberPlanetEarth с типом byte равно " + numberPlanetEarth);
       System.out.println("Значение переменной depthMarianaTrench с типом short равно " + depthMarianaTrench);
       System.out.println("Значение переменной populationChina с типом int равно " + populationChina);
       System.out.println("Значение переменной distanceEarthToSun с типом long равно " + distanceEarthToSun);
       System.out.println("Значение переменной pi с типом float равно " + pi);
       System.out.println("Значение переменной allPi с типом double равно " + allPi);
       //Task #2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        //Task #3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short allPaperSheets = 480;
        int allStudents = firstClass + secondClass + thirdClass;
        int paperSheetsForOneStudent = allPaperSheets / allStudents;
        System.out.println("На одного ученика приходится по " + paperSheetsForOneStudent + " листов бумаги");
        //Task #4
        byte bottlePerMin = 8;
        byte firstTimelap = 20;
        short secondTimelap = 1440;
        short thirdTimelap = 4320;
        int fourthTimelap = 44640;
        short numberBottleFirstTimelap = (short) (bottlePerMin * firstTimelap);
        short numberBottleSecondTimelap = (short) (bottlePerMin * secondTimelap);
        int numberBottleThirdTimelap = bottlePerMin * thirdTimelap;
        int numberBottleFourthTimelap = bottlePerMin * fourthTimelap;
        System.out.println("За 20 минут машина произвела " + numberBottleFirstTimelap + "шт. бутылок");
        System.out.println("За 1 день машина произвела " + numberBottleSecondTimelap + "шт. бутылок");
        System.out.println("За 3 дня машина произвела " + numberBottleThirdTimelap + "шт. бутылок");
        System.out.println("За 1 месяц машина произвела " + numberBottleFourthTimelap + "шт. бутылок");
        //Task #5
        byte CansPaint = 120;
        byte CansPaintWhite1Classroom = 2;
        byte CansPaintBrown1Classroom = 4;
        byte CansPaintFor1Classroom = (byte) (CansPaintBrown1Classroom + CansPaintWhite1Classroom);
        byte Classroom = (byte) (CansPaint / CansPaintFor1Classroom);
        byte CansPaintWhiteFor1Classroom = (byte) (Classroom * CansPaintWhite1Classroom);
        byte CansPaintBrownFor1Classroom = (byte) (Classroom * CansPaintBrown1Classroom);
        System.out.println("В школе, где " + Classroom + " классов нужно " + CansPaintWhiteFor1Classroom + " банок белой краски и " + CansPaintBrownFor1Classroom + " банок коричневой краски");
        //Task #6
        byte bananaPs = 5;
        short bananaWeightGr = (short) (bananaPs * 80);
        short milkMl = 200;
        short milkWeightGr = (short) (milkMl * 105 / 100);
        byte iceCreamPs = 2;
        short iceCreamWeightGr = (short) (iceCreamPs * 100);
        byte eggPs = 4;
        short eggsWeightGr = (short) (eggPs * 70);
        int breakfastWeightGr = bananaWeightGr + milkWeightGr + iceCreamWeightGr + eggsWeightGr;
        float breakfastWeightKg = breakfastWeightGr / 1000f;
        System.out.println("Вес спортивного завтрака состовляет " + breakfastWeightGr + " грамм");
        System.out.println("Вес спортивного завтрака состовляет " + breakfastWeightKg + " килограмм");
        //Task #7
        byte weightKg = 7;
        short weightGr = 7 * 1000;
        short firstDiet = 250;
        short secondDiet = 500;
        short daysFirsDiet = (short) (weightGr / firstDiet);
        short daysSecondDiet = (short) (weightGr / secondDiet);
        short midDaysDiet = (short) (daysFirsDiet / daysSecondDiet);
        System.out.println("Спортсмен сбросит вес при пользовании первым рационом через " + daysFirsDiet + " дней");
        System.out.println("Спортсмен сбросит вес при пользовании вторым рационом через " + daysSecondDiet + " дней");
        System.out.println("Среднее время сброса веса " + midDaysDiet + " дня");


        





    }
}