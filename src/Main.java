public void main() {

    int a = 0;
    byte b = 0;
    short c = 0;
    long d = 0;
    float e = 0;
    double f = 0;

    System.out.println("Задача 1");
    System.out.println("---------------------------------------");
    System.out.println("Объявили переменные с типами int, byte, short, long, float, double: a, b, c, d, e, f");
    System.out.println("---------------------------------------");

    int aB = 569;
    byte bC = 64;
    short cD = -159;
    long dE = 987678965549L;
    float eF = 2.786f;
    double fG = 27.12;

    System.out.println(" ");
    System.out.println("Задача 2");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной a с типом данных integer равно " + aB + "\n" + "Значение переменной b с типом данных integer = " + bC + "\n" + "Значение переменной c с типом данных integer = " + cD + "\n" + "Значение переменной d с типом данных integer = " + dE + "\n" + "Значение переменной e с типом данных integer = " + eF + "\n" + "Значение переменной f с типом данных integer = " + fG);
    System.out.println("---------------------------------------");

    int lyudmilaTeacher = 23;
    int annaTeacher = 27;
    int ekaterinaTeacher = 30;
    int sheetsAll = 480;

    System.out.println(" ");
    System.out.println("Задача 3");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной lyudmila с типом данных integer равно " + lyudmilaTeacher + "\n" + "Значение переменной anna с типом данных integer равно " + annaTeacher + "\n" + "Значение переменной ekaterina с типом данных integer равно " + ekaterinaTeacher + "\n");
    System.out.println("На каждого ученика рассчитано " + (sheetsAll / (lyudmilaTeacher + annaTeacher + ekaterinaTeacher)) +  " листов бумаги");
    System.out.println("---------------------------------------");

    int efficiency = 16;
    float time1 = 20;
    int time2 = 24 * 60;
    int time3 = 24 * 3 * 60;
    int time4 = 24 * 30 * 60;


    System.out.println(" ");
    System.out.println("Задача 4");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной time1 с типом float равно " + time1 + "\n" + "Значение переменной time2 с типом int равно " + time2 + "\n" + "Значение переменной time3 с типом int равно " + time3 + "\n" + "Значение переменной time4 с типом int равно " + time4 + "\n");
    System.out.println("За " + time1 + " минут машина произвела " + (time1 / efficiency / 2) + " штук бутылок");
    System.out.println("За " + time2 + " минут машина произвела " + (time2 / efficiency / 2) +" штук бутылок");
    System.out.println("За " + time3 + " минут машина произвела " + (time3 / efficiency / 2) +" штук бутылок");
    System.out.println("За " + time4 + " минут машина произвела " + (time4 / efficiency / 2) +" штук бутылок");
    System.out.println("---------------------------------------");

    int potsAll = 120;
    int potsWhiteAndBrown = 6;
    int potsWhite = 2;
    int potsBrown = 4;
    int resWhite = potsAll / potsWhiteAndBrown * potsWhite;
    int resBrown = potsAll / potsWhiteAndBrown * potsBrown;
    int classes = potsAll / potsWhiteAndBrown;


    System.out.println(" ");
    System.out.println("Задача 5");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной potsAll с типом int равно " + potsAll + "Значение переменной classes с типом int равно " + classes + "\n" + "Значение переменной potsWhiteAndBrown с типом int равно " + potsWhiteAndBrown + "\n" + "Значение переменной potsWhite с типом int равно " + potsWhite + "\n" + "Значение переменной potsBrown с типом int равно " + potsBrown + "\n" + "Значение переменной resWhite с типом int равно " + resWhite + "\n" + "Значение переменной resBrown с типом int равно " + resBrown + "\n");
    System.out.println("В школе, где " + classes + " классов, нужно " + resWhite + " банок белой краски и " + resBrown + " банок коричневой краски");
    System.out.println("---------------------------------------");

    int bananas = 5;
    int bananasWeight = bananas * 80;
    int milk = 200;
    int weightMilk = 105 * 2;
    int iceCream = 2;
    int iceCreamWeight = 2 * 100;
    int eggs = 4;
    int eggsWeight = 70 * eggs;
    float breakfast = bananasWeight + weightMilk + eggsWeight + iceCreamWeight;

    System.out.println(" ");
    System.out.println("Задача 6");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной bananas с типом int равно " + bananas + "\n" + "Значение переменной milk с типом int равно " + milk + "\n" + "Значение переменной icecream с типом int равно " + iceCream + "\n" + "Значение переменной eggs с типом int равно " + eggs + "\n");
    System.out.println("Вес завтрака спротсмена в граммах равен " + breakfast + " или " + (breakfast / 1000) + " килограмм");
    System.out.println("---------------------------------------");
    System.out.println(" ");

    int sportsmanWeight = 7;
    float gram1 = 0.250F;
    float gram2 = 0.500F;

    System.out.println(" ");
    System.out.println("Задача 7");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной sportsmanWeight с типом int равно " + sportsmanWeight + "\n" + "Значение переменной gram1 с типом float равно " + gram1 + "\n" + "Значение переменной gram2 с типом float равно " + gram2 + "\n");
    System.out.println("Если спортсмен будет терять каждый день по 250 грамм, спортсмену потребуется " + (sportsmanWeight / gram1) + " дней для сброса 7кг." + "\n" + "Если спортсмен будет терять каждый день по 500 грамм, спортсмену потребуется " + (sportsmanWeight / gram2) + " дней для сброса 7кг." +"\n");
    System.out.println("---------------------------------------");

    int masha = 67760;
    int denis = 83690;
    int kristina = 76230;
    float tax = 0.10F;
    int year = 12;
    double denisTax = denis + (denis * tax);
    double denisTaxYear = (denisTax * year * tax);
    float mashaTax = masha + (masha * tax);
    float mashaTaxYear = (masha * year * tax);
    float kristinaTax = kristina + (kristina * tax);
    float kristinaTaxYear = (kristina * year * tax);

    System.out.println(" ");
    System.out.println("Задача 8");
    System.out.println("---------------------------------------");
    System.out.println("Значение переменной masha с типом int равно " + masha + "\n" + "Значение переменной denis с типом int равно " + denis + "\n" + "Значение переменной kristina с типом int равно " + kristina + "\n" + "Значение переменной year с типом int равно " + year + "\n" + "Значение переменной tax с типом float равно " + tax + "\n" + "Значение переменной mashaTax с типом float равно " + mashaTax + "\n" + "Значение переменной mashaTaxYear с типом float равно " + mashaTaxYear + "\n" + "Значение переменной denisTax с типом float равно " + denisTax + "\n" + "Значение переменной denisTaxYear с типом float равно " + denisTaxYear + "\n" + "Значение переменной kristinaTaxYear с типом float равно " + kristinaTax + "\n" + "Значение переменной kristinaTaxYear с типом float равно " + kristinaTaxYear + "\n");
    System.out.println("После получения премии Маша теперь получает " + (mashaTax) + " рублей, что на " + (mashaTaxYear) + " рублей, больше, чем среднегодовой доход без начисления премии" + "\n" + "После получения премии Денис теперь получает " + (denisTax) + " рублей, что на " + (denisTaxYear) + " рублей больше, чем среднегодовой доход без начисления премии" + "\n" + "После получения премии Кристина теперь получает " + (kristinaTax) + " рублей, что на " + (kristinaTaxYear) + " рублей больше, чем среднегодовой доход без начисления премии" + "\n");
    System.out.println("---------------------------------------");
}