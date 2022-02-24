package com.example.lessonsix;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;

public class NoteEditor extends AppCompatActivity {

    int noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        EditText editText = (EditText) findViewById(R.id.editText);
        Intent intent = getIntent();
        noteId = intent.getIntExtra("noteId", -1);
        if (noteId != -1){
            editText.setText(com.example.lessonsix.MainActivity.notes.get(noteId));

        } else {
            com.example.lessonsix.MainActivity.notes.add("");
            noteId = com.example.lessonsix.MainActivity.notes.size() -1;
            com.example.lessonsix.MainActivity.arrayAdapter.notifyDataSetChanged();

        }
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                com.example.lessonsix.MainActivity.notes.set(noteId, String.valueOf(s));
                com.example.lessonsix.MainActivity.arrayAdapter.notifyDataSetChanged();
                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.easynote;", Context.MODE_PRIVATE);
                HashSet<String> set = new HashSet(com.example.lessonsix.MainActivity.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
