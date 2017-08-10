package com.example.mthat.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText etNewItem = (EditText) findViewById(R.id.editItem);
        String editItem = getIntent().getStringExtra("editItem");
        etNewItem.setText(editItem);
        etNewItem.setSelection(editItem.length());

    }

    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();
    }
}
