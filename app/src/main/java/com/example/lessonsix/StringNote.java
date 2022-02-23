package com.example.lessonsix;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public class StringNote implements Parcelable {
    public StringNote(int i) {
        index = i;
    }

    public static String getNoteName() {
        return NoteString;
    }


    public String getNoteName(Context mContext) {
        return mContext.getResources().getStringArray(R.array.noteContent)[index];
    }

    public StringNote createFromParcel(Parcel in) {
        return new StringNote(in);
    }


    public static int getNoteIndex() {
        return index;
    }

    public static Creator<StringNote> getCREATOR() {
        return CREATOR;
    }

    public static void setNoteIndex(int noteIndex) {
        index = noteIndex;
    }

    private static int index;

    public static String getNoteString() {
        return NoteString;
    }

    public static void setNoteString(String noteString) {
        NoteString = noteString;
    }

    private static String NoteString;

    protected StringNote(Parcel in) {
        index = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<StringNote> CREATOR = new Creator<StringNote>() {
        @Override
        public StringNote createFromParcel(Parcel in) {
            return new StringNote(in);
        }

        @Override
        public StringNote[] newArray(int size) {
            return new StringNote[size];
        }
    };
}


