package com.alipay.mobile.common.transport.utils;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConnectivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_QUICK = "quick";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4141a;

    public static int getConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cf11709", new Object[0])).intValue();
        }
        return ExtTransportOffice.getInstance().getConnState();
    }

    public static boolean isShowRedText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11bfd522", new Object[0])).booleanValue();
        }
        return f4141a;
    }

    public static void notifyRedText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14506e78", new Object[]{new Boolean(z)});
        } else {
            f4141a = z;
        }
    }

    public static void notifyScene(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf2840", new Object[]{str, new Boolean(z)});
        } else {
            ExtTransportOffice.getInstance().setScene(str, z);
        }
    }
}
