package com.taobao.zcache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum Environment {
    Debug(0),
    Daily(1),
    Release(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int value;

    Environment(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(Environment environment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/Environment");
    }

    public static Environment valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Environment) ipChange.ipc$dispatch("fd60766b", new Object[]{str});
        }
        return (Environment) Enum.valueOf(Environment.class, str);
    }
}
