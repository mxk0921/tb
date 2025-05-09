package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum SmartLayerConstant$SmartLayerState {
    INITIAL(0),
    LOAD_CONTENT(1),
    READY(2),
    READY_INACTIVE(3),
    ERROR_CLOSE(4),
    SHOWING(5),
    BACKGROUND(6),
    CLOSED(7);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int layerState;

    SmartLayerConstant$SmartLayerState(int i) {
        this.layerState = i;
    }

    public static /* synthetic */ Object ipc$super(SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/constant/SmartLayerConstant$SmartLayerState");
    }

    public static SmartLayerConstant$SmartLayerState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLayerConstant$SmartLayerState) ipChange.ipc$dispatch("8022cdab", new Object[]{str});
        }
        return (SmartLayerConstant$SmartLayerState) Enum.valueOf(SmartLayerConstant$SmartLayerState.class, str);
    }
}
