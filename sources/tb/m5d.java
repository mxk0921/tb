package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface m5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f23788a;
        public final String b;
        public final b c;

        static {
            t2o.a(843055288);
        }

        public a() {
            this(false, null, null, 7, null);
        }

        public final b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7782c1cd", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.b;
        }

        public final boolean c() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4550b0e", new Object[]{this})).booleanValue();
            }
            if (this.c != null || (str = this.b) == null || str.length() <= 0 || !this.f23788a) {
                return false;
            }
            return true;
        }

        public a(boolean z, String str, b bVar) {
            this.f23788a = z;
            this.b = str;
            this.c = bVar;
        }

        public /* synthetic */ a(boolean z, String str, b bVar, int i, a07 a07Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f23789a;
        public final String b;

        static {
            t2o.a(843055289);
        }

        public b(int i, String str) {
            this.f23789a = i;
            this.b = str;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
            }
            return this.f23789a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(String str, boolean z);

        void b(b bVar);

        void onDownloadProgress(int i);
    }

    void a(jkl jklVar, c cVar);
}
