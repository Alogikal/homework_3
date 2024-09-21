public void main() {

    int a = 569;
    byte b = 64;
    short c = -159;
    long d = 987678965549L;
    float e = 2.786f;
    double f = 27.12;
    System.out.println("");
    System.out.println("var = " + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n");

    int lyudmila = 23;
    int anna = 27;
    int ekaterina = 30;
    int sheets = 480;

    System.out.println("На каждого ученика рассчитано " + (sheets / (lyudmila + anna)) +  " листов бумаги");

    int efficiency = 16;
    int time1 = 20;
    int time2 = 24 * 60;
    int time3 = 24 * 3 * 60;
    int time4 = 24 * 30 * 60;

    System.out.println("За " + time1 + " минут машина произвела " + (time1 / efficiency) + " штук бутылок");
    System.out.println("За " + time2 + " минут машина произвела " + (time2 / efficiency) +" штук бутылок");
    System.out.println("За " + time3 + " минут машина произвела " + (time3 / efficiency) +" штук бутылок");

    int potsWhiteAndBrown = 120;
    int potsWhite = 6;
    int resWhite = potsWhiteAndBrown / potsWhite;
    int resBrown = potsWhiteAndBrown - resWhite;;
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
    int breakfast = bananasWeight + weightMilk + eggsWeight + iceCreamWeight;

    System.out.println("");
    System.out.println("Вес завтрака спротсмена в граммах равен " + breakfast + " или " + (breakfast * 0.77) + " килограмм");
}