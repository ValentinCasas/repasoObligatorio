package usuario.example.tpanexoa.misActividades;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import usuario.example.tpanexoa.Models.Actividad;
import usuario.example.tpanexoa.R;

public class ActividadFragment extends Fragment {

    private TextView nombreActividadTextView;
    private TextView fechaActividadTextView;
    private TextView horaActividadTextView;
    private TextView detalleActividadTextView;
    private TextView lugarActividadTextView;


    private Actividad actividad;

    public ActividadFragment() {
        // Required empty public constructor
    }

    public static ActividadFragment newInstance() {
        return new ActividadFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            actividad = (Actividad) getArguments().getSerializable("actividad");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actividad, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nombreActividadTextView = view.findViewById(R.id.tvNombreActividad);
        fechaActividadTextView = view.findViewById(R.id.tvFecha);
        horaActividadTextView = view.findViewById(R.id.tvHora);
        detalleActividadTextView = view.findViewById(R.id.tvDescripcionActividad);
        lugarActividadTextView = view.findViewById(R.id.tvLugarDetalle);

        if (actividad != null) {
            nombreActividadTextView.setText(actividad.getNombre());
            fechaActividadTextView.setText(new SimpleDateFormat("dd/MM/yyyy").format(actividad.getFecha()));
            horaActividadTextView.setText(actividad.getHora());
        }
    }
}
