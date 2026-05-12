package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    public void moChucNang1(View v) {
        Intent intent = new Intent(this, ChucNang1Activity.class);
        startActivity(intent);
    }

    public void moChucNang2(View v) {
        Intent intent = new Intent(this, ChucNang2Activity.class);
        startActivity(intent);
    }

    public void moChucNang3(View v) {
        Intent intent = new Intent(this, ChucNang3Activity.class);
        startActivity(intent);
    }

    public void moChucNang4(View v) {
        Intent intent = new Intent(this, ChucNang4Activity.class);
        startActivity(intent);
    }
}