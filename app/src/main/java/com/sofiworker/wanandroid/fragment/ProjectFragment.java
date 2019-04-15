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
 * 该类为项目展示页面
 */
public class ProjectFragment extends Fragment {

    private static ProjectFragment projectFragment = new ProjectFragment();

    public static ProjectFragment getInstance(){
        return projectFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_project, container, false);
    }
}
