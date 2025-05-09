package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Fa implements AbstractC1148bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f2552a;
    public final /* synthetic */ Ja b;

    public Fa(Ja ja, long j) {
        this.b = ja;
        this.f2552a = j;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1148bb
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else {
            System.currentTimeMillis();
        }
    }
}
