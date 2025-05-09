package com.alibaba.ariver.app.api.point.app;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface AppPausePoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    void onAppPause(App app);
}
