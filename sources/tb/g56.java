package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dxcommon.expression.DXExprException;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g56 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int API_3 = 3;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19732a = true;
    public final ww5 b = new ww5();

    static {
        t2o.a(444597896);
    }

    public static boolean h() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f11a6a8", new Object[0])).booleanValue();
        }
        if (!DinamicXEngine.j0() || (listFiles = new File("/data/local/tmp/.expressionVM").listFiles()) == null) {
            return false;
        }
        for (File file : listFiles) {
            if (file.getName().contains(".printCode")) {
                return true;
            }
        }
        return false;
    }

    public final wub a(ovb ovbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wub) ipChange.ipc$dispatch("f448b662", new Object[]{this, ovbVar});
        }
        if (ovbVar.b() == 3) {
            return new w16(ovbVar);
        }
        return null;
    }

    public final uw5 c(uw5 uw5Var, uw5 uw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("a97134e6", new Object[]{this, uw5Var, uw5Var2});
        }
        switch (uw5Var.x()) {
            case 1:
                return uw5.V();
            case 2:
                if (b(uw5Var2)) {
                    return uw5Var;
                }
                throw new DXExprException("get property on int is not allowed");
            case 3:
                if (b(uw5Var2)) {
                    return uw5Var;
                }
                throw new DXExprException("get property on float is not allowed");
            case 4:
                if (b(uw5Var2)) {
                    return uw5Var;
                }
                throw new DXExprException("get property on bool is not allowed");
            case 5:
                if (uw5Var2.M() && pg1.ATOM_length.equals(uw5Var2.w())) {
                    return uw5.S(uw5Var.w().length());
                }
                if (b(uw5Var2)) {
                    return uw5Var;
                }
                throw new DXExprException("get property on string is not allowed of key: " + uw5Var2.j());
            case 6:
                if (uw5Var2.M()) {
                    if (b(uw5Var2)) {
                        return uw5Var;
                    }
                    if (pg1.ATOM_length.equals(uw5Var2.w()) || "size".equals(uw5Var2.w())) {
                        return uw5.S(uw5Var.n().size());
                    }
                    return e(uw5Var.n(), (int) uw5Var2.g());
                } else if (uw5Var2.F()) {
                    return e(uw5Var.n(), uw5Var2.s());
                } else {
                    throw new DXExprException("get property on array is not allowed of key: " + uw5Var2.j());
                }
            case 7:
                if (!uw5Var2.M()) {
                    throw new DXExprException("get property object is not allowed of type: " + uw5Var2.y());
                } else if ("size".equals(uw5Var2.w())) {
                    return uw5.S(uw5Var.v().size());
                } else {
                    uw5 f = f(uw5Var.v(), uw5Var2.w());
                    return (!f.J() || !b(uw5Var2)) ? f : uw5Var;
                }
            case 8:
                if (uw5Var2.M()) {
                    return uw5Var.p().a(uw5Var2.w());
                }
                throw new DXExprException("get property on builtinObject is not allowed of type: " + uw5Var2.y());
            case 9:
                throw new DXExprException("get property on function is not allowed");
            case 10:
                throw new DXExprException("get property object is not allowed of type: " + uw5Var2.y());
            default:
                throw new DXExprException("Unsupported type: " + uw5Var.x());
        }
    }

    public final uw5 e(List<Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("c9607c35", new Object[]{this, list, new Integer(i)});
        }
        if (list == null) {
            return uw5.V();
        }
        return uw5.T(list.get(i));
    }

    public final uw5 f(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("f50ce2", new Object[]{this, map, str});
        }
        if (map == null) {
            return uw5.V();
        }
        return uw5.T(map.get(str));
    }

    public final String g(ovb ovbVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93568b48", new Object[]{this, ovbVar, new Integer(i)});
        }
        return ovbVar.c(i);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5017e4bb", new Object[]{this})).booleanValue();
        }
        m(h());
        return this.f19732a;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e14ff1e", new Object[]{this, str});
        } else if (i()) {
            h36.g("DXNanoExpressionVM", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0f8d  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0f92 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(tb.qwb r35, byte[] r36, int r37, java.util.Map r38, tb.ovb r39, tb.jw5<tb.uw5> r40, tb.pvb r41, tb.e56 r42) {
        /*
            Method dump skipped, instructions count: 4154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g56.k(tb.qwb, byte[], int, java.util.Map, tb.ovb, tb.jw5, tb.pvb, tb.e56):void");
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c81235", new Object[]{this, new Boolean(z)});
        } else {
            this.f19732a = z;
        }
    }

    public final boolean n(uw5 uw5Var, uw5 uw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dac3b0ba", new Object[]{this, uw5Var, uw5Var2})).booleanValue();
        }
        if (uw5Var2.x() == uw5Var.x()) {
            switch (uw5Var2.x()) {
                case 1:
                    return true;
                case 2:
                    if (uw5Var2.s() == uw5Var.s()) {
                        return true;
                    }
                    break;
                case 3:
                    if (rg5.a(uw5Var2.q(), uw5Var.q()) == 0) {
                        return true;
                    }
                    break;
                case 4:
                    if (uw5Var2.o() == uw5Var.o()) {
                        return true;
                    }
                    break;
                case 5:
                    return uw5Var2.w().equals(uw5Var.w());
                case 6:
                case 7:
                case 8:
                case 9:
                    return uw5Var2.L(uw5Var);
                default:
                    throw new DXExprException("invalid type");
            }
        } else if (uw5Var2.b0() == uw5Var.b0()) {
            return true;
        }
        return false;
    }

    public uw5 d(int i, ovb ovbVar, Map map, pvb pvbVar, e56 e56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("2ff229d1", new Object[]{this, new Integer(i), ovbVar, map, pvbVar, e56Var});
        }
        byte[] a2 = ovbVar.a(i);
        if (a2 != null) {
            qwb d = ovbVar.d();
            if (ovbVar.b() == 3) {
                return l(d, a2, map, ovbVar, pvbVar, e56Var);
            }
            return uw5.V();
        }
        throw new RuntimeException("找不到 index " + i + "对应的表达式");
    }

    public final boolean b(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e991bf29", new Object[]{this, uw5Var})).booleanValue();
        }
        return uw5Var.M() && "value".equals(uw5Var.w());
    }

    public uw5 l(qwb qwbVar, byte[] bArr, Map map, ovb ovbVar, pvb pvbVar, e56 e56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("a42a7217", new Object[]{this, qwbVar, bArr, map, ovbVar, pvbVar, e56Var});
        }
        jw5<uw5> jw5Var = new jw5<>();
        if (bArr == null || bArr.length <= 0) {
            throw new DXExprException("DXNanoExpressionVM: empty expression bytes");
        }
        k(qwbVar, bArr, bArr.length, map, ovbVar, jw5Var, pvbVar, e56Var);
        if (jw5Var.d() == 1) {
            return jw5Var.b();
        }
        h36.g("DXNanoExpressionVM", "mVarStack.size() != 1 " + jw5Var.d());
        return uw5.Y();
    }
}
