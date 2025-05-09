package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wo7 extends vy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, DXTemplateItem> f30814a = new HashMap();
    public ConcurrentHashMap<String, String> b;
    public final s c;
    public final ViewEngine d;
    public final h7v e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ly<List<DXTemplateItem>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/template/DinamicXTemplateProvider$1");
        }

        /* renamed from: b */
        public void a(List<DXTemplateItem> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("effe2a83", new Object[]{this, list});
            } else {
                wo7.c(wo7.this, list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ly<List<DXTemplateItem>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/template/DinamicXTemplateProvider$2");
        }

        /* renamed from: b */
        public void a(List<DXTemplateItem> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("effe2a83", new Object[]{this, list});
            } else if (list != null) {
                wo7.d(wo7.this, list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends wz<Boolean, List<zh6>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/template/DinamicXTemplateProvider$3");
        }

        /* renamed from: b */
        public Boolean a(List<zh6> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("4950c140", new Object[]{this, list});
            }
            return Boolean.valueOf(wo7.e(wo7.this, list));
        }
    }

    static {
        t2o.a(157286715);
    }

    public wo7(ViewEngine viewEngine) {
        this.d = viewEngine;
        h7v h7vVar = new h7v(viewEngine, new a(), new b(), new c());
        this.e = h7vVar;
        s b2 = viewEngine.Q().b();
        this.c = b2;
        b2.t(h7vVar);
    }

    public static /* synthetic */ void c(wo7 wo7Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c27170", new Object[]{wo7Var, list});
        } else {
            wo7Var.q(list);
        }
    }

    public static /* synthetic */ void d(wo7 wo7Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cca3671", new Object[]{wo7Var, list});
        } else {
            wo7Var.o(list);
        }
    }

    public static /* synthetic */ boolean e(wo7 wo7Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d1fb76", new Object[]{wo7Var, list})).booleanValue();
        }
        return wo7Var.p(list);
    }

    public static /* synthetic */ Object ipc$super(wo7 wo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/template/DinamicXTemplateProvider");
    }

    @Override // tb.xzd
    public void a(List<o58> list, xit xitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65975c6f", new Object[]{this, list, xitVar});
        } else {
            h(list, xitVar, null);
        }
    }

    @Override // tb.vy
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a079f60f", new Object[]{this, str, str2})).booleanValue();
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.b;
        if (concurrentHashMap == null || !str2.equals(concurrentHashMap.get(str))) {
            return false;
        }
        return true;
    }

    public final void f(List<o58> list, List<DXTemplateItem> list2, List<DXTemplateItem> list3, vcv vcvVar) {
        z7v.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fed8baf", new Object[]{this, list, list2, list3, vcvVar});
            return;
        }
        for (o58 o58Var : list) {
            if (o58Var != null) {
                DXTemplateItem a2 = ajt.a(o58Var);
                ViewEngine viewEngine = this.d;
                if (viewEngine == null || viewEngine.P() == null || this.d.P().a() == null) {
                    cVar = null;
                } else {
                    cVar = this.d.P().a();
                    cVar.c(a2);
                }
                if (a2.b > 0) {
                    DXTemplateItem i = this.c.i(a2);
                    if (i == null) {
                        list2.add(a2);
                        if (cVar != null) {
                            cVar.a(a2);
                        }
                        hav.g("DinamicXTemplateProvider", "fetch为空，准备下载DX:", a2.e());
                    } else {
                        String str = i.f7343a;
                        if (a2.b != i.b) {
                            list2.add(a2);
                            if (cVar != null) {
                                cVar.a(a2);
                            }
                            hav.g("DinamicXTemplateProvider", "版本不一致，准备下载DX:", a2.e());
                        }
                        synchronized (this) {
                            g(list3, a2, i);
                        }
                        m(str, i.h());
                    }
                } else {
                    continue;
                }
            }
        }
        if (list3.size() > 0) {
            o(list3);
        }
        int size = list2.size();
        if (size > 0) {
            hav.d("DinamicXTemplateProvider", "下载DX组件，个数：" + size);
            this.c.h(list2);
        }
    }

    public final void g(List<DXTemplateItem> list, DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993cf53a", new Object[]{this, list, dXTemplateItem, dXTemplateItem2});
            return;
        }
        String str = dXTemplateItem2.f7343a;
        DXTemplateItem dXTemplateItem3 = (DXTemplateItem) ((HashMap) this.f30814a).get(str);
        if (dXTemplateItem3 == null) {
            ((HashMap) this.f30814a).put(str, dXTemplateItem2);
            return;
        }
        long j = dXTemplateItem3.b;
        long j2 = dXTemplateItem2.b;
        if (j >= j2) {
            return;
        }
        if (!sh4.e()) {
            list.add(dXTemplateItem);
        } else if (dXTemplateItem.b == j2) {
            list.add(dXTemplateItem);
        }
    }

    public void h(List<o58> list, xit xitVar, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb3853e", new Object[]{this, list, xitVar, vcvVar});
        } else if (list != null && !list.isEmpty()) {
            this.e.d(xitVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (vcvVar == null || !vcvVar.c()) {
                f(list, arrayList, arrayList2, vcvVar);
            } else {
                n(list, arrayList, arrayList2);
            }
        }
    }

    public DXTemplateItem i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("4b57b03b", new Object[]{this, str});
        }
        return (DXTemplateItem) ((HashMap) this.f30814a).get(str);
    }

    public Map<String, DXTemplateItem> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e5e00c8", new Object[]{this});
        }
        return this.f30814a;
    }

    public final void k(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4bf80d", new Object[]{this, dXTemplateItem});
            return;
        }
        String str = dXTemplateItem.f7343a;
        if (((DXTemplateItem) ((HashMap) this.f30814a).get(str)) == null) {
            ((HashMap) this.f30814a).put(str, dXTemplateItem);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.B(this.e);
        }
    }

    public final void m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be55366f", new Object[]{this, str, new Long(j)});
        } else if (str != null) {
            if (this.b == null) {
                this.b = new ConcurrentHashMap<>();
            }
            this.b.put(str, String.valueOf(j));
        }
    }

    public final void n(List<o58> list, List<DXTemplateItem> list2, List<DXTemplateItem> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c0d22c", new Object[]{this, list, list2, list3});
            return;
        }
        hav.d("DinamicXTemplateProvider", "缓存渲染，跳过模板下载");
        for (o58 o58Var : list) {
            if (o58Var != null) {
                DXTemplateItem a2 = ajt.a(o58Var);
                if (a2.b > 0) {
                    DXTemplateItem i = this.c.i(a2);
                    if (i == null) {
                        list2.add(a2);
                    } else {
                        k(i);
                    }
                }
            }
        }
    }

    public final void o(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c36cd1f", new Object[]{this, list});
            return;
        }
        for (DXTemplateItem dXTemplateItem : list) {
            if (dXTemplateItem != null) {
                ((HashMap) this.f30814a).put(dXTemplateItem.f7343a, dXTemplateItem);
            }
        }
    }

    public final boolean p(List<zh6> list) {
        DXTemplateItem dXTemplateItem;
        DXTemplateItem i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2720af5", new Object[]{this, list})).booleanValue();
        }
        for (zh6 zh6Var : list) {
            if (!(zh6Var == null || (dXTemplateItem = zh6Var.f32770a) == null || zh6Var.c != 1000 || (i = this.c.i(dXTemplateItem)) == null || i.equals(((HashMap) this.f30814a).get(i.f7343a)))) {
                ((HashMap) this.f30814a).put(i.f7343a, i);
                z = true;
            }
        }
        return z;
    }

    public final void q(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66253e98", new Object[]{this, list});
        } else if (list != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                m(dXTemplateItem.f7343a, dXTemplateItem.h());
            }
        }
    }
}
