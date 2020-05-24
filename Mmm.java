package vlsu;

public class Mmm implements  gav {

    public void zxc(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    zxc(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }
}


