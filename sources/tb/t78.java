package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28535a;
    public List<a3w> b;

    static {
        t2o.a(456130602);
    }

    public static t78 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t78) ipChange.ipc$dispatch("30161107", new Object[0]);
        }
        return new t78();
    }

    public static t78 c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t78) ipChange.ipc$dispatch("242b6cfd", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return b().a(jSONObject);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", this.f28535a);
    }

    public t78 a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t78) ipChange.ipc$dispatch("731cc3f4", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getString("type");
        this.f28535a = jSONObject.getString("success");
        jSONObject.getString("errCode");
        jSONObject.getString("errMsg");
        a3w.i(jSONObject.getJSONObject("switchedVersion"));
        JSONArray jSONArray = jSONObject.getJSONArray("versionLists");
        if (jSONArray != null && jSONArray.size() > 0) {
            this.b = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                this.b.add(a3w.h().k(jSONArray.getJSONObject(i)));
            }
        }
        return this;
    }
}
