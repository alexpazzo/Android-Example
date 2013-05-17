package it.AccollaBelli.androidexample;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pickers extends Activity {
	
	static final int DATE_DIALOG_ID = 0;
	static final int TIME_DIALOG_ID = 1;
	Calendar date;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pickers);
		
		date = Calendar.getInstance();
		
		Button button_datapicker = (Button) findViewById(R.id.datapicker);
		Button button_timepicker = (Button) findViewById(R.id.timepicker);
		button_datapicker.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				showDialog(DATE_DIALOG_ID);
				
			}
		});
		button_timepicker.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				showDialog(TIME_DIALOG_ID);
				
			}
		});
	}
	
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this, null, date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
		case TIME_DIALOG_ID:
			return new TimePickerDialog(this, null, date.get(Calendar.HOUR_OF_DAY), date.get(Calendar.MINUTE), true);
		}
		return null;
	}
	
	
}


