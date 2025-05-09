package com.taobao.tao;

import android.app.Application;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import javax.annotation.Nonnull;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Globals {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Application sApplication;
    private static ClassLoader sClassLoader;
    private static String sInstalledVersionName;

    static {
        t2o.a(775946308);
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return sApplication;
    }

    public static ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[0]);
        }
        return sClassLoader;
    }

    public static String getInstalledVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b947cc3a", new Object[0]);
        }
        if (TextUtils.isEmpty(sInstalledVersionName)) {
            getVersionName();
        }
        return sInstalledVersionName;
    }

    public static int getVersionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[0])).intValue();
        }
        try {
            return getApplication().getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (!TextUtils.isEmpty(sInstalledVersionName)) {
            return sInstalledVersionName;
        }
        try {
            sInstalledVersionName = getApplication().getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            sInstalledVersionName = "5.0.0";
        }
        return sInstalledVersionName;
    }

    public static void init(@Nonnull Application application, @Nonnull ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8854d442", new Object[]{application, classLoader});
            return;
        }
        sApplication = application;
        sClassLoader = classLoader;
    }
}
