package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157637);
    }

    public static int getAlimmsdk_env() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6c884da", new Object[0])).intValue();
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 1) {
            return 2;
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 2) {
            return 1;
        }
        return 0;
    }
}
