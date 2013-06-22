package am.mlab.trainingappsecond;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Third extends Activity implements OnClickListener {
	
	EditText edit;
	Button ok;
	String editedText;
	Button go;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		
		edit = (EditText) findViewById(R.id.edit_text);
		ok = (Button) findViewById(R.id.ok);
		go = (Button) findViewById(R.id.goText);
		
		ok.setOnClickListener(this);
		go.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		editedText = edit.getText().toString();
		switch (v.getId()) {
		case R.id.goText:
			Intent intent = new Intent(getBaseContext(), Forth.class);
			intent.putExtra("PassedText", editedText);
			startActivity(intent);
			break;
		case R.id.ok:
			ok.setText(editedText);
			break;
		default:
			break;
		}
	}

}
