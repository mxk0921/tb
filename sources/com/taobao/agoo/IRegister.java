package com.taobao.agoo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class IRegister extends ICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933280);
    }

    public static /* synthetic */ Object ipc$super(IRegister iRegister, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/IRegister");
    }

    @Override // com.taobao.agoo.ICallback
    public abstract void onFailure(String str, String str2);

    @Override // com.taobao.agoo.ICallback
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
        }
    }

    public abstract void onSuccess(String str);
}
