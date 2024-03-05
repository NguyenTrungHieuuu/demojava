import java.util.Scanner;

public class HinhTron{
    float Bankinh;
    float chuVi;
    float Dientich;
    final float PI = 3.14f;
    void NhapBankinh(){
        Scanner sc= new Scanner( System.in);
        System.out.print("r= ");
        Bankinh = sc.nextFloat();
    }
    void tinhchuVi(){
        chuVi = 2 * PI *Bankinh;
    }
    void tinhDientich(){
        Dientich = PI* (Bankinh*Bankinh);
    }
    void inThongtin(){
        System.out.print("chuVi= "+chuVi);
        System.out.print("Dientich= "+Dientich);
    }
        
}