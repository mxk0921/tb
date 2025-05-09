package com.alibaba.security.realidentity;

import android.os.Bundle;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l0 implements j0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "ABDetectListener";

    /* renamed from: a  reason: collision with root package name */
    public final t0 f2753a;
    public final q b;
    public final RPBizConfig c;
    public final m0 d;
    public boolean e = false;

    public l0(t0 t0Var) {
        this.f2753a = t0Var;
        q j = t0Var.j();
        this.b = j;
        this.c = j.c();
        this.d = t0Var.w();
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : i != 0 ? i != 1 ? i != 6 ? e2.V : e2.S : e2.R : e2.Q;
    }

    private void d(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5408a45c", new Object[]{this, new Integer(i), bundle});
            return;
        }
        int value = this.f2753a.v().getValue();
        ABDetectPhase aBDetectPhase = ABDetectPhase.FINISH;
        if (value >= aBDetectPhase.getValue() || this.f2753a.v() == ABDetectPhase.ACTION_END) {
            return;
        }
        if (2 == i) {
            this.f2753a.T();
            if (this.f2753a.v().getValue() <= ABDetectPhase.ADJUST_END.getValue()) {
                e(e2.J, bundle);
            } else {
                e(e2.I, bundle);
            }
        } else {
            int value2 = this.f2753a.v().getValue();
            ABDetectPhase aBDetectPhase2 = ABDetectPhase.ACTION_BEGIN;
            if (value2 < aBDetectPhase2.getValue()) {
                this.f2753a.a((c0) null);
                return;
            }
            ABActionResult u = this.f2753a.u();
            if (u != null) {
                u.ecResult = bundle.getString("ecResult", "");
            }
            if (this.f2753a.v().getValue() >= aBDetectPhase2.getValue() && this.f2753a.v().getValue() < aBDetectPhase.getValue()) {
                this.d.a(a(i, u), true, false);
            }
        }
    }

    @Override // com.alibaba.security.realidentity.j0
    public void b(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba80a5a", new Object[]{this, new Integer(i), bundle});
        } else {
            e(i, bundle);
        }
    }

    @Override // com.alibaba.security.realidentity.j0
    public void c(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd8575b", new Object[]{this, new Integer(i), bundle});
        } else {
            d(i, bundle);
        }
    }

    public final void e(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d838f15d", new Object[]{this, new Integer(i), bundle});
        } else if (this.d.b(i)) {
            this.b.g();
            this.f2753a.a(i, bundle);
        } else if (this.d.c(i)) {
            this.f2753a.c(12, new g0(i, bundle));
        }
    }

    @Override // com.alibaba.security.realidentity.j0
    public void a(long j, z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f19f950", new Object[]{this, new Long(j), zVar});
            return;
        }
        int value = this.f2753a.v().getValue();
        ABDetectPhase aBDetectPhase = ABDetectPhase.FINISH;
        if (value < aBDetectPhase.getValue()) {
            if (zVar != null && zVar.a() > 0 && !this.e) {
                this.e = true;
            }
            if (this.f2753a.v() == ABDetectPhase.INIT) {
                a();
            }
            this.f2753a.c(11, zVar);
            if (this.f2753a.v() == ABDetectPhase.ADJUST_END && this.c.getBiometricsConfig().actionCount > 0) {
                t0 t0Var = this.f2753a;
                t0Var.b(4, t0Var.J());
            }
            if (this.f2753a.I()) {
                this.f2753a.T();
                b(e2.U);
            }
            int a2 = this.d.a();
            if (a2 != 0 && this.f2753a.v().getValue() < aBDetectPhase.getValue()) {
                b(a2);
            }
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            e(i, new Bundle());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    @Override // com.alibaba.security.realidentity.j0
    public ABDetectType a(c0 c0Var, ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABDetectType) ipChange.ipc$dispatch("9895b7b1", new Object[]{this, c0Var, aBDetectType});
        }
        y x = this.f2753a.x();
        if (this.f2753a.v().getValue() >= ABDetectPhase.FINISH.getValue()) {
            return ABDetectType.DONE;
        }
        int value = this.f2753a.v().getValue();
        ABDetectPhase aBDetectPhase = ABDetectPhase.ACTION_BEGIN;
        if (value < aBDetectPhase.getValue()) {
            if (!this.d.c(x)) {
                b(e2.P);
                return ABDetectType.AIMLESS;
            }
            this.d.a(x);
            this.d.b(x);
            this.f2753a.b(3, c0Var);
            return ABDetectType.AIMLESS;
        } else if (aBDetectType == ABDetectType.KEEP_STILL) {
            return ABDetectType.AIMLESS;
        } else {
            if (this.f2753a.v() != aBDetectPhase) {
                return ABDetectType.AIMLESS;
            }
            this.f2753a.b(5, c0Var);
            if (!this.f2753a.F()) {
                return ABDetectType.AIMLESS;
            }
            return ABDetectType.DONE;
        }
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            this.b.a(trackLog);
        }
    }

    @Override // com.alibaba.security.realidentity.j0
    public void a(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i), bundle});
        } else {
            e(i, bundle);
        }
    }

    private ABDetectType a(int i, ABActionResult aBActionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABDetectType) ipChange.ipc$dispatch("4ff5e3bc", new Object[]{this, new Integer(i), aBActionResult});
        }
        b(a(i));
        return this.f2753a.s();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f2753a.e(1);
        this.f2753a.b(1);
    }
}
