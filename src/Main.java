public class Main {

    public static void main(String[] args) {
        // Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double SugarWeight = 4.5;
        float SaltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;


        // Заданние 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double boxerWeightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + boxerWeightDifference);


        // Задание 3
        double banana = 5;
        double weightOfOneBanana = 80;
        double milk = 200;
        double weightOf100MlMilk = 105;
        double plumber = 2;
        double weightOfOneIceCream = 100;
        double egg = 4;
        double weightOfOneEgg = 70;
        double weight5Bananas = banana * weightOfOneBanana;
        double conversionOf200MlOfMilkIntoUnitsOf100Grams = milk / 100;
        double weight200GramsOfMilk = weightOf100MlMilk * conversionOf200MlOfMilkIntoUnitsOf100Grams;
        double iceCreamWeight = plumber * weightOfOneIceCream;
        double eggWeight = egg * weightOfOneEgg;
        double breakfastWeightInGrams = weight5Bananas + weight200GramsOfMilk + iceCreamWeight + eggWeight;
        System.out.println("Вес завтрака в граммах " + breakfastWeightInGrams);
        double breakfastWeightInKilograms = breakfastWeightInGrams / 1000;
        System.out.println("Вес завтрака в килограммах " + breakfastWeightInKilograms);

        // Задание 4
        int needToReset = 7;
        int losesInADay1 = 250;
        int losesInADay2 = 500;
        int weConvert7KilogramsToGrams = needToReset * 1000;
        int numberOfDaysAt250 = weConvert7KilogramsToGrams / losesInADay1;
        System.out.println("Количество дней при потери 250 грамм ежедневно " + numberOfDaysAt250);
        int numberOfDaysAt500 = weConvert7KilogramsToGrams / losesInADay2;
        System.out.println("Количество дней при потери 500 грамм ежедневно " + numberOfDaysAt500);
        int averageNumberOfDays = (numberOfDaysAt250 + numberOfDaysAt500) / 2;
        System.out.println("Среднее количество дней для похудения " + averageNumberOfDays);

        // Задание 5
        double Masha = 67760;
        double Denis = 83690;
        double Kristina = 76230;
        double MaschaSalaryIncrease = Masha * 0.1 + Masha;
        System.out.println("Зарплата Маши после повышения " + MaschaSalaryIncrease);
        double DenisSalaryIncrease = Denis * 0.1 + Denis;
        System.out.println("Зарплата Дениса после повышения " + DenisSalaryIncrease);
        double KristinaSalaryIncrease = Kristina * 0.1 + Kristina;
        System.out.println("Зарплата Кристины после повышения " + KristinaSalaryIncrease);
        double differenceBetweenAnnualIncomeMasha = (MaschaSalaryIncrease * 12) - (Masha * 12);
        System.out.println("Годовой доход Маши вырос на " + differenceBetweenAnnualIncomeMasha);
        double differenceBetweenAnnualIncomeDenis = (DenisSalaryIncrease * 12) - (Denis * 12);
        System.out.println("Годовой доход Дениса вырос на " + differenceBetweenAnnualIncomeDenis);
        double differenceBetweenAnnualIncomeKristina = (KristinaSalaryIncrease * 12) - (Kristina * 12);
        System.out.println("Годовой доход Кристины вырос на " + differenceBetweenAnnualIncomeKristina);








    }



}