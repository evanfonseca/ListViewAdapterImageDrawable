package enf.android.listviewadapterimagedrawable;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by enfonseca on 4/18/16.
 */
public class ShowMusic extends AppCompatActivity {

    int [] images ={R.drawable.lura,
            R.drawable.jeniffer,
            R.drawable.ceuzany,
            R.drawable.tito,
            R.drawable.grace,
            R.drawable.dany,
            R.drawable.dino,
            R.drawable.elida,
            R.drawable.mayra,
            R.drawable.jhumberto};

    String [] Titulos;
    String [] Artistas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int p=getIntent().getExtras().getInt("position");

        ImageView myImage= (ImageView) findViewById(R.id.imageView2);
        TextView myMusica= (TextView) findViewById(R.id.Musica);
        TextView  myArtista= (TextView) findViewById(R.id.Artista);

        myImage.setImageResource(images[p]);
        Resources res = getResources();
        Titulos=res.getStringArray(R.array.titulos);
        Artistas=res.getStringArray(R.array.artistas);
        myMusica.setText(Titulos[p]);
        myArtista.setText(Artistas[p]);



    }
}
