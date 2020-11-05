package com.example.testing_covid.ServiceLinkages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testing_covid.MainActivity;
import com.example.testing_covid.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class ServiceLinkagesActivity extends AppCompatActivity {

    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref;

    ImageView back;

    TextView text2,text3,text4,text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_linkages);

        back=findViewById(R.id.back);

        text2=findViewById(R.id.file2);
        text3=findViewById(R.id.file3);
        text4=findViewById(R.id.file4);
        text5=findViewById(R.id.file5);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ServiceLinkagesActivity.this, MainActivity.class));
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadfile2();
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadfile3();
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadfile4();
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadfile5();
            }
        });
    }

    private void downloadfile5() {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("service5.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadfiles5(ServiceLinkagesActivity.this,"service5",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void downloadfiles5(Context context, String filename, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,filename+fileExtension);

        downloadManager.enqueue(request);
    }

    private void downloadfile4() {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("service4.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadfiles4(ServiceLinkagesActivity.this,"service4",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void downloadfiles4(Context context, String filename, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,filename+fileExtension);

        downloadManager.enqueue(request);
    }

    private void downloadfile3() {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("service3.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadfiles3(ServiceLinkagesActivity.this,"service3",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void downloadfiles3(Context context, String filename, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,filename+fileExtension);

        downloadManager.enqueue(request);
    }

    private void downloadfile2() {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("service2.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadfiles2(ServiceLinkagesActivity.this,"service2",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void downloadfiles2(Context context, String filename, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,filename+fileExtension);

        downloadManager.enqueue(request);
    }


    public void text1(View view) {
        downloadfile1();
    }
    private void downloadfile1() {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("service1.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadfiles1(ServiceLinkagesActivity.this,"service1",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }
    private void downloadfiles1(Context context, String filename, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,filename+fileExtension);

        downloadManager.enqueue(request);
    }

}