package com.example.lessonsix;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class note extends Fragment {

    public static note newInstance() {
        note fragment = new note();
        return fragment;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] note = getResources().getStringArray(R.array.note);

        for (int i=0; i< note.length; i++){

            String StringNoteName = note[i];
            TextView textView = new TextView(getContext());
            textView.setTextSize(30f);
            textView.setText(StringNoteName);
            ((LinearLayout) view).addView(textView);
            final int finalI = i;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StringNote StringNote = new StringNote(finalI);
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                        noteContent NoteContent = noteContent.newInstance(StringNote);
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.noteContent, NoteContent).commit();
                    }else{
                       // noteContent NoteContent = noteContent.newInstance(StringNote);
                      //  getActivity().getSupportFragmentManager().beginTransaction();
                    }

                    }

            });

        }

    }

}