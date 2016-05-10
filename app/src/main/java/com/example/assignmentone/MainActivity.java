package com.example.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView txtLabel;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLabel = (TextView) findViewById(R.id.txtLabelID);
        imgView = (ImageView) findViewById(R.id.imageViewID);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_reset:
                count = 0;
                txtLabel.setText(R.string.txtLabel);
                imgView.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void RegisterClick(View view) {
        count++;
        txtLabel.setText(String.format(getString(R.string.clickedTimes), count));
    }

    public void ToggleImage(View view) {
        if (imgView.getVisibility() == View.VISIBLE) {
            imgView.setVisibility(View.INVISIBLE);
        } else {
            imgView.setVisibility(View.VISIBLE);
        }

    }
}
