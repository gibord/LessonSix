package com.example.lessonsix;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            note Note = note.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.note, Note).commit();
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
                ;
            {   StringNote defaultStringNote = new StringNote(StringNote.getNoteIndex());
                noteContent NoteContent = noteContent.newInstance(defaultStringNote);
                getSupportFragmentManager().beginTransaction().replace(R.id.noteContent, NoteContent).commit();


            }

        }


    }
}
