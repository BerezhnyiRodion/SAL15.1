package com.example.sal151;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = (TextView) findViewById(R.id.tvColor);
        tvSize = (TextView) findViewById(R.id.tvSize);

        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }

    @Override
    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.tvColor:
                getMenuInflater().inflate(R.menu.menu_color, menu);
                break;
            case R.id.tvSize:
                getMenuInflater().inflate(R.menu.menu_size, menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_red:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color = red");
                break;
            case R.id.menu_green:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color - green");
                break;
            case R.id.menu_blue:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color - blue");
                break;
            case R.id.menu_22:
                tvSize.setTextSize(22);
                tvSize.setText("Text size - 22");
                break;
            case R.id.menu_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size - 26");
                break;
            case R.id.menu_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size - 30");
                break;
        }
        return super.onContextItemSelected(item);
    }
}