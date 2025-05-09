package com.taobao.android.live.plugin.proxy.rank;

import android.util.Pair;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import tb.mvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IRankProxy extends IProxy {
    public static final String KEY = "IRankProxy";

    Pair<Long, mvb> getRankEntranceDXHandler();

    Class<? extends BaseFrame> getRankEntranceFrameClass();
}
