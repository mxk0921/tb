package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.gao;
import tb.lao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eao {
    public static final Executor g = Executors.newSingleThreadExecutor(new a());

    /* renamed from: a  reason: collision with root package name */
    public final iao f18419a = iao.d();
    public final gao b = new gao();
    public final lao c = new lao();
    public final hao<fao> d = new hao<>(100);
    public int e = 0;
    public int f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Rest");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18420a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ Context e;

        public b(String str, String str2, int i, String str3, Context context) {
            this.f18420a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            gao.a b = eao.this.b.b(this.f18420a, this.b);
            b.a(String.valueOf(this.c), this.d);
            if (b.c() >= eao.this.f18419a.a() || b.e() >= eao.this.f18419a.b()) {
                eao.this.r(b, this.e);
                eao.this.b.d(this.f18420a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements lao.b {
        public c() {
        }

        @Override // tb.lao.b
        public void a(fao faoVar) {
            eao.this.m(faoVar);
        }

        @Override // tb.lao.b
        public void b(fao faoVar) {
            eao.this.n(faoVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fao f18422a;

        public d(fao faoVar) {
            this.f18422a = faoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            fao faoVar = (fao) eao.this.d.c(this.f18422a);
            if (faoVar != null) {
                int b = faoVar.b();
                eao.this.f += b;
                bih.b("fail", "totalCount", Integer.valueOf(eao.this.f), "currentCount", Integer.valueOf(b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fao f18423a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements lao.b {
            public a() {
            }

            @Override // tb.lao.b
            public void a(fao faoVar) {
                eao.this.m(faoVar);
            }

            @Override // tb.lao.b
            public void b(fao faoVar) {
                eao.this.n(faoVar);
            }
        }

        public e(fao faoVar) {
            this.f18423a = faoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int b = this.f18423a.b();
            eao.this.e += b;
            bih.b("success", "totalCount", Integer.valueOf(eao.this.e), "currentCount", Integer.valueOf(b));
            fao faoVar = (fao) eao.this.d.b();
            if (faoVar != null) {
                eao.this.c.c(faoVar, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (gao.a aVar : ((HashMap) eao.this.b.c()).values()) {
                eao.this.r(aVar, zap.b().f32654a);
            }
            eao.this.b.a();
        }
    }

    static {
        t2o.a(813695005);
    }

    public eao() {
        if (bap.a()) {
            Executor executor = g;
            if (executor instanceof ThreadPoolExecutor) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
                threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        }
    }

    public final boolean l(int i) {
        if (wen.a() < this.f18419a.c(String.valueOf(i))) {
            return true;
        }
        return false;
    }

    public final void m(fao faoVar) {
        g.execute(new d(faoVar));
    }

    public final void n(fao faoVar) {
        g.execute(new e(faoVar));
    }

    public final byte[] o(String str, Context context, Map<String, String> map) {
        try {
            return ne2.b(str, context, map);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void p() {
        g.execute(new f());
    }

    public boolean q(int i, String str, Context context, String str2, String str3) {
        if (!l(i)) {
            return false;
        }
        g.execute(new b(str, str2, i, str3, context));
        return true;
    }

    public final void r(gao.a aVar, Context context) {
        byte[] o = o(aVar.d(), context, aVar.b());
        if (o != null) {
            this.c.c(new fao(aVar.d(), aVar.f(), aVar.e(), o), new c());
        }
    }
}
