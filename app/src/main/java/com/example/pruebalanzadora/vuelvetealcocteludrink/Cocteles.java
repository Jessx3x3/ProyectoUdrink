package com.example.pruebalanzadora.vuelvetealcocteludrink;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class Cocteles extends AppCompatActivity {
    ListView lista;
    String cocteles[] = new String[] {"a","b","c","d","e","f","g"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteles);
        lista = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cocteles);
        lista.setAdapter(adapter);

    }
}
