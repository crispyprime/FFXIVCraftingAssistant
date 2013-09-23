package com.crispyco.ffxivcraftingassistant;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity implements View.OnClickListener{

	Spinner Profession;
	String stProf;
	
	class MyOnItemSelectedListener implements OnItemSelectedListener {

	    public void onItemSelected(AdapterView<?> parent,
	        View view, int pos, long id) {
	        stProf = parent.getItemAtPosition(pos).toString();
	    }

	    public void onNothingSelected(AdapterView<?> parent) {
	      // Do nothing.
	    }
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter <CharSequence> adapter =
				  new ArrayAdapter <CharSequence> (this, android.R.layout.simple_spinner_item );
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		addProfession(adapter);
		
		Profession = (Spinner)findViewById(R.id.Profession);
        Profession.setAdapter(adapter);
        Profession.setOnItemSelectedListener(new MyOnItemSelectedListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    private void addProfession(ArrayAdapter <CharSequence> a)
	{
		a.add("Alchemy");
		a.add("Armorcraft");
		a.add("Clothcraft");
		a.add("Cooking");
		a.add("Goldsmithing");
		a.add("Leatherworking");
		a.add("Smithing");
		a.add("Woodworking");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
    
}
