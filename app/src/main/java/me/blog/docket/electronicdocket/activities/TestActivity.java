package me.blog.docket.electronicdocket.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import me.blog.docket.electronicdocket.R;


public class TestActivity extends AppCompatActivity {

    private ImageView ivTestImg;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ivTestImg = (ImageView) findViewById(R.id.iv_test_img);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        ivTestImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ivTestImg", "I am Imageview");
                Toast.makeText(getApplicationContext(), "I am image View ", Toast.LENGTH_LONG).show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("btn1", "I am btn 1");
                Toast.makeText(getApplicationContext(), "I am btn 1 ", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("btn2", "I am btn 2");
                Toast.makeText(getApplicationContext(), "I am btn 2", Toast.LENGTH_LONG).show();
            }
        });

    }

}
