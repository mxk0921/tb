package com.taobao.falco;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f10463a;
    public final /* synthetic */ FalcoEnvironmentImpl b;

    public g(FalcoEnvironmentImpl falcoEnvironmentImpl, f.b bVar) {
        this.b = falcoEnvironmentImpl;
        this.f10463a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!FalcoEnvironmentImpl.j(this.b).contains(this.f10463a)) {
            FalcoEnvironmentImpl.j(this.b).add(this.f10463a);
            try {
                this.f10463a.a(this.b.l(), this.b.s(), this.b.a(), this.b.d(), this.b.g(), this.b.h(), this.b.e(), this.b.b(), this.b.k());
            } catch (Exception e) {
                ALog.e(FalcoEnvironmentImpl.TAG, "[onChange] error", null, e, new Object[0]);
            }
        }
    }
}
