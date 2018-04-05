package omhhiyobi.firstclassproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.a1);
        editText= findViewById(R.id.a2);
        button= findViewById(R.id.a3);
    }
    public void click (View v){
       String text = editText.getText().toString();
       textView.setText(text);
    }
}
