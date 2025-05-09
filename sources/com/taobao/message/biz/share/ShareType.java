package com.taobao.message.biz.share;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum ShareType {
    GOODS(0);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int value;

    ShareType(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(ShareType shareType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/biz/share/ShareType");
    }

    public static ShareType valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareType) ipChange.ipc$dispatch("886a439a", new Object[]{str}) : (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }

    public static ShareType valueOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareType) ipChange.ipc$dispatch("ff9519bf", new Object[]{new Integer(i)});
        }
        if (i != 0) {
            return GOODS;
        }
        return GOODS;
    }
}
