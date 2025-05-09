package com.alibaba.security.realidentity;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b4 extends a4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public b4(c4 c4Var) {
        super(c4Var);
    }

    public static /* synthetic */ Object ipc$super(b4 b4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/b4");
    }

    @Override // com.alibaba.security.realidentity.a4
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return null;
    }

    public Pair<Boolean, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[]{this});
        }
        return new Pair<>(Boolean.TRUE, "");
    }
}
