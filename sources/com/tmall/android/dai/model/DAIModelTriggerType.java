package com.tmall.android.dai.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum DAIModelTriggerType {
    Ut,
    After,
    Timing,
    CEP,
    Stream;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DAIModelTriggerType dAIModelTriggerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/model/DAIModelTriggerType");
    }

    public static DAIModelTriggerType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIModelTriggerType) ipChange.ipc$dispatch("83ce733", new Object[]{str});
        }
        return (DAIModelTriggerType) Enum.valueOf(DAIModelTriggerType.class, str);
    }
}
