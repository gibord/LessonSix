package com.example.lessonsix;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class noteContent extends Fragment {

    public static final String ARG_NOTE = "NOTE";

private StringNote stringNote;
    public static noteContent newInstance(StringNote stringNote) {
        noteContent fragment = new noteContent();
        Bundle bundle= new Bundle();
        bundle.putParcelable(ARG_NOTE, stringNote);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note_content, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        stringNote = getArguments().getParcelable(ARG_NOTE);
        TextView textView = view.findViewById(R.id.TView);
        textView.setText(valueOf.getResourceId(stringNote.getNoteIndex(),R.array.noteContent));

        TypedArray images = getResources().obtainTypedArray(R.array.coat_of_arms_imgs);
        tView.setStringResource(images.getResourceId(stringNote.getIndex(),R.drawable.msc));

    }
}
