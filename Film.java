public class Film {
    private  String id;
    private String tieuDe;
    private double ranking;
    private TheLoai category;

    // hàm contrus không tham số
    public Film() {
    }
    // hàm contrus có tham số
    public Film(String id, String tieuDe, double ranking, TheLoai category) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.ranking = ranking;
        this.category = category;
    }
    // get and set
    public String getId(String s) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public TheLoai getCategory() {
        return category;
    }

    public void setCategory(TheLoai category) {
        this.category = category;
    }

    // toSing

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", ranking=" + ranking +
                ", category=" + category +
                '}';
    }
}
