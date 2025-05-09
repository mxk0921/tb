package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30486a = false;
    public JSONObject b = new JSONObject();
    public final pvh c;
    public final pvh d;
    public String e;
    public com.alibaba.fastjson.JSONObject f;
    public String g;
    public int h;

    static {
        t2o.a(980418645);
    }

    public w6j(pvh pvhVar, pvh pvhVar2) {
        this.c = pvhVar;
        this.d = pvhVar2;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            try {
                this.b.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void b(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fca6d6", new Object[]{this, str, jSONArray});
        } else if (str != null && jSONArray != null) {
            try {
                this.b.put(str, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public pvh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("4812a4fd", new Object[]{this});
        }
        return this.c;
    }

    public pvh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("79776bf", new Object[]{this});
        }
        return this.d;
    }

    public com.alibaba.fastjson.JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("668a87b6", new Object[]{this});
        }
        return this.f;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba6f0e08", new Object[]{this});
        }
        return this.b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.g;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f30486a;
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b = jSONObject;
        }
    }

    public void k(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd1ba8e", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c49780a", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f30486a = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.b.toString();
    }
}
