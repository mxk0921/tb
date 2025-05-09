package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.gic;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i3g<C extends h2g<C>, DT extends gic> extends f2g<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int INTENT_HISTORY_DROP_CNT = 25;
    public static final int INTENT_HISTORY_MAX_RECORD_CNT = 100;

    /* renamed from: a  reason: collision with root package name */
    public C f21068a;
    public final Map<s2g, mic<DT>> b = new LinkedHashMap();
    public List<s2g> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438685);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438684);
        t2o.a(1002438736);
    }

    public i3g(C c) {
        super(c);
        this.f21068a = c;
    }

    public static /* synthetic */ Object ipc$super(i3g i3gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683216384) {
            super.b();
            return null;
        } else if (hashCode == 2024047597) {
            super.f();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kmp/kernel/arch/kernel/component/transition/KernelTransitionComponent");
        }
    }

    public static final String m(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1512b2f3", new Object[]{r2gVar});
        }
        return "state 正常, identifier:" + r2gVar.a() + " code:" + r2gVar.a().b();
    }

    @Override // tb.f2g
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, c});
        } else {
            this.f21068a = c;
        }
    }

    @Override // tb.f2g
    public void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
            return;
        }
        super.b();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            mic micVar = (mic) entry.getValue();
            C g = g();
            if (g != null) {
                str = g.k();
            } else {
                str = null;
            }
            micVar.p(str);
        }
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        for (mic micVar : ((LinkedHashMap) this.b).values()) {
            micVar.f();
        }
        ((LinkedHashMap) this.b).clear();
        super.f();
    }

    public C g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((h2g) ipChange.ipc$dispatch("5ab35416", new Object[]{this}));
        }
        return this.f21068a;
    }

    public final List<s2g> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14369cd3", new Object[]{this});
        }
        return this.c;
    }

    public void j(Map<s2g, ? extends mic<DT>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7409e6d", new Object[]{this, map});
            return;
        }
        ckf.g(map, "stateMap");
        this.b.putAll(map);
    }

    public final void k(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320e9ff0", new Object[]{this, r2gVar});
            return;
        }
        if (this.c.size() >= 100) {
            this.c = i04.E0(i04.T(this.c, 25));
        }
        this.c.add(r2gVar.a());
    }

    public e2g<DT> q(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("819a4844", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return l(r2gVar, null);
    }

    public final e2g<DT> l(final r2g r2gVar, e2g<DT> e2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("386f2d29", new Object[]{this, r2gVar, e2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        mic micVar = (mic) ((LinkedHashMap) this.b).get(r2gVar.a());
        String str = null;
        if (e2gVar == null || !e2gVar.b()) {
            pus pusVar = pus.INSTANCE;
            C g = g();
            if (g != null) {
                str = g.k();
            }
            pusVar.m("LifeCycle", str, "state 异常, identifier:" + r2gVar.a() + " code:" + r2gVar.a().b());
            if (micVar != null) {
                micVar.r(r2gVar);
            }
            return e2gVar;
        }
        k(r2gVar);
        e2g<DT> b = e2g.Companion.b(null);
        pus pusVar2 = pus.INSTANCE;
        C g2 = g();
        if (g2 != null) {
            str = g2.k();
        }
        pusVar2.i("LifeCycle", str, new d1a() { // from class: tb.h3g
            @Override // tb.d1a
            public final Object invoke() {
                String m;
                m = i3g.m(r2g.this);
                return m;
            }
        });
        if (micVar == null) {
            return b;
        }
        micVar.d(r2gVar);
        e2g<DT> i = micVar.i(r2gVar);
        micVar.r(r2gVar);
        return i;
    }
}
