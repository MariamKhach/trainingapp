package am.mlab.trainingappsecond;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Forth extends Activity {
	
	TextView text;
	String passedText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forth);
		
		text = (TextView) findViewById(R.id.textview_forth);
		passedText = getIntent().getExtras().getString("PassedText");
		text.setText(passedText);
	}
}
