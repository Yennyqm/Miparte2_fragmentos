package com.ditec.miparte2_fragmentos.Ejemplo1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ditec.miparte2_fragmentos.R;

public class ListaFragmento extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { View view= inflater.inflate(R.layout.lista_fragmento,container,false);
        return view;
    }
}
