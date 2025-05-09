package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MediaPlayScreenType {
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait"),
    LANDSCAPE_FULL_SCREEN("landscape");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    MediaPlayScreenType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(MediaPlayScreenType mediaPlayScreenType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaPlayScreenType");
    }

    public static MediaPlayScreenType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayScreenType) ipChange.ipc$dispatch("8f9957b8", new Object[]{str});
        }
        return (MediaPlayScreenType) Enum.valueOf(MediaPlayScreenType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
