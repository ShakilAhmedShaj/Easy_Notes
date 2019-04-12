package com.t3ch.shaj.easynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.t3ch.shaj.easynotes.adapters.NotesRecyclerAdapter;
import com.t3ch.shaj.easynotes.models.Note;

import java.util.ArrayList;

public class NotesListActivity extends AppCompatActivity {

    private static final String TAG = "NotesListActivity";

    //UI Components
    private RecyclerView mRecyclerView;

    //vars
    private ArrayList<Note> mNotes = new ArrayList<>();
    private NotesRecyclerAdapter mNoteRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertFakeNotes();


    }

    private void insertFakeNotes(){
        for(int i = 0; i < 1000; i++){
            Note note = new Note();
            note.setTitle("title #" + i);
            note.setContent("content #: " + i);
            note.setTimestamp("Jan 2019");
            mNotes.add(note);
        }
        mNoteRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mNoteRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
        mRecyclerView.setAdapter(mNoteRecyclerAdapter);


    }

}
