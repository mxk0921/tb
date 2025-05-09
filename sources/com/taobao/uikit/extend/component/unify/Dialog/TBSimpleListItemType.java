package com.taobao.uikit.extend.component.unify.Dialog;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TBSimpleListItemType {
    NORMAL,
    ALERT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBSimpleListItemType tBSimpleListItemType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/TBSimpleListItemType");
    }

    public static TBSimpleListItemType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSimpleListItemType) ipChange.ipc$dispatch("fd22be2b", new Object[]{str});
        }
        return (TBSimpleListItemType) Enum.valueOf(TBSimpleListItemType.class, str);
    }
}
