package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SiteUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157652);
    }

    public static int getDefaultLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f24a7f", new Object[0])).intValue();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }
}
