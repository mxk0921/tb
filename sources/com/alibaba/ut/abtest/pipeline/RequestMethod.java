package com.alibaba.ut.abtest.pipeline;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum RequestMethod {
    GET,
    POST;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RequestMethod requestMethod, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/pipeline/RequestMethod");
    }

    public static RequestMethod valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestMethod) ipChange.ipc$dispatch("3f1ad45c", new Object[]{str});
        }
        return (RequestMethod) Enum.valueOf(RequestMethod.class, str);
    }
}
