package com.alirnp.implementaion.codeFlow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alirnp.implementaion.R;
import com.alirnp.implementaion.codeFlow.model.Car;
import com.alirnp.implementaion.codeFlow.model.Engine;
import com.alirnp.implementaion.codeFlow.model.Wheel;

import javax.inject.Inject;

public class CodeFlowActivity extends AppCompatActivity {

    @Inject Car mCar ;
    @Inject Wheel wheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_flow);

        CarComponent carComponent1 = DaggerCarComponent.create();
        Car car2 = carComponent1.getCar();
        car2.drive(2);

        CarComponent carComponent2 = DaggerCarComponent.create();
        carComponent2.inject(this);

        car2.drive(3);

        wheel.toast();





    }
}