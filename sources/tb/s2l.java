package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s2l extends i3g<fyk, kzk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fyk d;
    public final pzk e;

    static {
        t2o.a(1004535834);
    }

    public s2l(fyk fykVar) {
        super(fykVar);
        String str;
        this.d = fykVar;
        fyk n = g();
        if (n != null) {
            str = n.k();
        } else {
            str = null;
        }
        this.e = new pzk(str);
    }

    public static /* synthetic */ Object ipc$super(s2l s2lVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 946810153) {
            return s2lVar.l((r2g) objArr[0], (e2g) objArr[1]);
        }
        if (hashCode == 2024047597) {
            super.f();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchTransitionComponent");
    }

    @Override // tb.i3g, tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        a2l a2lVar = a2l.INSTANCE;
        fyk n = g();
        a2lVar.p(this, "释放 Transition", a2lVar.g(n != null ? n.k() : null));
        super.f();
    }

    /* renamed from: n */
    public fyk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyk) ipChange.ipc$dispatch("72b44af0", new Object[]{this});
        }
        return this.d;
    }

    public final pzk o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzk) ipChange.ipc$dispatch("afd36d81", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.i3g
    public e2g<kzk> q(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("819a4844", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return l(r2gVar, this.e.g(r2gVar));
    }

    /* renamed from: s */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        } else {
            this.d = fykVar;
        }
    }
}
