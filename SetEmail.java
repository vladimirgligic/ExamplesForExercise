package setemail;

import java.util.Scanner;

/**
 *
 * @author vladimirgligic
 */
public class SetEmail {

    public static void main(String[] args) {
        Email em = new Email();
    }

}

class Email {

    String ime;
    String prezime;
    String email;
    String password;
    String department="";
    String firma="";

    Email() {
        Scanner im = new Scanner(System.in);
        System.out.println("Unesite ime:");
        ime = im.nextLine();
        Scanner pr = new Scanner(System.in);
        System.out.println("Unesite prezime:");
        prezime = pr.nextLine();
        unosDepartmenta();
        napraviMail();
        password = setPassword();
        System.out.println("Lozinka je: " + password);
        changePassword();

    }

    void unosDepartmenta() {
        int broj = 0;
        do {
            System.out.println("Department \n1 Prodaja\n2 Marketing\n3 Razvoj");
            Scanner im = new Scanner(System.in);
            System.out.println("Unesite department:");
            broj = im.nextInt();

            if (broj == 1) {
                department = "Prodaja";
            } else if (broj == 2) {
                department = "Marketing";
            } else if (broj == 3) {
                department = "Razvoj";
            } else {
                broj = 0;
                System.out.println("Pogrešan unos\n Unesite department ponovo");
            }
        } while (broj == 0);
    }

    void napraviMail() {
        email = ime.toLowerCase() + "." + prezime.toLowerCase() + "@" + department.toLowerCase() + "." + firma.toLowerCase() + ".com";
        System.out.println("Vaš email je: " + email);
    }

    String setPassword() {
        String str = "ABCDEFGHIJKLMNOPRSTYXZWQOUIqwertzuioplkjhgfdsayxcvbnm123456789!#$%&";
        int duzina = 10;
        char[] password = new char[duzina];
        for (int i = 0; i < duzina; i++) {
            int rnd = (int) (Math.random() * str.length());
            password[i] = str.charAt(rnd);
        }
        return new String(password);
    }

    String changePassword() {
        System.out.println("Da li želite da promenite lozinku\n1 DA\n2 NE");

        Scanner sc = new Scanner(System.in);
        String odluka = sc.nextLine();
        if (odluka.equalsIgnoreCase("1")) {
            System.out.println("Unesite novu lozinku:");
            password = sc.nextLine();
        }
        return password;
    }

}
