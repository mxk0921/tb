package com.ali.user.open.core.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum WebViewOption {
    SYSTEM,
    UC;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WebViewOption webViewOption, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/config/WebViewOption");
    }

    public static WebViewOption valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebViewOption) ipChange.ipc$dispatch("dee3ac99", new Object[]{str});
        }
        return (WebViewOption) Enum.valueOf(WebViewOption.class, str);
    }
}
