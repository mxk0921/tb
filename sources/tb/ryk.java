package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ryk extends oyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fyk m;

    static {
        t2o.a(1004536512);
    }

    public ryk() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(ryk rykVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683216384) {
            super.y();
            return null;
        } else if (hashCode == 2024047597) {
            super.f();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kmp/nexus/arch/openArch/entity/single/OpenArchEntityPublicSingle");
        }
    }

    @Override // tb.oyk
    public Map<s2g, mic<kzk>> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("564c3c39", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jzk.a aVar = jzk.Companion;
        linkedHashMap.put(aVar.k(), new d2l());
        linkedHashMap.put(aVar.r(), new k2l());
        linkedHashMap.put(aVar.s(), new l2l());
        linkedHashMap.put(aVar.m(), new f2l());
        linkedHashMap.put(aVar.n(), new g2l());
        linkedHashMap.put(aVar.l(), new e2l());
        linkedHashMap.put(aVar.o(), new j2l());
        linkedHashMap.put(aVar.p(), new h2l());
        linkedHashMap.put(aVar.q(), new i2l());
        linkedHashMap.put(aVar.d(), new c2l());
        return linkedHashMap;
    }

    /* renamed from: O */
    public fyk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyk) ipChange.ipc$dispatch("72b44af0", new Object[]{this});
        }
        return this.m;
    }

    /* renamed from: R */
    public void s(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        } else {
            this.m = fykVar;
        }
    }

    @Override // tb.oyk, tb.m2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            super.f();
        }
    }

    @Override // tb.oyk, tb.m2g
    public void y() {
        f3d f3dVar;
        cyk b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
            return;
        }
        super.y();
        cyk b2 = b();
        if (b2 != null) {
            f3dVar = b2.e();
        } else {
            f3dVar = null;
        }
        if (f3dVar == null && (b = b()) != null) {
            b.g(new byk());
        }
    }

    public final z5m z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z5m) ipChange.ipc$dispatch("e877a465", new Object[]{this});
        }
        return null;
    }

    public /* synthetic */ ryk(fyk fykVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : fykVar);
    }

    public ryk(fyk fykVar) {
        super(fykVar);
        this.m = fykVar;
    }
}
