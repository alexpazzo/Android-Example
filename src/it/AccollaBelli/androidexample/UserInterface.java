package it.AccollaBelli.androidexample;

import android.os.Bundle;

public class UserInterface extends MyListActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setList(R.array.ui);
	}
}
	 

