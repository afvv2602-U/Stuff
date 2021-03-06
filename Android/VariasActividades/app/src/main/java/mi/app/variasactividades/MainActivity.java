package mi.app.variasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button linear = (Button) findViewById(R.id.linea1);
        final Button calculadora = (Button) findViewById(R.id.calculadora);
        final Button ciudades = (Button) findViewById(R.id.ciudades);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunicacion = new Intent(v.getContext(), linearlayout.class);
                startActivity(comunicacion);
            }
        });
        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunicacion = new Intent(v.getContext(), calculadora.class);
                startActivity(comunicacion);
            }
        });
        ciudades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunicacion = new Intent(v.getContext(), ciudades.class);
                startActivity(comunicacion);
            }
        });
    }

}
