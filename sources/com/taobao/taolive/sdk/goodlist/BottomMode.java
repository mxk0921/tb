package com.taobao.taolive.sdk.goodlist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum BottomMode {
    ADDCART("ADDCART"),
    BUYNOW("BUYNOW"),
    CONFIRM("CONFIRM"),
    ADDCART_AND_BUYNOW("ADDCART_AND_BUYNOW");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mValue;

    BottomMode(String str) {
        this.mValue = str;
    }

    public static BottomMode getBottomMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMode) ipChange.ipc$dispatch("d877b7", new Object[]{str});
        }
        BottomMode bottomMode = ADDCART;
        if (bottomMode.mValue.equalsIgnoreCase(str)) {
            return bottomMode;
        }
        BottomMode bottomMode2 = BUYNOW;
        if (bottomMode2.mValue.equalsIgnoreCase(str)) {
            return bottomMode2;
        }
        BottomMode bottomMode3 = CONFIRM;
        if (bottomMode3.mValue.equalsIgnoreCase(str)) {
            return bottomMode3;
        }
        BottomMode bottomMode4 = ADDCART_AND_BUYNOW;
        if (bottomMode4.mValue.equalsIgnoreCase(str)) {
            return bottomMode4;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(BottomMode bottomMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/goodlist/BottomMode");
    }

    public static BottomMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMode) ipChange.ipc$dispatch("d249f73", new Object[]{str});
        }
        return (BottomMode) Enum.valueOf(BottomMode.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.mValue;
    }
}
