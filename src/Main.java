import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //11.3(a)
        double[] str1 = new double[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            str1[i] = random.nextDouble();
            System.out.print(str1[i] + "");
            System.out.println();
        }
        //11.3(b)
        double[] str2 = new double[15];
        for (int i = 0; i < 15; i++) {
            str2[i] = random.nextDouble();
            System.out.print(str2[i] + 22 + "");
            System.out.println();
        }
        //11.3(c)
        double[] str3 = new double[15];
        for (int i = 0; i < 15; i++) {
            str3[i] = -50 + Math.random() * 100;
            System.out.print(str3[i] + "  ");
            System.out.println();
        }
        //11.3(d)
        double[] str4 = new double[15];
        for (int i = 0; i < 15; i++) {
            str4[i] = Math.random() * 10;
            System.out.print(str4[i] + "");
            System.out.println();
        }
        //11.3(f)
        int[] str5 = new int[10];
        for (int i = 0; i < 10; i++) {
            str5[i] = i + 1;
            System.out.print(str5[i] + "");
            System.out.println();
        }
        //11.18(a)
        int[] str6 = new int[5];
        int[] newstr1 = new int[5];
        for (int i = 0; i <= 5; i++) {
            str1[i] = (int) (Math.random() * 10);
            newstr1[i] = str6[i] - 20;
            System.out.print(newstr1[i] + "");
        }
        //11.18(b)
        int[] str6 = new int[5];
        for (int i = 0; i < 5; i++) {
            str1[i] = (int) (Math.random() * 10);
        }
        int[] stre = new int[5];
        int lastel = str6[str6.length - 1];
        for (int i = 0; i < 5; i++) {
            stre[i] = str6[i] * lastel;
            System.out.print(stre[i] + " ");
        }
        //11.18(c)
        int[] str7 = new int[5];
        for (int i = 0; i < 5; i++) {
            str7[i] = (int) (Math.random() * 10);
        }
        int B = 6;
        int[] stre1 = new int[5];
        for (int i = 0; i < 5; i++) {
            stre1[i] = str7[i] + B;
            System.out.print(stre1[i] + " ");
        }
        //11.19(a)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] str8 = new int[n];
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            str8[i] = (int) (Math.random() * 100);
            sum1 += str8[i];
        }
        System.out.println(sum1);
        //11.19(b)
        int n1 = scanner.nextInt();
        int[] str9 = new int[n1];
        int pr = 1;
        for (int i = 0; i < n1; i++) {
            str9[i] = (int) (Math.random() * 100);
            pr *= str9[i];
        }
        System.out.println(pr);
        //11.19(c)
        int n2 = scanner.nextInt();
        int[] str10 = new int[n2];
        int sum2 = 0;
        for (int i = 0; i < n2; i++) {
            str10[i] = (int) (Math.random() * 100);
            int kv = str10[i] * str10[i];
            sum2 += kv;
        }
        System.out.println(sum2);
        //11.19(d)
        int n3 = scanner.nextInt();
        int[] str11 = new int[n3];
        for (int i = 0; i < n3; i++) {
            str11[i] = (int) (Math.random() * 100);
        }
        int summ = str11[0] + str11[1] + str11[2] + str11[3] + str11[4] + str11[5];
        System.out.println(summ);
        //11.19(i)
        int n4 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int[] str12 = new int[n4];
        if (k2 < k1) {
            System.out.println("введите другие числа");
            return;
        }
        for (int i = 0; i < n4; i++) {
            str12[i] = (int) (Math.random() * 100);
        }
        int summl = 0;
        while (k2 > k1) {
            summl += str12[k1];
            k1++;
        }
        System.out.println(summl);
        //11.19(f)
        int n5 = scanner.nextInt();
        int[] str13 = new int[n5];
        double sumsr = 0;
        for (int i = 0; i < n5; i++) {
            str13[i] = (int) (Math.random() * 100);
            sumsr += str13[i];
        }
        double dl = str13.length;
        double sr = sumsr / dl;
        System.out.println(sr);
        //11.19(g)
        int n6 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int[] str14 = new int[n6];
        if (s2 < s1) {
            System.out.println("Введите другое число");
            return;
        }
        for (int i = 0; i < n6; i++) {
            str14[i] = (int) (Math.random() * 100);
        }
        int sumsr2 = 0;
        while (s2 > s1) {
            sumsr2 += str14[s1];
            s1++;
        }
        int dl2 = s2 - s1;
        int sr2 = sumsr2 / dl2;
        System.out.println(sr2);
        //11.28
        int n7 = scanner.nextInt();
        int[] str15 = new int[n7];
        int sumn = 0;
        for (int i = 0; i < n7; i++) {
            str15[i] = random.nextInt();
            sumn += str15[i];
        }
        if (sumn >= 0) {
            System.out.println("Да, верно");
        } else {
            System.out.println("Неверно");
        }
        //11.32
        int gr = scanner.nextInt();//грузоподъемность
        int[] str16 = new int[30];
        int sumgr = 0;
        for (int i = 0; i < 30; i++) {
            str16[i] = (int) (Math.random() * 100);
            sumgr += str16[i];
        }
        if (sumgr <= gr) {
            System.out.println("Общая масса не превышает грузоподъемность");
        } else {
            System.out.println("Общая масса превышает грузоподъемность");
        }
        //11.43
        int[] invr = new int[31];
        for (int i = 0; i < 31; i++) {
            invr[i] = (int) (Math.random() * 100);
            if (invr[i] == 0) {
                System.out.print(i + " ");
            }
        }
        //11.45
        int[] invr1 = new int[15];
        for (int i = 0; i < 15; i++) {
            invr1[i] = (int) (-100 + Math.random() * 100);
            if (i % 2 == 0) {
                System.out.print(invr1[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            if (i % 2 != 0) {
                System.out.print(invr1[i] + " ");
            }
        }
        //11.46(a)
        int[] invr2 = new int[30];
        for (int i = 0; i < 30; i++) {
            invr2[i] = (int) (-1000 + Math.random() * 1000);
            if (invr2[i] < 0) {
                invr2[i] = Math.abs(invr2[i]);
                System.out.println(invr2[i]);
            }
        }
        //11.46(b)
        double[] invr3 = new double[30];
        for (int i = 0; i < 30; i++) {
            invr3[i] = -20 + Math.random() * 1000;
            if (invr3[i]>0 && i % 2 != 0) {
                invr3[i] = Math.sqrt(invr3[i]);
                String invr4 = String.format("%.1f", invr3[i]);
                System.out.println(invr4);
            }
        }
        //11.69
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        int[] str17 = new int[30];
        if (b < a) {
            return;
        }
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < 30; i++) {
            str17[i] = (int) (-10 + Math.random() * 30);
            if (str17[i] == a) {
                ai = i;
            } else if (str17[i] == b) {
                bi = i;
            }
        }
        int dl3 = bi - ai;
        int dl15 = Math.abs(dl3);
        System.out.println(dl15);
        //11.71
        int[] ocenki = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            ocenki[i] = random.nextInt(2, 5);
            if (ocenki[i] == 4 || ocenki[i] == 5) {
                count++;
            }
        }
        System.out.println(Arrays.toString(ocenki));
        System.out.println(count);
        //11.115
        int[] U1 = new int[10];
        int maxu = 0;
        int numb1 = 0;
        int numb2 = 0;
        for (int i = 0; i < 10; i++) {
            U1[i] = random.nextInt(0, 550);
            if (U1[i] > maxu) {
                maxu = U1[i];
                numb1 = i;
                numb2 = i;
            } else if (U1[i] == maxu) {
                numb2 = i;
            }
        }
        System.out.println("Первый: " + numb1);
        System.out.println("Послдений: " + numb2);
        //11.122
        int[] kn1 = new int[60];
        int min1 = 100000;
        for (int i = 0; i < 60; i++) {
            kn1[i] = random.nextInt(0, 100000);
            if (kn1[i] < min1) {
                min1 = kn1[i];
            }
        }
        int count2 = 0;
        for (int i = 0; i < 60; i++) {
            if (kn1[i] == min1) {
                count2++;
            }
        }
        System.out.println(count2);
        //11.111
        double[] sportsmens = new double[25];
        double res = 5;
        for (int i = 0; i < 25; i++) {
            sportsmens[i] = Math.random() * 5;
            if (sportsmens[i] < res) {
                res = sportsmens[i];
            }
            System.out.println("Результат победителя: " + res);
        }
    }
}