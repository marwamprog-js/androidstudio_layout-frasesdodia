package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Comece onde você está, use o que você tem e faça o que você pode.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.",
                "Não importa que você vá devagar, contanto que você não pare."
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}