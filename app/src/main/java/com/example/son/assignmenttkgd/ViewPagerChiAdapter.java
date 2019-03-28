package com.example.son.assignmenttkgd;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerChiAdapter extends FragmentPagerAdapter {
    private final List<Fragment>fragmentList=new ArrayList<>();
    private final List<String>FragmentListTitles=new ArrayList<>();
    public ViewPagerChiAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }
    public void AddFragmentChi(Fragment fragment,String title){
        fragmentList.add(fragment);
        FragmentListTitles.add(title);
    }
}
