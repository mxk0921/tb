package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWVideoScreenType {
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait"),
    LANDSCAPE_FULL_SCREEN("landscape");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    DWVideoScreenType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(DWVideoScreenType dWVideoScreenType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWVideoScreenType");
    }

    public static DWVideoScreenType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType) ipChange.ipc$dispatch("3bb1a022", new Object[]{str});
        }
        return (DWVideoScreenType) Enum.valueOf(DWVideoScreenType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
