package pt.up.fe.hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	int estado=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void getName(View view) {
    	TextView editText = (TextView) findViewById(R.id.textView2);
    	if(estado==0)
    	{
    		editText.setText("Rafael Rodrigues");
    		estado=1;
    	}
    	else
    	{
    		editText.setText("Antonio Franco");
    		estado=0;
    	}
    }
    
}
