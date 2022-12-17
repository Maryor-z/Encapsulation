public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.fullname = "may";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("initial heath " + tim.healthRemaining());
    }
}
