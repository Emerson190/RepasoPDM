package sv.ues.eisi.repasop2pdm;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class VehiculosMenuActivity extends ListActivity {
    String[] menu = {"Insertar Vehiculo"};
    String[] activities = {"VehiculosInsertarActivity"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        listView.setBackgroundColor(Color.rgb(129, 195, 164));
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String nombreValue = activities[position];

        l.getChildAt(position).setBackgroundColor(Color.rgb(128, 128, 255));

        try {
            Class<?> clase = Class.forName("sv.ues.fia.eisi.basedatoscarnet." + nombreValue);
            Intent inte = new Intent(this, clase);
            this.startActivity(inte);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}