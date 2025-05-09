package com.taobao.uikit.gesture.controller;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.api.IGlobalGestureListener;
import com.taobao.uikit.gesture.controller.GestureManager;
import com.taobao.uikit.gesture.model.GestureContext;
import com.taobao.uikit.gesture.model.GestureEvent;
import com.taobao.uikit.gesture.model.GlobalGestureListenerWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureNotifier implements GestureManager.GestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final GestureNotifier NONE = new GestureNotifier();
    private static final String TAG = "GestureNotifier";
    private final List<GlobalGestureListenerWrapper> listenerWrappers;
    public IGlobalGestureListener mChosenListener;
    private GlobalGestureListenersManager mGlobalGestureListenersManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GestureContext mGestureContext;
        private final GestureNotifier mGestureNotifier = new GestureNotifier();

        static {
            t2o.a(933232657);
        }

        public GestureNotifier build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GestureNotifier) ipChange.ipc$dispatch("71c25e44", new Object[]{this});
            }
            if (this.mGestureContext == null) {
                GestureLog.loge(GestureNotifier.TAG, "build, skip build. mGestureContext is null.");
                return GestureNotifier.NONE;
            } else if (GestureNotifier.access$100(this.mGestureNotifier) == null) {
                GestureLog.loge(GestureNotifier.TAG, "build, skip build. mGlobalGestureListenersManager is null.");
                return GestureNotifier.NONE;
            } else {
                for (GlobalGestureListenerWrapper globalGestureListenerWrapper : GestureNotifier.access$100(this.mGestureNotifier).getGlobalListeners()) {
                    if (globalGestureListenerWrapper != null && globalGestureListenerWrapper.filter.matchContext(this.mGestureContext)) {
                        GestureNotifier.access$200(this.mGestureNotifier).add(globalGestureListenerWrapper);
                    }
                }
                boolean isEmpty = GestureNotifier.access$200(this.mGestureNotifier).isEmpty();
                if (isEmpty) {
                    GestureLog.loge(GestureNotifier.TAG, "build, skip build. no listener match context. mGestureContext: " + this.mGestureContext.getActivityName());
                }
                if (isEmpty) {
                    return GestureNotifier.NONE;
                }
                return this.mGestureNotifier;
            }
        }

        public Builder withGestureContext(GestureContext gestureContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4ebfc094", new Object[]{this, gestureContext});
            }
            this.mGestureContext = gestureContext;
            return this;
        }

        public Builder withGlobalGestureListenerManager(GlobalGestureListenersManager globalGestureListenersManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f1ca3cb2", new Object[]{this, globalGestureListenersManager});
            }
            GestureNotifier.access$102(this.mGestureNotifier, globalGestureListenersManager);
            return this;
        }
    }

    static {
        t2o.a(933232655);
        t2o.a(933232654);
    }

    public static /* synthetic */ GlobalGestureListenersManager access$100(GestureNotifier gestureNotifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalGestureListenersManager) ipChange.ipc$dispatch("68fe1971", new Object[]{gestureNotifier});
        }
        return gestureNotifier.mGlobalGestureListenersManager;
    }

    public static /* synthetic */ GlobalGestureListenersManager access$102(GestureNotifier gestureNotifier, GlobalGestureListenersManager globalGestureListenersManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalGestureListenersManager) ipChange.ipc$dispatch("8d66425f", new Object[]{gestureNotifier, globalGestureListenersManager});
        }
        gestureNotifier.mGlobalGestureListenersManager = globalGestureListenersManager;
        return globalGestureListenersManager;
    }

    public static /* synthetic */ List access$200(GestureNotifier gestureNotifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("68e5be81", new Object[]{gestureNotifier});
        }
        return gestureNotifier.listenerWrappers;
    }

    private GestureNotifier() {
        this.listenerWrappers = new ArrayList();
    }

    @Override // com.taobao.uikit.gesture.controller.GestureManager.GestureListener
    public boolean onGesture(GestureEvent gestureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3feb97", new Object[]{this, gestureEvent})).booleanValue();
        }
        int i = gestureEvent.gestureState;
        if (i == 1 || i == 8) {
            Iterator<GlobalGestureListenerWrapper> it = this.listenerWrappers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GlobalGestureListenerWrapper next = it.next();
                if (next.filter.matchGesture(gestureEvent) && next.listener.intercept(gestureEvent)) {
                    GestureLog.loge(TAG, "onGesture, wrapper: " + next);
                    this.mChosenListener = next.listener;
                    break;
                }
            }
        }
        if (this.mChosenListener == null) {
            GestureLog.loge(TAG, "onGesture, mChosenListener is null. skip notify. event: " + gestureEvent);
            return false;
        }
        GestureLog.loge(TAG, "onGesture, start notify. event: " + gestureEvent + " mChosenListener: " + this.mChosenListener);
        this.mChosenListener.onGlobalGestureEvent(gestureEvent);
        int i2 = gestureEvent.gestureState;
        if (i2 == 2 || i2 == 4 || i2 == 8) {
            this.mChosenListener = null;
        }
        return true;
    }
}
