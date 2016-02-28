package ua.startandroid.swetofor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView)findViewById(R.id.textView);
        Button greenButton = (Button)findViewById(R.id.buttonGreen);
        greenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mInfoTextView.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
            }
        });
    }


    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                break;
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
        }
    }
}
