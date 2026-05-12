package com.khanhnd.vieccanlam;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Khai báo biến
    ArrayList<CongViec> lstCV;
    CongViecAdapter adapter;
    ListView lvCongViec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ ListView
        lvCongViec = findViewById(R.id.lvCongViec);

        // 2. Cài đặt Adapter cho ListView
        lstCV = new ArrayList<>();
        adapter = new CongViecAdapter(this, lstCV);
        lvCongViec.setAdapter(adapter);

        // 3. Kết nối với Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("TASKS");

        // 4. Lắng nghe và tải dữ liệu từ Firebase về ListView
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                lstCV.clear();

                for (DataSnapshot obj : snapshot.getChildren()){
                    CongViec cv = obj.getValue(CongViec.class);
                    if(cv != null) {
                        lstCV.add(cv);
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Lỗi tải dữ liệu!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}