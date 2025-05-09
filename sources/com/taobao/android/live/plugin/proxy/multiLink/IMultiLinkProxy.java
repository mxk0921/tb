package com.taobao.android.live.plugin.proxy.multiLink;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMultiLinkProxy extends IBTypeProxy {
    public static final String KEY = "IMultiLinkProxy";

    BaseFrame getMultiLinkFrame(Context context, ux9 ux9Var);

    Class<? extends BaseFrame> getMultiLinkFrameClass();
}
