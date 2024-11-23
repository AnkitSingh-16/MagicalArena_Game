public class MagicalArena {
    public static void main(String[] args) {
        Player playerA = new Player("Player A", 70, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 15);

        /* Checking initial requirements */
        if (!playerA.isAlive()) {
            System.out.println("Player A does not have minimum health required to participate in the game");
            return;
        }
        if (!playerB.isAlive()) {
            System.out.println("Player B does not have minimum health required to participate in the game");
            return;
        }

        System.out.println("Starting the Magical Arena Match!");
        runMatch(playerA, playerB);
    }

    public static void runMatch(Player player1, Player player2) {
        // Determining based on their health value, who will start the match
        if (player1.getHealth() > player2.getHealth()) {
            Player temp = player1;
            player1 = player2;
            player2 = temp;
        }
        int turn = 0;
        /*
         * If turn == 0 -> player1 will attack
         * If turn == 1 -> player2 will attack
         */
        while (player1.isAlive() && player2.isAlive()) {
            if (turn == 0) {
                fight(player1, player2);
            } else {
                fight(player2, player1);
            }
            turn = turn ^ 1;

        }
    }

    public static void fight(Player attacker, Player defender) {
        int attackRoll = attacker.rollDice();
        int defenseRoll = defender.rollDice();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefenseStrength(defenseRoll);

        int netDamage = Math.max(attackDamage - defenseStrength, 0);
        defender.reduceHealth(netDamage);

        // Print round results
        System.out.println(attacker.getName() + " attacks with dice roll " + attackRoll);
        System.out.println("Attack damage: " + attackDamage);
        System.out.println(defender.getName() + " defends with dice roll " + defenseRoll);
        System.out.println("Defense strength: " + defenseStrength);
        System.out.println(defender.getName() + "'s health reduced by " + netDamage + " to " + defender.getHealth());
        System.out.println("----------------------------------");

        if (!defender.isAlive()) {
            System.out.println(defender.getName() + " has been defeated!");
            System.out.println(attacker.getName() + " wins!");
        }
    }
}
