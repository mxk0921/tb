package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gjr {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20046a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String d;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20047a = false;
        public boolean b = false;
        public boolean c = false;
        public boolean e = false;
        public boolean f = false;

        static {
            t2o.a(779092078);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c78b99", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6cb56f8", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ccf2257", new Object[]{bVar})).booleanValue();
            }
            return bVar.f20047a;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b06de12e", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d6b915", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1eda8474", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("24de4fd3", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public gjr h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gjr) ipChange.ipc$dispatch("7f6d61c8", new Object[]{this});
            }
            return new gjr(this);
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("712c82cb", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("75ec8120", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1869faea", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("17e333dc", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("51b07285", new Object[]{this, new Boolean(z)});
            }
            this.f20047a = z;
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4274fb84", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }
    }

    static {
        t2o.a(779092076);
    }

    public gjr(b bVar) {
        this.f20046a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.b = b.a(bVar);
        this.c = b.b(bVar);
        this.f20046a = b.c(bVar);
        this.f = b.d(bVar);
        b.e(bVar);
        this.d = b.f(bVar);
        this.e = b.g(bVar);
    }
}
