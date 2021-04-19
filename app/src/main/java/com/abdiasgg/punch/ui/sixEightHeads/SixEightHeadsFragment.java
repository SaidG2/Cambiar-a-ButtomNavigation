package com.abdiasgg.punch.ui.sixEightHeads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.abdiasgg.punch.data.CalculateStation;
import com.abdiasgg.punch.databinding.FragmentSixEightHeadsBinding;
import com.abdiasgg.punch.ui.utils.FormatStation;

public class SixEightHeadsFragment extends Fragment {

    private SixEightHeadsViewModel viewModel;
    private FragmentSixEightHeadsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        viewModel = new SixEightHeadsViewModel(
                new CalculateStation(),
                new FormatStation(),
                new MutableLiveData<>());

        binding = FragmentSixEightHeadsBinding.inflate(inflater);

        binding.btnCalculate.setOnClickListener(v -> {
            viewModel.calculateStations(binding.txtPitch.getText().toString());
        });

        viewModel.getResult().observe(getViewLifecycleOwner(), s -> {
            binding.tvStations.setText(s);
        });

        return binding.getRoot();
    }
}