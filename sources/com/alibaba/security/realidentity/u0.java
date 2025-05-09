package com.alibaba.security.realidentity;

import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public u0(t0 t0Var) {
        super(t0Var);
    }

    public static /* synthetic */ Object ipc$super(u0 u0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/u0");
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        return true;
    }
}
