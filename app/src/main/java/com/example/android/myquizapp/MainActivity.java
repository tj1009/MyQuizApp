package com.example.android.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.myquizapp.R.id.et_ques5_answer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FinalScore(View view) {
        int score1;
        int score2;
        int score3;
        int score4;
        int score5 = 0;
        int score6;
        int score7;
        int TotalScore;

        //Checks if the correct answer(All of these) for question 1 is selected
        RadioButton answer1 = (RadioButton) findViewById(R.id.rb_ques1_all_of_these);
        Boolean isCorrect1 = answer1.isChecked();
        if (isCorrect1) {
            score1 = 1;
        } else {
            score1 = 0;
        }
        //Checks if the correct answer(Strings.xml) for question 2 is selected
        RadioButton answer2 = (RadioButton) findViewById(R.id.rb_ques2_strings);
        Boolean isCorrect2 = answer2.isChecked();
        if (isCorrect2) {
            score2 = 1;
        } else {
            score2 = 0;
        }

        //Checks if the correct answer(Java and XML) for question 3 is selected
        CheckBox answer3_option1 = (CheckBox) findViewById((R.id.cb_ques3_java));
        Boolean isCorrect3_option1 = answer3_option1.isChecked();

        CheckBox answer3_option2 = (CheckBox) findViewById((R.id.cb_ques3_xml));
        Boolean isCorrect3_option2 = answer3_option2.isChecked();

        CheckBox answer3_option3 = (CheckBox) findViewById((R.id.cb_ques3_sql));
        Boolean isCorrect3_option3 = answer3_option3.isChecked();

        CheckBox answer3_option4 = (CheckBox) findViewById((R.id.cb_ques3_dream_weaver));
        Boolean isCorrect3_option4 = answer3_option4.isChecked();

        if (isCorrect3_option1 && isCorrect3_option2 && !isCorrect3_option3 && !isCorrect3_option4) {
            score3 = 1;
        } else {
            score3 = 0;
        }

        //Checks if the correct answer(All of these) for question 4 is selected
        RadioButton answer4 = (RadioButton) findViewById(R.id.rb_ques4_all_of_these);
        Boolean isCorrect4 = answer4.isChecked();
        if (isCorrect4) {
            score4 = 1;
        } else {
            score4 = 0;
        }

        //Checks if the correct answer(2005) for question 5 is provided
        EditText answer5 = (EditText) findViewById(et_ques5_answer);
        if ((answer5.getText().length()) != 0) {
            int isCorrect5 = Integer.parseInt(answer5.getText().toString());
            if (isCorrect5 == 2005) {
                score5 = 1;
            } else {
                score5 = 0;
            }
        }

        //Checks if the correct answer(kotlin) for question 6 is provided
        EditText answer6 = (EditText) findViewById(R.id.et_ques6_answer);
        String isCoreect6 = answer6.getText().toString().toLowerCase();
        if (isCoreect6.equals("kotlin") || isCoreect6.equals("java")) {
            score6 = 1;
        } else {
            score6 = 0;
        }

        //Checks if the correct answer(muffin) for question 7 is selected
        RadioButton answer7 = (RadioButton) findViewById(R.id.rb_ques7_muffin);
        Boolean isCorrect7 = answer7.isChecked();
        if (isCorrect7) {
            score7 = 1;
        } else {
            score7 = 0;
        }

        //adds the score based on correct answers
        TotalScore = score1 + score2 + score3 + score4 + score5 + score6 + score7;

        //the total score is displayed through the toast message
        if (TotalScore == 7) {
            Toast.makeText(this, "You got perfect score " + TotalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your score is " + TotalScore, Toast.LENGTH_SHORT).show();
        }
    }
}
