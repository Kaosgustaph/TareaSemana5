package com.himarquez.petgram.Fragments;

import com.himarquez.petgram.Adapters.MascotaAdaptador;
import com.himarquez.petgram.Pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by inavid on 07/07/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascotas> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
