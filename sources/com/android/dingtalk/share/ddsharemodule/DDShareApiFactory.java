package com.android.dingtalk.share.ddsharemodule;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DDShareApiFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(90177537);
    }

    public static IDDShareApi createDDShareApi(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDDShareApi) ipChange.ipc$dispatch("182fcc8c", new Object[]{context, str, new Boolean(z)});
        }
        return new DDShareApiV2(context, str, z);
    }
}
