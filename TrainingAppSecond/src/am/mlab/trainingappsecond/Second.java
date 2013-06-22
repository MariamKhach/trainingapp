package am.mlab.trainingappsecond;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity implements OnClickListener {
	
	Button bt1;
	Button bt2;
	Button bt3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		bt1 = (Button) findViewById(R.id.btt3);
		bt2 = (Button) findViewById(R.id.btt4);
		bt3 = (Button) findViewById(R.id.btt5);
		
		bt2.setVisibility(View.INVISIBLE);
		bt3.setVisibility(View.INVISIBLE);
		
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btt3:
			bt2.setVisibility(View.VISIBLE);
			break;
		case R.id.btt4:
			bt3.setVisibility(View.VISIBLE);
			break;
		case R.id.btt5:
			//finish();
			Intent intent = new Intent(getBaseContext(), Third.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

}
