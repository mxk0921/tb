package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MediaType {
    GIF("DWGif"),
    VIDEO("Video"),
    LIVE("TBLive"),
    PIC("Pic");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    MediaType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(MediaType mediaType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaType");
    }

    public static MediaType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaType) ipChange.ipc$dispatch("873c0158", new Object[]{str});
        }
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
