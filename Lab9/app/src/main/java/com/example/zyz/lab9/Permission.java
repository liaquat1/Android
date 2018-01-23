package com.example.zyz.lab9;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by ZYZ on 2017/12/19.
 */

public class Permission {

    private static final int REQUEST_CODE = 1;

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE ,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    private static String[] PERMISSIONS_CAMERA = {
            Manifest.permission.CAMERA,
    };
    private static String[] PERMISSIONS_CONTACTS = {
            Manifest.permission.READ_CONTACTS,
            Manifest.permission.WRITE_CONTACTS
    };

    private static String[] PERMISSIONS_INTERNET = {
            Manifest.permission.INTERNET
    };

    /**
     * 外部储存的的权限申请
     */
    public static void verifyExternalStoragePermissions(Activity activity) {
        int permission = ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.READ_EXTERNAL_STORAGE);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity,
                    PERMISSIONS_STORAGE, REQUEST_CODE);
        }
    }

    /**
     * 相机的权限申请
     */
    public static void verifyCameraPermissions(Activity activity) {
        int permission = ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.CAMERA);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity,
                    PERMISSIONS_CAMERA, REQUEST_CODE);
        }
    }

    /**
     * 获取联系人权限
     */
    public static void verifyContactPermissions(Activity activity)
    {
        int permission = ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.READ_CONTACTS);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity,
                    PERMISSIONS_CONTACTS, REQUEST_CODE);
        }
    }

    /**
     * 获取网络访问权限
     */
    public static void verifyInternetPermissions(Activity activity)
    {
        int permission = ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.INTERNET);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity,
                    PERMISSIONS_INTERNET, REQUEST_CODE);
        }
    }
}
