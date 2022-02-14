package com.example.lessonsix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            note NoteFragment = note.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.note, NoteFragment).commit();
         /*   if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
                ;
            {
                noteContent NoteContent = noteContent.newInstance();
                getSupportFragmentManager().beginTransaction().replace(R.id.noteContent, NoteContent).commit();


            }*/

        }


    }
}