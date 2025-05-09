package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.usx;
import tb.vux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecurityClientMobile {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        synchronized (SecurityClientMobile.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1cbb6ac2", new Object[]{context, map});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", vux.b(map, "utdid", ""));
            hashMap.put("tid", vux.b(map, "tid", ""));
            hashMap.put("userId", vux.b(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            return usx.b(context);
        }
    }
}
