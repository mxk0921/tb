package com.taobao.message.notification.base;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultABProvider implements IABProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271288);
        t2o.a(610271292);
    }

    @Override // com.taobao.message.notification.base.IABProvider
    public String getABResult(String str, String str2, String str3) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("653ecea7", new Object[]{this, str, str2, str3});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null || (variation = activate.getVariation(str3)) == null) {
            return "";
        }
        return variation.getValueAsString("");
    }
}
