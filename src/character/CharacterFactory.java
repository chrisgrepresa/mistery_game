package character;

import redgame.StartRedGame;

import java.util.Scanner;

public class CharacterFactory {

    Scanner scanner = new Scanner(System.in);

    public void createCharacter(Character character) {
        System.out.println("¿Cómo se llama tu personaje?");
        String choosenName = scanner.nextLine();
        character.setName(choosenName);
        System.out.printf("Hola, " + character.getName() + " . ");
        boolean faltanRespuestas = true;
        while (faltanRespuestas) {
            System.out.println("Ahora escoge un color: ");
            System.out.println("a) Rojo | b) Verde");
            String choosenColor = scanner.nextLine();
            character.setColor(choosenColor);
            if (character.getColor().equalsIgnoreCase("a") ||
                    character.getColor().equalsIgnoreCase("rojo")) {
                System.out.println("Tu color es el a) Rojo");
                System.out.println("Empezemos el juego...");
                faltanRespuestas = false;
                StartRedGame startRedGame = new StartRedGame();
                startRedGame.startRedGame(character);
            } else if (character.getColor().equalsIgnoreCase("b") ||
                    character.getColor().equalsIgnoreCase("verde")) {
                System.out.println("Tu color es el b) Verde");
                System.out.println("De momento, la partida verde no está disponible. Escoge otra opción.");
                //aquí método para comenzar la partida verde
            } else {
                System.out.println("Por favor, introduce una de las dos opciones.");
            }
        }

    }


}
