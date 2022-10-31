package practice11;

import java.util.Scanner;

public class App {

    /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
     */
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int month, day;


        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Oğlak burcu.");
                    } else {
                        System.out.println("Kova burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");}
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("Kova burcu.");
                    } else {
                        System.out.println("Balık burcu.");
                    }
                }else{
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 3:
                if (day >= 1 && day <=31) {
                    if (day <= 20) {
                        System.out.println("Balık burcu.");
                    } else {
                        System.out.println("Koç burcu.");
                    }
                }else{
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        System.out.println("Koç burcu.");
                    } else {
                        System.out.println("Boğa burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Boğa burcu.");
                    } else {
                        System.out.println("İkizler burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("İkizler burcu.");
                    } else {
                        System.out.println("Yengeç burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Yengeç burcu.");
                    } else {
                        System.out.println("Aslan burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Aslan burcu.");
                    } else {
                        System.out.println("Başak burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("Başak burcu.");
                    } else {
                        System.out.println("Terazi burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Terazi burcu.");
                    } else {
                        System.out.println("Akrep burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Akrep burcu.");
                    } else {
                        System.out.println("Yay burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;

            case 12:
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Yay burcu.");
                    } else {
                        System.out.println("Oğlak burcu.");
                    }
                }else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } break;
        }
    }

}

