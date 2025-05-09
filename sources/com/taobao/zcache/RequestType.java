package com.taobao.zcache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum RequestType {
    Normal(0),
    UniApp(1),
    Weex(2),
    Web(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int value;

    RequestType(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(RequestType requestType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/RequestType");
    }

    public static RequestType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("e9311cd5", new Object[]{str});
        }
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }
}
