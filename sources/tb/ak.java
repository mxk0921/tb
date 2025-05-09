package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15782a;
    public ym b;
    public JSONObject c;
    @JSONField(serialize = false)
    private Map<String, Object> mExtraParams = new HashMap();

    static {
        t2o.a(80740413);
    }

    public ym a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ym) ipChange.ipc$dispatch("4270dfc7", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a966f3f", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
        }
        return this.f15782a;
    }

    public void d(ym ymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc49c31", new Object[]{this, ymVar});
        }
    }

    public void e(ym ymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2485d9", new Object[]{this, ymVar});
        } else {
            this.b = ymVar;
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b42c425", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b02e4", new Object[]{this, str});
        } else {
            this.f15782a = str;
        }
    }
}
