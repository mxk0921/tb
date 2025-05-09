package com.alibaba.triver.triver_render.extension;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface PagePulldownPoint extends Extension {
    @ThreadType(ExecutorType.URGENT)
    void onReachPullRefreshDistance(App app, int i);

    @ThreadType(ExecutorType.URGENT)
    void onRefresh(App app);
}
