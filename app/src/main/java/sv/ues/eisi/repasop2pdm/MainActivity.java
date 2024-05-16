package sv.ues.eisi.repasop2pdm;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends ListActivity {
    String[] menu = {"Tabla Vehiculo", "Tabla Conductor"};
    String[] activities = {"VehiculosMenuActivity", "ConductorMenuActivity"};
    ControlBDGR19001 BDhelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menu));
        BDhelper=new ControlBDGR19001 (this);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if (position != 2) {

            String nombreValue = activities[position];
            try {
                Class<?>
                        clase = Class.forName("sv.ues.eisi.repasop2pdm." + nombreValue);
                Intent inte = new Intent(this, clase);
                this.startActivity(inte);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        } else {
            // aqui va el llenado pero no sera necesario.
        }
    }
}

