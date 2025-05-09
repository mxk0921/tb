package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXT_KEY_DX_RUNTIME_CONTEXT = "dx_runtime_context";

    /* renamed from: a  reason: collision with root package name */
    public String f26768a;
    public String b;
    public JSONObject c;
    public AURARenderComponent d;
    public Object[] e;
    public DXEvent f;
    public String h;
    @JSONField(serialize = false)
    private Map<String, Object> mExtraParams = new HashMap();
    public int g = 0;

    static {
        t2o.a(80740430);
    }

    public qi() {
    }

    public Object[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        return this.e;
    }

    public DXEvent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("96f8da1", new Object[]{this});
        }
        return this.f;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd54c1e4", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3369a89", new Object[]{this});
        }
        String str = this.b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
        }
        return this.f26768a;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c73f273", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public Object g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8180330e", new Object[]{this, str});
        }
        return this.mExtraParams.get(str);
    }

    @JSONField(serialize = false)
    public Map<String, Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.mExtraParams;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        JSONObject c = c();
        if (c != null && !TextUtils.isEmpty(c.getString("identifier"))) {
            this.h = c.getString("identifier");
        }
        if (TextUtils.isEmpty(this.h) && j() != null) {
            this.h = j().key;
        }
        return this.h;
    }

    public AURARenderComponent j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("659b1b43", new Object[]{this});
        }
        return this.d;
    }

    public void k(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104c8854", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null) {
            this.mExtraParams.put(str, obj);
        }
    }

    public void m(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eb1ccd", new Object[]{this, dXEvent});
        } else {
            this.f = dXEvent;
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e061b8", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5da7275", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9080e4", new Object[]{this, str});
        } else {
            this.f26768a = str;
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1607658f", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    @JSONField(serialize = false)
    public void r(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc8e3aa", new Object[]{this, map});
            return;
        }
        this.mExtraParams.clear();
        if (map != null) {
            this.mExtraParams.putAll(map);
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb8cafc", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void t(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83195a6f", new Object[]{this, aURARenderComponent});
        } else {
            this.d = aURARenderComponent;
        }
    }

    public void l(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6180b", new Object[]{this, objArr});
            return;
        }
        this.e = objArr;
        if (objArr != null) {
            if (objArr.length < 1) {
                ck.g().b("UMFEventModel", "setArgs", "eventFlag is empty");
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof String) {
                this.b = (String) obj;
            } else {
                ck.g().b("UMFEventModel", "setArgs", "eventFlag is empty");
            }
        }
    }

    public qi(qi qiVar) {
        o(qiVar.d());
        t(qiVar.j());
        n(qiVar.c());
        l(qiVar.a());
        p(qiVar.e());
        s(qiVar.i());
        m(qiVar.b());
        q(qiVar.f());
        r(qiVar.h());
    }
}
