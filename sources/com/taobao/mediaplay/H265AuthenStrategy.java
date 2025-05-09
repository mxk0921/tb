package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum H265AuthenStrategy {
    WHITLIST("h265WhiteList"),
    BLACKLIST("h265BlackList");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    H265AuthenStrategy(String str) {
        this.value = "h265BlackList";
        if (str != null) {
            this.value = str;
        }
    }

    public static /* synthetic */ Object ipc$super(H265AuthenStrategy h265AuthenStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/H265AuthenStrategy");
    }

    public static H265AuthenStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H265AuthenStrategy) ipChange.ipc$dispatch("a6eef553", new Object[]{str});
        }
        return (H265AuthenStrategy) Enum.valueOf(H265AuthenStrategy.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
