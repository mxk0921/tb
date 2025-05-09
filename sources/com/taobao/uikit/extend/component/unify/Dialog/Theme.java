package com.taobao.uikit.extend.component.unify.Dialog;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum Theme {
    LIGHT,
    DARK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Theme theme, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/Theme");
    }

    public static Theme valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Theme) ipChange.ipc$dispatch("b1446af7", new Object[]{str});
        }
        return (Theme) Enum.valueOf(Theme.class, str);
    }
}
