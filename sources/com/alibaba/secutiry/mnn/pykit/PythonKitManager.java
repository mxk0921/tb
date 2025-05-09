package com.alibaba.secutiry.mnn.pykit;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.Jb;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PythonKitManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!WukongNativeManager.c().a()) {
            WukongNativeManager.c().a(new Jb());
        } else {
            nPyKitInit();
        }
    }

    public static native void nPyKitInit();
}
