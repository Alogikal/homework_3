public void main() {

    int a = 569;
    byte b = 64;
    short c = -159;
    long d = 987678965549L;
    float e = 2.786f;
    double f = 27.12;

    System.out.println("");
    System.out.println("Значение переменной a с типом данных integer = " + a + "\n" + "Значение переменной b с типом данных integer = " + b + "\n" + "Значение переменной c с типом данных integer = " + c + "\n" + "Значение переменной d с типом данных integer = " + d + "\n" + "Значение переменной e с типом данных integer = " + e + "\n" + "Значение переменной f с типом данных integer = " + f + "\n");

    int lyudmila = 23;
    int anna = 27;
    int ekaterina = 30;
    int sheets = 480;

    System.out.println("");
    System.out.println("Значение переменной lyudmila с типом данных integer = " + lyudmila + "\n" + "Значение переменной anna с типом данных integer = " + anna + "\n" + "Значение переменной ekaterina с типом данных integer = " + ekaterina + "\n");
    System.out.println("На каждого ученика рассчитано " + (sheets / (lyudmila + anna + ekaterina)) +  " листов бумаги");

    int efficiency = 16;
    float time1 = 20;
    int time2 = 24 * 60;
    int time3 = 24 * 3 * 60;
    int time4 = 24 * 30 * 60;

    System.out.println("");
    System.out.println("Значение переменной time1 с типом float равно " + time1 + "\n" + "Значение переменной time2 с типом int равно " + time2 + "\n" + "Значение переменной time3 с типом int равно " + time3 + "\n" + "Значение переменной time4 с типом int равно " + time4 + "\n");
    System.out.println("За " + time1 + " минут машина произвела " + (time1 / efficiency / 2) + " штук бутылок");
    System.out.println("За " + time2 + " минут машина произвела " + (time2 / efficiency / 2) +" штук бутылок");
    System.out.println("За " + time3 + " минут машина произвела " + (time3 / efficiency / 2) +" штук бутылок");
    System.out.println("За " + time4 + " минут машина произвела " + (time4 / efficiency / 2) +" штук бутылок");

    int potsWhiteAndBrown = 120;
    int potsWhite = 6;
    int resWhite = potsWhiteAndBrown / potsWhite;
    int resBrown = potsWhiteAndBrown - resWhite;
    int classes = potsWhiteAndBrown / potsWhite;
    System.out.println("");
    System.out.println("В школе, где " + classes + " классов, нужно " + resWhite + " банок белой краски и " + resBrown + " банок коричневой краски");

    int bananas = 5;
    int bananasWeight = 80;
    int milk = 200;
    int weightMilk = 105 * 2;
    int iceCream = 2;
    int iceCreamWeight = 2 * 100;
    int eggs = 4;
    int eggsWeight = 70 * eggs;
    float breakfast = bananasWeight + weightMilk + eggsWeight + iceCreamWeight;

    System.out.println("");
    System.out.println("Значение переменной bananas с типом int равно " + bananas + "\n" + "Значение переменной milk с типом int равно " + milk + "\n" + "Значение переменной icecream с типом int равно " + iceCream + "\n" + "Значение переменной eggs с типом int равно " + eggs + "\n");
    System.out.println("Вес завтрака спротсмена в граммах равен " + breakfast + " или " + (breakfast / 1000) + " килограмм");

}