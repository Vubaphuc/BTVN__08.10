public class Series extends Film{
    private int soTap;
    //thời lượng tính theo phút
    private int thoiLuongTrungBinh;

    public Series(String s, String s1, double v, TheLoai horror, int i) {
    }

    public Series(int soTap, int thoiLuongTrungBinh) {
        this.soTap = soTap;
        this.thoiLuongTrungBinh = thoiLuongTrungBinh;
    }

    public Series(String id, String tieuDe, double ranking, TheLoai category, int soTap, int thoiLuongTrungBinh) {
        super(id, tieuDe, ranking, category);
        this.soTap = soTap;
        this.thoiLuongTrungBinh = thoiLuongTrungBinh;
    }

    public int getSoTap() {
        return soTap;
    }

    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    public int getThoiLuongTrungBinh() {
        return thoiLuongTrungBinh;
    }

    public void setThoiLuongTrungBinh(int thoiLuongTrungBinh) {
        this.thoiLuongTrungBinh = thoiLuongTrungBinh;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Series{" +
                "soTap=" + soTap +
                ", thoiLuongTrungBinh=" + thoiLuongTrungBinh +
                '}';
    }
}
