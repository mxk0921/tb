package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface foc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19438a;
        public final String b;
        public final String c;

        static {
            t2o.a(919601169);
        }

        public b(String str, String str2, String str3) {
            this.f19438a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b1c620a", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca3bff75", new Object[]{this});
            }
            return this.b;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return this.f19438a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!ckf.b(this.f19438a, bVar.f19438a) || !ckf.b(this.b, bVar.b) || !ckf.b(this.c, bVar.c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f19438a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return i5 + i3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "UserInfo(userId=" + this.f19438a + ", nickName=" + this.b + ", avatar=" + this.c + f7l.BRACKET_END_STR;
        }
    }

    void a(a aVar);

    void b(a aVar);

    boolean isLogin();

    void login(boolean z);
}
