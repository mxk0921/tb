package com.taobao.uikit.feature.callback;

import android.graphics.Rect;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface FocusCallback {
    void afterOnFocusChanged(boolean z, int i, Rect rect);

    void afterOnWindowFocusChanged(boolean z);

    void beforeOnFocusChanged(boolean z, int i, Rect rect);

    void beforeOnWindowFocusChanged(boolean z);
}
