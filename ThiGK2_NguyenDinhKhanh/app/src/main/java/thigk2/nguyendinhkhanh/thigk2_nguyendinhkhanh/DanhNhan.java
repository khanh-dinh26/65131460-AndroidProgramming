package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

public class DanhNhan {
    private String ten;
    private String queQuan;
    private int hinhAnh; // Thêm biến lưu id ảnh

    // //1. Hàm tạo cập nhật có thêm ảnh
    public DanhNhan(String ten, String queQuan, int hinhAnh) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.hinhAnh = hinhAnh;
    }

    // //2. Các hàm Getter
    public String getTen() { return ten; }
    public String getQueQuan() { return queQuan; }
    public int getHinhAnh() { return hinhAnh; } // Lấy ảnh
}