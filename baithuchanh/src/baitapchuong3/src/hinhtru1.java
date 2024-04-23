public class hinhtru1  extends Hinhtron{
public class hinhtru1 extends Hinhtron {
        public float chieucao;
        public hinhtru(){
            ten= " hinh tru ";
    
        public hinhtru() {
            ten = " hinh tru ";
        }
        public void nhapchieucao(){
    
        public void nhapchieucao() {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap chieu cao :");
            chieucao = sc.nextFloat();
    
        }
    
    
        public void tinhthetich(){
    
        public void tinhthetich() {
            tinhdientich();
            thetich = dientich * chieucao;
            
    
        }
    
        public static void main(String[] args) {
            hinhtru ht = new hinhtru();
            ht.xuatten();
    
}
