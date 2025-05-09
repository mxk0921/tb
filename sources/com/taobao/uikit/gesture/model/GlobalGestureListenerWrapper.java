package com.taobao.uikit.gesture.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.api.IGlobalGestureListener;
import com.taobao.uikit.gesture.controller.SwitchManager;
import com.taobao.uikit.gesture.model.GestureFilter;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalGestureListenerWrapper implements SwitchManager.IConfigChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final GestureFilter DEFAULT_FILTER = new GestureFilter.Builder().setGestureType(-1).setActivityName("").build();
    public GestureFilter filter;
    public IGlobalGestureListener listener;
    private GestureFilter mOriginalFilter;

    static {
        t2o.a(933232674);
        t2o.a(933232665);
    }

    public GestureFilter getOriginalFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureFilter) ipChange.ipc$dispatch("db23a68a", new Object[]{this});
        }
        return this.mOriginalFilter;
    }

    @Override // com.taobao.uikit.gesture.controller.SwitchManager.IConfigChangeListener
    public void onBlackListChange(List<SwitchManager.GestureConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf316be6", new Object[]{this, list});
        } else if (this.listener != null && this.mOriginalFilter != null && list != null && !list.isEmpty()) {
            for (SwitchManager.GestureConfig gestureConfig : list) {
                if (gestureConfig.activityName.equals(this.mOriginalFilter.mActivityName)) {
                    int i = gestureConfig.gestureTypes;
                    if (i == 1) {
                        this.filter = DEFAULT_FILTER;
                        return;
                    }
                    int i2 = this.mOriginalFilter.mGestureType;
                    if ((i & i2) == i2) {
                        this.filter = DEFAULT_FILTER;
                        return;
                    }
                }
            }
            this.filter = this.mOriginalFilter;
        }
    }

    public void setFilter(GestureFilter gestureFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2902df5b", new Object[]{this, gestureFilter});
            return;
        }
        this.filter = gestureFilter;
        this.mOriginalFilter = gestureFilter;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GlobalGestureListenerWrapper{listener=" + this.listener + ", filter=" + this.filter + '}';
    }
}
