package com.example.menunavegable.ui.palabras;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.menunavegable.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetallePalabras#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetallePalabras extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private TextView largo;
    private TextView primero;
    private DetallePalabrasViewModel vm;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DetallePalabras() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetallePalabras.
     */
    // TODO: Rename and change types and number of parameters
    public static DetallePalabras newInstance(String param1, String param2) {
        DetallePalabras fragment = new DetallePalabras();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        vm=new DetallePalabrasViewModel();
        vm.getLargo().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                largo.setText(s);

            }
        });
        vm.getPrimero().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                primero.setText(s);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_detalle_palabras, container, false);

        largo=view.findViewById(R.id.largo);
        primero=view.findViewById(R.id.primer);
        String palabra=getArguments().getString("palabra");
        vm.obtenerDatos(palabra);


        return view;
    }
}
