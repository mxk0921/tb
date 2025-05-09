package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import tb.nwv;
import tb.pg1;
import tb.qtl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final f.h f12218a;
        public final Object b;

        static {
            t2o.a(503317046);
        }

        public a(f.h hVar, Object obj) {
            this.f12218a = hVar;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12218a != aVar.f12218a) {
                return false;
            }
            Object obj2 = this.b;
            if (!(obj2 instanceof Number) || !(aVar.b instanceof Number)) {
                return nwv.i(obj2, aVar.b);
            }
            if (((Number) obj2).doubleValue() == ((Number) aVar.b).doubleValue()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            f.h hVar = this.f12218a;
            if (hVar == null) {
                i = 0;
            } else {
                i = hVar.hashCode();
            }
            int i3 = (527 + i) * 31;
            Object obj = this.b;
            if (obj != null) {
                i2 = obj.hashCode();
            }
            return i3 + i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final r f12219a;
        public final int b;

        static {
            t2o.a(503317047);
        }

        public b(r rVar, int i) {
            this.f12219a = rVar;
            this.b = i;
        }
    }

    static {
        t2o.a(503317045);
    }

    public static boolean a(n nVar, List<qtl> list, boolean z, boolean z2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16bdbb78", new Object[]{nVar, list, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        for (qtl qtlVar : list) {
            int i = qtlVar.f26923a;
            if (i == 1) {
                nVar.y0(((Integer) qtlVar.b).intValue(), (r) qtlVar.c, z2);
            } else if (i == 2) {
                nVar.O0(((Integer) qtlVar.b).intValue(), ((Integer) qtlVar.c).intValue(), z2);
            } else if (i == 4) {
                nVar.m(((Integer) qtlVar.b).intValue(), ((Integer) qtlVar.c).intValue(), z2);
            } else if (i == 5) {
                nVar.z1((String) qtlVar.b, qtlVar.c, z2);
            }
            z3 = true;
        }
        if (!nVar.D0() && nVar.K() != null) {
            nVar.K().parseViewParams(nVar.I());
        }
        return z3;
    }

    public static void b(r.e eVar, List<r> list, int i, s sVar, List<qtl> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b568ab74", new Object[]{eVar, list, new Integer(i), sVar, list2});
        } else {
            ((r.a) eVar).a(list.get(i), sVar);
        }
    }

    public static boolean c(r.e eVar, r rVar, s sVar, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e077e3bb", new Object[]{eVar, rVar, sVar, new Boolean(z)})).booleanValue();
        }
        if (eVar != null) {
            z2 = ((r.a) eVar).b(rVar, sVar);
        }
        if (z || !z2) {
            return z2;
        }
        return nwv.i(h(eVar, rVar, null), h(eVar, null, sVar));
    }

    public static void d(r.e eVar, List<r> list, s sVar, int i, List<qtl> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c1b2dc", new Object[]{eVar, list, sVar, new Integer(i), list2});
            return;
        }
        r c = ((r.a) eVar).c(sVar);
        list.add(i, c);
        list2.add(new qtl(1, Integer.valueOf(i), c));
    }

    public static HashMap e(r.e eVar, List<r> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7d8318dc", new Object[]{eVar, list, new Integer(i), new Integer(i2)});
        }
        HashMap hashMap = new HashMap();
        while (i <= i2) {
            r rVar = list.get(i);
            Object h = h(eVar, rVar, null);
            if (h != null) {
                hashMap.put(h, new b(rVar, i));
            }
            i++;
        }
        return hashMap;
    }

    public static void f(List<r> list, List<s> list2, r.e eVar, List<qtl> list3) {
        r rVar;
        r rVar2;
        s sVar;
        s sVar2;
        b bVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e060283a", new Object[]{list, list2, eVar, list3});
            return;
        }
        int size = list.size() - 1;
        int size2 = list2.size() - 1;
        HashMap hashMap = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= size && i3 <= size2) {
            if (i2 < 0 || i2 >= list.size()) {
                rVar = null;
            } else {
                rVar = list.get(i2);
            }
            if (size < 0 || size >= list.size()) {
                rVar2 = null;
            } else {
                rVar2 = list.get(size);
            }
            if (i3 < 0 || i3 >= list2.size()) {
                sVar = null;
            } else {
                sVar = list2.get(i3);
            }
            if (size2 < 0 || size2 >= list2.size()) {
                sVar2 = null;
            } else {
                sVar2 = list2.get(size2);
            }
            if (c(eVar, rVar, sVar, false)) {
                b(eVar, list, i2, sVar, list3);
            } else {
                if (c(eVar, rVar2, sVar2, false)) {
                    b(eVar, list, size, sVar2, list3);
                } else if (c(eVar, rVar, sVar2, false)) {
                    b(eVar, list, i2, sVar2, list3);
                    i(list, i2, size + 1, list3);
                } else if (c(eVar, rVar2, sVar, false)) {
                    b(eVar, list, size, sVar, list3);
                    i(list, size, i2, list3);
                } else {
                    Object h = h(eVar, null, sVar);
                    if (h != null && hashMap == null) {
                        hashMap = e(eVar, list, i2, size);
                    }
                    if (h != null) {
                        bVar = (b) hashMap.remove(h);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        if (bVar.f12219a == list.get(bVar.b)) {
                            i = bVar.b;
                        } else {
                            i = list.indexOf(bVar.f12219a);
                        }
                        b(eVar, list, i, sVar, list3);
                        i(list, i, i2, list3);
                        i3++;
                        i2++;
                    } else {
                        d(eVar, list, sVar, i2, list3);
                        i2++;
                        size++;
                        i3++;
                    }
                }
                size--;
                size2--;
            }
            i2++;
            i3++;
        }
        if (i2 > size) {
            while (i3 <= size2) {
                d(eVar, list, list2.get(i3), i3, list3);
                i3++;
            }
        } else if (i3 > size2) {
            j(list, i3, (size - i2) + 1, list3);
        }
    }

    public static Object h(r.e eVar, r rVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("688b3ada", new Object[]{eVar, rVar, sVar});
        }
        if (eVar != null) {
            return ((r.a) eVar).d(rVar, sVar);
        }
        return null;
    }

    public static void i(List<r> list, int i, int i2, List<qtl> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5958f7f5", new Object[]{list, new Integer(i), new Integer(i2), list2});
            return;
        }
        r remove = list.remove(i);
        if (i > i2) {
            list.add(i2, remove);
        } else if (i < i2) {
            list.add(i2 - 1, remove);
        }
        list2.add(new qtl(2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void j(List<r> list, int i, int i2, List<qtl> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4669eeef", new Object[]{list, new Integer(i), new Integer(i2), list2});
            return;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            r remove = list.remove(i + i3);
            if (remove != null) {
                remove.c = null;
            }
        }
        list2.add(new qtl(4, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aad6520", new Object[]{str})).booleanValue();
        }
        return str.equals("html-text") || str.equals("text") || str.contains("width") || str.contains("height") || str.startsWith("padding") || str.startsWith("margin") || str.equals(pg1.ATOM_EXT_UDL_font_size) || str.equals("top") || str.equals("left") || str.equals("right") || str.equals("bottom") || str.equals("font") || str.equals(pg1.ATOM_EXT_UDL_font_style) || str.equals(Constants.Name.LINES) || str.equals("attrs");
    }
}
