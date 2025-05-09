package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWInstanceType {
    GIF("DWGif"),
    VIDEO("DWVideo"),
    PIC("DWPic");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    DWInstanceType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(DWInstanceType dWInstanceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWInstanceType");
    }

    public static DWInstanceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstanceType) ipChange.ipc$dispatch("ecedf544", new Object[]{str});
        }
        return (DWInstanceType) Enum.valueOf(DWInstanceType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
