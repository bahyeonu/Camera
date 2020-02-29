package com.example.camera

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.camera2.CameraManager
import androidx.core.content.ContextCompat.getSystemService

class Camera2{
    public fun checkCameraHardware(context: Context): Boolean {
        return !(context.packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY))
    }

    public fun getCameraInstance(): Camera2?{
        return try{

        }
    }
}