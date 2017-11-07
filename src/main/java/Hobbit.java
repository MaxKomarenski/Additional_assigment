public class Hobbit extends Character{
    public Hobbit(){
        power = 0;
        hp = 3;
    }

    public void kick(Character c){
        toCry();
    }

    private void toCry(){
        System.out.println("AAAAAAAAAAAAAAa");
    }

}
