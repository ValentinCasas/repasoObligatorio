package usuario.example.tpanexoa.ui.miMusica;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import usuario.example.tpanexoa.R;

public class MiMusicaFragment extends Fragment {

    private MiMusicaViewModel mViewModel;

    public static MiMusicaFragment newInstance() {
        return new MiMusicaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mi_musica, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MiMusicaViewModel.class);
        // TODO: Use the ViewModel
    }

}