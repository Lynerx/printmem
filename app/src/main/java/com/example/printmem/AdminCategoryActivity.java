package com.example.printmem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import io.paperdb.Paper;

// // // // // // // // // // // // // // // // // // // // // // // // // //
//                                                                         //
//      CLASSE DEDICADA A RECEBER O INPUT DO ADMIN QUANDO ESTE ESCOLHER    //
//      QUAL A CATEGORIA DO SEU NOVO PRODUTO.                              //
//                                                                         //
// // // // // // // // // // // // // // // // // // // // // // // // // //

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView frames, albums, big_posters, envelops;
    private Button allProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        Paper.init(this);
        frames = findViewById(R.id.frames);
        albums = findViewById(R.id.albums);
        big_posters = findViewById(R.id.big_posters);
        envelops = findViewById(R.id.envelops);
        allProductsBtn = findViewById(R.id.all_products);


        frames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity .this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Frames");
                startActivity(intent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity .this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Albums");
                startActivity(intent);
            }
        });

        big_posters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity .this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Big Posters");
                startActivity(intent);
            }
        });

        envelops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity .this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Envelops");
                startActivity(intent);
            }
        });

        allProductsBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                Toast.makeText(AdminCategoryActivity.this, "This are all the products...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                startActivity(intent);

           }
       });


    }
}
