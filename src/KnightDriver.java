public class KnightDriver {

    public static void main(String[] args) {
        KnightNode six = new KnightNode("K6");
        KnightNode five = new KnightNode("K5", six);
        KnightNode four = new KnightNode("K4", five);
        KnightNode three = new KnightNode("K3", four);
        KnightNode second = new KnightNode("K2", three);
        KnightNode head = new KnightNode("K1", second);
        six.next = head;

        while (head.health > 0 && head.next != null) {
            System.out.println("--------------");
            System.out.println("Knight: " +head.name+ "("+head.health +") vs " +  "Knight " +head.next.name+ "("+head.next.health +")");
            int remainingHealth = head.getFight(head.next);
            System.out.println("Knight: " +head.name+ "("+head.health +") vs " +  "Knight " +head.next.name+ "("+head.next.health +")");
            System.out.println("next "+ head.next.name +" remainingHealth " + remainingHealth);
            System.out.println("--------------");

            if (remainingHealth <= 0) {
                head.next = head.next.next;
            }
            if(head.name != head.next.name){
                head = head.next;
            } else {
                head.next = null;
            }
        }

        System.out.println("the winner is head " +head.name);
    }
}
