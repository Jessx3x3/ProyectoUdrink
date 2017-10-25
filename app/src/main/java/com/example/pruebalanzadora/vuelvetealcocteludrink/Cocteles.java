package com.example.pruebalanzadora.vuelvetealcocteludrink;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class Cocteles extends AppCompatActivity {
    ListView lista;



    String cocteles[] = new String[] {
            "Margarita corona",
            "Gelatina de champaña",
            "Margarita de fresa con tequila",
            "Sorbete de piña al cava",
            "Caipiroska de pepino",
            "El trago de la bandera de colombia",
            "Fresa espumante",
            "Whiskey: Irish Redhead",
            "Clericot de vino blanco",
            "Carajillo de Bailey's",
            "Sorbete de mojito",
            "Trago de durazno",
            "Blueberry Spritzer",
            "Mojito de vodka con maracuyá",
            "Cóctel de granizado de ginebra",
            "Cóctel americano",
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
