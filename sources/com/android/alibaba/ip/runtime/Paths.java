package com.android.alibaba.ip.runtime;

import android.content.Context;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Paths {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(493879323);
    }

    public static String getDataDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73421b62", new Object[]{str});
        }
        return "/data/data/" + str + "/files/instant-patch";
    }

    public static String getExternalDataDirectory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f84a041", new Object[]{context});
        }
        File externalFilesDir = context.getExternalFilesDir("instant-patch");
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return null;
    }

    public static String getMainApkDataDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3aeaff9", new Object[]{str});
        }
        return "/data/data/" + str;
    }

    public static String getMainApkFilesDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7affc4c", new Object[]{str});
        }
        return "/data/data/" + str + "/files";
    }

    public static String getDataDirectory(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d419a10c", new Object[]{context}) : new File(context.getFilesDir(), "instant-patch").getPath();
    }

    public static String getMainApkDataDirectory(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5f00495", new Object[]{context}) : context.getFilesDir().getParentFile().getPath();
    }

    public static String getMainApkFilesDirectory(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("622c4e2", new Object[]{context}) : context.getFilesDir().getPath();
    }
}
