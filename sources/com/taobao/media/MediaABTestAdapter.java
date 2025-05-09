package com.taobao.media;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaABTestAdapter implements f0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String Tag = "MediaABTestAdapter";

    static {
        t2o.a(774897677);
        t2o.a(774897665);
    }

    public String getBucket(String str, String str2) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a61b05", new Object[]{this, str, str2});
        }
        try {
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate == null || activate.size() <= 0 || (variation = activate.getVariation("bucket")) == null) {
                return "";
            }
            return variation.getValueAsString("bucket");
        } catch (Throwable unused) {
            return "";
        }
    }
}
