package com.taobao.android.launcher.bootstrap.tao;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.b;
import tb.iqk;
import tb.w35;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f8159a;

    public c(e eVar) {
        this.f8159a = eVar;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.b.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb28c7", new Object[]{this});
            return;
        }
        iqk d = e.a(this.f8159a).d();
        if (d != null) {
            d.r();
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.b.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec79c00", new Object[]{this});
            return;
        }
        w35.a("onLaunchCompleted");
        e.a(this.f8159a).y().k();
        w35.c();
    }
}
