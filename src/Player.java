public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth (int damage) {

        health -= damage;
        if (health <= 0) {
            System.out.println("Player has been knocked out");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health < 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
