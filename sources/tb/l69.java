package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23132a;
    public final Integer b;
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Integer f23133a;
        public boolean b;

        static {
            t2o.a(488636655);
        }

        public static /* synthetic */ Integer a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("608e91bf", new Object[]{bVar});
            }
            return bVar.f23133a;
        }

        public static /* synthetic */ Integer b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("304ec55e", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4fb435a", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public l69 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l69) ipChange.ipc$dispatch("3de5648b", new Object[]{this});
            }
            return new l69(this);
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f64db42c", new Object[]{this, new Integer(i)});
            }
            this.f23133a = Integer.valueOf(i);
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ddb5060b", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }
    }

    static {
        t2o.a(488636653);
    }

    public Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("25f9a74d", new Object[]{this});
        }
        return this.f23132a;
    }

    public Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c5441c79", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("870abe50", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public l69(b bVar) {
        this.f23132a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
    }
}
