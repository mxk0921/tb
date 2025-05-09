package com.taobao.uikit.gesture.api;

import com.taobao.uikit.gesture.model.GestureEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IGlobalGestureListener {
    String getBizName();

    boolean intercept(GestureEvent gestureEvent);

    void onGlobalGestureEvent(GestureEvent gestureEvent);
}
