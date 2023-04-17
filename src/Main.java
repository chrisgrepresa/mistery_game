import character.Character;
import character.CharacterFactory;
import redgame.StartRedGame;
import redgame.AtHome;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        CharacterFactory characterFactory = new CharacterFactory();
        characterFactory.createCharacter(character);

        StartRedGame startRedGame = new StartRedGame();
        //startRedGame.startRedGame();
        AtHome atHome = new AtHome();
        //atHome.toDoAtHome();


    }
}