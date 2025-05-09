package com.ali.user.open.ucc.context;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> bizParams = new HashMap();
    public static long startTrustLoginTime = 0;

    static {
        t2o.a(76546137);
    }

    public static Map<String, String> getBizParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[0]);
        }
        return bizParams;
    }

    public static void setBizParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cf6c87", new Object[]{map});
        } else {
            bizParams = map;
        }
    }
}
