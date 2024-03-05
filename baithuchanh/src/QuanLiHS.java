import java.util.Scanner;

public class QuanLiHS {
    String hoTen;
    String gioiTinh;
    String MSV;
    void NhapHoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("HoTen : ");
        hoTen = sc.nextLine();
    }
    void NhapGioiTinh(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("gioi tinh : ");
        gioiTinh = sc.nextLine();
     }
     void NhapMSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien : ");
        MSV = sc.nextLine();
     }
     void inthongtin(){
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Ma sinh vien: " +MSV);
     }
    
    }
    
