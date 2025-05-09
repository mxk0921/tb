package com.ut.share.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OrangeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME_SPACE = "android_share_bizconfig";

    static {
        t2o.a(662700081);
    }

    public static String getBizOrangeConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db404ef8", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", str, str2);
    }
}
