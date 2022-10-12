import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mời bạn nhập số lượng Book: ");
        int n = new Scanner(System.in).nextInt();
        Book books[] = new Book[n];
        for (int i = 0; i < n; i++){
            System.out.println("Mời bạn nhập cuốn sách "+(i+1));
            System.out.println("Mời bạn nhập tên sách");
            String teSach = new Scanner(System.in).nextLine();
            System.out.println("Mời bạn nhập tác giả");
            String tacGia = new Scanner(System.in).nextLine();
            System.out.println("Mời bạn nhập thể loại sách");
            String theLoai = new Scanner(System.in).nextLine();
            System.out.println("Mời bạn nhập nhà xuất bản");
            String nhaXuatBan = new Scanner(System.in).nextLine();
            System.out.println("Mời bạn nhập năm xuất bản");
            String namXuatBan = new Scanner(System.in).nextLine();

            Book b = new Book();
            b.setTenSach(teSach);
            b.setTacGia(tacGia);
            b.setTheLoai(theLoai);
            b.setNhaXuatBan(nhaXuatBan);
            b.setNamSanXuat(Integer.parseInt(namXuatBan));
            books[i] = b;

        }
        System.out.println("Menu.......");
        System.out.println("1. in ra danh sách book");
        System.out.println("2. Tìm kiếm theo tên Sách");
        System.out.println("3. Tìm kiếm theo tên thể loại");
        System.out.println("4. Liệt kê các sách xuất bản trong năm này");
        int menu = new Scanner(System.in).nextInt();
        switch (menu){
            case 1:
                System.out.println("Danh sách book");
                for (int i = 0; i < books.length; i++){
                    System.out.println(books[i].toString());
                }
                break;
            case 2:
                System.out.println("Nhập tên sách cần tìm");
                String keyWord = new Scanner(System.in).nextLine();
                for (int i = 0; i < books.length; i++){
                    if (books[i].getTenSach().contains(keyWord)){
                        System.out.println(books[i].toString());
                    }
                }
                break;
            case 3:
                System.out.println("Nhập thể loại sách cần tìm");
                String keyWord1 = new Scanner(System.in).nextLine();
                for (int i = 0; i < books.length; i++){
                    if (books[i].getTheLoai().contains(keyWord1)){
                        System.out.println(books[i].toString());
                    }
                }
                break;
            case 4:
                System.out.println("Cách sách xuất bản năm nay");
                for (int i = 0; i < books.length; i++){
                    if (books[i].getNamSanXuat()== LocalDate.now().getYear()){
                        System.out.println(books[i].toString());
                    }
                }
                break;
        }

    }
}