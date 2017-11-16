package com.example.framgia.caculatorfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TopFragment  extends Fragment {
    public TextView textViewKq;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Đọc file xml tạo ra đối tượng View.

        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)

        View view= inflater.inflate(R.layout.activity_top, container, false);

        textViewKq = (TextView) view.findViewById(R.id.textViewKq);

        return view;
    }

    public void showText(String textViewText) {
        textViewKq.setText(textViewText);
    }
}