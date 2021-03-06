package com.example.lenovo.duan1.AdminFragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.duan1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HoaDonFragment extends Fragment {
    TabLayout tabLayout;

    // TAB layout ko sửa
    public HoaDonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hoadon, container, false);
        tabLayout = view.findViewById(R.id.tablayoutHoaDon);

        tabLayout.addTab(tabLayout.newTab().setText("Chưa giao"));
        tabLayout.addTab(tabLayout.newTab().setText("Đang giao"));
        tabLayout.addTab(tabLayout.newTab().setText("Đã giao"));

        loadFragment(new ChuaGiaoFragment());

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment;
                switch (tab.getPosition()){
                    case 0:
                        fragment = new ChuaGiaoFragment();
                        loadFragment(fragment);
                        break;
                    case 1:
                        fragment = new DangGiaoFragment();
                        loadFragment(fragment);
                        break;
                    case 2:
                        fragment=new DaGiaoFragment();
                        loadFragment(fragment);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return view;
    }


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_containerHoaDon, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
