package com.t3ch.shaj.easynotes.persistence;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.t3ch.shaj.easynotes.models.Note;

import java.util.List;

/**
 * Created by Shakil Ahmed Shaj on 27-Apr-19.
 * shakilahmedshaj@gmail.com
 */
public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {

        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note) {

    }

    public void updateNoteTask(Note note) {

    }

    public LiveData<List<Note>> retrieveNoteTask(Note note) {

        return null;

    }

    public void deleteNoteTask(Note note) {

    }
}
