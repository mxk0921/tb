package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15468a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ com.alibaba.android.ultron.vfw.instance.a c;
        public final /* synthetic */ List d;
        public final /* synthetic */ a.h e;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;
        public final /* synthetic */ IDMComponent h;

        public a(boolean z, boolean z2, com.alibaba.android.ultron.vfw.instance.a aVar, List list, a.h hVar, List list2, List list3, IDMComponent iDMComponent) {
            this.f15468a = z;
            this.b = z2;
            this.c = aVar;
            this.d = list;
            this.e = hVar;
            this.f = list2;
            this.g = list3;
            this.h = iDMComponent;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean z = this.f15468a;
            if (z || this.b) {
                if (this.b) {
                    i = 4;
                }
                this.c.X(i | (z ? 1 : 0));
            }
            if (this.d != null) {
                this.c.T(this.e);
                this.c.e(this.d);
                return;
            }
            List<IDMComponent> list = this.f;
            if (list != null) {
                this.c.c0(list);
                return;
            }
            List<IDMComponent> list2 = this.g;
            if (list2 != null) {
                this.c.P(list2, this.h);
            }
        }
    }

    static {
        t2o.a(157286667);
    }

    public static int a(List<?>... listArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88373797", new Object[]{listArr})).intValue();
        }
        if (listArr == null) {
            return 0;
        }
        int i = 0;
        for (List<?> list : listArr) {
            if (list != null) {
                i++;
            }
        }
        return i;
    }

    public static void b(boolean z, boolean z2, List<IDMComponent> list, List<IDMComponent> list2, List<IDMComponent> list3, IDMComponent iDMComponent, a.h hVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a542a5f8", new Object[]{new Boolean(z), new Boolean(z2), list, list2, list3, iDMComponent, hVar, aVar});
        } else {
            PanguApplication.runOnUiThread(new a(z, z2, aVar, list, hVar, list2, list3, iDMComponent));
        }
    }

    public static void c(u55 u55Var, et6 et6Var, a.h hVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed5a70e", new Object[]{u55Var, et6Var, hVar, aVar});
        } else if (u55Var.t() == null || u55Var.t().isEmpty()) {
            aVar.T(hVar);
            aVar.V(127);
        } else {
            d(u55Var.t(), hVar, et6Var, aVar);
        }
    }

    public static void d(List<rb4> list, a.h hVar, et6 et6Var, com.alibaba.android.ultron.vfw.instance.a aVar) {
        boolean z;
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2fa98f", new Object[]{list, hVar, et6Var, aVar});
            return;
        }
        List<IDMComponent> c = et6Var.c();
        List<IDMComponent> h = et6Var.h();
        List<IDMComponent> f = et6Var.f();
        Iterator<rb4> it = list.iterator();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        IDMComponent iDMComponent = null;
        ArrayList arrayList3 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = -1;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            rb4 next = it.next();
            if (next instanceof o1o) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                o1o o1oVar = (o1o) next;
                IDMComponent a2 = o1oVar.a();
                IDMComponent b = o1oVar.b();
                if (h.contains(b)) {
                    int indexOf = h.indexOf(b);
                    h.remove(indexOf);
                    h.add(indexOf, a2);
                    z3 = true;
                } else if (f.contains(b)) {
                    int indexOf2 = f.indexOf(b);
                    f.remove(indexOf2);
                    f.add(indexOf2, a2);
                    z4 = true;
                } else {
                    if (c.contains(b)) {
                        arrayList3.add(a2);
                    }
                    if (i2 > 0 && arrayList3.size() > 0) {
                        i = c.indexOf(b);
                        if (Math.abs(i - i2) > 1) {
                            z = true;
                            break;
                        }
                    } else {
                        i = 0;
                    }
                    i2 = i;
                }
            }
            if (next instanceof db7) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((db7) next).a());
            }
            if (next instanceof fbf) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                fbf fbfVar = (fbf) next;
                iDMComponent = fbfVar.b();
                arrayList2.addAll(fbfVar.a());
            }
        }
        if (a(arrayList3, arrayList, arrayList2) < 2) {
            z2 = z;
        }
        if (z2) {
            aVar.T(hVar);
            aVar.V(127);
            return;
        }
        b(z3, z4, arrayList3, arrayList, arrayList2, iDMComponent, hVar, aVar);
    }
}
