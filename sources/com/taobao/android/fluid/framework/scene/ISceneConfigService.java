package com.taobao.android.fluid.framework.scene;

import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.FluidService;
import java.util.Map;
import tb.ar9;
import tb.enc;
import tb.iep;
import tb.mca;
import tb.pep;
import tb.rch;
import tb.wfc;
import tb.zod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ISceneConfigService extends FluidService {
    public static final ar9 ERROR_CODE_MISS_PARAM = new ar9("SCENE-1", "FluidInstanceConfig 缺少必要字段");

    /* synthetic */ void addInstanceConfigChangedListener(wfc wfcVar);

    /* synthetic */ void addSessionParamsChangedListener(zod zodVar);

    mca getGlobalState();

    enc getLockListListener();

    iep getSessionExtParams();

    pep getSessionParams();

    rch getSlidePageLockConfigure();

    boolean isItemRecognizeShowing();

    void mergeTab3ExtParams(Map map);

    void refreshInstanceConfig(FluidInstanceConfig fluidInstanceConfig);

    void refreshSessionParams(Map map);

    /* synthetic */ void removeInstanceConfigChangedListener(wfc wfcVar);

    /* synthetic */ void removeSessionParamsChangedListener(zod zodVar);

    void setItemRecognizeShowing(boolean z);

    void setLockListListener(enc encVar);

    void updateGlobalParams(Map map);
}
