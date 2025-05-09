package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.concurrent.Future;
import tb.hgc;
import tb.rg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nq6 implements hgc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f24888a;
    public final rg7 b;
    public final int c;
    public final tg7 d;
    public final rg7.c e;

    static {
        t2o.a(468714266);
        t2o.a(468714268);
    }

    public nq6(FluidContext fluidContext, rg7 rg7Var, int i, tg7 tg7Var, rg7.c cVar) {
        this.f24888a = fluidContext;
        this.b = rg7Var;
        this.c = i;
        this.d = tg7Var;
        this.e = cVar;
    }

    public rg7.c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg7.c) ipChange.ipc$dispatch("c747856d", new Object[]{this});
        }
        return this.e;
    }

    public tg7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("b374a9f1", new Object[]{this});
        }
        return this.d;
    }

    public Future c(tg7 tg7Var, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("668a8eea", new Object[]{this, tg7Var, cVar});
        }
        if (this.c >= this.b.e().c()) {
            FluidException.throwException(this.f24888a, IDataService.DATA_ERROR_INTERCEPTOR_CHAIN_OUT_OF_INDEX);
        }
        FluidContext fluidContext = this.f24888a;
        rg7 rg7Var = this.b;
        return rg7Var.e().b(this.c).a(new nq6(fluidContext, rg7Var, this.c + 1, tg7Var, cVar));
    }
}
