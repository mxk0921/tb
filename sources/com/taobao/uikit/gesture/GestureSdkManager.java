package com.taobao.uikit.gesture;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.adapter.GestureActivityLifecycleCallbacks;
import com.taobao.uikit.gesture.api.IGlobalGestureListener;
import com.taobao.uikit.gesture.controller.GestureContextManager;
import com.taobao.uikit.gesture.controller.GlobalGestureListenersManager;
import com.taobao.uikit.gesture.controller.SwitchManager;
import com.taobao.uikit.gesture.model.GestureFilter;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureSdkManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "uikit_gesture.GestureSdkManager";
    private final GestureContextManager mGestureContextManager;
    private final GlobalGestureListenersManager mGlobalGestureListenersManager;
    private final SwitchManager mSwitchManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Holder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final GestureSdkManager INSTANCE = new GestureSdkManager();

        static {
            t2o.a(933232645);
        }

        private Holder() {
        }

        public static /* synthetic */ GestureSdkManager access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GestureSdkManager) ipChange.ipc$dispatch("c3ae6757", new Object[0]);
            }
            return INSTANCE;
        }
    }

    static {
        t2o.a(933232643);
    }

    public static GestureSdkManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureSdkManager) ipChange.ipc$dispatch("952d9cbd", new Object[0]);
        }
        return Holder.access$100();
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (this.mSwitchManager.isGestureSwitchOn()) {
            application.registerActivityLifecycleCallbacks(new GestureActivityLifecycleCallbacks(this.mGestureContextManager, this.mGlobalGestureListenersManager));
        }
    }

    public void initSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9eeb3d", new Object[]{this, context});
        } else {
            this.mSwitchManager.init(context);
        }
    }

    public boolean isGestureSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efbc99d", new Object[]{this})).booleanValue();
        }
        return this.mSwitchManager.isGestureSwitchOn();
    }

    public void registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, GestureFilter gestureFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c664751", new Object[]{this, iGlobalGestureListener, gestureFilter});
        } else {
            this.mGlobalGestureListenersManager.registerGlobalGestureListener(iGlobalGestureListener, gestureFilter);
        }
    }

    public boolean unregisterGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200bfe54", new Object[]{this, iGlobalGestureListener})).booleanValue();
        }
        return this.mGlobalGestureListenersManager.unregisterGlobalGestureListener(iGlobalGestureListener);
    }

    private GestureSdkManager() {
        this.mGestureContextManager = new GestureContextManager();
        SwitchManager switchManager = new SwitchManager();
        this.mSwitchManager = switchManager;
        GlobalGestureListenersManager globalGestureListenersManager = new GlobalGestureListenersManager();
        this.mGlobalGestureListenersManager = globalGestureListenersManager;
        switchManager.addConfigChangeListener(globalGestureListenersManager);
    }

    public boolean registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, List<GestureFilter> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3205df6c", new Object[]{this, iGlobalGestureListener, list})).booleanValue() : this.mGlobalGestureListenersManager.registerGlobalGestureListener(iGlobalGestureListener, list);
    }
}
