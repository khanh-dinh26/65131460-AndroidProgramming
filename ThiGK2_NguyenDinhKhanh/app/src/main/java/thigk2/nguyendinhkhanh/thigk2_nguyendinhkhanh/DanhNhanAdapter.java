package thigk2.nguyendinhkhanh.thigk2_nguyendinhkhanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DanhNhanAdapter extends BaseAdapter {
    private ArrayList<DanhNhan> dsDanhNhan;
    private Context context;
    private LayoutInflater cai_bom;

    // //1. Hàm tạo
    public DanhNhanAdapter(Context _context, ArrayList<DanhNhan> dsDanhNhan) {
        this.context = _context;
        this.dsDanhNhan = dsDanhNhan;
        this.cai_bom = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() { return dsDanhNhan.size(); }

    @Override
    public Object getItem(int position) { return dsDanhNhan.get(position); }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // //2. View item hiện hành
        View viewHienHanh = convertView;
        if (viewHienHanh == null) {
            viewHienHanh = cai_bom.inflate(R.layout.item_danhnhan, null);
        }

        // //3. Lấy dữ liệu
        DanhNhan danhNhanHienTai = dsDanhNhan.get(position);

        // //4. Tìm điều khiển (Tìm thêm imgAnh)
        ImageView imgAnh = viewHienHanh.findViewById(R.id.imgAnh);
        TextView tvTen = viewHienHanh.findViewById(R.id.tvTenDanhNhan);
        TextView tvQue = viewHienHanh.findViewById(R.id.tvQueQuan);

        // //5. Gán dữ liệu (Set thêm cái Hình ảnh)
        imgAnh.setImageResource(danhNhanHienTai.getHinhAnh());
        tvTen.setText(danhNhanHienTai.getTen());
        tvQue.setText(danhNhanHienTai.getQueQuan());

        return viewHienHanh;
    }
}
