import java.util.HashSet;
import java.util.Scanner;

public class Hashslide57 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetString.add("harry maguire");
        hashSetString.add("anh 7 co?");
        hashSetString.add("antony");
        hashSetString.add("messi");
        hashSetString.add("onana");
        System.out.println("cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        if (hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSetString:");
            System.out.println(hashSetString);
        }else{
            System.out.println("xoa khong thanh cong!");
        }
    }
    
}
