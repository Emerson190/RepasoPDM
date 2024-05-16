package sv.ues.eisi.repasop2pdm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ControlBDGR19001 {

    private static final String[] camposConductor = new String[]
            {"id_conductor", "nombre", "direccion", "telefono", "cantVehiculos"};
    private static final String[] camposVehiculos = new String[]
            {"id_vehiculo ", "id_conductor ", "marca ", "modelo", "anho", "placa"};
    private final Context context;
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public ControlBDGR19001(Context ctx) {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);

    }

    private static class DatabaseHelper extends SQLiteOpenHelper {
        private static final String BASE_DATOS = "BDGR19001.s3db";
        private static final int VERSION = 1;

        public DatabaseHelper(Context context) {
            super(context, BASE_DATOS, null, VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL("CREATE TABLE conductor(id_conductor INTEGER NOT NULL PRIMARY KEY, nombre text, direccion text,telefono text, cantVehiculos INTEGER);");
                db.execSQL("CREATE TABLE vehiculos(id_vehiculo integer NOT NULL ,id_conductor integer NOT NULL, marca text,modelo text,anho integer,placa integer,  primary key (id_conductor,id_vehiculo)); ");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// TODO Auto-generated method stub
        }
    }

    public void abrir() throws SQLException {
        db = DBHelper.getWritableDatabase();
        return;
    }

    public void cerrar() {
        DBHelper.close();
    }

    public String insertar(Conductor conductor) {
        String regInsertados = "Registro Insertado Nº= ";
        long contador = 0;
        ContentValues conduc = new ContentValues();
        conduc.put("id_conductor", conductor.getId_conductor());
        conduc.put("nombre", conductor.getNombre());
        conduc.put("direccion", conductor.getDireccion());
        conduc.put("telefono", conductor.getTelefono());
        conduc.put("cantVehiculos", conductor.getCantVehiculos());
        contador = db.insert("conductor", null, conduc);

        if (contador == -1 || contador == 0) {
            regInsertados = "Error al insertar los registros";
        } else {
            regInsertados = regInsertados + conductor;
        }
        return regInsertados;
    }

    public String insertar(Vehiculos vehiculos) {

        return null;
    }


}


