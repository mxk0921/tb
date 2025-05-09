package com.taobao.android.fluid.framework.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import tb.ju0;
import tb.t2o;
import tb.tq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AnalysisService implements IAnalysisService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final tq9 mFluidInstanceAnalysis;
    private boolean mIsRetryFetchContent;
    private final ju0 mServiceConfig = new ju0();

    static {
        t2o.a(468713845);
        t2o.a(468713846);
    }

    public AnalysisService(FluidContext fluidContext) {
        this.mFluidInstanceAnalysis = new FluidInstanceAnalysis(fluidContext, null);
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public ju0 getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ju0) ipChange.ipc$dispatch("cc2ffeae", new Object[]{this});
        }
        return this.mServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public tq9 getFluidInstanceAnalysis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tq9) ipChange.ipc$dispatch("6dfad7dc", new Object[]{this});
        }
        return this.mFluidInstanceAnalysis;
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public boolean isRetryFetchContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45a6f528", new Object[]{this})).booleanValue();
        }
        return this.mIsRetryFetchContent;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public void setRetryFetchContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b165768", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsRetryFetchContent = z;
        }
    }
}
