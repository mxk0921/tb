package com.taobao.android.fluid.framework.mute;

import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import tb.jfj;
import tb.xxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMuteService extends FluidService, xxc {
    /* synthetic */ void addMuteFlagChangedListener(xxc xxcVar);

    jfj getMuteImpl();

    boolean isFadInForFirstTime();

    boolean isMuteABTestForSettings();

    @Override // tb.xxc
    /* synthetic */ void onMuteFlagChanged(FluidContext fluidContext, String str, String str2);

    /* synthetic */ void removeMuteFlagChangedListener(xxc xxcVar);

    void setFadInForFirstTime(boolean z);

    void setMuteABTestForSettings(boolean z);

    void setMuteImpl(jfj jfjVar);
}
