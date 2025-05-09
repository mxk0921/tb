package com.taobao.uikit.animation.api;

import com.taobao.uikit.animation.model.AnimationErrorInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface AnimationStageListener {
    void onBackgroundDraw();

    void onCreate();

    void onDestroy();

    void onError(AnimationErrorInfo animationErrorInfo);

    void onFirstFrame();

    void onStart();

    void onStop();
}
