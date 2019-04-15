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
 * 该类为公众号展示页面
 */
public class PublicNumberFragment extends Fragment {

    private static PublicNumberFragment publicNumberFragment = new PublicNumberFragment();

    public static PublicNumberFragment getInstance(){
        return publicNumberFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_public_number, container, false);
    }
}
