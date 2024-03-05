import java.util.Scanner;

public class NhanVien {
    public String hoTen , gioiTinh , chucVu ;
    public int tuoi , namSinh ; 
      void nhaphoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va Ten : ");
        hoTen = sc.nextLine();
      }
      void nhapgioiTinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("gioi tinh : ");
        gioiTinh = sc.nextLine();
      }
      void nhapchucVu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuc vu : ");
        chucVu = sc.nextLine();
      }

      void nhapnamSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nam sinh : ");
        namSinh = sc.nextInt();
      }
      void tinhtuoi(){
        tuoi = 2024 - namSinh ;
      }
         void inthongtin(){
            System.out.println("Ho va ten : "+hoTen);
            System.out.println("gioi tinh : "+gioiTinh);
            System.out.println("chuc vu : "+chucVu);
            System.out.println("tuoi : "+tuoi);
         }
}

