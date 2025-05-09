package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f16255a;
    public String b;
    public String c;
    public IDMComponent d;
    public o5e e;
    public Object f;
    public final Map<String, Object> g = new HashMap();
    public final a h = new a();
    public String i = UUID.randomUUID().toString();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, JSONObject> f16256a = new HashMap();
        public final Map<String, MtopResponse> b = new HashMap();
        public final JSONObject c = new JSONObject();

        static {
            t2o.a(157286536);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ec18c397", new Object[]{aVar});
            }
            return aVar.f16256a;
        }

        public static /* synthetic */ Map b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5a9fd4d8", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7103ce04", new Object[]{aVar});
            }
            return aVar.c;
        }

        public JSONObject d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5a727f55", new Object[]{this});
            }
            return this.c;
        }

        public final Map<String, MtopResponse> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ae0b76d", new Object[]{this});
            }
            return this.b;
        }

        public final Map<String, JSONObject> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("80d64805", new Object[]{this});
            }
            return this.f16256a;
        }
    }

    static {
        t2o.a(157286535);
    }

    public b8v A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("699cc7ae", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public b8v B(o5e o5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("c3a88a8f", new Object[]{this, o5eVar});
        }
        this.e = o5eVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ede74d", new Object[]{this});
            return;
        }
        a.a(this.h).clear();
        a.b(this.h).clear();
        this.h.d().clear();
    }

    public void b(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51746e04", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            a();
            o(b8vVar.j());
            Object f = b8vVar.f();
            if (f instanceof DMEvent) {
                DMEvent dMEvent = (DMEvent) f;
                try {
                    r(new DMEvent(dMEvent.getType(), JSON.parseObject(dMEvent.getFields().toJSONString()), dMEvent.getComponents(), dMEvent.getOption()));
                } catch (Throwable unused) {
                }
            } else {
                r(b8vVar.f());
            }
            p(b8vVar.d()).q(b8vVar.e()).t(b8vVar.h()).A(b8vVar.m()).B(b8vVar.n()).w(null).v(b8vVar.g).s(b8vVar.g());
        }
    }

    public Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4b2fa4ca", new Object[]{this, str});
        }
        Object obj = ((HashMap) this.g).get("bizParams");
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public IDMComponent d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.d;
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f16255a;
    }

    public <T> T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c0780841", new Object[]{this});
        }
        try {
            return (T) this.f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0633aa4", new Object[]{this});
        }
        return this.i;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return this.b;
    }

    public <T> T i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("37f60f1d", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (T) ((HashMap) this.g).get(str);
    }

    public a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1b23fd0d", new Object[]{this});
        }
        return this.h;
    }

    public JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8cdda71d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (JSONObject) a.a(this.h).get(str);
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b76c8e89", new Object[]{this});
        }
        return a.c(this.h);
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4e4d2a", new Object[]{this});
        }
        return this.c;
    }

    public o5e n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5e) ipChange.ipc$dispatch("c060d81d", new Object[]{this});
        }
        return this.e;
    }

    public void o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76647c1", new Object[]{this, aVar});
        } else if (aVar != null) {
            a.a(this.h).putAll(a.a(aVar));
            a.b(this.h).putAll(a.b(aVar));
            this.h.d().putAll(aVar.d());
        }
    }

    public b8v p(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("d3e6480c", new Object[]{this, iDMComponent});
        }
        this.d = iDMComponent;
        return this;
    }

    public b8v q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("27892a0e", new Object[]{this, context});
        }
        this.f16255a = context;
        return this;
    }

    public b8v r(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("602ac09b", new Object[]{this, obj});
        }
        this.f = obj;
        return this;
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2eda152", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public b8v t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("9b9162bd", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public b8v u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("1e8a3c3f", new Object[]{this, str, obj});
        }
        if (str != null) {
            ((HashMap) this.g).put(str, obj);
        }
        return this;
    }

    public b8v v(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("63b417c0", new Object[]{this, map});
        }
        if (map != null) {
            ((HashMap) this.g).putAll(map);
        }
        return this;
    }

    public b8v w(jfo jfoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("cefc4770", new Object[]{this, jfoVar});
        }
        return this;
    }

    public void x(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc1789f", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            a.a(this.h).put(str, jSONObject);
        }
    }

    public void y(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978c9d1", new Object[]{this, str, jSONObject});
        } else {
            a.c(this.h).put(str, (Object) jSONObject);
        }
    }

    public void z(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9233aede", new Object[]{this, str, mtopResponse});
        } else if (!TextUtils.isEmpty(str) && mtopResponse != null) {
            a.b(this.h).put(str, mtopResponse);
        }
    }
}
