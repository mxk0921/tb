package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.hhz;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ehz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ehz INSTANCE = new ehz();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18588a = ciz.Companion.c();
    public static final boolean b = true;
    public static final ihz c = new ihz();

    static {
        t2o.a(598737334);
    }

    public static /* synthetic */ hhz j(ehz ehzVar, d0z d0zVar, n9z n9zVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("147ac5cd", new Object[]{ehzVar, d0zVar, n9zVar, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return ehzVar.i(d0zVar, n9zVar, z);
    }

    public final boolean a(hhz hhzVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a0c3f7e", new Object[]{this, hhzVar})).booleanValue();
        }
        ckf.g(hhzVar, "<this>");
        if (hhzVar instanceof hhz.l) {
            z = true;
        } else {
            z = hhzVar instanceof hhz.n;
        }
        if (z) {
            return false;
        }
        if (hhzVar instanceof hhz.b) {
            z2 = true;
        } else {
            z2 = hhzVar instanceof hhz.g;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = hhzVar instanceof hhz.i;
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = hhzVar instanceof hhz.d;
        }
        if (z4) {
            z5 = true;
        } else {
            z5 = hhzVar instanceof hhz.f;
        }
        if (z5) {
            z6 = true;
        } else {
            z6 = hhzVar instanceof hhz.m;
        }
        if (z6) {
            return hhzVar.e();
        }
        return true;
    }

    public final Object b(hhz hhzVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ff97bd6", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "<this>");
        if (!(hhzVar instanceof hhz.l)) {
            z = hhzVar instanceof hhz.n;
        }
        if (z) {
            return null;
        }
        if (hhzVar instanceof hhz.g) {
            return Integer.valueOf(((hhz.g) hhzVar).J());
        }
        if (hhzVar instanceof hhz.i) {
            return Long.valueOf(((hhz.i) hhzVar).J());
        }
        if (hhzVar instanceof hhz.d) {
            return Double.valueOf(((hhz.d) hhzVar).J());
        }
        if (hhzVar instanceof hhz.f) {
            return Float.valueOf(((hhz.f) hhzVar).J());
        }
        if (hhzVar instanceof hhz.b) {
            return Boolean.valueOf(((hhz.b) hhzVar).M());
        }
        if (hhzVar instanceof hhz.m) {
            return ((hhz.m) hhzVar).J();
        }
        if (hhzVar instanceof hhz.h) {
            return ((hhz.h) hhzVar).M();
        }
        if (hhzVar instanceof hhz.j) {
            return ((hhz.j) hhzVar).M();
        }
        return null;
    }

    public final hhz d(hhz hhzVar, hhz hhzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("860f4b4d", new Object[]{this, hhzVar, hhzVar2});
        }
        if (hhzVar instanceof hhz.l) {
            return hhz.Companion.m();
        }
        if (hhzVar instanceof hhz.h) {
            return f(((hhz.h) hhzVar).M(), (int) hhzVar2.f());
        }
        if (!(hhzVar instanceof hhz.j)) {
            throw new NCExprException("get property on left " + hhzVar.h() + "  right " + hhzVar2.h() + " is not allowed");
        } else if (hhzVar2 instanceof hhz.m) {
            return g(((hhz.j) hhzVar).M(), hhzVar2.p());
        } else {
            throw new NCExprException(ckf.p("get property on map is not allowed of type: ", hhzVar2.h()));
        }
    }

    public final hhz e(int i, n9z n9zVar, Map<?, ?> map, o9z o9zVar, dhz dhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("ef76ed99", new Object[]{this, new Integer(i), n9zVar, map, o9zVar, dhzVar});
        }
        d0z a2 = n9zVar.a(i);
        if (a2 != null) {
            n(ckf.p("开始执行表达式 executeExpr   index ", Integer.valueOf(i)));
            hhz o = o(a2, map, n9zVar, o9zVar, dhzVar);
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j("结束执行表达式 executeExpr   index " + i + " ret " + INSTANCE.b(o));
            }
            return o;
        }
        throw new RuntimeException("找不到 index " + i + "对应的表达式");
    }

    public final hhz f(List<? extends Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("57978f79", new Object[]{this, list, new Integer(i)});
        }
        if (list == null) {
            return hhz.Companion.m();
        }
        return hhz.Companion.k(list.get(i));
    }

    public final hhz g(Map<String, ? extends Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("1295146c", new Object[]{this, map, str});
        }
        if (map == null) {
            return hhz.Companion.m();
        }
        return hhz.Companion.k(map.get(str));
    }

    public final hhz h(hhz hhzVar, hhz hhzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("a3be6199", new Object[]{this, hhzVar, hhzVar2});
        }
        if (hhzVar instanceof hhz.l) {
            return hhz.Companion.m();
        }
        if (hhzVar instanceof hhz.m) {
            if (!hhzVar2.x()) {
                throw new NCExprException(ckf.p("get property on string is not allowed of key: ", hhzVar2.h()));
            } else if (ckf.b(hhzVar2.p(), pg1.ATOM_length)) {
                return hhz.Companion.d(hhzVar.p().length());
            } else {
                throw new NCExprException(ckf.p("get property on string is not allowed of key: ", hhzVar2.h()));
            }
        } else if (hhzVar instanceof hhz.h) {
            if (hhzVar2.x()) {
                if (ckf.b(pg1.ATOM_length, hhzVar2.p()) || ckf.b("size", hhzVar2.p())) {
                    return hhz.Companion.d(((hhz.h) hhzVar).M().size());
                }
                return f(((hhz.h) hhzVar).M(), hhzVar2.l());
            } else if (hhzVar2.s()) {
                return f(((hhz.h) hhzVar).M(), hhzVar2.l());
            } else {
                throw new NCExprException(ckf.p("get property on array is not allowed of key: ", hhzVar2.h()));
            }
        } else if (!(hhzVar instanceof hhz.j)) {
            throw new NCExprException("get property on left " + hhzVar.h() + "  right " + hhzVar2.h() + " is not allowed");
        } else if (!hhzVar2.x()) {
            throw new NCExprException(ckf.p("get property map is not allowed of type: ", hhzVar2.h()));
        } else if (ckf.b("size", hhzVar2.p())) {
            return hhz.Companion.d(((hhz.j) hhzVar).M().size());
        } else {
            String p = hhzVar2.p();
            if (ckf.b(p, "size")) {
                return hhz.Companion.d(((hhz.j) hhzVar).M().size());
            }
            if (ckf.b(p, "result")) {
                return hhz.Companion.f(((hhz.j) hhzVar).M().get("result"));
            }
            return g(((hhz.j) hhzVar).M(), hhzVar2.p());
        }
    }

    public final hhz i(d0z d0zVar, n9z n9zVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("bdcca347", new Object[]{this, d0zVar, n9zVar, new Boolean(z)});
        }
        int c2 = d0zVar.c();
        if (u6z.Companion.a(c2)) {
            int f = d0zVar.f();
            String[] strArr = new String[f];
            for (int i = 0; i < f; i++) {
                String c3 = n9zVar.c(d0zVar.f());
                ckf.d(c3);
                strArr[i] = c3;
            }
            Map<String, Object> data = n9zVar.getData();
            if (data == null) {
                return hhz.Companion.m();
            }
            return l(data, strArr, c2);
        }
        throw new NCExprException(ckf.p("OP_GET_DATA Unsupported dataType: ", Integer.valueOf(c2)));
    }

    public final String k(n9z n9zVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("199b0f8d", new Object[]{this, n9zVar, new Integer(i)});
        }
        return n9zVar.c(i);
    }

    public final hhz m(int i, n9z n9zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("2b069156", new Object[]{this, new Integer(i), n9zVar});
        }
        ckf.g(n9zVar, "exprContext");
        return e(i, n9zVar, n9zVar.a(), n9zVar.b(), n9zVar.e());
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e14ff1e", new Object[]{this, str});
            return;
        }
        ckf.g(str, "str");
        if (f18588a) {
            iiz.Companion.l("NanoComposerExpressionVM", str);
        }
    }

    public final hhz o(d0z d0zVar, Map<?, ?> map, n9z n9zVar, o9z o9zVar, dhz dhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("3f5fdda2", new Object[]{this, d0zVar, map, n9zVar, o9zVar, dhzVar});
        }
        ckf.g(d0zVar, "bytes");
        ckf.g(n9zVar, "INCExprContext");
        ckf.g(o9zVar, "INCExprGetFuncByName");
        chz<hhz> chzVar = new chz<>(0, 1, null);
        if (d0zVar.z() > 0) {
            p(d0zVar, d0zVar.z(), map, n9zVar, chzVar, o9zVar, dhzVar);
            if (chzVar.size() > 1 && iiz.c()) {
                iiz.Companion.k("NanoExpressionVM: more than one value in stack");
            }
            if (chzVar.d()) {
                return chzVar.pop();
            }
            return hhz.Companion.n();
        }
        throw new NCExprException("NanoExpressionVM: empty expression bytes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1bba A[LOOP:0: B:7:0x0056->B:868:0x1bba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x1bc8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r37v0, types: [tb.cgz] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(tb.d0z r45, int r46, java.util.Map<?, ?> r47, tb.n9z r48, tb.chz<tb.hhz> r49, tb.o9z r50, tb.dhz r51) {
        /*
            Method dump skipped, instructions count: 7298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ehz.p(tb.d0z, int, java.util.Map, tb.n9z, tb.chz, tb.o9z, tb.dhz):void");
    }

    public final boolean q(hhz hhzVar, hhz hhzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96a2dcb6", new Object[]{this, hhzVar, hhzVar2})).booleanValue();
        }
        if (ckf.b(dun.b(hhzVar2.getClass()), dun.b(hhzVar.getClass()))) {
            return ckf.b(hhzVar2, hhzVar);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r6.equals("List") == false) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r6.equals(tb.pg1.ATOM_Map) == false) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r6.equals("MutableList") == false) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        return r5 instanceof tb.hhz.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        return r5 instanceof tb.hhz.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r6.equals("MutableMap") == false) goto L_0x0058;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(tb.hhz r5, java.lang.String r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ehz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "73bc8c73"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001f:
            java.lang.String r0 = "<this>"
            tb.ckf.g(r5, r0)
            java.lang.String r0 = "type"
            tb.ckf.g(r6, r0)
            int r0 = r6.hashCode()
            switch(r0) {
                case -137346876: goto L_0x0050;
                case 77116: goto L_0x0044;
                case 2368702: goto L_0x003b;
                case 134117494: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0058
        L_0x0032:
            java.lang.String r0 = "MutableMap"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0058
        L_0x003b:
            java.lang.String r0 = "List"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x0058
        L_0x0044:
            java.lang.String r0 = "Map"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0058
        L_0x004d:
            boolean r5 = r5 instanceof tb.hhz.j
            goto L_0x0063
        L_0x0050:
            java.lang.String r0 = "MutableList"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0061
        L_0x0058:
            java.lang.String r5 = r5.E()
            boolean r5 = r6.equals(r5)
            goto L_0x0063
        L_0x0061:
            boolean r5 = r5 instanceof tb.hhz.h
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ehz.r(tb.hhz, java.lang.String):boolean");
    }

    public final List<lfz> c(chz<hhz> chzVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dba39b64", new Object[]{this, chzVar, new Integer(i)});
        }
        ckf.g(chzVar, "varStack");
        ArrayList arrayList = new ArrayList();
        if (i % 2 == 0) {
            ydf m = hfn.m(hfn.n(0, i), 2);
            int c2 = m.c();
            int d = m.d();
            int e = m.e();
            if ((e > 0 && c2 <= d) || (e < 0 && d <= c2)) {
                while (true) {
                    c2 += e;
                    hhz pop = chzVar.pop();
                    hhz pop2 = chzVar.pop();
                    if (pop2 instanceof hhz.g) {
                        arrayList.add(0, qfz.INSTANCE.a(((hhz.g) pop2).J(), pop.g()));
                        if (c2 == d) {
                            break;
                        }
                    } else {
                        throw new IllegalArgumentException("create modifier key is not int32; type: " + pop2.E() + " value: " + pop2);
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("create modifier argc % 2 != 0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [tb.hhz$c] */
    public final hhz l(Map<String, ? extends Object> map, String[] strArr, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("f18b7001", new Object[]{this, map, strArr, new Integer(i)});
        }
        ckf.g(map, "<this>");
        ckf.g(strArr, "keyPath");
        int length = strArr.length;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            if (map instanceof Map) {
                map = ((Map) map).get(str);
            } else if (!(map instanceof List)) {
                return hhz.Companion.m();
            } else {
                map = ((List) map).get(Integer.parseInt(str));
            }
        }
        if (u6z.a(u6z.b(i), map)) {
            return hhz.Companion.f(map);
        }
        return hhz.Companion.m();
    }
}
