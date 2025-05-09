package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b3o implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_EXPARAMS = "exParams";

    /* renamed from: a  reason: collision with root package name */
    public String f16158a;
    public String b;
    public final boolean c = true;
    public final boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public int g = 0;
    public Map<String, String> h = new HashMap();
    public Map<String, String> i = new HashMap();

    static {
        t2o.a(155189260);
    }

    public static b3o p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("69e39b3e", new Object[0]);
        }
        return new b3o();
    }

    public b3o a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("2096840", new Object[]{this, map});
        }
        if (this.h == null || map == null || map.isEmpty()) {
            this.h = map;
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    if ("exParams".equals(key)) {
                        q(this.h, entry.getValue());
                    } else {
                        this.h.put(key, entry.getValue());
                    }
                }
            }
        }
        return this;
    }

    /* renamed from: b */
    public b3o clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("93e11c46", new Object[]{this});
        }
        try {
            b3o b3oVar = (b3o) super.clone();
            b3oVar.w(new HashMap(this.h));
            b3oVar.u(new HashMap(this.i));
            return b3oVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return p();
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.f16158a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return this.b;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.i;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be3cf212", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28628159", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f430765d", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a99b176", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void q(Map<String, String> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb8f3e0", new Object[]{this, map, str});
        } else if (map != null && str != null) {
            String str2 = map.get("exParams");
            if (TextUtils.isEmpty(str2)) {
                map.put("exParams", str);
                return;
            }
            JSONObject jSONObject2 = null;
            try {
                jSONObject = JSON.parseObject(str2);
                try {
                    jSONObject2 = JSON.parseObject(str);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.putAll(jSONObject2);
            map.put("exParams", jSONObject.toJSONString());
        }
    }

    public b3o r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("96592df9", new Object[]{this, new Boolean(z)});
        }
        this.f = z;
        return this;
    }

    public b3o s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("208cf836", new Object[]{this, str});
        }
        this.f16158a = str;
        return this;
    }

    public b3o t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("e662713", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public b3o u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("5a3a3d3c", new Object[]{this, map});
        }
        this.i = map;
        return this;
    }

    public void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9747738", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public b3o w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("143181f8", new Object[]{this, map});
        }
        this.h = map;
        return this;
    }

    public b3o x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("e48d59cc", new Object[]{this, new Boolean(z)});
        }
        this.e = z;
        return this;
    }
}
