import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.println("In a player " + player.getSlotsCount() + " slots with weapons,"
            + " enter a number to shot,"
            + " -1 if end game.");
        int slot = scanner.nextByte();

        while(slot != -1) {
            player.shotWithWeapon(slot);
            slot = scanner.nextByte();
        }
        System.out.println("Game over");
    }
}
