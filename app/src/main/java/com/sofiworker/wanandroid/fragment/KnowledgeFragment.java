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
 * 该类为知识体系页面
 */
public class KnowledgeFragment extends Fragment {

    private static KnowledgeFragment knowledgeFragment = new KnowledgeFragment();

    public static KnowledgeFragment getInstance(){
        return knowledgeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_knowledge, container, false);
    }
}
