package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ph3<OUT, CONTEXT extends w3o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26090a;
    public final lzm<OUT, CONTEXT> b;
    public oh3 c;

    public <NEXT_OUT extends swn> ph3(oh3<OUT, NEXT_OUT, CONTEXT> oh3Var, boolean z) {
        fpm.c(oh3Var);
        this.f26090a = z;
        if (z && oh3Var.r() && oh3Var.n() != oh3Var.l()) {
            d(oh3Var.k());
        }
        this.b = oh3Var;
        this.c = oh3Var;
    }

    public static <O, NEXT_O extends swn, CONTEXT extends w3o> ph3<O, CONTEXT> b(oh3<O, NEXT_O, CONTEXT> oh3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph3) ipChange.ipc$dispatch("c665ace", new Object[]{oh3Var, new Boolean(z)});
        }
        return new ph3<>(oh3Var, z);
    }

    public lzm<OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzm) ipChange.ipc$dispatch("b523c2ca", new Object[]{this});
        }
        return this.b;
    }

    public <NEXT_O, NN_O extends swn> ph3<OUT, CONTEXT> c(oh3<NEXT_O, NN_O, CONTEXT> oh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph3) ipChange.ipc$dispatch("c970314", new Object[]{this, oh3Var});
        }
        fpm.c(oh3Var);
        if (this.f26090a) {
            Type n = oh3Var.n();
            if (oh3Var.r() && n != oh3Var.l()) {
                d(oh3Var.k());
            }
            Type l = this.c.l();
            if (l != n) {
                throw new RuntimeException("NEXT_OUT " + l + " of last producer(" + this.c.getClass().getSimpleName() + ") not equal OUT " + n + " of next producer(" + oh3Var.getClass().getSimpleName() + f7l.BRACKET_END_STR);
            }
        }
        this.c = this.c.G(oh3Var);
        return this;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8062de9", new Object[]{this, str});
            return;
        }
        throw new IllegalArgumentException(str + " skip to consume new result, require OUT class must equal NEXT_OUT class");
    }
}
