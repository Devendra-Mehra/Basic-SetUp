package com.example.basesetup.base;

import android.Manifest;
import android.content.Context;

import pub.devrel.easypermissions.EasyPermissions;


public class AppPermission {

    public AppPermission() {
    }

    public boolean hasCameraPermission(Context context) {
        return EasyPermissions.hasPermissions(context, Manifest.permission.CAMERA);
    }

    public boolean hasSmsPermission(Context context) {
        return EasyPermissions.hasPermissions(context, Manifest.permission.READ_SMS);
    }

    public boolean hasStoragePermission(Context context) {
        return EasyPermissions.hasPermissions(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }

    public boolean hasReadPermission(Context context) {
        return EasyPermissions.hasPermissions(context, Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    public boolean hasLocationPermission(Context context) {
        return EasyPermissions.hasPermissions(context, Manifest.permission.ACCESS_FINE_LOCATION);
    }
}
