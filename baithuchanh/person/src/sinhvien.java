public class sinhvien {
    public String name, age, address;

    public sinhvien(){
        name = "Nguyen Trung Hieu";
        age = "20";
        address = "Bac Ninh";
    }

    public void nhapThongTin(String ten){
        this.name = ten;
    }

    public void nhapThongTin(String ten, String tuoi){
        this.name = ten;
        this.age = tuoi;
    }

    public void nhapThongTin(String ten, String tuoi, String diaChi){
        this.name = ten;
        this.age = tuoi;
        this.address = diaChi;
    }

    public void xuatThongTin(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Dia chi : " + address);
    }

    public void xuatThongTin(String name){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Dia chi : " + address);
    }   

    public void xuatThongTin(String name, String age){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Dia chi : " + address);
    }

    public void xuatThongTin(String name, String age, String address){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Dia chi : " + address);
    }
}