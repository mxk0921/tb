package com.taobao.android.detail2.core.framework.base.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum ContainerError {
    WEEX_URL_EMPTY,
    WEEX_URL_INCONSISTENT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ContainerError containerError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/ContainerError");
    }

    public static ContainerError valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerError) ipChange.ipc$dispatch("8a892935", new Object[]{str});
        }
        return (ContainerError) Enum.valueOf(ContainerError.class, str);
    }
}
