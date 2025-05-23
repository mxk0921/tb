package com.taobao.android.live.plugin.proxy.voiceroom;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IVoiceRoomProxy extends IBTypeProxy {
    public static final String KEY = "IVoiceRoomProxy";

    BaseFrame getVoiceRoomFrame(Context context, ux9 ux9Var);

    Class<? extends BaseFrame> getVoiceRoomFrameClass();
}
