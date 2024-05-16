package sv.ues.eisi.repasop2pdm;

import android.os.Bundle;
import android.widget.Toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ConductorInsertarActivity extends Activity {
    ControlBDGR19001 helper;
    EditText editIdConductor;
    EditText editNombreConductor;
    EditText editDireccionConductor;
    EditText editTelefonoConductor;
    EditText editCantVeh;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor_insertar);
        helper = new ControlBDGR19001(this);
        editIdConductor = (EditText) findViewById(R.id.editIdConductor);
        editNombreConductor = (EditText) findViewById(R.id.editNombreConductor);
        editDireccionConductor = (EditText) findViewById(R.id.editDireccionConductor);
        editTelefonoConductor = (EditText) findViewById(R.id.editTelefonoConductor);
        editCantVeh = (EditText) findViewById(R.id.editCantVeh);
    }

    public void insertarConductor(View v) {
        String regInsertados="Datos ingresados correctamente";
        int idconductor = Integer.valueOf(editIdConductor.getText().toString());
        String nombre = editNombreConductor.getText().toString();
        String direccion = editDireccionConductor.getText().toString();
        String telefono = editTelefonoConductor.getText().toString();
        int cantidadVehiculo = Integer.valueOf(editCantVeh.getText().toString());
        Conductor conductor = new Conductor();
        conductor.setId_conductor(idconductor);
        conductor.setNombre(nombre);
        conductor.setDireccion(direccion);
        conductor.setTelefono(telefono);
        conductor.setCantVehiculos(cantidadVehiculo);
        helper.abrir();
        helper.insertar(conductor);
        helper.cerrar();
        Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
    }
}