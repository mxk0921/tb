package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cdf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u8f extends he1 implements adf<p5c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final v8f e;
    public final wnc f = (wnc) d62.b(wnc.class, "InitialInstantialtor");
    public final o5c g = new y07();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements cdf.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f29226a;

        public a(long j) {
            this.f29226a = j;
        }

        @Override // tb.cdf.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f954954", new Object[]{this, obj});
            } else if (obj != null && (obj instanceof p5c)) {
                p5c p5cVar = (p5c) obj;
                c.a().put(u8f.c(u8f.this).d(), p5cVar);
                u8f.d(u8f.this).c("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - this.f29226a));
                if (u8f.c(u8f.this).e() != null) {
                    u8f.c(u8f.this).e().b(p5cVar, u8f.c(u8f.this).a());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements cdf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.cdf.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
            } else if (u8f.c(u8f.this).e() != null) {
                u8f.c(u8f.this).e().a(str, u8f.c(u8f.this).a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Map<String, p5c> f29228a = new HashMap();

        static {
            t2o.a(676331613);
        }

        public static /* synthetic */ Map a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
            }
            return f29228a;
        }
    }

    static {
        t2o.a(676331610);
        t2o.a(676331614);
    }

    public u8f(v8f v8fVar) {
        this.e = v8fVar;
    }

    public static /* synthetic */ v8f c(u8f u8fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8f) ipChange.ipc$dispatch("e65617f5", new Object[]{u8fVar});
        }
        return u8fVar.e;
    }

    public static /* synthetic */ wnc d(u8f u8fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("25f97105", new Object[]{u8fVar});
        }
        return u8fVar.f;
    }

    public static /* synthetic */ Object ipc$super(u8f u8fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/instantiation/InitialInstantialtor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public p5c a() {
        Exception e;
        ddf ddfVar = this.c;
        wnc wncVar = this.f;
        v8f v8fVar = this.e;
        String b2 = v8fVar.b();
        if (TextUtils.isEmpty(b2) && !TextUtils.isEmpty(v8fVar.d())) {
            b2 = ((y07) this.g).g(v8fVar.d());
        }
        p5c p5cVar = null;
        if (!TextUtils.isEmpty(b2)) {
            try {
                wncVar.c("InitialInstantialtor create Instance: %s", b2);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    if (TextUtils.isEmpty(v8fVar.d())) {
                        p5c p5cVar2 = (p5c) Class.forName(b2).newInstance();
                        ddfVar = p5cVar2;
                        if (v8fVar.e() != null) {
                            v8fVar.e().b(p5cVar2, v8fVar.a());
                            ddfVar = p5cVar2;
                        }
                    } else if (c.a().get(v8fVar.d()) == null) {
                        cdf c2 = ddfVar.c();
                        c2.c = v8fVar.c();
                        c2.b = v8fVar.d();
                        c2.i = this;
                        c2.g = b2;
                        c2.e = new a(currentTimeMillis);
                        c2.f = new b();
                        ddfVar.a(c2);
                        wncVar.c("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    } else {
                        p5c p5cVar3 = (p5c) c.a().get(v8fVar.d());
                        ddfVar = p5cVar3;
                        if (v8fVar.e() != null) {
                            v8fVar.e().b(p5cVar3, v8fVar.a());
                            ddfVar = p5cVar3;
                        }
                    }
                    p5cVar = ddfVar;
                    wncVar.c("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Exception e2) {
                    e = e2;
                    p5cVar = ddfVar;
                    e.printStackTrace();
                    if (v8fVar.e() != null) {
                        v8fVar.e().a(e.getMessage(), v8fVar.a());
                    }
                    return p5cVar;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } else if (v8fVar.e() != null) {
            v8fVar.e().a("Initclass is empty", v8fVar.a());
        }
        return p5cVar;
    }
}
