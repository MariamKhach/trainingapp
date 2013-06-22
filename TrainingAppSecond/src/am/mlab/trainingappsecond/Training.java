package am.mlab.trainingappsecond;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Training extends Activity implements OnClickListener {
	
	Button but;
	Button change;
	TextView hello;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.training);
		
		but = (Button) findViewById(R.id.btt1);
		hello = (TextView) findViewById(R.id.text);
		change = (Button) findViewById(R.id.btt2);
		
		but.setOnClickListener(this);
		change.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ttraining, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btt1:
			Intent intent = new Intent(getBaseContext(), Second.class);
			startActivity(intent);
			break;
		case R.id.btt2:
			hello.setText(R.string.goodbye);
			break;
		default:
			break;
		}		
	}

}
