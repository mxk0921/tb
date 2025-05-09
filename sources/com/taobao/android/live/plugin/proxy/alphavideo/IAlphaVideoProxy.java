package com.taobao.android.live.plugin.proxy.alphavideo;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.room.adapter.alphavideo.a;
import tb.hyb;
import tb.r9d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IAlphaVideoProxy extends IBTypeProxy {
    public static final String KEY = "IAlphaVideoProxy";
    public static final String KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME = "FavorEffectFrame";

    hyb createDataSource();

    r9d createGLTextureViewPlayerController(Context context, LifecycleOwner lifecycleOwner, a.b bVar);

    Class<? extends BaseFrame> getFrameClassMap(String str);
}
