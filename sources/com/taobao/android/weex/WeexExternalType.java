package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexExternalType {
    PAN("external.pan");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mValue;

    WeexExternalType(String str) {
        this.mValue = str;
    }

    public static /* synthetic */ Object ipc$super(WeexExternalType weexExternalType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexExternalType");
    }

    public static WeexExternalType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalType) ipChange.ipc$dispatch("9d7e61cb", new Object[]{str});
        }
        return (WeexExternalType) Enum.valueOf(WeexExternalType.class, str);
    }

    public String value() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3da9e28", new Object[]{this});
        }
        return this.mValue;
    }
}
