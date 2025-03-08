// Name: Mahi Laddha
// PRN:23070126069
// Batch:A3
public class Main {
    public static void main(String[] args){
        MallardDuck md=new MallardDuck();
        System.out.println("--------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-------");

        RubberDuck rb=new RubberDuck();
        System.out.println("--------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("-------");

        RedHead rh=new RedHead();
        System.out.println("--------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("-------");

        DecoyDuck dd= new DecoyDuck();
        System.out.println("--------");
        dd.display();
        dd.performSwim();
        dd.performFly();
        System.out.println("-------");
    }
}
