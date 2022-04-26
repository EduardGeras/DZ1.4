public class Main {
    public static void main(String[] args) {

        // Задание 1
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--){
            System.out.print(j + " ");
        }
        System.out.println();

        // Задание 2
        int k = 3;
        for ( int friday = k; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
        }

        // Задание 3
        int period = 79;
        int were = 1822;
        int willBe = 2122;
        for (int f = 0; f <= willBe; f = f + period) {
            if ( f >= were) {
                System.out.println(f);
            }
        }
    }
}