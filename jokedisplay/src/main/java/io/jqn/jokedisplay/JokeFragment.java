package io.jqn.jokedisplay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JokeFragment extends Fragment {
    public JokeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            View rootView = inflater.inflate(R.layout.fragment_joke, container, false);
            return  rootView;
        } catch (Exception e) {
            Log.e("*********", "Fragment error", e);
            throw e;

        }


    }
}
