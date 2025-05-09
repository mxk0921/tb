package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16488a;
    public final tfw b;
    public final Object c;
    public final Object d;
    public Object e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16489a = "default";
        public tfw b;
        public Object c;
        public Object d;
        public Object e;

        static {
            t2o.a(444596347);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c330564d", new Object[]{bVar});
            }
            return bVar.f16489a;
        }

        public static /* synthetic */ Object b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ae60debe", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ Object c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8c54449d", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Object d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6a47aa7c", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ tfw e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tfw) ipChange.ipc$dispatch("70687095", new Object[]{bVar});
            }
            return bVar.b;
        }

        public bn7 f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bn7) ipChange.ipc$dispatch("f294d2b4", new Object[]{this});
            }
            return new bn7(this);
        }

        public b g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3239a852", new Object[]{this, obj});
            }
            this.e = obj;
            return this;
        }

        public b h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("86b2c49", new Object[]{this, obj});
            }
            this.c = obj;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5ec4d60f", new Object[]{this, str});
            }
            this.f16489a = str;
            return this;
        }

        public b j(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1fd8cdee", new Object[]{this, obj});
            }
            this.d = obj;
            return this;
        }

        public b k(tfw tfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("21c2e88d", new Object[]{this, tfwVar});
            }
            this.b = tfwVar;
            return this;
        }
    }

    static {
        t2o.a(444596345);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d8daf81e", new Object[]{this});
        }
        return this.e;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4da145f5", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e176d7", new Object[]{this});
        }
        return this.f16488a;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f70369a", new Object[]{this});
        }
        return this.d;
    }

    public tfw e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("d4d08bad", new Object[]{this});
        }
        return this.b;
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7252d0e4", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    public bn7(b bVar) {
        this.f16488a = "default";
        this.f16488a = b.a(bVar);
        this.e = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        this.b = b.e(bVar);
    }
}
