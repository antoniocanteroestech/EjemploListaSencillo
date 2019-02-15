package softepec.es.ejemplolistasencilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.list);

        String[] names = {
                "Alexander Pierrot",
                "Carlos Lopez",
                "Sara Bonz",
                "Liliana Clarence",
                "Benito Peralta",
                "Juan Jaramillo",
                "Christian Steps",
                "Alexa Giraldo",
                "Linda Murillo",
                "Lizeth Astrada"
        };

        mAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                names);

        mList.setAdapter(mAdapter);

    }
}
