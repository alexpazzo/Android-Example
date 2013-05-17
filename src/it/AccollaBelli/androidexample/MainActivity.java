package it.AccollaBelli.androidexample;

import android.os.Bundle;

public class MainActivity extends MyListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setList(R.array.main);
	}

}
