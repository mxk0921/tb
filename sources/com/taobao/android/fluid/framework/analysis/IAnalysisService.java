package com.taobao.android.fluid.framework.analysis;

import com.taobao.android.fluid.core.FluidService;
import tb.ju0;
import tb.tq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IAnalysisService extends FluidService {
    public static final String SERVICE_NAME = "IAnalysisService";

    ju0 getConfig();

    tq9 getFluidInstanceAnalysis();

    boolean isRetryFetchContent();

    void setRetryFetchContent(boolean z);
}
