package com.taobao.weex.ui.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WXTextDecoration {
    INVALID,
    NONE,
    UNDERLINE,
    LINETHROUGH;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXTextDecoration wXTextDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXTextDecoration");
    }

    public static WXTextDecoration valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXTextDecoration) ipChange.ipc$dispatch("ab52419a", new Object[]{str});
        }
        return (WXTextDecoration) Enum.valueOf(WXTextDecoration.class, str);
    }
}
