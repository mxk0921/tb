package com.taobao.uikit.gesture.adapter;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.controller.GestureContextManager;
import com.taobao.uikit.gesture.controller.GestureManager;
import com.taobao.uikit.gesture.controller.GlobalGestureListenersManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GestureActivityLifecycleCallbacks";
    private final GestureContextManager mGestureContextManager;
    private final GlobalGestureListenersManager mGlobalGestureListenersManager;

    static {
        t2o.a(933232646);
    }

    public GestureActivityLifecycleCallbacks(GestureContextManager gestureContextManager, GlobalGestureListenersManager globalGestureListenersManager) {
        this.mGestureContextManager = gestureContextManager;
        this.mGlobalGestureListenersManager = globalGestureListenersManager;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            this.mGestureContextManager.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            this.mGestureContextManager.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            GestureLog.loge(TAG, "onActivityResumed, " + activity + " window is null. skip delegate window callback");
            return;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            int i = R.id.uik_gesture_window_callback;
            if (!(peekDecorView.getTag(i) instanceof GestureWindowCallbackDelegate)) {
                Window.Callback callback = window.getCallback();
                GestureManager build = new GestureManager.Builder().withGlobalGestureListenerManager(this.mGlobalGestureListenersManager).withGestureContext(this.mGestureContextManager.getGestureContext(activity)).build();
                if (build != null) {
                    GestureWindowCallbackDelegate gestureWindowCallbackDelegate = new GestureWindowCallbackDelegate(callback, build);
                    window.setCallback(gestureWindowCallbackDelegate);
                    peekDecorView.setTag(i, gestureWindowCallbackDelegate);
                    GestureLog.loge(TAG, "onActivityResumed, delegate window callback. activityName:" + activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }
}
