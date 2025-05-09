package com.taobao.themis.kernel.adapter;

import android.content.Context;
import com.alibaba.ut.abtest.VariationSet;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import tb.n8s;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.inside.adapter.ABTestAdapter")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IABTestAdapter extends n8s {
    VariationSet getExperimentByModule(String str, String str2);

    VariationSet getExperimentBySwitch(Context context, String str);

    boolean isFeatureOpened(Context context, String str);
}
