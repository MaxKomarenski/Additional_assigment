public class Hobbit extends Character{
    public Hobbit(){
        power = 0;
        hp = 30;
    }

    protected void kick(Character c){
        toCry();
        c.hp -= power;
    }

    private void toCry(){
        System.out.println("AAAAAAAAAAAAAAa");
    }
}
