package toong.vn.androidstrictmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    StringBuilder stringBuilder3 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        a();
    }

    private void a() {
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("" + i);
            stringBuilder2.append("" + i);
            stringBuilder3.append("" + i);
        }
    }
}
