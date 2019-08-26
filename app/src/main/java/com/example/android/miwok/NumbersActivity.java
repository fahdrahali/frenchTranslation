/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("un","one",R.drawable.number_one));
        words.add(new Word("deux","two",R.drawable.number_two));
        words.add(new Word("trois","three",R.drawable.number_three));
        words.add(new Word("quatre","four",R.drawable.number_four));
        words.add(new Word("cinq","five",R.drawable.number_five));
        words.add(new Word("six","six",R.drawable.number_six));
        words.add(new Word("sept","seven",R.drawable.number_seven));
        words.add(new Word("huit","eight",R.drawable.number_eight));
        words.add(new Word("neuf","nine",R.drawable.number_nine));
        words.add(new Word("dix","ten",R.drawable.number_ten));


      //  LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);



        // int count = 0;

        // while(count<words.size()){
        //TextView wordsView = new TextView(this);
        //    wordsView.setText(words.get(count));
        //rootView.addView(wordsView);
        //   count++;
        // }

        //for(int count = 0; count < words.size(); count++){

          //  TextView wordsView = new TextView(this);
           // wordsView.setText(words.get(count));
           // rootView.addView(wordsView);

       // }

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


       // Log.v("NumbersActivity","wordsView :"+wordsView.getText());



    }
}
