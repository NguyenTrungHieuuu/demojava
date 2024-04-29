public class meo extends animals {
    void Run(){
        System.out.println("Meo  bat chuot rat nhanh");
    }
    void Eat(){
        System.out.println("Meo an tap");
    }
    public static void main(String[] args) {
        animals meo = new meo();
        meo.Run();
        meo.Eat();
    }
}
