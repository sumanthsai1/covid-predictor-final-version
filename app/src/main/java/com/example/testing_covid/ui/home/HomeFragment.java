package com.example.testing_covid.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.testing_covid.Dialog.AboutApp_dialog;
import com.example.testing_covid.Dialog.About_dialog;
import com.example.testing_covid.Helpline.HelpLineActivity;
import com.example.testing_covid.Hospitals.HospitalActivity;
import com.example.testing_covid.Maps.MapsActivity;
import com.example.testing_covid.MedicalStores.MedicalStoresActivity;
import com.example.testing_covid.Notifications.NotificationActivity;
import com.example.testing_covid.OnlineDoctorAppoinment.OnlineDoctorActivity;
import com.example.testing_covid.R;
import com.example.testing_covid.ServiceLinkages.ServiceLinkagesActivity;
import com.example.testing_covid.UserDetails.profile;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;
import org.json.JSONObject;

public class HomeFragment extends Fragment implements PopupMenu.OnMenuItemClickListener {

    ImageView menu,maps;

    CardView card1,card2,card3,card4,card5,card6;

    TextView tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        menu=view.findViewById(R.id.menu);
        maps=view.findViewById(R.id.maps);

        card1=view.findViewById(R.id.card1);
        card2=view.findViewById(R.id.card2);
        card3=view.findViewById(R.id.card3);
        card5=view.findViewById(R.id.card5);
        card6=view.findViewById(R.id.card6);

        tvCases=view.findViewById(R.id.con);
        tvRecovered=view.findViewById(R.id.rec);
        tvTotalDeaths=view.findViewById(R.id.dec);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), HospitalActivity.class));
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), OnlineDoctorActivity.class));
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MedicalStoresActivity.class));
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), HelpLineActivity.class));

            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ServiceLinkagesActivity.class));

            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MapsActivity.class));
            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup=new PopupMenu(getContext(),v);
                popup.setOnMenuItemClickListener(HomeFragment.this);
                popup.inflate(R.menu.menu);
                popup.show();

            }


        });
        fetchData();

        return view;
    }

    private void fetchData() {
        String url  = "https://corona.lmao.ninja/v2/countries/india";


        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject = new JSONObject(response.toString());

                            tvCases.setText(jsonObject.getString("cases"));
                            tvRecovered.setText(jsonObject.getString("recovered"));
                            tvTotalDeaths.setText(jsonObject.getString("deaths"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(request);

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.profile:
                startActivity(new Intent(getContext(), NotificationActivity.class));
                return true;
            case R.id.aboutus:
                openaboutapp();
                return true;
            case R.id.Contact:
                openaboutdialog();
                return true;
            case R.id.logout:
                startActivity(new Intent(getActivity(), profile.class));
                return true;
        }
        return true;
    }

    private void openaboutapp() {
        AboutApp_dialog aboutApp_dialog=new AboutApp_dialog();
        aboutApp_dialog.show(getFragmentManager(),"example about app");
    }

    private void openaboutdialog() {
        About_dialog about_dialog=new About_dialog();
        about_dialog.show(getFragmentManager(),"example dialog");
    }

}