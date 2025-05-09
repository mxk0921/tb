package com.taobao.android.fluid.business.globalinteraction;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.ar9;
import tb.ngf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IInteractionService extends FluidService {
    public static final ar9 ERROR_CODE_WEB_VIEW_NULL = new ar9("INTERACTION-1", "全局互动 WebView 为空");

    ngf getConfig();

    void initCollectionPoplayer();

    void initGlobalH5MessageHandler(a aVar);

    void initGlobalInteractHandler();

    boolean isEnableGlobalWeexDSLV2();

    void setGlobalLayerVisibility(boolean z);
}
