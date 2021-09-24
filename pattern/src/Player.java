public class Player {
    IStrategy behaviour;
    String type;
    public Player(String type){
        this.type = type;
    }
    public void setStrategy(IStrategy behaviour){
        this.behaviour = behaviour;
    }
    public void action(){
        System.out.println("Player:"+this.type);
        behaviour.actionCommand();
    }
}
