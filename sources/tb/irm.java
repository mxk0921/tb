package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class irm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f21529a;
    public final String b;
    public final String c;
    public final Map<String, List<String>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f21530a;
        public String b;
        public String c;
        public Map<String, List<String>> d;
        public wrm e;

        static {
            t2o.a(912262200);
        }

        public static /* synthetic */ JSONObject a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2ebefa57", new Object[]{bVar});
            }
            return bVar.f21530a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32dd49ca", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8be8954b", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Map d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("c7ff7589", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ wrm j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wrm) ipChange.ipc$dispatch("d7a9e0c", new Object[]{bVar});
            }
            return bVar.e;
        }

        public irm e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (irm) ipChange.ipc$dispatch("c449b8ea", new Object[]{this});
            }
            return new irm(this);
        }

        public b f(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ad6cf274", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public b g(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f008cdb3", new Object[]{this, jSONObject});
            }
            this.f21530a = jSONObject;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("24d9f970", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f79f6d36", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b k(wrm wrmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e46f484b", new Object[]{this, wrmVar});
            }
            this.e = wrmVar;
            return this;
        }
    }

    static {
        t2o.a(912262198);
    }

    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9dad198", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("963f3aaf", new Object[]{this});
        }
        return this.f21529a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aca4a16c", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("916d1f7e", new Object[]{this});
        }
        return this.b;
    }

    public irm(b bVar) {
        this.f21529a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        b.j(bVar);
    }
}
