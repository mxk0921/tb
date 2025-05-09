package com.taobao.message.notification.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DensityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271340);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
