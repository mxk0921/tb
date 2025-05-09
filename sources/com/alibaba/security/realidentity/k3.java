package com.alibaba.security.realidentity;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static p2 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p2) ipChange.ipc$dispatch("4efb1cde", new Object[]{context});
        }
        return new l3(context);
    }
}
