package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class och {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";

    /* renamed from: a  reason: collision with root package name */
    public final String f25299a;
    public final String b;

    static {
        t2o.a(912261538);
    }

    public och(JSONObject jSONObject) {
        this.f25299a = jSONObject.getString("id");
        this.b = jSONObject.getString("name");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f25299a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }
}
