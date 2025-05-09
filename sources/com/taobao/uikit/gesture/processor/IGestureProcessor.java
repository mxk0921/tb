package com.taobao.uikit.gesture.processor;

import android.view.MotionEvent;
import com.taobao.uikit.gesture.controller.MotionEventsManager;
import com.taobao.uikit.gesture.model.GestureEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IGestureProcessor {
    void onIntercept(boolean z);

    GestureEvent onProcess(MotionEvent motionEvent);

    void setMotionEventsManager(MotionEventsManager motionEventsManager);

    boolean shouldBlock(MotionEvent motionEvent);
}
