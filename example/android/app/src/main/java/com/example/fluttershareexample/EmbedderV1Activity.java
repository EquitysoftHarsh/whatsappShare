package com.example.whatsapp_shareexample;

import android.os.Bundle;

import com.example.whatsapp_share.WhatsappShare;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.pathprovider.PathProviderPlugin;

public class EmbedderV1Activity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PathProviderPlugin.registerWith(registrarFor("io.flutter.plugins.flutter.io/path_provider"));
        WhatsappShare.registerWith(registrarFor("com.example.whatsapp_shareexample.FlutterShare"));
    }
}