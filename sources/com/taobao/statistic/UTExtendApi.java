package com.taobao.statistic;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UTExtendApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593130);
    }

    public static void updateNextPageProperties(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d96261", new Object[]{properties});
        } else {
            TBS.updateNextPageProperties(properties);
        }
    }
}
