package com.taobao.android.behavix.utils;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Debuggable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean DEBUG = false;

    static {
        t2o.a(404750664);
    }

    public static void init(Application application) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            DEBUG = z;
        } catch (Exception unused) {
        }
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return DEBUG;
    }
}
