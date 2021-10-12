package com.example.spshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView carparts, automotivebushings, gearleverparts, automotivemetalparts;
    private ImageView autopartsfittings, threewheelersparts, twowheelersparts, washernozzles;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        carparts= (ImageView) findViewById(R.id.carparts);
        autopartsfittings = (ImageView) findViewById(R.id.autopartsfittings);
        automotivebushings = (ImageView) findViewById(R.id.automotivebushings);
        automotivemetalparts = (ImageView) findViewById(R.id.automotivemetalparts);

        gearleverparts = (ImageView) findViewById(R.id.gearleverparts);
        threewheelersparts = (ImageView) findViewById(R.id.threewheelersparts);
        twowheelersparts = (ImageView) findViewById(R.id.twowheelersparts);
        washernozzles = (ImageView) findViewById(R.id.washernozzles);


        carparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "car parts");
                startActivity(intent);
            }
        });
        autopartsfittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "autoparts fittings");
                startActivity(intent);
            }
        });


        automotivebushings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "automotive bushings");
                startActivity(intent);
            }
        });


        automotivemetalparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "automotive metal parts");
                startActivity(intent);
            }
        });


        gearleverparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "gear lever parts");
                startActivity(intent);
            }
        });


        threewheelersparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "three wheelers parts");
                startActivity(intent);
            }
        });



        twowheelersparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "two wheelers parts");
                startActivity(intent);
            }
        });


        washernozzles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", " washer nozzles");
                startActivity(intent);
            }
        });
    }
}
