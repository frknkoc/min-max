import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, n, max = 1, min = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaç sayı girmek istediğinizi yazınız...");
        number = input.nextInt();
        int i = 1, t, a;

        while (i <= number){
            System.out.println("Lütfen girmek istediğiniz " + i + ". sayıyı yazınız...");
            i++;
            n = input.nextInt();
            if (n >= 0){
                t = 0;
                while (t <= n){
                    if (t > max){
                        max = t;
                    }
                    t++;
                }

            } else {
                a = 0;
                while (a >= n){
                    if (a < min){
                        min = a;
                    }
                    a--;
                }
            }
            }
        System.out.println("Girdiğiniz değerler arasında en yüksek değer : " + max);
        System.out.println("Girdiğiniz değerler arasında en düşük değer : " + min);
        }
    }