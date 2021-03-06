package com.himarquez.petgram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.himarquez.petgram.Adapters.MascotaAdaptador;
import com.himarquez.petgram.Pojo.ConstructorMascotas;
import com.himarquez.petgram.Pojo.Mascotas;
import com.himarquez.petgram.Presentador.IRecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miappbar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ListaMascotas = (RecyclerView) findViewById(R.id.rvMascotasF);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        ListaMascotas.setLayoutManager(llm);

        inicializaMascotas();
        inicializaAdaptador();
    }

    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializaMascotas(){
        ConstructorMascotas constructorMascotas = new ConstructorMascotas(this);

        mascotas = constructorMascotas.obtenerDatos();


    }
}
