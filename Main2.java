import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // khai báo mang 1
        Movie movie1 = new Movie("ID 1", "Tiêu đề 1", 1.0, TheLoai.HORROR, 360);
        Movie movie2 = new Movie("ID 2", "Tiêu đề 2", 2.0, TheLoai.COMEDY, 360);
        Movie movie3 = new Movie("ID 3", "Tiêu đề 3", 3.0, TheLoai.DOCUMENTATRY, 360);
        // xét giá trị
        movie1.setId("ID 1");
        movie2.setId("ID 2");
        movie3.setId("ID 3");
        movie1.setTieuDe("Tiêu Đề 1");
        movie2.setTieuDe("Tiêu Đề 2");
        movie3.setTieuDe("Tiêu Đề 3");
        movie1.setRanking(1.0);
        movie2.setRanking(2.0);
        movie3.setRanking(3.0);
        movie1.setCategory(TheLoai.HORROR);
        movie2.setCategory(TheLoai.COMEDY);
        movie3.setCategory(TheLoai.DOCUMENTATRY);
        movie1.setThoiLuong(360);
        movie2.setThoiLuong(360);
        movie2.setThoiLuong(360);
        // mảng 1
        Movie movies[] = {movie1, movie2, movie3};

        // khai báo mảng 2
        Series series1 = new Series("ID 1", "Tiêu Đề 1", 4.0, TheLoai.HORROR, 14, 300);
        Series series2 = new Series("ID 2", "Tiêu Đề 2", 5.0, TheLoai.DOCUMENTATRY, 15, 300);
        Series series3 = new Series("ID 3", "Tiêu Đề 3", 6.0, TheLoai.COMEDY, 16, 300);
        // set giá trị
        series1.setId("ID 1");
        series2.setId("ID 2");
        series3.setId("ID 3");
        series1.setTieuDe("panda");
        series2.setTieuDe("mickey");
        series3.setTieuDe("Dog");
        series1.setRanking(4.0);
        series2.setRanking(5.0);
        series3.setRanking(6.0);
        series1.setCategory(TheLoai.COMEDY);
        series1.setCategory(TheLoai.DOCUMENTATRY);
        series3.setCategory(TheLoai.COMEDY);
        series1.setSoTap(14);
        series2.setSoTap(15);
        series3.setSoTap(16);
        series1.setThoiLuongTrungBinh(300);
        series2.setThoiLuongTrungBinh(300);
        series3.setThoiLuongTrungBinh(300);
        // mảng 2
        Series seriess[] = {series1, series2, series3};
        int menu;
        do {
            System.out.println("Menu.........");
            System.out.println("1. In thông tin phim ra màn hình");
            System.out.println("2. Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)");
            System.out.println("3. In ra thông tin film có ranking thấp nhất (kiểm tra cả movie và series)");
            System.out.println("4. In ra tên đạo diễn của thể loại COMEDY có ranking thấp nhất");
            System.out.println("0. Thoát Chương trình");
            menu = new Scanner(System.in).nextInt();
            switch (menu) {
                case 1:
                    for (int i = 0; i < movies.length; i++) {
                        for (int j = 0; j < seriess.length; j++) {
                            System.out.println(movies[i].toString() + seriess[j].toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập tiêu đề film cần tìm");
                    String keyWord = new Scanner(System.in).nextLine();
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getTieuDe().contains(keyWord)) {
                            System.out.println(movies[i].toString());
                        }
                    }
                    for (int i = 0; i < seriess.length; i++) {
                        if (seriess[i].getTieuDe().contains(keyWord)) {
                            System.out.println(seriess[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("ranking thấp nhất là: ");
                    double min1 = movies[0].getRanking();
                    double min2 = seriess[0].getRanking();
                    for (int i = 0; i < movies.length; i++) {
                        if (min1 > movies[i].getRanking()) {
                            min1 = movies[i].getRanking();
                        }
                    }
                    for (int i = 0; i < movies.length; i++) {
                        if (min2 > seriess[i].getRanking()) {
                            min2 = seriess[i].getRanking();
                        }
                    }
                    if (min1<min2){
                        System.out.println(min1);
                    }
                    if (min1> min2){
                        System.out.println(min2);
                    }
                    break;
                case 4:
                    System.out.println("tên đạo diễn của thể loại COMEDY có ranking thấp nhất là: ");

                    break;
                case 0:
                    continue;

            }
        } while (menu != 0 && menu > 5);

    }
}