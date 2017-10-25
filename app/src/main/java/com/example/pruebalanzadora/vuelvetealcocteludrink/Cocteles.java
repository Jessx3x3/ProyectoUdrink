package com.example.pruebalanzadora.vuelvetealcocteludrink;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class Cocteles extends AppCompatActivity {
    ListView lista;
    String cocteles[] = new String[] {"\n" +
                        "Margarita corona\n" +
                        "Gelatina de champaña\n" +
                        "Margarita de fresa con tequila\n" +
                        "Sorbete de piña al cava\n" +
                        "Caipiroska de pepino\n" +
                        "El trago de la bandera de colombia\n" +
                        "Fresa espumante\n" +
                        "Whiskey: Irish Redhead\n" +
                        "Clericot de vino blanco\n" +
                        "Carajillo de Bailey's\n" +
                        "Sorbete de mojito\n" +
                        "Trago de durazno\n" +
                        "Blueberry Spritzer\n" +
                        "Mojito de vodka con maracuyá\n" +
                        "Cóctel de granizado de ginebra\n" +
                        "Cóctel americano\n" +
                        "Sangría de cava"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteles);
        lista = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cocteles);
        lista.setAdapter(adapter);

    }
}
