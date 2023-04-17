package usuario.example.tpanexoa.ui.miUbicacion;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import usuario.example.tpanexoa.R;

public class MiUbicacionFragment extends Fragment {

    private MiUbicacionViewModel mViewModel;

    public static MiUbicacionFragment newInstance() {
        return new MiUbicacionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mi_ubicacion, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MiUbicacionViewModel.class);
        // TODO: Use the ViewModel
    }

}