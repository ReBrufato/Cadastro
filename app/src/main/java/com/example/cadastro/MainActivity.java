package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.cadastro.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    private String nome;
    private String telefone;
    private String email;
    private boolean verifListaEmails = false;
    private String sexo;
    private String cidade;
    private String UF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

       //NOME
        amb.nomeInpt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                nome = charSequence.toString();
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        //TELEFONE
        amb.telInpt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                telefone = charSequence.toString();
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        //EMAIL
        amb.emailInpt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email = charSequence.toString();
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        //CHECKBOX
        amb.check.setOnClickListener(view ->  {
            verifListaEmails = (amb.check.isChecked())? true : false;
        });

        //SEXO
        amb.sexoInptM.setOnClickListener(view -> {
            sexo = String.valueOf(amb.sexoInptM.getText());
        });

        amb.sexoInptF.setOnClickListener(view -> {
            sexo = String.valueOf(amb.sexoInptF.getText());
        });

        //CIDADE
        amb.cidadeInpt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cidade = charSequence.toString();
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        //UF
        amb.ufs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                UF = (i==0)? "AC" : (i==1)? "AL" :(i==2)? "AP" : (i==3)? "AM" : (i==4)? "BA" : (i==5)? "CE" : (i==6)? "DF" : (i==7)? "ES" : (i==8)? "GO" :
                        (i==9)? "MA" : (i==10)? "MT" : (i==11)? "MS" : (i==12)? "MG" : (i==13)? "PA" : (i==14)? "PB" : (i==15)? "PR" : (i==16? "PE" : (i==17)? "PI" : (i==18)? "RJ" :
                                (i==19)? "RN" : (i==20)? "RS" : (i==21)? "RO" : (i==22)? "RR" : (i==23)? "SC" : (i==24)? "SP" : (i==25)? "SE" : "TO" );
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        //SALVAR
        amb.btnsalvar.setOnClickListener(view ->  {
                Formulario form = new Formulario(nome, telefone, email, verifListaEmails, sexo, cidade, UF);

                Toast.makeText(MainActivity.this, form.toString(), Toast.LENGTH_SHORT).show();
        });

        //LIMPAR
        amb.btnlimpar.setOnClickListener(view ->  {
                amb.nomeInpt.setText("");
                amb.telInpt.setText("");
                amb.emailInpt.setText("");
                amb.check.setChecked(false);
                amb.sexoInptM.setChecked(false);
                amb.sexoInptF.setChecked(false);
                amb.cidadeInpt.setText("");
        });

    }
}


