package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final JSONReader.c f24900a;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Future<JSONObject> f24901a;
        public final krf b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Callable<JSONObject> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public JSONObject call() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("31a17705", new Object[]{this});
                }
                b.this.b.z3();
                if (b.this.b.C1()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                b.this.b.S1(jSONObject, 0L);
                return jSONObject;
            }
        }

        static {
            t2o.a(150994949);
        }

        public static /* synthetic */ b a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("becb879e", new Object[]{bVar});
            }
            return bVar.e();
        }

        public b b(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eb1f9b2b", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            if (bArr != null && i2 > 0 && bArr.length >= i + i2) {
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                allocate.put(bArr, i, i2);
                allocate.flip();
                this.b.G3(allocate);
            }
            return this;
        }

        public b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a5cc6c85", new Object[]{this});
            }
            krf krfVar = this.b;
            krfVar.G3(krfVar.K);
            return this;
        }

        public JSONObject d() throws ExecutionException, InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2b0f6ffd", new Object[]{this});
            }
            return this.f24901a.get();
        }

        public final b e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6c79670c", new Object[]{this});
            }
            this.f24901a = wpt.a(new a());
            return this;
        }

        public b() {
            this.b = null;
            this.b = new krf(nrf.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Future<T> f24903a;
        public final Class<T> b;
        public final krf c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Callable<T> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
                }
                if ((nrf.a().f() & JSONReader.Feature.FieldBased.mask) != 0) {
                    z = true;
                }
                jdk J = nrf.a().i.J(c.this.b, z);
                c.this.c.z3();
                c cVar = c.this;
                T t = (T) J.o(cVar.c, cVar.b, null, 0L);
                c.this.c.Y0(t);
                if (c.this.c.e1() || (nrf.a().f() & JSONReader.Feature.IgnoreCheckClose.mask) != 0) {
                    return t;
                }
                throw new JSONException(c.this.c.a1("input not end"));
            }
        }

        static {
            t2o.a(150994951);
        }

        public static /* synthetic */ c a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("7dfc741a", new Object[]{cVar});
            }
            return cVar.e();
        }

        public c b(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("db84e8a", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            if (bArr != null && i2 > 0 && bArr.length >= i + i2) {
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                allocate.put(bArr, i, i2);
                allocate.flip();
                this.c.G3(allocate);
            }
            return this;
        }

        public c c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a6b53464", new Object[]{this});
            }
            krf krfVar = this.c;
            krfVar.G3(krfVar.K);
            return this;
        }

        public T d() throws ExecutionException, InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return this.f24903a.get();
        }

        public final c e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("77a7edab", new Object[]{this});
            }
            this.f24903a = wpt.a(new a());
            return this;
        }

        public c(Class<T> cls) {
            this.c = null;
            this.b = cls;
            this.c = new krf(nrf.a());
        }
    }

    static {
        t2o.a(150994947);
        JSONReader.c b2 = JSONFactory.b();
        f24900a = b2;
        b2.p(new lrf());
        b2.o(new mrf());
    }

    public static /* synthetic */ JSONReader.c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONReader.c) ipChange.ipc$dispatch("f939452", new Object[0]);
        }
        return f24900a;
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2c186094", new Object[0]);
        }
        return b.a(new b());
    }

    public static <T> c c(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5ccfc28d", new Object[]{cls});
        }
        return c.a(new c(cls));
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[0]);
        } else {
            b.compareAndSet(false, true);
        }
    }
}
