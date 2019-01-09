import java.util.Scanner;

public class adventureGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What's your name?");
        String userName = scanner.next();
        System.out.println("Hello " + userName + "! Do you want to start the game?");
        String start = scanner.next();

        int heroHealth  = (int) Math.floor(Math.random() * 101);
        int heroAttack = (int) Math.floor(Math.random() * 15) + 10;
        int heroDefence = (int) Math.floor(Math.random() * 5) + 10;
        int heroPotion = (int) Math.floor(Math.random() * 3) +1;

        int enemyHealth = (int) Math.floor(Math.random() * 101);
        int enemyAttack = (int) Math.floor(Math.random() * 15) + 10;
        int enemyDefence = (int) Math.floor(Math.random() * 5) + 10;
        int enemyPotion = (int) Math.floor(Math.random() * 3) +1;

        int potion = 8;

        if(start.equalsIgnoreCase("yes") || start.equalsIgnoreCase("y")) {
            System.out.println("You've entered the dungeon!");
            System.out.printf("Hero Stats: %nHealth: %d %nDefence: %d %nAttack: %d %nPotion: %d %n================%n", heroHealth, heroDefence, heroAttack, heroPotion);
            System.out.printf("Enemy Stats: %nHealth: %d %nDefence: %d %nAttack: %d %nPotion: %d %n================%n", enemyHealth, enemyDefence, enemyAttack, enemyPotion);
            do {

                System.out.printf("Hero abilities: Choose an action. %n=================================%n 1. Attack %n 2. Use Potion %n 3. Run Away %n");
                String heroAction = scanner.next();
                if (heroAction.equals("1")) {//Action 1
                    boolean block = (Math.random() < 0.5);
                    System.out.printf("You swing at enemy.%n");
                    if (block) {
                        System.out.printf("Your attack was blocked.%n%n");
                    } else {
                        enemyHealth -= heroAttack;
                        System.out.printf("You attack the enemy for %d %nThe enemy's health is now: %d%n%n", heroAttack, enemyHealth);
                    }
                    block = (Math.random() < 0.5);
                    if (enemyHealth > 0 && enemyHealth < 15 && enemyPotion >=1){
                        enemyHealth += potion;
                        enemyPotion -= 1;
                        System.out.printf("Enemy used potion for %d and it's health is now: %d%n%n", potion, enemyHealth);
                    }else{
                        System.out.printf("Enemy attacks you.%n");
                        if (block) {
                            System.out.printf("You block the enemy's attack.%n%n");
                        } else {
                            heroHealth -= enemyAttack;
                            System.out.printf("Enemy attacks you for %d %nYour health is now: %d%n%n", enemyAttack, heroHealth);
                        }
                    }
                } else if (heroAction.equals("2")) {//Action 2
                    if(heroPotion >= 1){
                        heroHealth += potion;
                        heroPotion -= 1;
                        System.out.printf("You used a potion and regain %d health. %nYour health is now: %d%n%n",potion, heroHealth);
                    }else{
                        System.out.println("You don't have any potion.");
                    }
                } else if (heroAction.equals("3")) {//Action 3
                    System.out.println("You can't run.");
                }

            }while(enemyHealth > 0 && heroHealth > 0 );

        }
    }
}