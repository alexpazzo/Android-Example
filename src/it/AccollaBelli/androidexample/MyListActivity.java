package it.AccollaBelli.androidexample;


import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MyListActivity extends ListActivity {

	
	protected void onListItemClick(ListView l, View v, int position, long id){
		String item = getPackageName() + "." + ((String) getListAdapter().getItem(position)).replaceAll("\\s","");
		ComponentName comp = new ComponentName(this,item);
		Intent i = new Intent();
		i.setComponent(comp);
		Log.i(getLocalClassName(),comp.toString());
		startActivity(i);
		
		
	}
	protected void setList(int resource){
		String[] list = getResources().getStringArray(resource);
		ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
		setListAdapter(adapter);
	}
}
	

