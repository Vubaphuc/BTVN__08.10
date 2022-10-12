public class Book {
    private static int maSach=0;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private String nhaXuatBan;
    private int namSanXuat;

    public Book(String tenSach1, String tacgia1, String theLoai1, String nhaXuatBan1, int i) {
    }

    public Book(int maSach, String tenSach, String tacGia, String theLoai, String nhaXuatBan, int namSanXuat) {
        maSach++;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.namSanXuat = namSanXuat;
    }

    public Book() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namSanXuat=" + namSanXuat +
                '}';
    }
}
