package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class icn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kcn f21241a;
    public JSONStringer b = null;

    static {
        t2o.a(649068548);
    }

    public icn(RVLLevel rVLLevel, String str) {
        rVLLevel = rVLLevel == null ? RVLLevel.Verbose : rVLLevel;
        int i = rVLLevel.value;
        RVLLevel rVLLevel2 = RVLLevel.Error;
        kcn kcnVar = new kcn(i <= rVLLevel2.value ? rVLLevel2 : rVLLevel, str == null ? "" : str, 0L);
        this.f21241a = kcnVar;
        kcnVar.j = true;
    }

    public icn a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("7c93fc7f", new Object[]{this, str, obj});
        }
        if (!(str == null || str.length() == 0)) {
            try {
                d(str);
                e(obj);
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public icn b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("7feebf4f", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                d(entry.getKey());
                e(entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public icn c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("dd36e8c8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                d(next);
                e(jSONObject.get(next));
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f519b6", new Object[]{this, str});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new JSONStringer().object();
            }
            if (str == null) {
                this.b.key("[null]");
            } else {
                this.b.key(str);
            }
        } catch (JSONException unused) {
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45231709", new Object[]{this});
            return;
        }
        kcn kcnVar = this.f21241a;
        if (kcnVar != null && kcnVar.f22567a.value <= lcn.e().value) {
            kcn kcnVar2 = this.f21241a;
            if (kcnVar2.h <= 0) {
                kcnVar2.h = System.currentTimeMillis();
            }
            JSONStringer jSONStringer = this.b;
            if (jSONStringer != null) {
                try {
                    jSONStringer.endObject();
                    this.f21241a.i = this.b.toString();
                } catch (JSONException unused) {
                }
            }
            lcn.h(this.f21241a);
            this.f21241a = null;
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        f();
        super.finalize();
    }

    public icn g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("5251f996", new Object[]{this, new Integer(i), str});
        }
        if (this.f21241a.e(String.valueOf(i)) && str != null) {
            this.f21241a.g = str;
        }
        return this;
    }

    public icn h(int i, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("d1c4d38b", new Object[]{this, new Integer(i), str, objArr});
        }
        if (this.f21241a.e(String.valueOf(i)) && str != null) {
            this.f21241a.g = String.format(str, objArr);
        }
        return this;
    }

    public icn i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("5c0ae05b", new Object[]{this, str, str2});
        }
        if (this.f21241a.e(str) && str2 != null) {
            this.f21241a.g = str2;
        }
        return this;
    }

    public icn j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("a73367e3", new Object[]{this, str});
        }
        this.f21241a.b(str);
        return this;
    }

    public icn k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("2286b06d", new Object[]{this, str, str2});
        }
        if (this.f21241a.b(str)) {
            this.f21241a.d(str2);
        }
        return this;
    }

    public icn l(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("2ef0758c", new Object[]{this, rVLLevel});
        }
        if (rVLLevel != null) {
            this.f21241a.f22567a = rVLLevel;
        }
        return this;
    }

    public icn m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("d76cacae", new Object[]{this, str});
        }
        this.f21241a.c(str);
        return this;
    }

    public icn n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("3c6b3eff", new Object[]{this, new Long(j)});
        }
        if (j > 0) {
            this.f21241a.h = j;
        }
        return this;
    }

    public final void e(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3462efda", new Object[]{this, obj});
        } else if (obj == null || (obj instanceof Boolean) || obj == JSONObject.NULL || (obj instanceof Number) || (obj instanceof String) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            this.b.value(obj);
        } else if (obj instanceof Character) {
            this.b.value(obj.toString());
        } else if (obj instanceof Collection) {
            this.b.array();
            for (Object obj2 : (Collection) obj) {
                e(obj2);
            }
            this.b.endArray();
        } else if (obj instanceof Map) {
            this.b.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d((String) entry.getKey());
                e(entry.getValue());
            }
            this.b.endObject();
        } else if (obj.getClass().isArray()) {
            this.b.array();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                e(Array.get(obj, i));
            }
            this.b.endArray();
        } else if (obj.getClass().getPackage().getName().startsWith("java.")) {
            this.b.value(obj.toString());
        } else {
            this.b.value(String.format("%s@%h", obj.getClass().getName(), obj));
        }
    }
}
