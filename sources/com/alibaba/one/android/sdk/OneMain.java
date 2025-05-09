package com.alibaba.one.android.sdk;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OneMain {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface UpdateListener {
        void onUpdated(int i, int i2, String str);
    }

    static {
        t2o.a(659554305);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        }
    }

    private static native void initNative(Context context);

    public static void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
            return;
        }
        mContext = context;
        initNative(context);
    }

    public static Object play(int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("106192ce", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), obj});
        }
        try {
            if (mContext == null) {
                return null;
            }
            return playNative(i, i2, i3, obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static native Object playNative(int i, int i2, int i3, Object obj);
}
