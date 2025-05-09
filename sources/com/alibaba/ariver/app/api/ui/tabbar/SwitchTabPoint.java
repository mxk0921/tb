package com.alibaba.ariver.app.api.ui.tabbar;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface SwitchTabPoint extends Extension {
    @ThreadType(ExecutorType.UI)
    void onSwitchTab(App app, int i);
}
