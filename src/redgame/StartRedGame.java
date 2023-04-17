package redgame;

import character.Character;

import java.util.Scanner;

public class StartRedGame {
    AtHome atHome = new AtHome();

    public void startRedGame(Character character) {
        System.out.println("Domingo por la mañana en tu pequeño apartamento en un tranquilo barrio de Hansenburgo. ");
        System.out.println("Te ha costado un poco despertarte. ");
        System.out.println("¿Qué pasó anoche? No te acuerdas bien del todo...");
        Scanner scanner = new Scanner(System.in);
        boolean faltanRespuestas = true;
        while (faltanRespuestas) {
            System.out.println("¿Qué quieres hacer? ");
            System.out.println("a) Dormir un poco más | b) Desayunar ya");
            String wakeUpOrNot = scanner.nextLine();
            if (wakeUpOrNot.equalsIgnoreCase("a") || wakeUpOrNot.equalsIgnoreCase("dormir")
                    || wakeUpOrNot.equalsIgnoreCase("dormir un poco más")) {
                System.out.println("Zzz");
                System.out.println("ZzzzZzzz...");
                System.out.println("Realmente te hacía falta dormir, ¿eh?");
                //¿Cómo hacer para que a la tercera te obligue a levantarte?
            } else if (wakeUpOrNot.equalsIgnoreCase("b") || wakeUpOrNot.equalsIgnoreCase("desayunar")
                    || wakeUpOrNot.equalsIgnoreCase("desayunar ya")) {
                System.out.println("En la despensa sólo quedan unos cereales. Te los tomas sin nada.");
                faltanRespuestas = false;
            } else {
                System.out.println("Esa opción no está disponible, vuelve a escoger.");
            }
        }
        System.out.println("Bueno, hora de comenzar el día... Es domingo, así que hoy puedes hacer lo que quieras.");
        stayOrGo(scanner, character);

    }

    private void stayOrGo(Scanner scanner, Character character) {
        boolean answerLack = true;
        while (answerLack) {
            System.out.println("¿Qué te apatece hacer?");
            System.out.println("a) Quedarte en casa | b) Salir");
            String stayOrGo = scanner.nextLine();
            if (stayOrGo.equalsIgnoreCase("a") || stayOrGo.equalsIgnoreCase("quedarme") ||
                    stayOrGo.equalsIgnoreCase("quedarme en casa") || stayOrGo.equalsIgnoreCase("quedarte en casa")) {
                System.out.println("He escogido quedarte en casa");
                atHome.toDoAtHome(character);
                answerLack = false;

            } else if (stayOrGo.equalsIgnoreCase("b") || stayOrGo.equalsIgnoreCase("salir")) {
                System.out.println("Has escogido salir.");
                System.out.println("La modalidad de salir de casa aún no está disponible");
            } else {
                System.out.println("Esa opción no está disponible, vuelve a escoger.");
            }
        }
    }
}

