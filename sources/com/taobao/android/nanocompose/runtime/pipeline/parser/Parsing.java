package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.a;
import tb.bgz;
import tb.ckf;
import tb.hhz;
import tb.njg;
import tb.olz;
import tb.plz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Parsing implements plz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f9029a = a.b(Parsing$invalidations$2.INSTANCE);
    public final njg b = a.b(Parsing$observations$2.INSTANCE);

    static {
        t2o.a(598737454);
        t2o.a(598737460);
    }

    @Override // tb.plz
    public void a(olz olzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cefd4d", new Object[]{this, olzVar});
            return;
        }
        ckf.g(olzVar, "reparseScope");
        b().add(olzVar);
    }

    public final Set<olz> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6d693b95", new Object[]{this});
        }
        return (Set) this.f9029a.getValue();
    }

    public final Map<bgz<hhz>, Set<olz>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3f1a979", new Object[]{this});
        }
        return (Map) this.b.getValue();
    }

    public final void d(bgz<hhz> bgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cc3be8", new Object[]{this, bgzVar});
            return;
        }
        ckf.g(bgzVar, "state");
        Set<olz> set = c().get(bgzVar);
        if (set != null && !set.isEmpty()) {
            for (olz olzVar : set) {
                olzVar.a();
            }
            c().remove(bgzVar);
        }
    }

    public void e(olz olzVar, bgz<hhz> bgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb0d268", new Object[]{this, olzVar, bgzVar});
            return;
        }
        ckf.g(olzVar, "reparseScope");
        ckf.g(bgzVar, "state");
        Map<bgz<hhz>, Set<olz>> c = c();
        Set<olz> set = c.get(bgzVar);
        if (set == null) {
            set = new HashSet<>();
            c.put(bgzVar, set);
        }
        set.add(olzVar);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417c48e7", new Object[]{this});
            return;
        }
        for (olz olzVar : b()) {
            olzVar.b();
        }
    }
}
