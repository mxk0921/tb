package com.taobao.android.detail.ttdetail.minivideo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum MiniVideoType {
    INDEPENDENT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MiniVideoType miniVideoType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/minivideo/MiniVideoType");
    }

    public static MiniVideoType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniVideoType) ipChange.ipc$dispatch("2837d4c", new Object[]{str});
        }
        return (MiniVideoType) Enum.valueOf(MiniVideoType.class, str);
    }
}
