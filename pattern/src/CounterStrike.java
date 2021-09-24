public class CounterStrike {
    public static void main(String[] args){
        Player terror = new Player("terror");
        Player count_terror = new Player("count_terror");

        System.out.println("Before bomb is planted");
        terror.setStrategy(new AggressiveStrategy());
        count_terror.setStrategy(new DefensiveStrategy());

        terror.action();
        count_terror.action();
        System.out.println("After bomb is planted");
        terror.setStrategy(new DefensiveStrategy());
        count_terror.setStrategy((new AggressiveStrategy()));

        terror.action();
        count_terror.action();
    }
}
