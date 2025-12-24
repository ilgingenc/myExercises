package Quiz;

import java.util.Random;

public class GameCharacter {
    private int characterID;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.health = health;
        this.level = level;
        Random rnd = new Random();
        this.characterID = 1000 + rnd.nextInt(9000);
        totalCharacters++;

    }

    public int getCharacterID() {
        return characterID;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;
    }

    public String getInfo() {
        return "Character ID: " + characterID +
                "  Name: " + name +
                "  Level: " + level +
                "  Health: " + health +
                "  Total Characters: " + totalCharacters;
    }
}
