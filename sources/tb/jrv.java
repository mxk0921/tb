package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jrv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22178a;
    public String b;
    public String c;

    static {
        t2o.a(486539526);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f8398c6", new Object[]{this})).booleanValue();
        }
        return this.f22178a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e10bd02", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a6227ca", new Object[]{this});
        }
        return this.b;
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe2db6c", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("enableExperienceCheck"))) {
            this.f22178a = TextUtils.equals(jSONObject.getString("enableExperienceCheck"), "true");
            this.b = jSONObject.getString("checkOpportunity");
            this.c = jSONObject.getString("checkKeyword");
        }
    }
}
