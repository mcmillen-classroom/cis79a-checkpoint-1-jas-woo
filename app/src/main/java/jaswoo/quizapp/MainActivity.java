package jaswoo.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFeedback = (TextView) findViewById(R.id.feedback_textview);

        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);
        mFeedback.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        TextView myTextView = (TextView) view;
        Toast myToast = Toast.makeText(this, "You just clicked " + myTextView.getText(), Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.TOP, 0, 0);

        myToast.show();
    }
}
