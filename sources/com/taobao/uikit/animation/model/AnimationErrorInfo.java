package com.taobao.uikit.animation.model;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AnimationErrorInfo {
    public static final int ERROR_ANIMATION_NOT_STARTED = 3;
    public static final int ERROR_BACKGROUND_DRAW_FAILED = 2;
    public static final int ERROR_CONTENT_NOT_LOADED = 1;
    public static final int ERROR_UNKNOWN = -1;
    public int errorCode;
    public String errorMsg;

    static {
        t2o.a(929038344);
    }

    public AnimationErrorInfo(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}
