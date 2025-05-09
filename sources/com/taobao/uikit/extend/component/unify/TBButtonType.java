package com.taobao.uikit.extend.component.unify;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TBButtonType {
    NORMAL,
    SECONDARY,
    ALERT,
    DISABLED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBButtonType tBButtonType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/TBButtonType");
    }

    public static TBButtonType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBButtonType) ipChange.ipc$dispatch("8ce9859f", new Object[]{str});
        }
        return (TBButtonType) Enum.valueOf(TBButtonType.class, str);
    }
}
