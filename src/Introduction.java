import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 2: chuyển đổi tiền tệ
//        final int RATE = 23000;
//        System.out.println("Nhập sô tiền muốn chuyển đổi:");
//        double usd = sc.nextDouble();
//        double vnd = usd * RATE;
//        System.out.printf("%.3f USD đổi sang tiền Việt là: %.3f", usd, vnd);

        // Bài 3: đổi số sang chữ
        System.out.println("Nhập số muốn chuyển đổi:");
        int inputnaumber = sc.nextInt();
        if (inputnaumber >= 0 && inputnaumber < 10) {
            switch (inputnaumber) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (inputnaumber >= 10 && inputnaumber < 20) {
            int ones = inputnaumber % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thiteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eightteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (inputnaumber >= 20 && inputnaumber < 100) {
            int tens = inputnaumber / 10;
            int ones = inputnaumber % 10;
            String strTens = "";
            String strOnes = "";
            switch (tens) {
                case 2:
                    strTens = "twenty";
                    break;
                case 3:
                    strTens = "thirty";
                    break;
                case 4:
                    strTens = "forty";
                    break;
                case 5:
                    strTens = "fifty";
                    break;
                case 6:
                    strTens = "sixty";
                    break;
                case 7:
                    strTens = "seventy";
                    break;
                case 8:
                    strTens = "eightty";
                    break;
                case 9:
                    strTens = "ninety";
                    break;
            }
            switch (ones) {
                case 0:
                    if (tens == 7) {
                        strTens = "seventies";
                    } else {
                        strOnes = "";
                    }
                    break;
                case 1:
                    strOnes = "one";
                    break;
                case 2:
                    strOnes = "two";
                    break;
                case 3:
                    strOnes = "three";
                    break;
                case 4:
                    strOnes = "four";
                    break;
                case 5:
                    strOnes = "five";
                    break;
                case 6:
                    strOnes = "six";
                    break;
                case 7:
                    strOnes = "seven";
                    break;
                case 8:
                    strOnes = "eight";
                    break;
                case 9:
                    strOnes = "nine";
                    break;
            }
            System.out.println("" + strTens + strOnes);
        } else {
            int hundred = inputnaumber / 100;
            int du = inputnaumber % 100;
            int tens = du / 10;
            int ones = du % 10;
            String strHundred = "";
            String strTens = "";
            String strOnes = "";
            String text = "hundred and";
            switch (hundred) {
                case 1:
                    strHundred = "one";
                    break;
                case 2:
                    strHundred = "two";
                    break;
                case 3:
                    strHundred = "three";
                    break;
                case 4:
                    strHundred = "four";
                    break;
                case 5:
                    strHundred = "five";
                    break;
                case 6:
                    strHundred = "six";
                    break;
                case 7:
                    strHundred = "seven";
                    break;
                case 8:
                    strHundred = "eight";
                    break;
                case 9:
                    strHundred = "nine";
                    break;
            }
            if (tens == 0 && ones ==0){
                text = "hundred";
            }
            if (tens == 0){
                strTens = "";
            }
            if (tens == 1){
                switch (ones) {
                    case 0:
                        strTens = "ten";
                        break;
                    case 1:
                        strTens = "eleven";
                        break;
                    case 2:
                        strTens = "twelve";
                        break;
                    case 3:
                        strTens = "thirteen";
                        break;
                    case 4:
                        strTens = "fourteen";
                        break;
                    case 5:
                        strTens = "fifteen";
                        break;
                    case 6:
                        strTens = "sixteen";
                        break;
                    case 7:
                        strTens = "seventeen";
                        break;
                    case 8:
                        strTens = "eightteen";
                        break;
                    case 9:
                        strTens = "nineteen";
                        break;
                }
            }
            if (tens >=2){
                switch (tens) {
                    case 2:
                        strTens = "twenty";
                        break;
                    case 3:
                        strTens = "thirty";
                        break;
                    case 4:
                        strTens = "forty";
                        break;
                    case 5:
                        strTens = "fifty";
                        break;
                    case 6:
                        strTens = "sixty";
                        break;
                    case 7:
                        strTens = "seventy";
                        break;
                    case 8:
                        strTens = "eightty";
                        break;
                    case 9:
                        strTens = "ninety";
                        break;}
                switch (ones) {
                    case 0:
                        strOnes = "";
                        break;
                    case 1:
                        strOnes = "one";
                        break;
                    case 2:
                        strOnes = "two";
                        break;
                    case 3:
                        strOnes = "three";
                        break;
                    case 4:
                        strOnes = "four";
                        break;
                    case 5:
                        strOnes = "five";
                        break;
                    case 6:
                        strOnes = "six";
                        break;
                    case 7:
                        strOnes = "seven";
                        break;
                    case 8:
                        strOnes = "eight";
                        break;
                    case 9:
                        strOnes = "nine";
                        break;
                }
            }
            System.out.println("" + strHundred + " " + text + " " + strTens + strOnes);
        }
    }
}
