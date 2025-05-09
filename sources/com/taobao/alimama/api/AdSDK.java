package com.taobao.alimama.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ec;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AdSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1018167300);
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls});
        }
        return (T) ec.c().a(cls);
    }

    public static void initSDK(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b99b057", new Object[]{context});
        } else {
            ec.c().b(context);
        }
    }
}
