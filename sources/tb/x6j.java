package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f31179a;
    public boolean b;
    public JSONObject c;

    public x6j() {
        this.f31179a = null;
        this.b = false;
        this.c = new JSONObject();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            try {
                this.c.put(str, str2);
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
                this.c.put(str, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public WVCallBackContext c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("484aa2bc", new Object[]{this});
        }
        return this.f31179a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.c = jSONObject;
        }
    }

    public void f(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e09a828", new Object[]{this, wVCallBackContext});
        } else {
            this.f31179a = wVCallBackContext;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.c.toString();
    }

    public x6j(WVCallBackContext wVCallBackContext) {
        this.f31179a = null;
        this.b = false;
        this.c = new JSONObject();
        this.f31179a = wVCallBackContext;
    }
}
