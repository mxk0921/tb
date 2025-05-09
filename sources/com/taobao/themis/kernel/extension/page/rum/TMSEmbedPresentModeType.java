package com.taobao.themis.kernel.extension.page.rum;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMSEmbedPresentModeType {
    PAGE,
    POP,
    CARD;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TMSEmbedPresentModeType tMSEmbedPresentModeType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/rum/TMSEmbedPresentModeType");
    }

    public static TMSEmbedPresentModeType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbedPresentModeType) ipChange.ipc$dispatch("e38e7e8a", new Object[]{str});
        }
        return (TMSEmbedPresentModeType) Enum.valueOf(TMSEmbedPresentModeType.class, str);
    }
}
