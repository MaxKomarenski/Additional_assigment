public class Hobbit extends Character{
    protected int power = 0;
    protected int hp = 3;
    public void kick(Character c){
        toCry();
    }

    private void toCry(){
        System.out.println("AAAAAAAAAAAAAAa");
    }

}
