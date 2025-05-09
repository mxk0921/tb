package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum H264AuthenStrategy {
    WHITLIST("h264WhiteList"),
    BLACKLIST("h264BlackList");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    H264AuthenStrategy(String str) {
        this.value = "h264BlackList";
        if (str != null) {
            this.value = str;
        }
    }

    public static /* synthetic */ Object ipc$super(H264AuthenStrategy h264AuthenStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/H264AuthenStrategy");
    }

    public static H264AuthenStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H264AuthenStrategy) ipChange.ipc$dispatch("c55d1774", new Object[]{str});
        }
        return (H264AuthenStrategy) Enum.valueOf(H264AuthenStrategy.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
