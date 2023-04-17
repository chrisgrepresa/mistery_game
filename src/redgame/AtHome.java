package redgame;
import java.util.Random;
import java.util.Scanner;
import character.Character;

public class AtHome {
    Scanner scanner = new Scanner(System.in);

    public void toDoAtHome(Character character) {
        boolean answerLack = true;
        while (answerLack) {
            System.out.println("¿Qué quieres hacer ahora?");
            System.out.println("a) Leer | b) TV | c) Plantas | d) Salir");
            String homeActivity = scanner.nextLine();
            if (homeActivity.equalsIgnoreCase("a") || homeActivity.equalsIgnoreCase("leer")) {
                System.out.println("Vamos a leer");
                whatToRead();
                randomPhoneCall(character);
            } else if (homeActivity.equalsIgnoreCase("b") || homeActivity.equalsIgnoreCase("TV")) {
                System.out.println("Vamos a ver la TV");
                randomPhoneCall(character);
            } else if (homeActivity.equalsIgnoreCase("c") || homeActivity.equalsIgnoreCase("plantas")) {
                System.out.println("Vamos a cuidar las plantas");
                System.out.println("¡Oh vaya! Todas mis plantas están muertas. Las regué hace poco, ¿me habré pasado con el agua?");
                randomPhoneCall(character);
            } else if (homeActivity.equalsIgnoreCase("d") || homeActivity.equalsIgnoreCase("salir")) {
                System.out.println("La modalidad de salir de casa aún no está disponible");
                randomPhoneCall(character);
            } else {
                System.out.println("Escoge una de las opciones disponibles, no otra.");
            }

        }
    }

    public void randomPhoneCall(Character character) {
        Random random = new Random();
        int phoneCall = random.nextInt(1, 10);
        if (phoneCall <= 2) {
            System.out.println("De repente, llaman al teléfono. ¿Quién será?");
            System.out.println("RINNNNG");
            System.out.println("Parece la voz de tu hermana...");
            System.out.println("'¡" + character.getName() + "...!' BBBZZZZZ '...rápido' BBBZZZ...'lago'");
            System.out.println("La llamada se cuelga.");
            System.out.println("'Qué extraño, la llamada se entrecortaba todo el rato. Luego la llamaré, a ver qué quiere', piensas.");

            toDoAtHome(character);
        } else if (phoneCall > 2 && phoneCall <= 4) {
            System.out.println("¡Anda! Llaman al teléfono de repente.");
            System.out.println("RIIIINNG");
            System.out.println("En la pantalla del teléfono dice 'Pepe Santo'.");
            System.out.println("Hace años que no sabes de tu viejo amigo Pepe Santo. ¿Acaso a vuelto a Hansenburgo? ¿Por qué te llama?");
            System.out.println("Descuelgas el teléfono, pero no suena nada al otro lado.");
            toDoAtHome(character);
        } else {
            System.out.println("Hay muchas cosas que hacer en casa. Por ejemplo...");
            toDoAtHome(character);
        }
    }

    private void whatToRead() {
        boolean readAnswerLack = true;
        while(readAnswerLack){
            System.out.println("¿Qué quieres leer?");
            System.out.println("a) Periódico | b) Revista");
            String whatToRead = scanner.nextLine();
            if(whatToRead.equalsIgnoreCase("a") | whatToRead.equalsIgnoreCase("periodico")){
                System.out.println("'El chico de los periódicos no ha venido hoy...¡Es un desastre!' piensas.");
                readAnswerLack = false;
            }
            else if (whatToRead.equalsIgnoreCase("b") || whatToRead.equalsIgnoreCase("revista")){
                System.out.println("¡Tienes el último número de Noticias Paranormales!");
                System.out.println("'¡En este número de Noticias Paranormales...!'");
                System.out.println("'El monstruo del Lago Ness ¿mito o realidad?'");
                System.out.println("'Todo sobre las Brujas de Salem... en nuestro reportaje sale.'");
                System.out.println("'Extraños avistamientos a las afueras de Hansenburgo. ¿Y tú, has visto algo?' ");
                System.out.println("'Me encanta esta revista', piensas.");
                readAnswerLack = false;
            }
            else {
                System.out.println("Por favor, escoge una de las opciones disponibles.");
            }
        }
    }

}
