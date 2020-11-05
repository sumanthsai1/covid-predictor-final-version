package com.example.testing_covid.ui.Video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testing_covid.R;

import java.util.ArrayList;

public class VideoFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<DataSetList> arrayList;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.video_fragment, container, false);


        recyclerView=view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        arrayList=new ArrayList<DataSetList>();

        DataSetList dataSetList=new DataSetList("https://youtu.be/0dOCDME6HK8");
        arrayList.add(dataSetList);

        dataSetList=new DataSetList("https://youtu.be/7tgm8KBlCtE");
        arrayList.add(dataSetList);

        dataSetList=new DataSetList("https://youtu.be/DCdxsnRF1Fk");
        arrayList.add(dataSetList);

        dataSetList=new DataSetList("https://youtu.be/U8r3oTVMtQ0");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter=new YoutubeAdapter(arrayList,getContext());
        recyclerView.setAdapter(youtubeAdapter);


        return view;
    }




}