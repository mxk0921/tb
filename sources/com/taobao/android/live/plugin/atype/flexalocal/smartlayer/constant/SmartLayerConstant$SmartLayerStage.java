package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum SmartLayerConstant$SmartLayerStage {
    SMART_INIT("SMART_INIT"),
    SMART_TRIGGER("SMART_TRIGGER"),
    SMART_DATA_LOAD("SMART_DATA_LOAD"),
    SMART_VALID("SMART_VALID"),
    SMART_LOAD_CONTENT("SMART_LOAD_CONTENT"),
    SMART_DISPLAY("SMART_DISPLAY"),
    SMART_SHOW("SMART_SHOW"),
    SMART_CONTEXT_UPDATE("SMART_CONTEXT_UPDATE"),
    SMART_PROCESS("SMART_PROCESS"),
    SMART_TEMPLATE("SMART_TEMPLATE"),
    SMART_CLOSE("SMART_CLOSE"),
    SMART_ERROR_CLOSE("SMART_ERROR_CLOSE"),
    SMART_JUMP("SMART_JUMP"),
    SMART_AWARD("SMART_AWARD"),
    SMART_LOAD_MORE("LOAD_MORE"),
    SMART_AWARD_SUCCESS("SMART_AWARD_SUCCESS");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String stage;

    SmartLayerConstant$SmartLayerStage(String str) {
        this.stage = str;
    }

    public static /* synthetic */ Object ipc$super(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/constant/SmartLayerConstant$SmartLayerStage");
    }

    public static SmartLayerConstant$SmartLayerStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLayerConstant$SmartLayerStage) ipChange.ipc$dispatch("80229cde", new Object[]{str});
        }
        return (SmartLayerConstant$SmartLayerStage) Enum.valueOf(SmartLayerConstant$SmartLayerStage.class, str);
    }
}
