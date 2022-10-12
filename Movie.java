public class Movie extends Film{
    //thời lượng tính theo phút
    private int thoiLuong;

    public Movie(String id, String tieuDe, double ranking, String horror, int thoiLuong) {
    }

    public Movie(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Movie(String id, String tieuDe, double ranking, TheLoai category, int thoiLuong) {
        super(id, tieuDe, ranking, category);
        this.thoiLuong = thoiLuong;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Movie{" +
                "thoiLuong=" + thoiLuong +
                '}';
    }
}
