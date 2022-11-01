package practice20;

import java.util.Scanner;

public class App {

    //Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String userName, password;

        int balance = 1500;
        int operation;
        int right = 3;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("murat") && password.equals("123")) {
                System.out.println("Bankaya hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen işlem seçiniz: ");
                    operation = input.nextInt();
                    int price = 0;
                    switch(operation){
                        case  1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();

                            balance += price;
                            break;
                        case  2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (operation != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }


    }


}
