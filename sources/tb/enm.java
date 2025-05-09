package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class enm implements xbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18700a;
    public final Map<String, Object> b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f18701a;
        public final String b;
        public Map<String, Object> c;
        public String d;
        public String e;
        public String f;

        static {
            t2o.a(729810258);
        }

        public b(String str, String str2) {
            this.f18701a = str;
            this.b = str2;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c045b52b", new Object[]{bVar});
            }
            return bVar.f18701a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c3cd582c", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bde65ec8", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cadc9e2e", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ce64412f", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d1ebe430", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d5738731", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d8fb2a32", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc82cd33", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ String j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e00a7034", new Object[]{bVar});
            }
            return bVar.f;
        }

        public enm k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (enm) ipChange.ipc$dispatch("728b8ac8", new Object[]{this});
            }
            return new enm(this);
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("423e23b3", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b m(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("adbdce72", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public b n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("af1b76e8", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f84a349", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }
    }

    static {
        t2o.a(729810256);
        t2o.a(447741980);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("564f1be7", new Object[]{this});
        }
        return this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fafff3aa", new Object[]{this});
        }
        return this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54ada043", new Object[]{this});
        }
        return this.f18700a;
    }

    public enm(b bVar) {
        this.f18700a = b.a(bVar);
        b.b(bVar);
        this.b = b.c(bVar);
        b.d(bVar);
        b.e(bVar);
        this.c = b.f(bVar);
        b.g(bVar);
        b.h(bVar);
        this.d = b.i(bVar);
        this.e = b.j(bVar);
    }
}
