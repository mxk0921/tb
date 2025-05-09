package com.taobao.taolive.uikit.favor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.favor.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static b c = null;

    /* renamed from: a  reason: collision with root package name */
    public final Thread f13345a;
    public final a b;

    static {
        t2o.a(779093594);
    }

    public b() {
        a aVar = new a();
        this.b = aVar;
        this.f13345a = new Thread(aVar, "FavorRenderThread");
        d();
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("58344f27", new Object[0]);
        }
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public void a(a.AbstractC0762a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37a1da8", new Object[]{this, aVar});
            return;
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
    }

    public void c(a.AbstractC0762a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c65c0b", new Object[]{this, aVar});
            return;
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.b.c();
        this.f13345a.start();
    }
}
