public class test {
    public static void main(String[] args) {

        nvfulltime sep = new nvfulltime("le sep");
        sep.loaichucvu(configs.nv_sep);
        nvfulltime trunghieu = new nvfulltime("trung hieu");
        nvfulltime vanho = new nvfulltime("van ho", 20);
        nvpartime pt = new nvpartime(" khanh linh ", 200);
        sep.tinhluong();
        ducdat.tinhluong();
        vietanh.tinhluong();
        pt.tinhluong();

        sep.inthongtin();
        ducdat.inthongtin();
        vietanh.inthongtin();
        pt.inthongtin();
    }
}
