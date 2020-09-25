package com.alirnp.implementaion.me1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alirnp.implementaion.R;
import com.alirnp.implementaion.me1.Components.ActivityComponent;
import com.alirnp.implementaion.me1.model.Car;

import javax.inject.Inject;

public class Me1Activity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me1);

/*        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(220)
                .engineCapacity(1400)
                .appComponent(((MyApp)getApplication()).getAppComponent())
                .build();*/

        ActivityComponent activityComponent = ((MyApp) getApplication()).getAppComponent().getActivityComponentBuilder()
                .horsePower(64)
                .engineCapacity(855)
                .build();

        activityComponent.inject(this);

        car.drive();

    }
}