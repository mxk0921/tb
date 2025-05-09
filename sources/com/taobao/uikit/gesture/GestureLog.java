package com.taobao.uikit.gesture;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "uikit_gesture";

    static {
        t2o.a(933232642);
    }

    public static void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else {
            TLog.loge(TAG, str, str2);
        }
    }
}
