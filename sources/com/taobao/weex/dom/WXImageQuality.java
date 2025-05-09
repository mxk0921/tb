package com.taobao.weex.dom;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WXImageQuality {
    ORIGINAL,
    LOW,
    NORMAL,
    HIGH,
    AUTO;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXImageQuality wXImageQuality, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/dom/WXImageQuality");
    }

    public static WXImageQuality valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXImageQuality) ipChange.ipc$dispatch("59da4d7f", new Object[]{str});
        }
        return (WXImageQuality) Enum.valueOf(WXImageQuality.class, str);
    }
}
