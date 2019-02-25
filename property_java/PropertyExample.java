class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class PropertyExample {
    public static void main(String[] args) {
        Player player = new Player("Monster");
        player.setName("Commander Keen");
        System.out.println(player.getName());
    }
}