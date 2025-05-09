package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNChannelOrder {
    PIXEL_RGBA2BGR(0),
    PIXEL_RGBA2RGB(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNChannelOrder(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNChannelOrder aliNNChannelOrder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNChannelOrder");
    }

    public static AliNNChannelOrder valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNChannelOrder) ipChange.ipc$dispatch("b7e2ecf", new Object[]{str});
        }
        return (AliNNChannelOrder) Enum.valueOf(AliNNChannelOrder.class, str);
    }
}
