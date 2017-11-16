package com.example.framgia.caculatorfragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Context;

public class BottomFragment extends Fragment {

    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Đọc file xml tạo ra đối tượng View.

        View view= inflater.inflate(R.layout.activity_bottom, container, false);

        Button kqButton = (Button) view.findViewById(R.id.btn_kq);

        kqButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setTextKQ();
            }
        });

        return view;
    }
    //  Phương thức này được gọi sau khi Fragment được ghép vào Activity.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }

    private void setTextKQ() {
        this.mainActivity.showText("121324");
    }

}