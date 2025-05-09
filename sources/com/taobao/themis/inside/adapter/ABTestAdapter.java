package com.taobao.themis.inside.adapter;

import android.content.Context;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import kotlin.Metadata;
import tb.ckf;
import tb.ru1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/inside/adapter/ABTestAdapter;", "Lcom/taobao/themis/kernel/adapter/IABTestAdapter;", "()V", "getExperimentByModule", "Lcom/alibaba/ut/abtest/VariationSet;", "component", "", "module", "getExperimentBySwitch", "context", "Landroid/content/Context;", "switchName", "isFeatureOpened", "", ru1.FEATURE_NAME, "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ABTestAdapter implements IABTestAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(837812250);
        t2o.a(839909457);
    }

    @Override // com.taobao.themis.kernel.adapter.IABTestAdapter
    public VariationSet getExperimentByModule(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("11490ed8", new Object[]{this, str, str2});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        return UTABTest.activate(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IABTestAdapter
    public VariationSet getExperimentBySwitch(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("8078ebc", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "switchName");
        return EVO.activateSync(context, str);
    }

    @Override // com.taobao.themis.kernel.adapter.IABTestAdapter
    public boolean isFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63361a", new Object[]{this, context, str})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(str, ru1.FEATURE_NAME);
        return ABGlobal.isFeatureOpened(context, str);
    }
}
