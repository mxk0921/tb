package com.taobao.uikit.gesture.controller;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.model.GestureContext;
import com.taobao.uikit.gesture.model.GlobalGestureListenerWrapper;
import com.taobao.uikit.gesture.processor.DoubleFingerDoubleTapProcessor;
import com.taobao.uikit.gesture.processor.IGestureProcessor;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureProcessor {
    private static final String TAG = "GestureProcessor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GestureContext mGestureContext;
        private GlobalGestureListenersManager mGlobalGestureListenersManager;

        static {
            t2o.a(933232659);
        }

        public List<IGestureProcessor> build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f80065b2", new Object[]{this});
            }
            GestureContext gestureContext = this.mGestureContext;
            if (gestureContext == null || this.mGlobalGestureListenersManager == null) {
                GestureLog.loge(GestureProcessor.TAG, "skip build. mGestureContext or mGlobalGestureListenersManager is null");
                return null;
            }
            String activityName = gestureContext.getActivityName();
            if (TextUtils.isEmpty(activityName)) {
                GestureLog.loge(GestureProcessor.TAG, "skip build. activityName is empty");
                return null;
            }
            List<GlobalGestureListenerWrapper> list = this.mGlobalGestureListenersManager.getGlobalFilters().get(activityName);
            if (list == null) {
                GestureLog.loge(GestureProcessor.TAG, "skip build. activity is not in white list. activityName: " + activityName);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (GlobalGestureListenerWrapper globalGestureListenerWrapper : list) {
                int i = globalGestureListenerWrapper.filter.mGestureType;
                if (i != -1) {
                    if (i != 32) {
                        GestureLog.loge(GestureProcessor.TAG, "skip build. unsupported gesture type. gestureType: " + globalGestureListenerWrapper.filter.mGestureType);
                    } else {
                        arrayList.add(new DoubleFingerDoubleTapProcessor());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            GestureLog.loge(GestureProcessor.TAG, "skip build. no supported gesture processor. activityName: " + activityName);
            return null;
        }

        public Builder withGestureContext(GestureContext gestureContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7041277c", new Object[]{this, gestureContext});
            }
            this.mGestureContext = gestureContext;
            return this;
        }

        public Builder withGlobalGestureListenerManager(GlobalGestureListenersManager globalGestureListenersManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2e862f1e", new Object[]{this, globalGestureListenersManager});
            }
            this.mGlobalGestureListenersManager = globalGestureListenersManager;
            return this;
        }
    }

    static {
        t2o.a(933232658);
    }
}
