package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiscUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RC_PACKAGE_NAME = "com.eg.android.AlipayGphoneRC";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f3851a;

    public static final boolean isDebugger(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4275d9a", new Object[]{context})).booleanValue();
        }
        Boolean bool = f3851a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f3851a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception e) {
            Log.e(com.alipay.mobile.common.transport.utils.MiscUtils.TAG, "", e);
            return false;
        }
    }
}
