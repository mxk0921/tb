package com.taobao.uikit.gesture;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.biz.ListenerInitializer;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InitGesture {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitGesture";
    private static boolean sIsInited = false;

    static {
        t2o.a(934281217);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (!sIsInited) {
            sIsInited = true;
            GestureSdkManager.getInstance().initSwitch(application);
            if (!GestureSdkManager.getInstance().isGestureSwitchOn()) {
                GestureLog.loge(TAG, "init, gesture switch is off");
                return;
            }
            GestureLog.loge(TAG, "init");
            GestureSdkManager.getInstance().init(application, hashMap);
            ListenerInitializer.init();
        }
    }
}
