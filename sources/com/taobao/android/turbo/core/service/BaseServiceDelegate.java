package com.taobao.android.turbo.core.service;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;
import tb.b7d;
import tb.ckf;
import tb.kee;
import tb.nuo;
import tb.pab;
import tb.pl4;
import tb.q2c;
import tb.qpu;
import tb.r2c;
import tb.t2c;
import tb.t2o;
import tb.vmd;
import tb.vod;
import tb.z0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseServiceDelegate implements vod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f9739a;

    static {
        t2o.a(919601248);
        t2o.a(919601251);
    }

    public BaseServiceDelegate(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.f9739a = qpuVar;
    }

    @Override // tb.vod
    public void F(String str, z0d z0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbde690d", new Object[]{this, str, z0dVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(z0dVar, DataReceiveMonitor.CB_LISTENER);
        ((kee) this.f9739a.getService(kee.class)).s0(str, z0dVar);
    }

    @Override // tb.vod
    public TurboEngineConfig G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngineConfig) ipChange.ipc$dispatch("37cb2226", new Object[]{this});
        }
        return this.f9739a.a();
    }

    @Override // tb.vod
    public void H(String str, z0d z0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9aaf8a", new Object[]{this, str, z0dVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(z0dVar, DataReceiveMonitor.CB_LISTENER);
        ((kee) this.f9739a.getService(kee.class)).c1(str, z0dVar);
    }

    public void I(r2c r2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1ce183", new Object[]{this, r2cVar});
            return;
        }
        ckf.g(r2cVar, DataReceiveMonitor.CB_LISTENER);
        ((t2c) this.f9739a.getService(t2c.class)).x(r2cVar);
    }

    public final pab K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pab) ipChange.ipc$dispatch("eec8427c", new Object[]{this});
        }
        return (pab) this.f9739a.getService(pab.class);
    }

    @Override // tb.vod
    public Map<String, String> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4b78c7f", new Object[]{this});
        }
        return ((b7d) this.f9739a.getService(b7d.class)).R();
    }

    public nuo U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("7eb587ec", new Object[]{this, str});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return ((vmd) this.f9739a.getService(vmd.class)).X0(new BaseServiceDelegate$getSchedulerMessage$1(str));
    }

    @Override // tb.vod
    public void a(String str, boolean z, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a06141", new Object[]{this, str, new Boolean(z), new Long(j), str2});
            return;
        }
        ckf.g(str, "stageName");
        K().a(str, z, j, str2);
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f39be4c", new Object[]{this})).booleanValue();
        }
        return ((t2c) this.f9739a.getService(t2c.class)).t().c();
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad376b3", new Object[]{this});
        } else {
            ((q2c) this.f9739a.getService(q2c.class)).onStateChanged(EngineState.VISIBLE);
        }
    }

    public void c0(r2c r2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c051066", new Object[]{this, r2cVar});
            return;
        }
        ckf.g(r2cVar, DataReceiveMonitor.CB_LISTENER);
        ((t2c) this.f9739a.getService(t2c.class)).r(r2cVar);
    }

    public void d0(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe017e84", new Object[]{this, nuoVar});
            return;
        }
        ckf.g(nuoVar, "message");
        ((vmd) this.f9739a.getService(vmd.class)).Z(nuoVar);
    }

    @Override // tb.vod
    public void g(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a033a99", new Object[]{this, str, new Long(j), str2});
            return;
        }
        ckf.g(str, "stageName");
        K().g(str, j, str2);
    }

    @Override // tb.vod
    public void h(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829d2b00", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        pab.b.d(K(), str, z, null, 4, null);
    }

    @Override // tb.vod
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6f1451", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "stageName");
        ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
        pab.b.a(K(), str, str2, null, 4, null);
    }

    @Override // tb.vod
    public void j(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63875880", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        ckf.g(str, "code");
        pab.b.h(K(), z, str, null, 4, null);
    }

    @Override // tb.vod
    public void k(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc97da31", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "stageName");
        ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
        pab.b.c(K(), str, str2, z, null, 8, null);
    }

    @Override // tb.vod
    public void l(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548e3db7", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        ckf.g(str, "stageName");
        K().l(str, z, str2);
    }

    @Override // tb.vod
    public void m(boolean z, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ca9f98", new Object[]{this, new Boolean(z), str, new Long(j), str2});
            return;
        }
        ckf.g(str, "code");
        K().m(z, str, j, str2);
    }

    @Override // tb.vod
    public void n(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3117006", new Object[]{this, str, obj, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        K().n(str, obj, str2);
    }

    @Override // tb.vod
    public IPage o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("c71f6329", new Object[]{this, str});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return ((pab) this.f9739a.getService(pab.class)).o(str);
    }

    @Override // tb.vod
    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e123b719", new Object[]{this, str});
            return;
        }
        ckf.g(str, "eventName");
        pab.b.f(K(), str, null, 2, null);
    }

    @Override // tb.vod
    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cc6fd71", new Object[]{this});
        }
        return pab.b.e(K(), null, 1, null);
    }

    @Override // tb.vod
    public void v(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af81a261", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "name");
        ((kee) this.f9739a.getService(kee.class)).a0(str, map);
    }

    @Override // tb.vod
    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f4d1846", new Object[]{this, str, str2});
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        return pab.b.b(K(), str, null, 2, null);
    }
}
