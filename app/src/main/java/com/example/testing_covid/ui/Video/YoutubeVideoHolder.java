package com.example.testing_covid.ui.Video;


import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testing_covid.R;

public class YoutubeVideoHolder extends RecyclerView.ViewHolder {
    WebView webView;
    Button button;
    public YoutubeVideoHolder(@NonNull View itemView) {
        super(itemView);
        webView=itemView.findViewById(R.id.video_view);
        button=itemView.findViewById(R.id.fullscreen);

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
