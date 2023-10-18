package br.com.etecia.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_wishlist extends AppCompatActivity {

    BottomNavigationView idBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist_layout);
        idBottomBar = findViewById(R.id.idBottomBar);
    }

}