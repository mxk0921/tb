package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28994a = true;
    public final Stack<uw5> b = new Stack<>();
    public final rvb c;

    static {
        t2o.a(444597776);
    }

    public tw5(rvb rvbVar) {
        this.c = rvbVar;
    }

    public static boolean e() {
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

    public final uw5 b(uw5 uw5Var, uw5 uw5Var2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("d6562a95", new Object[]{this, uw5Var, uw5Var2, dXRuntimeContext});
        }
        switch (uw5Var.x()) {
            case 1:
                return uw5.V();
            case 2:
                if (a(uw5Var2)) {
                    return uw5Var;
                }
                throw new IllegalStateException("get property on int is not allowed");
            case 3:
                if (a(uw5Var2)) {
                    return uw5Var;
                }
                throw new IllegalStateException("get property on float is not allowed");
            case 4:
                if (a(uw5Var2)) {
                    return uw5Var;
                }
                throw new IllegalStateException("get property on bool is not allowed");
            case 5:
                if (uw5Var2.M() && pg1.ATOM_length.equals(uw5Var2.w())) {
                    return uw5.S(uw5Var.w().length());
                }
                if (a(uw5Var2)) {
                    return uw5Var;
                }
                throw new IllegalStateException("get property on string is not allowed of key: " + uw5Var2.j());
            case 6:
                if (uw5Var2.M()) {
                    if (a(uw5Var2)) {
                        return uw5Var;
                    }
                    if (pg1.ATOM_length.equals(uw5Var2.w()) || "size".equals(uw5Var2.w())) {
                        return uw5.S(uw5Var.n().size());
                    }
                    return c(uw5Var.n(), (int) uw5Var2.g());
                } else if (uw5Var2.F()) {
                    return c(uw5Var.n(), uw5Var2.s());
                } else {
                    throw new IllegalStateException("get property on array is not allowed of key: " + uw5Var2.j());
                }
            case 7:
                if (!uw5Var2.M()) {
                    throw new IllegalStateException("get property object is not allowed of type: " + uw5Var2.y());
                } else if ("size".equals(uw5Var2.w())) {
                    return uw5.S(uw5Var.v().size());
                } else {
                    uw5 d = d(uw5Var.v(), uw5Var2.w());
                    return (!d.J() || !a(uw5Var2)) ? d : uw5Var;
                }
            case 8:
                if (uw5Var2.M()) {
                    return uw5Var.p().a(uw5Var2.w());
                }
                throw new IllegalStateException("get property on builtinObject is not allowed of type: " + uw5Var2.y());
            case 9:
                throw new IllegalStateException("get property on function is not allowed");
            case 10:
                if (!uw5Var2.M()) {
                    throw new IllegalStateException("get property object is not allowed of type: " + uw5Var2.y());
                } else if ((uw5Var.z() instanceof DXRuntimeContext) && uw5Var2.z().toString().equals("data")) {
                    return uw5.U(((DXRuntimeContext) uw5Var.z()).i());
                } else {
                    lub B = dXRuntimeContext.B();
                    if (B != null) {
                        Object a2 = B.a(uw5Var.z(), uw5Var2.z().toString());
                        return (a2 != null || !a(uw5Var2)) ? uw5.T(a2) : uw5Var;
                    }
                    throw new IllegalStateException("get property object is not allowed of type: " + uw5Var2.y());
                }
            default:
                throw new IllegalStateException("Unsupported type: " + uw5Var.x());
        }
    }

    public final uw5 c(List<Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("c9607c35", new Object[]{this, list, new Integer(i)});
        }
        if (list == null) {
            return uw5.V();
        }
        return uw5.T(list.get(i));
    }

    public final uw5 d(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("f50ce2", new Object[]{this, map, str});
        }
        if (map == null) {
            return uw5.V();
        }
        return uw5.T(map.get(str));
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5017e4bb", new Object[]{this})).booleanValue();
        }
        k(e());
        return this.f28994a;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e14ff1e", new Object[]{this, str});
        } else if (f()) {
            h36.g("nov_expr", str);
        }
    }

    public final uw5 h(DXRuntimeContext dXRuntimeContext, String str, zwb zwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("d2fc41d", new Object[]{this, dXRuntimeContext, str, zwbVar});
        }
        return zwbVar.a(dXRuntimeContext, str).b();
    }

    public uw5 i(DXRuntimeContext dXRuntimeContext, byte[] bArr, SparseArray<Object> sparseArray, zwb zwbVar, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("56e2c6ff", new Object[]{this, dXRuntimeContext, bArr, sparseArray, zwbVar, map});
        }
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalStateException("DXExpressionVM: empty expression bytes");
        }
        j(dXRuntimeContext, bArr, bArr.length, sparseArray, zwbVar, map);
        if (this.b.size() == 1) {
            return this.b.pop();
        }
        throw new IllegalStateException("DXExpressionVM: expression has error count return value");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x09d9, code lost:
        if (r32.b.pop().b() != false) goto L_0x0557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0a12, code lost:
        if (r32.b.pop().b() == false) goto L_0x0557;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.taobao.android.dinamicx.DXRuntimeContext r33, byte[] r34, int r35, android.util.SparseArray<java.lang.Object> r36, tb.zwb r37, java.util.Map r38) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 3706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tw5.j(com.taobao.android.dinamicx.DXRuntimeContext, byte[], int, android.util.SparseArray, tb.zwb, java.util.Map):void");
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c81235", new Object[]{this, new Boolean(z)});
        } else {
            this.f28994a = z;
        }
    }

    public final boolean l(uw5 uw5Var, uw5 uw5Var2) {
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
                    throw new IllegalArgumentException("invalid type");
            }
        } else if (uw5Var2.b0() == uw5Var.b0()) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXExpressionVM{ mVarStack=" + this.b + '}';
    }

    public final boolean a(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e991bf29", new Object[]{this, uw5Var})).booleanValue();
        }
        return uw5Var.M() && "value".equals(uw5Var.w());
    }
}
