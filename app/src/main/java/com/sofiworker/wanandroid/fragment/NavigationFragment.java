package com.sofiworker.wanandroid.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sofiworker.wanandroid.R;

/**
 * 该类是导航页面
 */
public class NavigationFragment extends Fragment {

    private static NavigationFragment navigationFragment = new NavigationFragment();

    public static NavigationFragment getInstance(){
        return navigationFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_navigation, container, false);
    }
}
