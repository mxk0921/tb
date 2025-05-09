package com.taobao.nanocompose.megability.ability;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.dr;
import tb.ht4;
import tb.t2o;
import tb.zm8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE = new c();

    static {
        t2o.a(1022361729);
    }

    public final Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("37b0960", new Object[]{this});
        }
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, Localization.LOG_MODULE, "isCnSite", new LinkedHashMap(), null, 8, null));
        if (a2 != null) {
            return ht4.a(a2, "result");
        }
        return null;
    }
}
