package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWVideoScreenType2 {
    LANDSCAPE_FULL_SCREEN_90("landscape90"),
    LANDSCAPE_FULL_SCREEN_270("landscape270"),
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    DWVideoScreenType2(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(DWVideoScreenType2 dWVideoScreenType2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWVideoScreenType2");
    }

    public static DWVideoScreenType2 valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("3a826342", new Object[]{str});
        }
        return (DWVideoScreenType2) Enum.valueOf(DWVideoScreenType2.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
