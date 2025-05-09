package com.taobao.android.launcher.statistics.sec;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.dp.DeviceSecuritySDK;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.imo;
import tb.whh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UMIDToken {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AB_CODE = "ngUMIDToken";

    /* renamed from: a  reason: collision with root package name */
    public static String f8167a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(false);

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1044af16", new Object[0])).booleanValue();
        }
        return c;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        b = BootstrapMode.o();
        boolean equals = TextUtils.equals(LauncherRuntime.b, LauncherRuntime.c);
        d = equals;
        if (equals && b) {
            c = a(context);
            whh.a("UMIDToken", "decided switch status: " + c);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8f278e", new Object[0]);
        } else {
            f.compareAndSet(false, true);
        }
    }

    public static String getSecurityToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("900fd3f6", new Object[0]);
        }
        Application application = LauncherRuntime.h;
        if (!d) {
            return DeviceSecuritySDK.getInstance(application).getSecurityToken();
        }
        if (!b) {
            return DeviceSecuritySDK.getInstance(application).getSecurityToken();
        }
        if (!c) {
            return DeviceSecuritySDK.getInstance(application).getSecurityToken();
        }
        if (f.get()) {
            return DeviceSecuritySDK.getInstance(application).getSecurityToken();
        }
        if (!TextUtils.isEmpty(f8167a)) {
            return f8167a;
        }
        if (e.compareAndSet(false, true)) {
            String string = application.getSharedPreferences("umid_token_store", 0).getString("umid_token", null);
            if (!TextUtils.isEmpty(string)) {
                f8167a = string;
            }
        }
        return f8167a;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c6175e9", new Object[]{context})).booleanValue();
        }
        return Boolean.parseBoolean(context.getSharedPreferences(imo.ORANGE_NAMESPACE, 0).getString(KEY_AB_CODE, "true"));
    }

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            application.getSharedPreferences("umid_token_store", 0).edit().putString("umid_token", DeviceSecuritySDK.getInstance(application).getSecurityToken()).commit();
        }
    }
}
