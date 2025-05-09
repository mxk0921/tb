package com.taobao.android.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import java.io.Serializable;
import java.util.HashMap;
import tb.lbr;
import tb.vk6;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DinamicXLauncherV3 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        lbr.f(application);
        try {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new vk6());
        } catch (Throwable th) {
            xv5.b(th);
        }
    }
}
