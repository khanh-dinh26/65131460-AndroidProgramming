package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ListView lvDanhNhan = findViewById(R.id.lvDanhNhan);

        // //2. Chuẩn bị dữ liệu (THÊM ẢNH MẶC ĐỊNH VÀO CUỐI)
        ArrayList<DanhNhan> dsDanhNhan = new ArrayList<>();
        dsDanhNhan.add(new DanhNhan("Trần Hưng Đạo", "Nam Định", R.drawable.tranhugdao));
        dsDanhNhan.add(new DanhNhan("Lý Thái Tổ", "Bắc Ninh", R.drawable.lythaito));
        dsDanhNhan.add(new DanhNhan("Võ Nguyên Giáp", "Quảng Bình", R.drawable.vonguyengiap));
        dsDanhNhan.add(new DanhNhan("Hai Ba Trưng", "Huyện Mê Linh", R.drawable.haibatrung));

        // //3. Khởi tạo Adapter
        DanhNhanAdapter adapter = new DanhNhanAdapter(this, dsDanhNhan);


        lvDanhNhan.setAdapter(adapter);
    }



}