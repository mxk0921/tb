package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.q4y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UtdidWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getUtdid(Context context) {
        try {
            IpChange ipChange = UTDevice.$ipChange;
            return (String) UTDevice.class.getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception e) {
            q4y.b("[-] UTDID error.");
            q4y.c(e);
            return "";
        }
    }
}
