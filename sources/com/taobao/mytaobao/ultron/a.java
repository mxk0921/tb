package com.taobao.mytaobao.ultron;

import com.android.alibaba.ip.runtime.IpChange;
import tb.a3w;
import tb.s1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements s1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MtbBizProxy f11350a;

    public a(MtbBizProxy mtbBizProxy) {
        this.f11350a = mtbBizProxy;
    }

    @Override // tb.s1c
    public void onSuccess(a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
        } else {
            MtbBizProxy.J(this.f11350a, true);
        }
    }
}
