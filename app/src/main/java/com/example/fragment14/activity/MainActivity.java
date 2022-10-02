package com.example.fragment14.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment14.R;
import com.example.fragment14.fragment.Kuliner;
import com.example.fragment14.fragment.Busana;
import com.example.fragment14.fragment.Pplg;
import com.example.fragment14.fragment.To;
import com.example.fragment14.fragment.Tpfl;



public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnBusana, btnKuliner, btnPplg, btnTo, btnTpfl, btnExit;

    Busana fragmentBusana;
    Kuliner fragmentKuliner;
    Pplg fragmentpplg;
    To fragmentTo;
    Tpfl fragmentTpfl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBusana = findViewById(R.id.btn_busana);
        btnKuliner = findViewById(R.id.btn_kuliner);
        btnPplg = findViewById(R.id.btn_pplg);
        btnTo = findViewById(R.id.btn_to);
        btnTpfl = findViewById(R.id.btn_tpfl);
        btnExit = findViewById(R.id.btn_exit);

        btnBusana.setOnClickListener(this);
        btnKuliner.setOnClickListener(this);
        btnPplg.setOnClickListener(this);
        btnTo.setOnClickListener(this);
        btnTpfl.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    void menuBusana() {
        fragmentBusana = new Busana();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentBusana);
        ft.commit();
    }

    void menuKuliner() {
        fragmentKuliner = new Kuliner();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentKuliner);
        ft.commit();
    }

    void menuPplg() {
        fragmentpplg = new Pplg();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentpplg);
        ft.commit();
    }

    void menuTo() {
        fragmentTo = new To();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentTo);
        ft.commit();
    }

    void menuTpfl() {
        fragmentTpfl = new Tpfl();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentTpfl);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnKuliner) {
            menuKuliner();
        }
        if (v == btnBusana) {
            menuBusana();
        }
        if (v == btnPplg) {
            menuPplg();
        }
        if (v == btnTo) {
            menuTo();
        }
        if (v == btnTpfl) {
            menuTpfl();
        }
        if (v == btnExit) {
            menuExit();
        }
    }
}