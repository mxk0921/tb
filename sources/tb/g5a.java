package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f19734a;
    public final Object b;
    public final Object c;
    public final f5a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19735a = "default";
        public Object b;
        public Object c;
        public f5a d;

        static {
            t2o.a(475005023);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18f71975", new Object[]{bVar});
            }
            return bVar.f19735a;
        }

        public static /* synthetic */ Object b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6b603e6", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ Object c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e737cbc5", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Object d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c7b993a4", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ f5a e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f5a) ipChange.ipc$dispatch("24702bdd", new Object[]{bVar});
            }
            return bVar.d;
        }

        public g5a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g5a) ipChange.ipc$dispatch("d16e9a8c", new Object[]{this});
            }
            return new g5a(this);
        }

        public b g(f5a f5aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("915672ab", new Object[]{this, f5aVar});
            }
            this.d = f5aVar;
            return this;
        }

        public b h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dfb50421", new Object[]{this, obj});
            }
            this.b = obj;
            return this;
        }

        public b i(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4f3cbbc6", new Object[]{this, obj});
            }
            this.c = obj;
            return this;
        }
    }

    static {
        t2o.a(475005021);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4da145f5", new Object[]{this});
        }
        return this.f19734a;
    }

    public f5a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5a) ipChange.ipc$dispatch("4067ed3b", new Object[]{this});
        }
        return this.d;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f70369a", new Object[]{this});
        }
        return this.b;
    }

    public g5a(b bVar) {
        b.a(bVar);
        this.c = b.b(bVar);
        this.f19734a = b.c(bVar);
        this.b = b.d(bVar);
        this.d = b.e(bVar);
    }
}
