package tb;

import android.os.Handler;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.a10;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ed4<ExposeKey, ExposeData> extends a10<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final mpk<ExposeKey, ExposeData> i;
    public final vvk<ExposeKey, ExposeData> j;
    public final gqk<ExposeKey, ExposeData> k;
    public final gpk<ExposeKey, ExposeData> l;
    public final long m;
    public final Handler n;
    public final int o;
    public final LruCache<ExposeKey, a10.b<ExposeData>> p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<ExposeKey, ExposeData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public mpk<ExposeKey, ExposeData> f18494a;
        public vvk<ExposeKey, ExposeData> b;
        public gqk<ExposeKey, ExposeData> c;
        public gpk<ExposeKey, ExposeData> d;
        public long e;
        public Handler f;
        public LruCache<ExposeKey, a10.b<ExposeData>> g;

        static {
            t2o.a(444597138);
            t2o.a(444597124);
        }

        public ed4<ExposeKey, ExposeData> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ed4) ipChange.ipc$dispatch("4277062f", new Object[]{this});
            }
            return new ed4<>(this.b, this.f18494a, this.c, this.d, this.e, this.f, 0, this.g);
        }

        public a<ExposeKey, ExposeData> b(LruCache<ExposeKey, a10.b<ExposeData>> lruCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f8a78533", new Object[]{this, lruCache});
            }
            this.g = lruCache;
            return this;
        }

        public a<ExposeKey, ExposeData> c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b8338ed", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a<ExposeKey, ExposeData> d(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9131002e", new Object[]{this, handler});
            }
            this.f = handler;
            return this;
        }

        public a<ExposeKey, ExposeData> e(gpk<ExposeKey, ExposeData> gpkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6dc67ec1", new Object[]{this, gpkVar});
            }
            this.d = gpkVar;
            return this;
        }

        public a<ExposeKey, ExposeData> f(mpk<ExposeKey, ExposeData> mpkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed8cd00b", new Object[]{this, mpkVar});
            }
            this.f18494a = mpkVar;
            return this;
        }

        public a<ExposeKey, ExposeData> g(gqk<ExposeKey, ExposeData> gqkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ea3053eb", new Object[]{this, gqkVar});
            }
            this.c = gqkVar;
            return this;
        }

        public a<ExposeKey, ExposeData> h(vvk<ExposeKey, ExposeData> vvkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff0b8e2b", new Object[]{this, vvkVar});
            }
            this.b = vvkVar;
            return this;
        }
    }

    static {
        t2o.a(444597137);
    }

    public ed4(vvk<ExposeKey, ExposeData> vvkVar, mpk<ExposeKey, ExposeData> mpkVar, gqk<ExposeKey, ExposeData> gqkVar, gpk<ExposeKey, ExposeData> gpkVar, long j, Handler handler, int i, LruCache<ExposeKey, a10.b<ExposeData>> lruCache) {
        this.i = mpkVar;
        this.j = vvkVar;
        this.k = gqkVar;
        this.l = gpkVar;
        this.m = j;
        this.n = handler;
        this.o = i;
        this.p = lruCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ed4 ed4Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1921348679:
                return new Boolean(super.z(objArr[0], objArr[1], (String) objArr[2]));
            case -1825367951:
                return super.p();
            case -1577005798:
                return new Long(super.r());
            case -1366954595:
                return new Integer(super.b());
            case -1068012274:
                super.w(objArr[0], objArr[1], (String) objArr[2]);
                return null;
            case -855372706:
                return super.o();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/videoc/expose/impl/ComposeExposure");
        }
    }

    @Override // tb.a10
    public void C(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4b42d6", new Object[]{this, exposekey, exposedata, str});
            return;
        }
        gqk<ExposeKey, ExposeData> gqkVar = this.k;
        if (gqkVar != null) {
            gqkVar.c(exposekey, exposedata, str);
        }
    }

    @Override // tb.a10
    public boolean H(ExposeKey exposekey, ExposeData exposedata, String str, Map<ExposeKey, ExposeData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8980e7d", new Object[]{this, exposekey, exposedata, str, map})).booleanValue();
        }
        vvk<ExposeKey, ExposeData> vvkVar = this.j;
        if (vvkVar != null) {
            return vvkVar.g(exposekey, exposedata, str, map);
        }
        return false;
    }

    @Override // tb.a10
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae85ed9d", new Object[]{this})).intValue();
        }
        int i = this.o;
        if (i > 0) {
            return i;
        }
        return super.b();
    }

    @Override // tb.a10
    public LruCache<ExposeKey, a10.b<ExposeData>> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("cd040c5e", new Object[]{this});
        }
        LruCache<ExposeKey, a10.b<ExposeData>> lruCache = this.p;
        if (lruCache != null) {
            return lruCache;
        }
        return super.o();
    }

    @Override // tb.a10
    public Handler p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("93331871", new Object[]{this});
        }
        Handler handler = this.n;
        if (handler != null) {
            return handler;
        }
        return super.p();
    }

    @Override // tb.a10
    public long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a200cd1a", new Object[]{this})).longValue();
        }
        long j = this.m;
        if (j > 0) {
            return j;
        }
        return super.r();
    }

    @Override // tb.a10
    public void w(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0576d0e", new Object[]{this, exposekey, exposedata, str});
            return;
        }
        gpk<ExposeKey, ExposeData> gpkVar = this.l;
        if (gpkVar != null) {
            gpkVar.d(exposekey, exposedata, str);
        } else {
            super.w(exposekey, exposedata, str);
        }
    }

    @Override // tb.a10
    public void x(List<Pair<ExposeKey, ExposeData>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2559b8b", new Object[]{this, list, str});
            return;
        }
        gqk<ExposeKey, ExposeData> gqkVar = this.k;
        if (gqkVar != null) {
            gqkVar.e(list, str);
        }
    }

    @Override // tb.a10
    public boolean z(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d7a8bb9", new Object[]{this, exposekey, exposedata, str})).booleanValue();
        }
        mpk<ExposeKey, ExposeData> mpkVar = this.i;
        if (mpkVar != null) {
            return mpkVar.f(exposekey, exposedata, str);
        }
        return super.z(exposekey, exposedata, str);
    }
}
