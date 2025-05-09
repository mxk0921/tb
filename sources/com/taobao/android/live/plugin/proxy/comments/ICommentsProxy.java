package com.taobao.android.live.plugin.proxy.comments;

import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ICommentsProxy extends IProxy {
    public static final String KEY = "ICommentsProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        Long getImportantMessageIntervalTime();

        Long getImportantMessageTimeoutTime();
    }

    Class<? extends BaseFrame> getChatFrame3Class();

    Class<? extends BaseFrame> getImportantEventFrameClass();
}
