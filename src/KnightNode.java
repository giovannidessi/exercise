import java.util.Random;

public class KnightNode {
    int health;
    String name;
    KnightNode next;

    KnightNode(String name) {
        this.name = name;
        this.health = 100;
        this.next = null;
    }

    KnightNode(String name, int health) {
        this.name = name;
        this.health = health;
        this.next = null;
    }

    KnightNode(String name, KnightNode next) {
        this.name = name;
        this.health = 100;
        this.next = next;
    }


    public int getFight(KnightNode node) {
        Random rand = new Random();
        int damage = (1 + rand.nextInt(5)+1);
        node.health = node.health - damage;
        System.out.println("node "+ node.name +" damage "+damage);
        return node.health;
    }

    @Override
    public String toString() {
        return "KnightNode{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
