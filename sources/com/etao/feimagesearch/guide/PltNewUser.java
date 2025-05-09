package com.etao.feimagesearch.guide;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eno;
import tb.iqv;
import tb.mno;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PltNewUser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long THIRTY_DAYS = -1702967296;

    static {
        t2o.a(730857613);
    }

    public static void markPltUsed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec4bd9", new Object[]{context});
        } else {
            mno.g(context, iqv.KEY_LAST_TIME, System.currentTimeMillis());
        }
    }

    public static boolean isNewUser(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78b27c4", new Object[]{context})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long c = eno.c(context, iqv.KEY_LAST_TIME, 0L);
        return c == 0 || currentTimeMillis - c >= THIRTY_DAYS;
    }
}
