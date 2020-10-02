public class Item {
    static int id;
    static String name;
    static String skin;
    static double hp;
    static boolean burnable;
    static String drop;

    public Item(int id, String name, String skin, double hp, boolean burnable, String drop) {
        this.id = id;
        this.name = name;
        this.skin = skin;
        this.hp = hp;
        this.burnable = burnable;
        this.drop = drop;
    }
}
