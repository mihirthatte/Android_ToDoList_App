package com.example.mthat.simpletodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;
import static com.example.mthat.simpletodo.R.id.etNewItem;
import static com.example.mthat.simpletodo.R.id.lvItems;
import static com.example.mthat.simpletodo.R.id.savebtn;

public class EditItemActivity extends AppCompatActivity {
    int index;
    Button savebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editNewItem = (EditText) findViewById(R.id.editItem);
        String item = getIntent().getStringExtra("saveItem");
        editNewItem.setText(item);
        editNewItem.setSelection(item.length());
        index = getIntent().getIntExtra("index", 0);
        Button button = (Button) findViewById(R.id.savebtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editedtext = (EditText) findViewById(R.id.editItem);
                Intent response = new Intent();
                response.putExtra("editedValue",editedtext.getText().toString());
                response.putExtra("index", index);
                setResult(Activity.RESULT_OK, response);
                finish();
            }
        });


    }



}
