package com.tutorials180.customizedarrayadapterwithlistviewforbscsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.tutorials180.customizedarrayadapterwithlistviewforbscsc.Adapters.CustomizedArrayAdapter;
import com.tutorials180.customizedarrayadapterwithlistviewforbscsc.Models.HumanModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<HumanModel> objectArrayList;
    ListView objectListView;

    CustomizedArrayAdapter objectCustomizedArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }


    private void initializeObjects()
    {
        try
        {
          objectListView=findViewById(R.id.LV);
          objectArrayList=new ArrayList<>();

          createObjectOfHumanModel();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void createObjectOfHumanModel()
    {
        try{
//            HumanModel human1, human2, human3, human4, human5, human6;
//            human1 = new HumanModel("Ali Raza", R.drawable.m_one);
//            human2 = new HumanModel("Allan", R.drawable.m_two);
//
//            human3 = new HumanModel("Reema Khan", R.drawable.fm_one);
//            human4 = new HumanModel("Ahad Butt", R.drawable.m_three);
//
//            human5 = new HumanModel("Maham", R.drawable.fm_one);
//            human6 = new HumanModel("Nabeel Maqbool", R.drawable.m_five);
            objectArrayList.add(new HumanModel("Ali Raza", R.drawable.m_one));
            objectArrayList.add(new HumanModel("Allan", R.drawable.m_two));

            objectArrayList.add(new HumanModel("Reema Khan", R.drawable.fm_one));
            objectArrayList.add(new HumanModel("Ahad Butt", R.drawable.m_three));

            objectArrayList.add(new HumanModel("Maham", R.drawable.fm_one));
            objectArrayList.add(new HumanModel("Nabeel Maqbool", R.drawable.m_five));

            sendValuesToCustomizedAdapter();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "createObjectOfHumanModel:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void sendValuesToCustomizedAdapter()
    {
        try
        {
            objectCustomizedArrayAdapter=new CustomizedArrayAdapter(
                    this,R.layout.single_row,objectArrayList
            );

            objectListView.setAdapter(objectCustomizedArrayAdapter);

        }
        catch (Exception e)
        {
            Toast.makeText(this, "sendValuesToCustomizedAdapter:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

























}
