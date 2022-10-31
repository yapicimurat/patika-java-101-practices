package practice7;

import java.util.Scanner;

public class App {


    /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */
    //USERNAME AND PASSWORD
    //USERNAME IMMUTABLE BUT PASSWORD IS MUTABLE TO BE ABLE TO CHANGE PASSWORD
    private static final String USER_NAME = "patika";
    private static String PASSWORD = "java123";

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String userName = "", password = "";

        System.out.println("Kullanıcı adı giriniz: ");
        userName = scanner.next();

        System.out.println("Parola giriniz: ");
        password = scanner.next();

        if(userName.equals(USER_NAME) && password.equals(PASSWORD)){
            //login is successfull
            System.out.println("Giriş başarılı");
        }
        else if(userName.equals("patika") && !password.equals("java123")){
            //userName or password incorrect
            System.out.println("Parola hatalı! Sanırım şifrenizi unuttunuz. 1-Şifre sıfırla, İptal için herhangi bir sayıya basınız...");
            int operation = scanner.nextInt();

            switch(operation){
                case 1:
                    System.out.println("Yeni bir parola giriniz: ");
                    String newPassword = scanner.next();

                    if(newPassword.equals(PASSWORD)){
                        System.out.println("Şifre oluşturulamadı.");
                    }else{
                        PASSWORD = newPassword;
                        System.out.println("Yeni şifre başarıyla oluşturuldu.");
                    }

                break;
                default:
                    System.out.println("işlem iptal edildi.");
                    break;
            }
        }
        else{
            System.out.println("Kullanıcı bulunamadı.");
        }

    }
}
