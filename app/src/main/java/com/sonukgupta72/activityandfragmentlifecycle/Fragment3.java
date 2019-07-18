package com.sonukgupta72.activityandfragmentlifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        printLog("Attach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        printLog("AttachFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog("Create");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        printLog("CreateView");
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        printLog("ActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        printLog("Start");
    }

    @Override
    public void onResume() {
        super.onResume();
        printLog("Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        printLog("Pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        printLog("Stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        printLog("DestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        printLog("Destroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        printLog("Detach");
    }

    private void printLog(String str) {
        Log.d("LIFE_CYCLE", getClass().getSimpleName() + " " + str);
    }

}
