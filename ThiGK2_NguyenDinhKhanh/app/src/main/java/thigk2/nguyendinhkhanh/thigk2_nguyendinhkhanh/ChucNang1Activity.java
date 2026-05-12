package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang1);
    }

    public void XuLyDoiTien(View view) {
        // // tìm điều khiển
        EditText editSoTien = findViewById(R.id.edtSoTien);
        EditText editTiGia = findViewById(R.id.edtTiGia);
        TextView textKetQua = findViewById(R.id.tvKetQua); // Kết quả hiển thị ra TextView

        // // lấy dữ liệu
        String strSoTien = editSoTien.getText().toString();
        String strTiGia = editTiGia.getText().toString();

        // // chuyển dữ liệu sang dạng số
        double soTien = Double.parseDouble(strSoTien);
        double tiGia = Double.parseDouble(strTiGia);

        // // tính toán
        double ketQua = soTien * tiGia;
        String strKetQua = String.valueOf(ketQua);

        // // Set lên
        textKetQua.setText("Kết quả: " + strKetQua + " VND");
    }
}