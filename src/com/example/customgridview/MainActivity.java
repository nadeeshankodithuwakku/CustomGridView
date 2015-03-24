package com.example.customgridview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	GridView myGrid;
	
	//int numOfEmps;
	
	String[] empNames;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		empNames = new String[]{"AAA","BBB","CCC","DDD"};
		
		myGrid=(GridView)findViewById(R.id.MyGrid);
		myGrid.setAdapter(new ImageAdapter(this));
		
		//numOfEmps=10;
		
	}
	
	public class ImageAdapter extends BaseAdapter
	{
		
		Context MyContext;
		
		
		
		public ImageAdapter(Context _MyContext)
		{
			MyContext = _MyContext;
		}
		
		@Override
		public int getCount() 
		{
			return empNames.length;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) 
		{
			
			View MyView = convertView;
			
			if ( convertView == null )
			{
				/*for(int i=0;i<empNames.length;i++)
				{*/
					LayoutInflater li = getLayoutInflater();
					MyView = li.inflate(R.layout.grid_item, null);
					
					TextView tv = (TextView)MyView.findViewById(R.id.grid_item_emp_name);
					//tv.setText(empNames[i]+""+position);
					tv.setText(empNames[position]);
					TextView tv2 = (TextView)MyView.findViewById(R.id.grid_item_emp_branch);
					tv2.setText("Kollupitiya Branch");
					
					ImageView iv = (ImageView)MyView.findViewById(R.id.grid_item_emp_image);
					iv.setImageResource(R.drawable.android_icon);
				/*}*/
				
				
			}
			
			return MyView;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
