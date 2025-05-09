package com.taobao.android.artry.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum ARType {
    MAKEUP_WANMEI;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ARType aRType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/constants/ARType");
    }

    public static ARType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARType) ipChange.ipc$dispatch("5fbedfa7", new Object[]{str});
        }
        return (ARType) Enum.valueOf(ARType.class, str);
    }
}
