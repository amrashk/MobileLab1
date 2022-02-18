package mn.edu.num.test1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button ColorButton;
    private Button ResetNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        ColorButton = findViewById(R.id.button_count);
        ResetNum = findViewById(R.id.zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        switch (mCount % 2){
            case 0: view.setBackgroundColor(Color.GREEN);
                break;
            case 1: view.setBackgroundColor(Color.RED);
                break;
            default: break;
        }
    }

    public void resetNum(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        view.setBackgroundColor(Color.GRAY);

    }
}