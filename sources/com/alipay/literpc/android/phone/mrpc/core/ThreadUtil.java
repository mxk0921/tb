package com.alipay.literpc.android.phone.mrpc.core;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ThreadUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean checkMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2e58f56", new Object[0])).booleanValue();
        }
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }
}
