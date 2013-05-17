package it.AccollaBelli.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

/**
 * Created by AleFisso on 16/05/13.
 */
public class TextFieldsEvents extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textfields);
        EditText ma = (EditText) findViewById(R.id.editTextE);



        ma.setOnEditorActionListener(eal);
    }

    private OnEditorActionListener eal = new OnEditorActionListener(){

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch (actionId)  {
                case EditorInfo.IME_ACTION_SEND:
                    Toast.makeText(TextFieldsEvents.this, "The e-mail was sent to: "+ v.getText(), Toast.LENGTH_SHORT).show();
                    return true;
                case EditorInfo.IME_ACTION_GO :
                    //if(v.getId() == R.id.editTextPW){
                        Toast.makeText(TextFieldsEvents.this, "The password is: "+ v.getText(), Toast.LENGTH_SHORT).show();
                        return true;
                   // }




            }
            return false;
        }
    };
}

