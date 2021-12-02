package org.insbaixcamp.testevents.ui.inici;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.insbaixcamp.testevents.R;
import org.insbaixcamp.testevents.databinding.FragmentHomeBinding;
import org.insbaixcamp.testevents.ui.home.HomeViewModel;

public class IniciFragment extends Fragment {

    private IniciViewModel iniciViewModel;

    public static IniciFragment newInstance() {
        return new IniciFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        iniciViewModel =
                new ViewModelProvider(this).get(IniciViewModel.class);


        final TextView textView = binding.textHome;
        iniciViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        iniciViewModel = new ViewModelProvider(this).get(IniciViewModel.class);
        // TODO: Use the ViewModel
    }

}