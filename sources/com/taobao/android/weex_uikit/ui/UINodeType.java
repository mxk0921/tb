package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum UINodeType {
    VIEW,
    DRAWABLE,
    LAYOUT,
    NONE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UINodeType uINodeType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeType");
    }

    public static UINodeType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("6ba71957", new Object[]{str});
        }
        return (UINodeType) Enum.valueOf(UINodeType.class, str);
    }
}
