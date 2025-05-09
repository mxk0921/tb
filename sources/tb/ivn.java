package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ivn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21601a;
    public final String b;
    public JSONObject c;
    public boolean d;

    static {
        t2o.a(481297176);
    }

    public ivn(String str, String str2, JSONObject jSONObject, boolean z) {
        ckf.g(str, "regionKey");
        ckf.g(str2, q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        this.f21601a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = z;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d57ff7", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63efa719", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1016204", new Object[]{this});
        }
        return this.f21601a;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("680a8339", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b71976d", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57c1d77", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
