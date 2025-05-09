package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.a;
import com.taobao.android.remoteso.resolver2.b;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.e;
import com.taobao.android.remoteso.resolver2.f;
import com.taobao.android.remoteso.resolver2.g;
import com.taobao.android.remoteso.resolver2.h;
import com.taobao.android.remoteso.resolver2.i;
import com.taobao.android.remoteso.resolver2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tb.u9t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class van implements dgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zho f29895a;
    public volatile dbn b = kc8.sFallbackFetcher;
    public volatile hbn c = qc8.sFallbackLoader;
    public volatile lid d = ad8.INSTANCE;
    public final AtomicReference<cgd> e = new AtomicReference<>(id8.EMPTY_CONFIG);
    public final m0n f = new m0n();
    public final List<igd> g = new ArrayList();

    public van(zho zhoVar) {
        this.f29895a = zhoVar;
    }

    public static b7o d(bu4 bu4Var, zho zhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b7o) ipChange.ipc$dispatch("8118d407", new Object[]{bu4Var, zhoVar});
        }
        obn obnVar = bu4Var.b;
        cgd cgdVar = bu4Var.f16635a;
        kgd kgdVar = zhoVar.f32778a;
        Application app = kgdVar.getApp();
        ggd ggdVar = zhoVar.c;
        hgd hgdVar = zhoVar.d;
        egd egdVar = zhoVar.e;
        m0n m0nVar = bu4Var.e;
        lgd a2 = clq.a(cgdVar);
        zan zanVar = new zan(ggdVar, m0nVar);
        bbn bbnVar = new bbn(app, kgdVar, hgdVar);
        g gVar = new g(kgdVar, obnVar);
        c cVar = new c(bbnVar, obnVar);
        f fVar = new f(kgdVar, obnVar, egdVar, cgdVar);
        i iVar = new i(kgdVar, zanVar, obnVar, egdVar, cgdVar);
        d[] dVarArr = {gVar, cVar, new RemoteResolver(cgdVar, obnVar, zanVar, fVar, iVar, new h(cgdVar, zanVar, bbnVar, obnVar)), new b(cgdVar, fVar, iVar)};
        HashMap hashMap = new HashMap(4);
        for (int i = 0; i < 4; i++) {
            d dVar = dVarArr[i];
            hashMap.put(dVar.b(), dVar);
        }
        return new b7o(kgdVar, cgdVar, a2, new k(obnVar, (e) ((u9t.b) zhoVar.j).b(bu4Var, new a(hashMap, obnVar, cgdVar))));
    }

    public static van f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (van) ipChange.ipc$dispatch("238a0ef0", new Object[0]);
        }
        return (van) bzn.c();
    }

    @Override // tb.dgd
    public dbn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("7be8c776", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.dgd
    public lid b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lid) ipChange.ipc$dispatch("2077322", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.dgd
    public hbn c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbn) ipChange.ipc$dispatch("88ace186", new Object[]{this});
        }
        return this.c;
    }

    public cgd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgd) ipChange.ipc$dispatch("70f28669", new Object[]{this});
        }
        return this.e.get();
    }

    public tmc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmc) ipChange.ipc$dispatch("201a898b", new Object[]{this});
        }
        return (tmc) this.f29895a.b(tmc.class);
    }

    public m0n h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0n) ipChange.ipc$dispatch("a3fd0dd2", new Object[]{this});
        }
        return this.f;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fafc9502", new Object[]{this});
            return;
        }
        RSoLog.d("RSoCoreImpl, startIdleTask(), enter ");
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            try {
                ((igd) it.next()).trigger();
            } catch (Throwable th) {
                rbn.g("startIdleTask", th);
            }
        }
        RSoLog.d("RSoCoreImpl, startIdleTask(), done ");
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        RSoLog.d("RSoCoreImpl, init, enter");
        Application app = this.f29895a.f32778a.getApp();
        zho zhoVar = this.f29895a;
        kgd kgdVar = zhoVar.f32778a;
        uan uanVar = new uan(zhoVar.b);
        uanVar.g();
        obn obnVar = new obn(app, kgdVar);
        lbn lbnVar = new lbn(kgdVar, obnVar);
        this.e.set(uanVar);
        bu4 bu4Var = new bu4(uanVar, obnVar, lbnVar, kgdVar, this.f);
        uec uecVar = (uec) this.f29895a.a(uec.class).a(bu4Var);
        com.taobao.android.remoteso.index.d dVar = new com.taobao.android.remoteso.index.d(app, uanVar, kgdVar, uecVar);
        dVar.m();
        com.taobao.android.remoteso.index.c cVar = new com.taobao.android.remoteso.index.c(app, kgdVar, uanVar, obnVar, dVar, uecVar);
        cVar.h();
        ((ArrayList) this.g).add(cVar);
        b7o d = d(bu4Var, this.f29895a);
        ((ArrayList) this.g).add(new kbn(uanVar, dVar, d, this.f29895a.g));
        ((ArrayList) this.g).add(new jbn(kgdVar, uanVar, dVar, lbnVar, d, this.f29895a.f.a(bu4Var), this.f29895a.k.a(bu4Var)));
        ws3 ws3Var = new ws3();
        ((ArrayList) this.g).add(new tan(uanVar, dVar, cVar, obnVar, kgdVar, d, ws3Var));
        u7h u7hVar = new u7h(new sh7(new sao(new aqm(new ran(uanVar, dVar, cVar, d), kgdVar, dVar), ws3Var), uanVar));
        this.b = new ebn(((h9t) this.f29895a.h).b(bu4Var, new cbn(uanVar, dVar, new j5n(u7hVar, ngd.POINT_PULLER, j5n.FETCH_FROM_BUSI_CALL))));
        this.c = new ibn(((o9t) this.f29895a.i).a(bu4Var, new d8q(new gbn(uanVar, kgdVar, new j5n(u7hVar, ngd.POINT_PULLER, "load"), clq.a(uanVar)))));
        this.d = new axn(new ywn(dVar, new j5n(new sh7(new sao(new zwn(uanVar, dVar, d), ws3Var), uanVar), ngd.POINT_PULLER_ASSETS, "")));
        RSoLog.d("RSoCoreImpl, init, finished");
    }
}
