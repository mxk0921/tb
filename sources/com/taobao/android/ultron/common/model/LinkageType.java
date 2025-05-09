package com.taobao.android.ultron.common.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum LinkageType {
    REQUEST,
    REFRESH;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LinkageType linkageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/common/model/LinkageType");
    }

    public static LinkageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkageType) ipChange.ipc$dispatch("68f100cf", new Object[]{str});
        }
        return (LinkageType) Enum.valueOf(LinkageType.class, str);
    }
}
