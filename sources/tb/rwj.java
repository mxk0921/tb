package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rwj implements erb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f27649a;
    public final r4a b = new r4a(a3b.f(), a3b.d(f()));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(rwj rwjVar) {
        }
    }

    static {
        t2o.a(729808950);
        t2o.a(729808989);
    }

    public rwj(String str) {
        this.f27649a = str;
    }

    @Override // tb.erb
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a00a958", new Object[]{this});
        }
        JSONObject b = this.b.b();
        if (b == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(JSON.toJSONString(b), new a(this), new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.erb
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2412b54e", new Object[]{this});
        }
        JSONObject c2 = this.b.c();
        if (c2 != null) {
            return JSON.toJSONString(c2);
        }
        return null;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        r4a r4aVar = this.b;
        if (r4aVar != null) {
            return r4aVar.d(a3b.e());
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed667c0a", new Object[]{this});
        }
        HashMap hashMap = (HashMap) c;
        if (!hashMap.containsKey(this.f27649a)) {
            hashMap.put(this.f27649a, slp.c(e(), null));
        }
        return (String) hashMap.get(this.f27649a);
    }

    @Override // tb.erb
    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9940369", new Object[]{this});
        }
        return "lastResultVersion_" + this.f27649a;
    }

    @Override // tb.erb
    public JSONObject getPassParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1231214", new Object[]{this});
        }
        return this.b.e(a3b.e());
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52a6ddae", new Object[]{this})).booleanValue();
        }
        String d = d();
        return (c() == null ? false : a3b.o(c().getString("multiTabRecommend"))) || (d == null ? false : d.startsWith("v5"));
    }
}
