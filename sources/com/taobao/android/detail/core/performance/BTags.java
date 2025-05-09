package com.taobao.android.detail.core.performance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum BTags {
    XLightOff("[XLightOff]");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String tagName;

    BTags(String str) {
        this.tagName = str;
    }

    public static /* synthetic */ Object ipc$super(BTags bTags, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/performance/BTags");
    }

    public static BTags valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BTags) ipChange.ipc$dispatch("18f1bf55", new Object[]{str});
        }
        return (BTags) Enum.valueOf(BTags.class, str);
    }
}
