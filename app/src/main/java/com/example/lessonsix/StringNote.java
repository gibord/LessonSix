package com.example.lessonsix;

import android.os.Parcel;
import android.os.Parcelable;

public class StringNote implements Parcelable {
    private static String NoteIndex;

    public String getNoteNote() {
        return NoteNote;
    }

    public static Creator<StringNote> getCREATOR() {
        return CREATOR;
    }

    public void setNoteNote(String noteNote) {
        NoteNote = noteNote;
    }

    private String NoteNote;

    protected StringNote(Parcel in) {
        NoteIndex = in.readString();
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

    public StringNote(String погода, String ясно) {
        this.NoteIndex = "ясно";
        this.NoteNote = "погода";

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(NoteIndex);
    }
    public static String getNoteIndex() {
        return NoteIndex;
    }

    public void setNoteIndex(String index) {
        this.NoteIndex = NoteIndex;
    }
}
