package com.example.son.assignmenttkgd;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ChiActivity extends AppCompatActivity {
        private TabLayout tabLayout;
        private ViewPager viewPager;
        private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi);
        toolbar=findViewById(R.id.tool_bar);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tabLayout);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ViewPagerChiAdapter adapter=new ViewPagerChiAdapter(getSupportFragmentManager());
        adapter.AddFragmentChi(new KhoanChi(),"Khoan chi");
        adapter.AddFragmentChi(new LoaiChi(),"Loai chi");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
