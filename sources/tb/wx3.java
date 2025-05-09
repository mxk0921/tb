package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vnb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wx3 implements vnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f30980a;

    static {
        t2o.a(852492332);
        t2o.a(839909553);
    }

    public wx3(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f30980a = bbsVar;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            vnb.a.a(this, bbsVar);
        }
    }

    @Override // tb.vnb
    public Float b0() {
        Integer num;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("a2a86fab", new Object[]{this});
        }
        idx idxVar = (idx) this.f30980a.g(idx.class);
        if (idxVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(idxVar.b());
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            return Float.valueOf(intValue);
        }
        return null;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            vnb.a.b(this);
        }
    }

    @Override // tb.vnb
    public Float q0() {
        Integer num;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("ad1b5e2", new Object[]{this});
        }
        idx idxVar = (idx) this.f30980a.g(idx.class);
        if (idxVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(idxVar.d());
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            return Float.valueOf(intValue);
        }
        return null;
    }
}
