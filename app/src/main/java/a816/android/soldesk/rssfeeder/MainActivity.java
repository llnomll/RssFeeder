package a816.android.soldesk.rssfeeder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnJoong,btnCho,btnDong,btnHan,btnMk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoong = (ImageButton) findViewById(R.id.btnjoongang);
        btnCho = (ImageButton) findViewById(R.id.btnchosun);
        btnDong = (ImageButton) findViewById(R.id.btndong);
        btnHan = (ImageButton) findViewById(R.id.btnhan);
        btnMk = (ImageButton) findViewById(R.id.btnmk);

    }

    public void onClickJoong(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        intent.putExtra("company",CategoryCreater.COMPANY_JOONGANG);
        startActivity(intent);
    }

    public void onClickcho(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        intent.putExtra("company",CategoryCreater.COMPANY_JOSUN);
        startActivity(intent);
    }

    public void onClickdong(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        intent.putExtra("company",CategoryCreater.COMPANY_DONGA);
        startActivity(intent);
    }

    public void onClickhan(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        intent.putExtra("company",CategoryCreater.COMPANY_HAN);
        startActivity(intent);
    }

    public void onClickmk(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        intent.putExtra("company",CategoryCreater.COMPANY_MK);
        startActivity(intent);
    }
}
