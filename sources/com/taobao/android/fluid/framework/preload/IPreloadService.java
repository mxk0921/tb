package com.taobao.android.fluid.framework.preload;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance;
import com.taobao.android.fluid.framework.preload.task.IPreloadTask;
import tb.ntm;
import tb.ptm;
import tb.r8e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPreloadService extends FluidService {
    void clearMemoryData();

    void clearPreloadTaskForContext(FluidInstance fluidInstance, Context context);

    void doPreload(FluidInstance fluidInstance, Context context, JSONObject jSONObject);

    void doPreloadForInactive(FluidInstance fluidInstance, Context context, JSONObject jSONObject);

    IPreloadTask getCurrentPreloadTask();

    r8e getPreLoadVideoCommentSizeObject();

    PreRenderDWInstance getPreRenderDWInstance();

    ntm getPreloadVideoData();

    ptm getPreloadVideoTrackerManager();

    ntm getPreloadedVideo();

    boolean isInactiveUnexposedCacheVideo();

    boolean isPreloadedVideoAdded(FluidContext fluidContext);

    void setPreloadABConfig(JSONObject jSONObject);

    JSONObject startRender(FluidInstance fluidInstance, Context context, ViewGroup viewGroup, Uri uri, String str, boolean z);

    void startWarmUp(FluidInstance fluidInstance, Context context, Uri uri);
}
