package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dxcommon.expression.DXExprException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ay5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final d56 b;
    public ovb c;

    /* renamed from: a  reason: collision with root package name */
    public final List<uw5> f16070a = new ArrayList();
    public final e56 d = new e56();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ovb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vvb f16071a;

        public a(vvb vvbVar) {
            this.f16071a = vvbVar;
        }

        @Override // tb.ovb
        public byte[] a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("cff96e9c", new Object[]{this, new Integer(i)});
            }
            return this.f16071a.a(i);
        }

        @Override // tb.ovb
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("913afbce", new Object[]{this})).intValue();
            }
            return this.f16071a.b();
        }

        @Override // tb.ovb
        public String c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e4adcb34", new Object[]{this, new Integer(i)});
            }
            return this.f16071a.c(i);
        }

        @Override // tb.ovb
        public qwb d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qwb) ipChange.ipc$dispatch("229b4d22", new Object[]{this});
            }
            return this.f16071a.d();
        }

        @Override // tb.ovb
        public uw5 e(int i, uw5 uw5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uw5) ipChange.ipc$dispatch("f69b5189", new Object[]{this, new Integer(i), uw5Var});
            }
            if (i < ay5.a(ay5.this).size()) {
                ay5.a(ay5.this).set(i, uw5Var);
            } else {
                ay5.a(ay5.this).add(uw5Var);
            }
            return uw5Var;
        }

        @Override // tb.ovb
        public d56 f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d56) ipChange.ipc$dispatch("7aceb66c", new Object[]{this});
            }
            return ay5.this.b;
        }

        @Override // tb.ovb
        public vvb g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vvb) ipChange.ipc$dispatch("1a0156f1", new Object[]{this});
            }
            return this.f16071a;
        }

        @Override // tb.ovb
        public uw5 h(uw5 uw5Var, qwb qwbVar, uw5 uw5Var2, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uw5) ipChange.ipc$dispatch("58200cd5", new Object[]{this, uw5Var, qwbVar, uw5Var2, new Integer(i), uw5VarArr, map});
            }
            if (this.f16071a.b() == 3) {
                return uw5Var.r().execute((DXRuntimeContext) qwbVar, uw5Var2, i, uw5VarArr, map);
            }
            throw new DXExprException("execute func 失败");
        }

        @Override // tb.ovb
        public uw5 i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uw5) ipChange.ipc$dispatch("ef5783b0", new Object[]{this, new Integer(i)});
            }
            uw5 uw5Var = (uw5) ay5.a(ay5.this).get(i);
            if (uw5Var != null) {
                return uw5Var;
            }
            throw new DXExprException("获取不到对应的变量 " + i);
        }

        @Override // tb.ovb
        public wx5 j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wx5) ipChange.ipc$dispatch("853ec54d", new Object[]{this, new Integer(i)});
            }
            if (this.f16071a.b() == 3) {
                return ((DXRuntimeContext) d()).z(i);
            }
            throw new DXExprException("找不到对应的 inner 方法 " + i);
        }

        @Override // tb.ovb
        public Object k(wx5 wx5Var, uw5[] uw5VarArr, vvb vvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("eb57884f", new Object[]{this, wx5Var, uw5VarArr, vvbVar});
            }
            if (vvbVar.b() == 3) {
                return ((DXRuntimeContext) d()).r().I().a(wx5Var, uw5VarArr, vvbVar);
            }
            throw new DXExprException("invokeFunc 失败");
        }
    }

    static {
        t2o.a(444597915);
    }

    public ay5(d56 d56Var) {
        this.b = d56Var;
    }

    public static /* synthetic */ List a(ay5 ay5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ee7c783a", new Object[]{ay5Var});
        }
        return ay5Var.f16070a;
    }

    public ovb b(vvb vvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovb) ipChange.ipc$dispatch("83bb85ed", new Object[]{this, vvbVar});
        }
        if (this.c == null) {
            this.c = new a(vvbVar);
        }
        return this.c;
    }

    public uw5 c(wx5 wx5Var, uw5[] uw5VarArr, vvb vvbVar) {
        e56 e56Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("d3e9cb15", new Object[]{this, wx5Var, uw5VarArr, vvbVar});
        }
        if (wx5Var != null) {
            int a2 = wx5Var.a();
            if (wx5Var.a() > 0) {
                if (uw5VarArr == null) {
                    throw new IllegalArgumentException("调用方法时，入参跟需要的参数不匹配 入参为数量为0  需要的数量 " + a2);
                } else if (a2 == uw5VarArr.length) {
                    ((ArrayList) this.f16070a).addAll(Arrays.asList(uw5VarArr));
                } else {
                    throw new IllegalArgumentException("调用方法时，入参跟需要的参数不匹配 入参数量" + uw5VarArr.length + " 需要的数量 " + a2);
                }
            }
            if (wx5Var.b() != null) {
                for (uvb uvbVar : wx5Var.b()) {
                    if (uvbVar instanceof vx5) {
                        uw5 b = this.b.b(((vx5) uvbVar).a(), b(vvbVar), null, this.d);
                        if (!(b == null || (e56Var = this.d) == null || !e56Var.a())) {
                            this.d.b(false);
                            return b;
                        }
                    } else if (uvbVar instanceof xx5) {
                        return uw5.T(((xx5) uvbVar).a());
                    } else {
                        throw new DXExprException("func 中不认识的 code类型");
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("funcModel 不允许为空");
    }
}
