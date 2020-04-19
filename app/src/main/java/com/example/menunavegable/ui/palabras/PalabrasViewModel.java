package com.example.menunavegable.ui.palabras;

import androidx.lifecycle.*;

import java.util.ArrayList;
import java.util.List;

public class PalabrasViewModel extends ViewModel {

    private MutableLiveData<List<String>> listaDePalabras;


    public LiveData<List<String>> getListaDePalabras() {
        if(listaDePalabras==null){
            listaDePalabras=new MutableLiveData<>();
        }
        return listaDePalabras;
    }

    public void cargarDatos(){

        ArrayList<String> palabras=new ArrayList<String>();
        palabras.add("Ulp");
        palabras.add("San Luis");
        palabras.add("Cuarentena");
        palabras.add("Salud");
        listaDePalabras.setValue(palabras);

    }
}

