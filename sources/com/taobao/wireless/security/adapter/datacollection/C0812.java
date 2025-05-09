package com.taobao.wireless.security.adapter.datacollection;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import java.io.File;

/* renamed from: com.taobao.wireless.security.adapter.datacollection.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0812 {

    /* renamed from: а  reason: contains not printable characters */
    private static Context f591;

    @TargetApi(3)
    /* renamed from: а  reason: contains not printable characters */
    public static String m373() {
        try {
            String string = Settings.Secure.getString(f591.getContentResolver(), "android_id");
            return string != null ? string.trim() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    private static String m374(File file) {
        if (file == null) {
            return null;
        }
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Long l = (Long) statFs.getClass().getDeclaredMethod("getAvailableBytes", new Class[0]).invoke(statFs, new Object[0]);
                if (l != null) {
                    return l.toString();
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        } else {
            long availableBlocks = statFs.getAvailableBlocks();
            long blockCount = statFs.getBlockCount();
            return (blockCount * availableBlocks) + "";
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public static String m375() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (!(dataDirectory == null || dataDirectory.getAbsolutePath().length() == 0)) {
                return m374(dataDirectory);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static void m376(Context context) {
        if (context != null && f591 == null) {
            f591 = context;
        }
    }
}
