package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15531a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        t2o.a(456130613);
    }

    public static a3w h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("3c68cc02", new Object[0]);
        }
        return new a3w();
    }

    public static a3w i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("c64eae78", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return h().k(jSONObject);
    }

    public a3w a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("3133b0f3", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public a3w b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("8d057c54", new Object[]{this, jSONObject});
        }
        this.e = jSONObject;
        return this;
    }

    public a3w c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("15938240", new Object[]{this, str, obj});
        }
        if (this.e == null) {
            this.e = new JSONObject();
        }
        this.e.put(str, obj);
        return this;
    }

    public a3w d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("798d4e7", new Object[]{this, str});
        }
        this.f15531a = str;
        return this;
    }

    public a3w e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("a25948a9", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof a3w)) {
            return false;
        }
        a3w a3wVar = (a3w) obj;
        if (!TextUtils.equals(a3wVar.f15531a, this.f15531a) || !TextUtils.equals(a3wVar.b, this.b) || !TextUtils.equals(a3wVar.c, this.c)) {
            return false;
        }
        return true;
    }

    public a3w f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("175ec230", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b6a2ff62", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataVersion", (Object) this.f15531a);
        jSONObject.put("groupCode", (Object) this.b);
        jSONObject.put("versionCode", (Object) this.c);
        jSONObject.put("activeType", (Object) this.d);
        jSONObject.put("bizParams", (Object) this.e);
        return jSONObject;
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e56c7eca", new Object[]{this, str})).booleanValue();
        }
        return TextUtils.equals(str, this.b);
    }

    public a3w k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("4976740f", new Object[]{this, jSONObject});
        }
        return jSONObject == null ? this : d(jSONObject.getString("dataVersion")).f(jSONObject.getString("versionCode")).e(jSONObject.getString("groupCode")).a(jSONObject.getString("activeType")).b(jSONObject.getJSONObject("bizParams"));
    }
}
