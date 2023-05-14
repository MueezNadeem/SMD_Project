package com.example.smd_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserProfile extends AppCompatActivity {
    TextView custName;
    TextView custDOB;
    TextView custPN;
    ImageView custPIC;
    RecyclerView pastBookings;

    ArrayList<Booking> bookings;
    Customer C;
    FirebaseClass FC;
    Button EditProf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FC=new FirebaseClass();
        ArrayList<Booking> temp;
        C= (Customer) getIntent().getSerializableExtra("customer");
        //TODO: booking from firebase
        Booking b=new Booking();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profie);

        FC.returnBooking();
        custName=(TextView) findViewById(R.id.cust_name);
        custDOB=(TextView) findViewById(R.id.cust_DOB);
        custPN=(TextView) findViewById(R.id.cust_phone);
        custPIC=(ImageView)findViewById(R.id.cust_img);
        pastBookings=(RecyclerView) findViewById(R.id.past_booking_rView);
        EditProf=(Button) findViewById(R.id.profile_edit_button);

        custName.setText(C.getName());
        custDOB.setText("Date of Birth: "+C.getDOB());
        custPN.setText("Phone Number: "+C.getPhoneNumber());

        FC.AddBooking(b);
        temp=FC.returnBooking();

        FC.getBitmapFromFirebaseStorage(C.getName(), new FirebaseClass.OnBitmapLoadedListener() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap) {
                custPIC.setImageBitmap(bitmap);
            }
        });



        for (int i=0;i<temp.size();i++){
            if (temp.get(i).getCust()==C){
                bookings.add(temp.get(i));
            }

        }
        pastBookings.setLayoutManager(new LinearLayoutManager(this));
        pastBookings.setAdapter(new BookingAdapter(bookings));

        //TODO: Implement methods to get img from Firebase
        EditProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),editProfile.class);

                i.putExtra("customer",C);

                startActivity(i);
            }
        });



    }
}