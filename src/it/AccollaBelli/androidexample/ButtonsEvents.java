package it.AccollaBelli.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ButtonsEvents extends Activity {
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);

		Button button = (Button) findViewById(R.id.button);
		Button buttonsmall = (Button) findViewById(R.id.buttonsmall);
		ImageButton imagebutton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
		Button buttontextimage = (Button) findViewById(R.id.buttontextimage);

		button.setOnClickListener(oclistener);
		buttonsmall.setOnClickListener(oclistener);
		imagebutton.setOnClickListener(oclistener);
        imagebutton2.setOnClickListener(oclistener);
		buttontextimage.setOnClickListener(oclistener);

        button.setOnLongClickListener(olclistener);
        buttonsmall.setOnLongClickListener(olclistener);
        imagebutton.setOnLongClickListener(olclistener);
        imagebutton2.setOnLongClickListener(olclistener);
        buttontextimage.setOnLongClickListener(olclistener);
	}

    OnClickListener oclistener = new OnClickListener() {

	    public void onClick(View button) {
		    String str = "You chatched the onClick event on the ";
		    int id = button.getId();
		    switch (id) {
		    case R.id.button:
			    Toast.makeText(ButtonsEvents.this, str + "NORMAL BUTTON", Toast.LENGTH_SHORT).show();
			    break;
		    case R.id.buttonsmall:
			    Toast.makeText(ButtonsEvents.this, str + "SMALL BUTTON", Toast.LENGTH_SHORT).show();
			    break;
		    case R.id.imageButton:
			    Toast.makeText(ButtonsEvents.this, str + "IMAGE BUTTON", Toast.LENGTH_SHORT).show();
			    break;
		    case R.id.buttontextimage:
			    Toast.makeText(ButtonsEvents.this, str + "BUTTON WITH IMAGE AND TEXT", Toast.LENGTH_SHORT).show();
			    break;
            case R.id.imageButton2:
                Toast.makeText(ButtonsEvents.this, str + "BUTTON WITH IMAGE AND TEXT", Toast.LENGTH_SHORT).show();
                break;
		    }
		
	    }

	};

    OnLongClickListener olclistener = new OnLongClickListener() {

        public boolean onLongClick(View button) {
            String str = "You chatched the onLongClick event on the ";
            int id = button.getId();
            switch (id) {
                case R.id.button:
                    Toast.makeText(ButtonsEvents.this, str + "NORMAL BUTTON", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.buttonsmall:
                    Toast.makeText(ButtonsEvents.this, str + "SMALL BUTTON", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.imageButton:
                    Toast.makeText(ButtonsEvents.this, str + "IMAGE BUTTON", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.buttontextimage:
                    Toast.makeText(ButtonsEvents.this, str + "BUTTON WITH IMAGE AND TEXT", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.imageButton2:
                    Toast.makeText(ButtonsEvents.this, str + "BUTTON WITH IMAGE AND TEXT", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return true;
        }
    };
}
