package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ucm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_HOME_PAGE = "PageTaoHome";
    public final String b;

    /* renamed from: a  reason: collision with root package name */
    public String f29294a = "PageTaoHome";
    public final JSONObject c = new JSONObject();

    static {
        t2o.a(729808980);
    }

    public ucm(String str) {
        this.b = str;
    }

    public static ucm d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucm) ipChange.ipc$dispatch("543b697", new Object[]{str});
        }
        return new ucm(str);
    }

    public static void f(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3f245e", new Object[]{zveVar});
        } else if (zveVar != null && !TextUtils.isEmpty("PageTaoHome") && !TextUtils.isEmpty(zveVar.f33039a)) {
            d(zveVar.f33039a).a("PageTaoHome").b(zveVar.c()).e();
        }
    }

    public ucm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucm) ipChange.ipc$dispatch("911b50f8", new Object[]{this, str});
        }
        this.f29294a = str;
        return this;
    }

    public ucm b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucm) ipChange.ipc$dispatch("bc682ce2", new Object[]{this, jSONObject});
        }
        if (!(jSONObject == null || jSONObject.size() == 0)) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.c.put(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public ucm c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucm) ipChange.ipc$dispatch("b04e4662", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return this;
        }
        this.c.put(str, (Object) str2);
        return this;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b183fc01", new Object[]{this});
        } else {
            new ujn(this).a();
        }
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "pageName:" + this.f29294a + " eventName:" + this.b + " params" + this.c.toJSONString();
    }
}
