package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.component.OpenArchObserveMode;
import com.taobao.kmp.nexus.arch.openArch.observe.OpenArchObservableStateCompareResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n1l extends f2g<fyk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final njg<Boolean> g = kotlin.a.a(LazyThreadSafetyMode.NONE, new d1a() { // from class: tb.m1l
        @Override // tb.d1a
        public final Object invoke() {
            boolean k;
            k = n1l.k();
            return Boolean.valueOf(k);
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public fyk f24445a;
    public int b;
    public final Map<String, Object> c = new LinkedHashMap();
    public final Map<String, i3d> d = new LinkedHashMap();
    public final Map<Integer, t2l> e = new LinkedHashMap();
    public final Map<String, List<u2l>> f = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004535830);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69976d65", new Object[]{this})).booleanValue();
            }
            return ((Boolean) n1l.g().getValue()).booleanValue();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004535829);
    }

    public n1l(fyk fykVar) {
        super(fykVar);
        this.f24445a = fykVar;
    }

    public static final /* synthetic */ njg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("f6013e78", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(n1l n1lVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchObserveComponent");
    }

    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8de72cb", new Object[0])).booleanValue();
        }
        boolean I = mhr.e0().I("tblive", "enableObserveComponent", true);
        pus pusVar = pus.INSTANCE;
        pusVar.k("OpenArchObserveComponent", "", "enableObserveComponent:" + I);
        return I;
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        super.f();
        ((LinkedHashMap) this.c).clear();
        ((LinkedHashMap) this.d).clear();
        ((LinkedHashMap) this.e).clear();
        ((LinkedHashMap) this.f).clear();
    }

    public final void h(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc02e22", new Object[]{this, new Integer(i)});
            return;
        }
        t2l t2lVar = (t2l) ((LinkedHashMap) this.e).get(Integer.valueOf(i));
        if (t2lVar == null) {
            return;
        }
        if ((t2lVar.b() == OpenArchObserveMode.Once && t2lVar.c() == 0) || t2lVar.b() == OpenArchObserveMode.Multitime) {
            g1a<oyk, xhv> a2 = t2lVar.a();
            if (a2 != null) {
                a2l a2lVar = a2l.INSTANCE;
                fyk l = l();
                if (l != null) {
                    str = l.k();
                } else {
                    str = null;
                }
                a2.invoke(a2lVar.g(str));
            }
            t2lVar.d(t2lVar.c() + 1);
            pus pusVar = pus.INSTANCE;
            pusVar.k("OpenArchObserveComponent", "", "callTriggerId:" + i + " count:" + t2lVar.c());
        }
    }

    public final void j(i3d i3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a360a7", new Object[]{this, i3dVar});
            return;
        }
        ckf.g(i3dVar, "state");
        pus pusVar = pus.INSTANCE;
        pusVar.k("OpenArchObserveComponent", "", "changeState:" + i3dVar.getName() + " value:" + i3dVar.getValue());
        this.c.put(i3dVar.getName(), i3dVar.getValue());
        List<u2l> list = (List) ((LinkedHashMap) this.f).get(i3dVar.getName());
        if (list != null) {
            for (u2l u2lVar : list) {
                i3d i3dVar2 = (i3d) ((LinkedHashMap) this.d).get(i3dVar.getName());
                if ((i3dVar2 != null ? i3dVar2.a(u2lVar.d().get(i3dVar.getName()), i3dVar.getValue()) : null) == u2lVar.c()) {
                    u2lVar.a().add(i3dVar.getName());
                } else {
                    u2lVar.a().remove(i3dVar.getName());
                }
                if (u2lVar.a().size() == u2lVar.d().size()) {
                    h(u2lVar.b());
                }
            }
        }
    }

    public fyk l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyk) ipChange.ipc$dispatch("72b44af0", new Object[]{this});
        }
        return this.f24445a;
    }

    public final void n(List<? extends i3d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d053", new Object[]{this, list});
            return;
        }
        ckf.g(list, "states");
        for (i3d i3dVar : list) {
            this.d.put(i3dVar.getName(), i3dVar);
        }
    }

    /* renamed from: o */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        } else {
            this.f24445a = fykVar;
        }
    }

    public final int m(List<? extends i3d> list, OpenArchObserveMode openArchObserveMode, g1a<? super oyk, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("799bb4b", new Object[]{this, list, openArchObserveMode, g1aVar})).intValue();
        }
        ckf.g(list, "states");
        ckf.g(openArchObserveMode, "mode");
        ckf.g(g1aVar, "observeCallback");
        int i = this.b;
        this.b = 1 + i;
        this.e.put(Integer.valueOf(i), new t2l(openArchObserveMode, g1aVar, list, 0));
        OpenArchObservableStateCompareResult openArchObservableStateCompareResult = OpenArchObservableStateCompareResult.Equal;
        List<? extends i3d> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hfn.c(v3i.e(zz3.q(list2, 10)), 16));
        for (i3d i3dVar : list2) {
            Pair a2 = jpu.a(i3dVar.getName(), i3dVar.getValue());
            linkedHashMap.put(a2.getFirst(), a2.getSecond());
        }
        u2l u2lVar = new u2l(i, openArchObservableStateCompareResult, new LinkedHashSet(), linkedHashMap);
        for (i3d i3dVar2 : list2) {
            pus pusVar = pus.INSTANCE;
            pusVar.k("OpenArchObserveComponent", "", "observeStateId:" + i + " name:" + i3dVar2.getName() + " value:" + i3dVar2.getValue());
            Map<String, List<u2l>> map = this.f;
            String name = i3dVar2.getName();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
            Object obj = linkedHashMap2.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(name, obj);
            }
            ((List) obj).add(u2lVar);
        }
        return i;
    }
}
