public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void reduceHealth(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1; // Random number between 1 and 6
    }

    public int calculateAttackDamage(int diceRoll) {
        return this.attack * diceRoll;
    }

    public int calculateDefenseStrength(int diceRoll) {
        return this.strength * diceRoll;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

}
