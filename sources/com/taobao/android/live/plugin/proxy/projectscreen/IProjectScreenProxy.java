package com.taobao.android.live.plugin.proxy.projectscreen;

import android.util.Pair;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import tb.mvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IProjectScreenProxy extends IProxy {
    public static final String KEY = "IProjectScreenProxy";

    Pair<Long, mvb> getProjectScreenDXHandler();

    Class<? extends BaseFrame> getProjectScreenIconFrameClass();

    Class<? extends BaseFrame> getProjectScreenOptFrameClass();

    Class<? extends BaseFrame> getProjectScreenSearchFrameClass();
}
