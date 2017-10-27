package com.example.pruebalanzadora.vuelvetealcocteludrink;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class Cocteles extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteles);

        lista = (ListView) findViewById(R.id.lista);

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


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cocteles);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                if(i==0){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,0);
                }
                if(i==1){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,1);
                }
                if(i==2){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,2);
                }
                if(i==3){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,3);
                }
                if(i==4){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,4);
                }
                if(i==5){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,5);
                }
                if(i==6){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,6);;
                }
                if(i==7){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,7);
                }
                if(i==8){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,8);
                }
                if(i==9){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,9);
                }
                if(i==10){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,10);
                }
                if(i==11){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,11);
                }
                if(i==12){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,12);
                }
                if(i==13){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,13);
                }
                if(i==14){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,14);
                }
                if(i==15){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,15);
                }
                if(i==16){
                    Intent intent = new Intent(view.getContext(), DetalleCoctelActivity.class);
                    startActivityForResult(intent,16);
                }
            }
        });
    }
}