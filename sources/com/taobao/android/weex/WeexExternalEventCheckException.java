package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexExternalEventCheckException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;

    static {
        t2o.a(982515744);
    }

    public WeexExternalEventCheckException() {
    }

    public static WeexExternalEventCheckException fromState(boolean z, WeexExternalEventType weexExternalEventType) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalEventCheckException) ipChange.ipc$dispatch("74fde845", new Object[]{new Boolean(z), weexExternalEventType});
        }
        StringBuilder sb = new StringBuilder("weex external event check error, ");
        if (z) {
            str = "start";
        } else {
            str = "!start";
        }
        sb.append(str);
        sb.append(" to ");
        sb.append(weexExternalEventType.name());
        return new WeexExternalEventCheckException(sb.toString());
    }

    public static /* synthetic */ Object ipc$super(WeexExternalEventCheckException weexExternalEventCheckException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexExternalEventCheckException");
    }

    public WeexExternalEventCheckException(String str) {
        super(str);
    }
}
