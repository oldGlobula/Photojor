package com.example.photojor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    Context context = this;
    ArrayAdapter<String> adapter;

    ArrayList<String> ingrArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ingrArr = new ArrayList<>();
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, ingrArr);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater li=LayoutInflater.from(context);
                View registerView = li.inflate(R.layout.add_ingredient, null);

                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
                mDialogBuilder.setView(registerView);

                final EditText nameText =  registerView.findViewById(R.id.et_add_ingredient);
                ListView listView = findViewById(R.id.ingrList);
                listView.setAdapter(adapter);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int id) {
                                        if (!nameText.getText().toString().isEmpty()){
                                            adapter.add(nameText.getText().toString());
                                            adapter.notifyDataSetChanged();
                                        }
                                        else {
                                            Toast toast=Toast.makeText(context, "You entered incorrect data", Toast.LENGTH_LONG);
                                            toast.show();
                                        }
                                    }

                                });
                //Создаем AlertDialog:
                AlertDialog alertDialog = mDialogBuilder.create();

                //и отображаем его:
                alertDialog.show();


            }
        });
    }
}
