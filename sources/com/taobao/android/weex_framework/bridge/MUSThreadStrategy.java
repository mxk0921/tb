package com.taobao.android.weex_framework.bridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum MUSThreadStrategy {
    CURRENT,
    UI,
    JS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MUSThreadStrategy mUSThreadStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/bridge/MUSThreadStrategy");
    }

    public static MUSThreadStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSThreadStrategy) ipChange.ipc$dispatch("5fe3320e", new Object[]{str});
        }
        return (MUSThreadStrategy) Enum.valueOf(MUSThreadStrategy.class, str);
    }
}
