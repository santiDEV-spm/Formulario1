package coursera.santi.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etNombre,etDate,etTelefono,etEmail,etDescripcion;
    Button btnSiguente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre =(EditText)findViewById(R.id.etNombre);
        etDate =(EditText)findViewById(R.id.etDate);
        etTelefono =(EditText)findViewById(R.id.etTelefono);
        etEmail =(EditText)findViewById(R.id.etEmail);
        etDescripcion =(EditText)findViewById(R.id.etDescripcion);

        btnSiguente = (Button)findViewById(R.id.btnConfirmar);

        btnSiguente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=etNombre.getText().toString();
                String date=etDate.getText().toString();
                String telefono=etTelefono.getText().toString();
                String email=etEmail.getText().toString();
                String descripcion=etDescripcion.getText().toString();

                Intent suiguiente = new Intent(v.getContext(),Main2Activity.class);
                suiguiente.putExtra("nombre",nombre);
                suiguiente.putExtra("date",date);
                suiguiente.putExtra("telefono",telefono);
                suiguiente.putExtra("email",email);
                suiguiente.putExtra("descripcion",descripcion);

                startActivity(suiguiente);



            }
        });


    }
}
