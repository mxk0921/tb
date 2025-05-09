package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ai5 f = new ai5();
    public static final wq5 g = new wq5();
    public static final oo5 h = new oo5();
    public static final zj5 i = new zj5();
    public static final jo5 j = new jo5();
    public static final rl5 k = new rl5();
    public static final fk5 l = new fk5();
    public static final ro5 m = new ro5();
    public static final sl5 n = new sl5();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23607a = true;
    public final aw5 b = new aw5();
    public final ArrayList<mw5> c = new ArrayList<>();
    public final Stack<mw5> d = new Stack<>();
    public boolean e = false;

    static {
        t2o.a(444596834);
    }

    public void a(byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e1f787", new Object[]{this, bArr, new Integer(i2)});
            return;
        }
        this.e = true;
        this.b.g(bArr, i2);
        int d = this.b.d();
        this.c.clear();
        this.c.ensureCapacity(d);
        for (int i3 = 0; i3 < d; i3++) {
            this.c.add(null);
        }
    }

    public final mw5 b(mw5 mw5Var, mw5 mw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("7fce2e9b", new Object[]{this, mw5Var, mw5Var2});
        }
        if (mw5Var.B() && mw5Var2.B()) {
            return j(mw5Var.b() + mw5Var2.b());
        }
        if (mw5Var.w()) {
            mw5Var = j(mw5Var.b());
        }
        if (mw5Var2.w()) {
            mw5Var2 = j(mw5Var2.b());
        }
        return mw5.O(mw5Var.toString() + mw5Var2.toString());
    }

    public final mw5 c(mw5 mw5Var, mw5 mw5Var2, DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, nb5 nb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("575fba4d", new Object[]{this, mw5Var, mw5Var2, dXEvent, dXRuntimeContext, nb5Var});
        }
        mw5[] mw5VarArr = {mw5Var, mw5Var2};
        by5 by5Var = new by5();
        by5Var.b(dXEvent);
        try {
            return nb5Var.call(dXRuntimeContext, null, 2, mw5VarArr, by5Var);
        } catch (Throwable th) {
            mw5.M();
            throw new IllegalArgumentException("FunctionError: " + th.getMessage(), th);
        }
    }

    public final mw5 d(mw5 mw5Var, mw5 mw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("11cc40ab", new Object[]{this, mw5Var, mw5Var2});
        }
        if (mw5Var.B() || mw5Var2.B()) {
            return j(mw5Var.b() / mw5Var2.b());
        }
        throw new IllegalStateException("Can't do " + mw5Var + " / " + mw5Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.mw5 e(com.taobao.android.dinamicx.DXRuntimeContext r6, tb.mw5 r7, tb.mw5 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lw5.e(com.taobao.android.dinamicx.DXRuntimeContext, tb.mw5, tb.mw5, boolean):tb.mw5");
    }

    public final mw5 f(mw5 mw5Var, mw5 mw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("b68ec5d8", new Object[]{this, mw5Var, mw5Var2});
        }
        if (mw5Var.B() || mw5Var2.B()) {
            return j(mw5Var.b() * mw5Var2.b());
        }
        throw new IllegalStateException("Can't do " + mw5Var + " * " + mw5Var2);
    }

    public final mw5 g(mw5 mw5Var, mw5 mw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("54eda6dc", new Object[]{this, mw5Var, mw5Var2});
        }
        if (mw5Var.B() || mw5Var2.B()) {
            return j(mw5Var.e() - mw5Var2.e());
        }
        throw new IllegalStateException("Can't do " + mw5Var + " - " + mw5Var2);
    }

    public final mw5 h(JSONArray jSONArray, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("10334887", new Object[]{this, jSONArray, new Integer(i2)});
        }
        Object obj = jSONArray.get(i2);
        if (obj == null) {
            return mw5.P();
        }
        return mw5.d(obj);
    }

    public final mw5 i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("9ffa1392", new Object[]{this, jSONObject, str});
        }
        Object obj = jSONObject.get(str);
        if (obj == null) {
            return mw5.P();
        }
        return mw5.d(obj);
    }

    public final mw5 j(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("38aaf345", new Object[]{this, new Double(d)});
        }
        long round = Math.round(d);
        if (round == d) {
            return mw5.K(round);
        }
        return mw5.I(d);
    }

    public final boolean k(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca634571", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        return dXRuntimeContext.s().l();
    }

    public final mw5 l(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("48ba84b2", new Object[]{this, new Integer(i2)});
        }
        mw5 mw5Var = this.c.get(i2);
        if (mw5Var == null) {
            mw5Var = this.b.c(i2);
            this.c.set(i2, mw5Var);
        }
        if (mw5Var != null) {
            return mw5Var;
        }
        throw new IllegalArgumentException("Invalid const: " + i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0556, code lost:
        if (r21.d.pop().c() != false) goto L_0x0558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0558, code lost:
        r1 = (r1 - r18) - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0580, code lost:
        if (r21.d.pop().c() == false) goto L_0x0558;
     */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(com.taobao.android.dinamicx.DXRuntimeContext r22, com.taobao.android.dinamicx.expression.event.DXEvent r23, byte[] r24, int r25, int r26, java.util.Map<java.lang.String, tb.mw5> r27, tb.v16 r28, tb.cw5 r29, tb.td5 r30) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lw5.n(com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.expression.event.DXEvent, byte[], int, int, java.util.Map, tb.v16, tb.cw5, tb.td5):void");
    }

    public void o(dw5 dw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e8cdbe", new Object[]{this, dw5Var});
        }
    }

    public final boolean p(mw5 mw5Var, mw5 mw5Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19981ff2", new Object[]{this, mw5Var, mw5Var2})).booleanValue();
        }
        if (mw5Var2.q() == mw5Var.q()) {
            switch (mw5Var2.q()) {
                case 0:
                case 1:
                    return true;
                case 2:
                    if (mw5Var2.m() == mw5Var.m()) {
                        return true;
                    }
                    break;
                case 3:
                    if (Double.compare(mw5Var2.k(), mw5Var.k()) == 0) {
                        return true;
                    }
                    break;
                case 4:
                    if (mw5Var2.i() == mw5Var.i()) {
                        return true;
                    }
                    break;
                case 5:
                    return mw5Var2.p().equals(mw5Var.p());
                case 6:
                case 7:
                case 8:
                case 9:
                    return mw5Var2.D(mw5Var);
                default:
                    throw new IllegalArgumentException("invalid type");
            }
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXExprVM{mConst=" + this.c + ", mVarStack=" + this.d + '}';
    }

    public mw5 m(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, int i2, Map<String, mw5> map, v16 v16Var, cw5 cw5Var, td5 td5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("3bb52af9", new Object[]{this, dXRuntimeContext, dXEvent, new Integer(i2), map, v16Var, cw5Var, td5Var});
        }
        if (this.e) {
            try {
                n(dXRuntimeContext, dXEvent, this.b.b(), this.b.f(i2), this.b.e(i2), map, v16Var, cw5Var, td5Var);
                if (this.d.size() == 0) {
                    throw new IllegalStateException("expression has no return value");
                } else if (this.d.size() <= 1) {
                    return this.d.pop();
                } else {
                    throw new IllegalStateException("invalid stack size. vm error");
                }
            } catch (Throwable th) {
                this.d.clear();
                throw th;
            }
        } else {
            throw new IllegalStateException("run before decode");
        }
    }
}
