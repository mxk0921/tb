package com.taobao.android.fluid.framework.performance;

import com.taobao.android.fluid.core.FluidService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPerformanceService extends FluidService {
    public static final String MTS_TAG_INTERACT_DETAIL_CACHE = "detailCache";
    public static final String MTS_TAG_PENDING_FIRST_FRAME_CALLBACK = "pendingFirstFrameCallback";
    public static final String MTS_TAG_PRECREATE_WEEX = "PrecreateWeexInstance";
    public static final String MTS_TAG_PREFETCH_MTOP = "mtopprefetch";
    public static final String MTS_TAG_VERSION_MATCH = "dataVersionMatch";
    public static final String MTS_VALUE_INTERACT_SUCCESS = "interactFrameSuccess";

    boolean isInteractLayerFirstFrameReady();

    void onInteractAPMTrace(Map map);

    void onInteractLayerFirstFrameReady();

    void onInteractLayerResultReady();

    void onVideoFirstFrameReady(Runnable runnable);
}
