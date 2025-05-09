package com.taobao.uikit.gesture.controller;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.adapter.GestureWindowCallbackDelegate;
import com.taobao.uikit.gesture.model.GestureContext;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MotionEventsManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GestureContext mGestureContext;
    private final List<MotionEvent> mEvents = new ArrayList();
    private boolean mIsStarted = false;

    static {
        t2o.a(933232661);
    }

    public MotionEventsManager(GestureContext gestureContext) {
        this.mGestureContext = gestureContext;
    }

    public void dispatchEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a8813a", new Object[]{this});
            return;
        }
        this.mIsStarted = false;
        Activity activity = this.mGestureContext.getActivity();
        if (activity == null) {
            this.mEvents.clear();
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.mEvents.clear();
            return;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            this.mEvents.clear();
            return;
        }
        Object tag = peekDecorView.getTag(R.id.uik_gesture_window_callback);
        if (!(tag instanceof GestureWindowCallbackDelegate)) {
            this.mEvents.clear();
            return;
        }
        GestureWindowCallbackDelegate gestureWindowCallbackDelegate = (GestureWindowCallbackDelegate) tag;
        for (MotionEvent motionEvent : this.mEvents) {
            gestureWindowCallbackDelegate.dispatchTouchEventWithoutManager(motionEvent);
            motionEvent.recycle();
            GestureLog.loge("MotionEventsManager", "dispatchEvents, event:" + motionEvent);
        }
        this.mEvents.clear();
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
        } else if (this.mIsStarted) {
            if (this.mEvents.size() > 100) {
                stop();
                GestureLog.loge("MotionEventsManager", "mEvents.size() > 100");
            } else if (motionEvent.getActionMasked() != 3) {
                this.mEvents.add(MotionEvent.obtain(motionEvent));
            }
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.mEvents.clear();
        this.mIsStarted = true;
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.mIsStarted) {
            this.mIsStarted = false;
            this.mEvents.clear();
        }
    }
}
