package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTop_Activity extends AppCompatActivity {
    //declarando a variavel global do objeto AppBar
    MaterialToolbar idTollBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);
        //apresentando a tollbar xml para o java
        idTollBar = findViewById(R.id.idToolbar);

    idTollBar.setNavigationOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),
                    "Clique no icone",
                    Toast.LENGTH_SHORT).show();
        }
    });
    }

}