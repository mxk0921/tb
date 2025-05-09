package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import tb.swn;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class oh3<OUT, NEXT_OUT extends swn, CONTEXT extends w3o> implements lzm<OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25389a;
    public final int b;
    public final ek4 c;
    public Type[] d;
    public lzm<NEXT_OUT, CONTEXT> e;
    public huo f;
    public huo g;

    public oh3(String str, int i, int i2) {
        this.f25389a = i(str);
        this.b = i;
        this.c = new ek4(i2);
    }

    public void A(huo huoVar, kk4<OUT, CONTEXT> kk4Var, yto<NEXT_OUT> ytoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1331d1ec", new Object[]{this, huoVar, kk4Var, ytoVar});
        } else {
            B(huoVar, kk4Var, ytoVar, true);
        }
    }

    public abstract void B(huo huoVar, kk4<OUT, CONTEXT> kk4Var, yto<NEXT_OUT> ytoVar, boolean z);

    public void C(kk4<OUT, CONTEXT> kk4Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24faf2", new Object[]{this, kk4Var, th});
            return;
        }
        yto<NEXT_OUT> ytoVar = new yto<>(16, true);
        ytoVar.e = th;
        A(this.g, kk4Var, ytoVar);
    }

    public void D(kk4<OUT, CONTEXT> kk4Var, boolean z, NEXT_OUT next_out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71c7eb2", new Object[]{this, kk4Var, new Boolean(z), next_out});
        } else {
            E(kk4Var, z, next_out, true);
        }
    }

    public void E(kk4<OUT, CONTEXT> kk4Var, boolean z, NEXT_OUT next_out, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c740a62", new Object[]{this, kk4Var, new Boolean(z), next_out, new Boolean(z2)});
            return;
        }
        yto<NEXT_OUT> ytoVar = new yto<>(1, z);
        ytoVar.c = next_out;
        B(this.g, kk4Var, ytoVar, z2);
    }

    public void F(kk4<OUT, CONTEXT> kk4Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daab8897", new Object[]{this, kk4Var, new Float(f)});
            return;
        }
        yto<NEXT_OUT> ytoVar = new yto<>(4, false);
        ytoVar.d = f;
        A(this.g, kk4Var, ytoVar);
    }

    public <NN_OUT extends swn> oh3 G(oh3<NEXT_OUT, NN_OUT, CONTEXT> oh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oh3) ipChange.ipc$dispatch("a7d6bf28", new Object[]{this, oh3Var});
        }
        fpm.c(oh3Var);
        this.e = oh3Var;
        return oh3Var;
    }

    public boolean c(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        return false;
    }

    public boolean d(kk4<OUT, CONTEXT> kk4Var, buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e41db0a", new Object[]{this, kk4Var, buoVar})).booleanValue();
        }
        return c(kk4Var);
    }

    public oh3<OUT, NEXT_OUT, CONTEXT> e(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oh3) ipChange.ipc$dispatch("3a988f1b", new Object[]{this, huoVar});
        }
        this.g = huoVar;
        return this;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dbcd4cb", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            try {
                this.d = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
            } catch (Exception e) {
                xv8.c("RxSysLog", "chain producer get generic types error=%s", e);
                return false;
            }
        }
        return true;
    }

    public huo g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("475893cf", new Object[]{this});
        }
        return this.g;
    }

    public ek4 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ek4) ipChange.ipc$dispatch("e13c4a96", new Object[]{this});
        }
        return this.c;
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50f67a39", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return name.substring(lastIndexOf + 1);
        }
        return name;
    }

    public abstract na7<OUT, NEXT_OUT, CONTEXT> j();

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f25389a;
    }

    public Type l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("1e37107f", new Object[]{this});
        }
        if (!f()) {
            return null;
        }
        Type[] typeArr = this.d;
        Type type = typeArr[1];
        if (type == w3o.class) {
            return typeArr[0];
        }
        return type;
    }

    public lzm<NEXT_OUT, CONTEXT> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzm) ipChange.ipc$dispatch("fd4217f7", new Object[]{this});
        }
        return this.e;
    }

    public Type n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("f5f8712c", new Object[]{this});
        }
        if (!f()) {
            return null;
        }
        return this.d[0];
    }

    public huo o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("7fbfee6b", new Object[]{this});
        }
        return this.f;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14bd097e", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6837bf51", new Object[]{this})).booleanValue();
        }
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8645206", new Object[]{this})).booleanValue();
        }
        if (q() || h().a(1)) {
            return false;
        }
        return true;
    }

    public void s(kk4<OUT, CONTEXT> kk4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea64faf6", new Object[]{this, kk4Var, new Boolean(z)});
        } else {
            w(kk4Var, false, z, false);
        }
    }

    public void t(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32336119", new Object[]{this, kk4Var});
        } else {
            x(kk4Var, false, false);
        }
    }

    public void u(kk4<OUT, CONTEXT> kk4Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140f4ee6", new Object[]{this, kk4Var, new Boolean(z), new Boolean(z2)});
        } else {
            w(kk4Var, true, z, z2);
        }
    }

    public void v(kk4<OUT, CONTEXT> kk4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cf1f23", new Object[]{this, kk4Var, new Boolean(z)});
        } else {
            x(kk4Var, true, z);
        }
    }

    public final void w(kk4<OUT, CONTEXT> kk4Var, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc102292", new Object[]{this, kk4Var, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        mzm g = kk4Var.getContext().g();
        if (g != null) {
            g.b(kk4Var.getContext(), getClass(), z, z2, z3);
        }
    }

    public final void x(kk4<OUT, CONTEXT> kk4Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62182f5", new Object[]{this, kk4Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        mzm g = kk4Var.getContext().g();
        if (g != null) {
            g.a(kk4Var.getContext(), getClass(), z, z2);
        }
    }

    public oh3<OUT, NEXT_OUT, CONTEXT> y(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oh3) ipChange.ipc$dispatch("a92ce0ff", new Object[]{this, huoVar});
        }
        this.f = huoVar;
        return this;
    }

    public void z(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19564efc", new Object[]{this, kk4Var});
        } else {
            A(this.g, kk4Var, new yto<>(8, true));
        }
    }
}
