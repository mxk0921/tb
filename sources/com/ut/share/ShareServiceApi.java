package com.ut.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.utils.ShareLinkWrapper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareServiceApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(662700053);
    }

    public static String urlBackFlow(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b473c57", new Object[]{str, str2, str3});
        }
        return ShareLinkWrapper.wrapShareLink(str, str2, str3);
    }
}
