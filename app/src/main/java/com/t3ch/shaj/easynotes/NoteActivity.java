package com.t3ch.shaj.easynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.t3ch.shaj.easynotes.models.Note;

public class NoteActivity extends AppCompatActivity {

    //ui components

    private LineEditText mLineEditText;
    private EditText mEditTitle;
    private TextView mViewTitle;

    //vars

    private boolean mIsNewNote;


    private static final String TAG = "NoteActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        mLineEditText = findViewById(R.id.note_text);
        mEditTitle = findViewById(R.id.note_edit_title);
        mViewTitle = findViewById(R.id.note_text_title);

        if (getIncomingIntent()) {
            // this is a new note (EDIT MODE)
        } else {
            // this is note a new note (VIEW MODE)
        }

    }

    private boolean getIncomingIntent() {
        if (getIntent().hasExtra("selected_note")) {
            Note incomingNote = getIntent().getParcelableExtra("selected_note");


            mIsNewNote = false;
            return false;
        }
        mIsNewNote = true;
        return true;
    }
}
