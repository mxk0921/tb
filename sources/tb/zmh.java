package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LruCache<String, f59> c;
    public int b = 1;

    /* renamed from: a  reason: collision with root package name */
    public final f59 f32868a = new f59();

    static {
        t2o.a(468713522);
    }

    public zmh(FluidContext fluidContext) {
        LruCache<String, f59> b = ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().b();
        this.c = b;
        if (b == null) {
            int i = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().t;
            ir9.b("LruFeedBack", "feedBackCount：" + i);
            if (i > 0) {
                LruCache<String, f59> lruCache = new LruCache<>(i);
                this.c = lruCache;
                ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().h(lruCache);
            }
        }
    }

    public final void a(String str, f59 f59Var) {
        LruCache<String, f59> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822cdc2e", new Object[]{this, str, f59Var});
        } else if (!TextUtils.isEmpty(str) && (lruCache = this.c) != null) {
            lruCache.put(str, f59Var);
        }
    }

    public void b(String str, a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63caceb", new Object[]{this, str, eVar});
            return;
        }
        this.f32868a.k(str);
        this.f32868a.i(SystemClock.elapsedRealtime());
        if (eVar.j() != null) {
            this.f32868a.o(String.valueOf(eVar.j().duration * 1000));
        }
        f(true);
    }

    public void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f53b2bf", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f32868a.l(i);
        f59 d = d(str);
        String valueOf = String.valueOf(((this.f32868a.f() - 1) * Long.parseLong(this.f32868a.g())) + this.f32868a.d());
        String str2 = "0";
        if (TextUtils.isEmpty(valueOf)) {
            valueOf = str2;
        }
        if (d == null || !TextUtils.isEmpty(str)) {
            this.f32868a.m(valueOf);
        } else {
            if (!TextUtils.isEmpty(d.e())) {
                str2 = d.e();
            }
            if (Long.parseLong(valueOf) > Long.parseLong(str2)) {
                this.f32868a.m(valueOf);
            }
        }
        this.f32868a.j(SystemClock.elapsedRealtime());
        f59 f59Var = this.f32868a;
        f59Var.h(f59Var.b() - this.f32868a.a());
        ir9.a("LruFeedBack", "cardDisappear 存当前页面的值：" + this.f32868a.toString());
        e(str, this.f32868a);
    }

    public final f59 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f59) ipChange.ipc$dispatch("f74a2d33", new Object[]{this, str});
        }
        f59 f59Var = new f59();
        LruCache<String, f59> lruCache = this.c;
        if (lruCache != null) {
            return lruCache.get(str);
        }
        return f59Var;
    }

    public final void e(String str, f59 f59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c916c48", new Object[]{this, str, f59Var});
        } else {
            a(str, f59Var);
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13a39ae", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b = 1;
        } else {
            this.b++;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77df587", new Object[]{this});
        } else {
            this.f32868a.n(this.b);
        }
    }
}
