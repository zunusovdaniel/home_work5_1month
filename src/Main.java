
public class Main {
    public static void main(String[] args) {
        Boss b = new Boss();
        b.setHealth(100);
        b.setDamage(100);
        b.setTypeProtection("magic");
        System.out.println("Boss health "+b.getHealth()+", "+"Boss damage "+b.getDamage()+" ," + b.getTypeProtection());
        creatHeroes();
        for (int i = 0; i < creatHeroes().length; i++) {
            System.out.println("Herohealth " + creatHeroes()[i].getHealth() +" herodamage  "+ creatHeroes()[i].getDamage());
        }
    }
    public static Hero[] creatHeroes() {
        Hero spiderman = new Hero(100,100);
        Hero batman = new Hero(200,200);
        Hero joker = new Hero(222,345,"knife");

        Hero[] massive ={spiderman,batman,joker};
        return massive;
    }
}
