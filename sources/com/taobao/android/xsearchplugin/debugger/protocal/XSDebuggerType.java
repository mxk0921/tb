package com.taobao.android.xsearchplugin.debugger.protocal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum XSDebuggerType {
    CLICK,
    SWITCH,
    CLICK_SWITCH,
    CUSTOM;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(XSDebuggerType xSDebuggerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/debugger/protocal/XSDebuggerType");
    }

    public static XSDebuggerType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSDebuggerType) ipChange.ipc$dispatch("f563756a", new Object[]{str});
        }
        return (XSDebuggerType) Enum.valueOf(XSDebuggerType.class, str);
    }
}
