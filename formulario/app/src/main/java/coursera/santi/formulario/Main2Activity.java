package coursera.santi.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvNombre,tvDate,tvTelefono,tvEmail,tvDescripcion;
    Button btnEditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String date_formato="Fecha nacimiento: ";
        final String telefono_formato="telefono: ";
        final String email_formato="email: ";
        final String descripcion_formato="descripcion: ";




        tvNombre=(TextView)findViewById(R.id.tvNombre);
        tvDate=(TextView)findViewById(R.id.tvDate);
        tvTelefono=(TextView)findViewById(R.id.tvTelefono);
        tvEmail=(TextView)findViewById(R.id.tvEmail);
        tvDescripcion=(TextView)findViewById(R.id.tvDescripcion);

        btnEditar=(Button)findViewById(R.id.btnEditar);

        Bundle  parametrosConfirmar = getIntent().getExtras();
        String nombre_confirmar=parametrosConfirmar.getString("nombre");
        String date_confirmar=parametrosConfirmar.getString("date");
        String telefono_confirmar=parametrosConfirmar.getString("telefono");
        String email_confirmar=parametrosConfirmar.getString("email");
        String descripcion_confirmar=parametrosConfirmar.getString("descripcion");

      tvNombre.setText(nombre_confirmar);
        tvDate.setText(date_formato + date_confirmar);
        tvTelefono.setText(telefono_formato + telefono_confirmar);
        tvEmail.setText(telefono_formato + telefono_confirmar);
        tvDescripcion.setText(descripcion_formato + descripcion_confirmar);


        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
