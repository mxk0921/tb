package com.taobao.android.tbelder.jsplugins;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBElderJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_GET_ELDER_FLAGS = "getElderFlags";
    public static final String NAME = "TBElder";

    public static /* synthetic */ Object ipc$super(TBElderJSBridge tBElderJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbelder/jsplugins/TBElderJSBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str == null || !METHOD_GET_ELDER_FLAGS.equals(str)) {
            return false;
        }
        nsw nswVar = new nsw("HY_SUCCESS");
        nswVar.a("isElderHome", Boolean.valueOf(TBElder.c()));
        nswVar.a("isElderFont", Boolean.valueOf(TBElder.b()));
        wVCallBackContext.success(nswVar);
        return true;
    }
}
