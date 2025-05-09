package com.taobao.weex.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WXImageSharpen {
    UNSHARPEN,
    SHARPEN;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXImageSharpen wXImageSharpen, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXImageSharpen");
    }

    public static WXImageSharpen valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXImageSharpen) ipChange.ipc$dispatch("689f31a8", new Object[]{str});
        }
        return (WXImageSharpen) Enum.valueOf(WXImageSharpen.class, str);
    }
}
