package it.AccollaBelli.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class TextFields extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.textfields);
		AutoCompleteTextView view =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
		String[] continents = getResources().getStringArray(R.array.autocomplete);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, continents);
		view.setAdapter(adapter);
	}
}	
