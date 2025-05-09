package com.alipay.android.msp.drivers.actions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ActionTypes {
    COMMAND,
    NET_REQUEST,
    NET_RESPONSE,
    NET_RETRY,
    UI_START,
    UI_SHOW,
    EXIT,
    EXCEPTION;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ActionTypes actionTypes, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/ActionTypes");
    }

    public static ActionTypes valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionTypes) ipChange.ipc$dispatch("288b7c7b", new Object[]{str});
        }
        return (ActionTypes) Enum.valueOf(ActionTypes.class, str);
    }
}
