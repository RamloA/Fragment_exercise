package com.example.fragment_lec6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BirthFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BirthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BirthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_birth, container, false);
    }

}
