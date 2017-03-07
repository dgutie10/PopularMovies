package com.example.android.popularmovies;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;

/**
 * Created by diegog on 3/6/2017.
 */

public class MoviesFragment extends Fragment{
    private ArrayAdapter<String> mMovieAdapter;

    public MoviesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mMovieAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_main,
                R.id.movie_poster_main,
                new ArrayList<String>()
        );

        View rootView = inflater.inflate(R.layout.activity_main, container,false);
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(mMovieAdapter);

        return rootView;
    }

//    private void updateMobieList(){
//        FetchMoviesTask moviesTask =  new fetchMoviesTask();
//        moviesTask.execute();
//    }

    public class FetchMoviesTask extends AsyncTask<String, Void, String[]>{

        //Please enter your own API key
        //TODO: Enter API Key
        private static final String MOVIE_DB_API_KEY = "?api_key=";
        private static final String MOVIE_BASE_URL ="http://api.themoviedb.org/3/movie/";


        @Override
        protected String[] doInBackground(String... strings) {
            HttpURLConnection urlConnection  = null;
            BufferedReader reader = null;
            String jsonStr = null;

            final String QUERY_PARAM = "popular";

            try {
                Uri builUri = Uri.parse(MOVIE_BASE_URL).buildUpon()
                        .appendPath()
            }

        }
    }
}
