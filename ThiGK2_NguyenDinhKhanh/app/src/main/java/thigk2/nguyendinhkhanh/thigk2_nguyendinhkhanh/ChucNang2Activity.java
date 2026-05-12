package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);

        ListView lvCaKhuc = findViewById(R.id.lvCaKhuc);

        // //2. Chuẩn bị dữ liệu
        ArrayList<String> dsCaKhuc = new ArrayList<>();
        dsCaKhuc.add("Tiến Quân Ca");
        dsCaKhuc.add("Hồ Chí Minh đẹp nhất tên người");
        dsCaKhuc.add("Trường Sơn Đông Trường Sơn Tây");
        dsCaKhuc.add("Lên Đàng");
        dsCaKhuc.add("Đất nước trọn niềm vui");
        dsCaKhuc.add("Nguyễn Đình Khánh");
        dsCaKhuc.add("Mùa xuân trên Thành phố Hồ Chí Minh");
        dsCaKhuc.add("Đoàn vệ quốc quân");
        dsCaKhuc.add("Cô gái Sài Gòn đi tải đạn");
        dsCaKhuc.add("Giai điệu tự hào");

        // //3. Tạo Adapter và Set lên
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsCaKhuc);
        lvCaKhuc.setAdapter(adapter);
    }

}