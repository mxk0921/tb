package com.taobao.falco;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f10464a;
    public final /* synthetic */ FalcoEnvironmentImpl b;

    public h(FalcoEnvironmentImpl falcoEnvironmentImpl, f.b bVar) {
        this.b = falcoEnvironmentImpl;
        this.f10464a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            FalcoEnvironmentImpl.j(this.b).remove(this.f10464a);
        }
    }
}
