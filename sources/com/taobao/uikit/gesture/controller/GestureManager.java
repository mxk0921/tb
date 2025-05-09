package com.taobao.uikit.gesture.controller;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.controller.GestureNotifier;
import com.taobao.uikit.gesture.controller.GestureProcessor;
import com.taobao.uikit.gesture.model.GestureContext;
import com.taobao.uikit.gesture.model.GestureEvent;
import com.taobao.uikit.gesture.processor.IGestureProcessor;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GestureContext mGestureContext;
    private final GestureListener mGestureListener;
    private final List<IGestureProcessor> mGestureProcessors;
    private final MotionEventsManager mMotionEventsManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GestureContext mGestureContext;
        private GlobalGestureListenersManager mGlobalGestureListenersManager;

        static {
            t2o.a(933232653);
        }

        public GestureManager build() {
            GestureNotifier build;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GestureManager) ipChange.ipc$dispatch("93bf695f", new Object[]{this});
            }
            List<IGestureProcessor> build2 = new GestureProcessor.Builder().withGlobalGestureListenerManager(this.mGlobalGestureListenersManager).withGestureContext(this.mGestureContext).build();
            if (build2 == null || build2.isEmpty() || (build = new GestureNotifier.Builder().withGlobalGestureListenerManager(this.mGlobalGestureListenersManager).withGestureContext(this.mGestureContext).build()) == GestureNotifier.NONE) {
                return null;
            }
            return new GestureManager(build, build2, this.mGestureContext);
        }

        public Builder withGestureContext(GestureContext gestureContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("89b0d41", new Object[]{this, gestureContext});
            }
            this.mGestureContext = gestureContext;
            return this;
        }

        public Builder withGlobalGestureListenerManager(GlobalGestureListenersManager globalGestureListenersManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1e619563", new Object[]{this, globalGestureListenersManager});
            }
            this.mGlobalGestureListenersManager = globalGestureListenersManager;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface GestureListener {
        boolean onGesture(GestureEvent gestureEvent);
    }

    static {
        t2o.a(933232651);
    }

    private MotionEvent onProcess(IGestureProcessor iGestureProcessor, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("8c10ebff", new Object[]{this, iGestureProcessor, motionEvent});
        }
        GestureEvent onProcess = iGestureProcessor.onProcess(motionEvent);
        if (onProcess != null) {
            onProcess.bindContext(this.mGestureContext);
            iGestureProcessor.onIntercept(onGesture(onProcess));
        }
        if (iGestureProcessor.shouldBlock(motionEvent)) {
            motionEvent.setAction(3);
        }
        return motionEvent;
    }

    public boolean onGesture(GestureEvent gestureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3feb97", new Object[]{this, gestureEvent})).booleanValue();
        }
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener == null) {
            return false;
        }
        return gestureListener.onGesture(gestureEvent);
    }

    public MotionEvent onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("7e2c0535", new Object[]{this, motionEvent});
        }
        MotionEvent motionEvent2 = motionEvent;
        for (IGestureProcessor iGestureProcessor : this.mGestureProcessors) {
            motionEvent2 = onProcess(iGestureProcessor, motionEvent);
        }
        return motionEvent2;
    }

    private GestureManager(GestureListener gestureListener, List<IGestureProcessor> list, GestureContext gestureContext) {
        this.mGestureListener = gestureListener;
        this.mGestureProcessors = list;
        this.mGestureContext = gestureContext;
        this.mMotionEventsManager = new MotionEventsManager(gestureContext);
        for (IGestureProcessor iGestureProcessor : list) {
            iGestureProcessor.setMotionEventsManager(this.mMotionEventsManager);
        }
    }
}
