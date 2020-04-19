package com.example.menunavegable.ui.palabras;

import androidx.lifecycle.*;

public class DetallePalabrasViewModel extends ViewModel {
    private MutableLiveData<String> largo;
    private MutableLiveData<String> primero;

    public LiveData<String> getLargo() {
        if(largo==null){
            largo=new MutableLiveData<>();
        }
        return largo;
    }

    public LiveData<String> getPrimero() {
        if(primero==null){
            primero=new MutableLiveData<>();
        }
        return primero;
    }

    public void obtenerDatos(String palabra){

        primero.setValue(palabra.charAt(0)+"");
        largo.setValue(palabra.length()+"");
    }
}
