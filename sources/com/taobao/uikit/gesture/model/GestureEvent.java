package com.taobao.uikit.gesture.model;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GestureContext context;
    public MotionEvent event;
    public int gestureState;
    public int gestureType;

    static {
        t2o.a(933232670);
    }

    public void bindContext(GestureContext gestureContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1b6dd6", new Object[]{this, gestureContext});
        } else {
            this.context = gestureContext;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GestureEvent{context=" + this.context + ", event=" + this.event + ", gestureType=" + this.gestureType + ", gestureState=" + this.gestureState + '}';
    }
}
