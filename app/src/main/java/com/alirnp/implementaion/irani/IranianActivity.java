package com.alirnp.implementaion.irani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alirnp.implementaion.R;
import com.alirnp.implementaion.irani.component.ActivityComponent;
import com.alirnp.implementaion.irani.model.Car;
import com.alirnp.implementaion.me1.MyApp;

import javax.inject.Inject;

public class IranianActivity extends AppCompatActivity {

    @Inject
    Car myCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irani);

        ActivityComponent activityComponent = ((MyApp)getApplication()).getApplicationComponents().getActivityComponentBuilder()
                .hoursPower(2600)
                .engineCapacity(1400)
               // .driverComponent(((MyApp)getApplication()).getApplicationComponents())
                .build();
        Car car = activityComponent.getCar();
        car.drive();

        activityComponent.inject(this);
        myCar.drive();


    }
}