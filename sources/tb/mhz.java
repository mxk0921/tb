package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mhz INSTANCE = new mhz();

    static {
        t2o.a(598737317);
    }

    public final n9z a(jhz jhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9z) ipChange.ipc$dispatch("b6f2e5c4", new Object[]{this, jhzVar});
        }
        ckf.g(jhzVar, "funcContext");
        return new wgz(jhzVar);
    }

    public final hhz b(int i, jhz jhzVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("e42d0d36", new Object[]{this, new Integer(i), jhzVar});
        }
        ckf.g(jhzVar, "funcContext");
        if (i == Integer.MAX_VALUE) {
            return hhz.Companion.m();
        }
        List<d0z> f = jhzVar.f();
        if (f != null) {
            i2 = f.size();
        }
        if (i < i2) {
            return ehz.INSTANCE.m(i, a(jhzVar));
        }
        throw new IllegalStateException("exprIndex 不合法");
    }

    public final hhz c(n7z n7zVar, hhz[] hhzVarArr, jhz jhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("5ee28806", new Object[]{this, n7zVar, hhzVarArr, jhzVar});
        }
        ckf.g(n7zVar, "funcInfo");
        ckf.g(jhzVar, "funcContext");
        dhz i = jhzVar.i();
        int a2 = n7zVar.a();
        if (a2 > 0) {
            if (hhzVarArr == null) {
                throw new IllegalArgumentException(ckf.p("调用方法时，入参跟需要的参数不匹配 入参为数量为0  需要的数量 ", Integer.valueOf(a2)).toString());
            } else if (a2 == hhzVarArr.length) {
                if (iiz.c()) {
                    iiz.Companion.j(ckf.p("NCFuncVM invokeFunc args ", hhzVarArr));
                }
                List<? extends hhz> asList = Arrays.asList(Arrays.copyOf(hhzVarArr, hhzVarArr.length));
                ckf.f(asList, "asList(*args)");
                jhzVar.m(asList);
            } else {
                throw new IllegalArgumentException(("调用方法时，入参跟需要的参数不匹配 入参数量" + hhzVarArr.length + " 需要的数量 " + a2).toString());
            }
        }
        if (n7zVar.b() != null) {
            for (m7z m7zVar : n7zVar.b()) {
                if (m7zVar.c()) {
                    Integer b = m7zVar.b();
                    ckf.d(b);
                    hhz m = ehz.INSTANCE.m(b.intValue(), a(jhzVar));
                    if (!(m == null || i == null || !i.a())) {
                        i.b(false);
                        return m;
                    }
                } else if (m7zVar.d()) {
                    hhz a3 = m7zVar.a();
                    return a3 == null ? hhz.Companion.m() : a3;
                } else {
                    throw new NCExprException("func 中不认识的 code类型");
                }
            }
        }
        return hhz.Companion.m();
    }
}
