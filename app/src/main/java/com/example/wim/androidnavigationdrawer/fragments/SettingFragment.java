package com.example.wim.androidnavigationdrawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wim.androidnavigationdrawer.R;

/**
 * Created by docotel on 3/4/16.
 */
public class SettingFragment extends Fragment {

    public static SettingFragment newInstance(){
        return new SettingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);

        return rootView;
    }
}
