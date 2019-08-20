package space.ahammdan.curiculumvitae.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import space.ahammdan.curiculumvitae.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class eduFragment extends Fragment {


    public eduFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edu, container, false);
    }

}
