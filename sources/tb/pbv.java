package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pbv {

    /* renamed from: a  reason: collision with root package name */
    public final String f26004a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final Object i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public Object i;

        /* renamed from: a  reason: collision with root package name */
        public String f26005a = "";
        public String b = "1.0";
        public boolean c = false;
        public String h = "UNIT_TRADE";

        static {
            t2o.a(157286867);
        }

        public pbv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pbv) ipChange.ipc$dispatch("48f59d6a", new Object[]{this});
            }
            return new pbv(this.f26005a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3c4cc855", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4c845ae8", new Object[]{this, str});
            }
            this.f26005a = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ca711f6f", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54a00bcd", new Object[]{this, obj});
            }
            this.i = obj;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("84c9589d", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b51fd78d", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6222f828", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("711ead86", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("36fe7dad", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }
    }

    static {
        t2o.a(157286865);
    }

    public pbv(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, Object obj) {
        this.f26004a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str3;
        this.i = obj;
    }
}
