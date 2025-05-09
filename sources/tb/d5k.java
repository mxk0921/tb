package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.ucp.bridge.NativeDelegate;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17597a;
    public final List<y7d> b;
    public final List<y7d> c;
    public final List<y7d> d;
    public final List<y7d> e;
    public final List<y7d> f;
    public final List<y7d> g;
    public final List<y7d> h;
    public final List<y7d> i;
    public final Map<String, List<y7d>> j;
    public final Map<String, List<y7d>> k;

    static {
        t2o.a(404750516);
    }

    public d5k(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        this.f17597a = string;
        if (TextUtils.equals(string, BHRTaskConfigBase.TYPE_CONFIG_UT)) {
            this.b = xk8.a(jSONObject.getJSONArray("pgIn"));
            this.c = xk8.a(jSONObject.getJSONArray("pgNIn"));
            this.d = xk8.a(a(jSONObject.getJSONArray("eIdIn")));
            this.e = xk8.a(a(jSONObject.getJSONArray("eIdNIn")));
            this.f = xk8.a(jSONObject.getJSONArray("arg1In"));
            this.g = xk8.a(jSONObject.getJSONArray("arg1NIn"));
            this.h = xk8.a(jSONObject.getJSONArray("arg2In"));
            this.i = xk8.a(jSONObject.getJSONArray("arg2NIn"));
            this.j = xk8.b(jSONObject.getJSONObject("argsIn"));
            this.k = xk8.b(jSONObject.getJSONObject("argsNIn"));
        } else if (TextUtils.equals(string, NativeDelegate.SETTING_BIZ)) {
            this.b = xk8.a(jSONObject.getJSONArray("sceneIn"));
            this.c = xk8.a(jSONObject.getJSONArray("sceneNIn"));
            this.d = xk8.a(jSONObject.getJSONArray("actionTypeIn"));
            this.e = xk8.a(jSONObject.getJSONArray("actionTypeNIn"));
            this.f = xk8.a(jSONObject.getJSONArray("actionNameIn"));
            this.g = xk8.a(jSONObject.getJSONArray("actionNameNIn"));
            this.h = xk8.a(jSONObject.getJSONArray("bizIdIn"));
            this.h = xk8.a(jSONObject.getJSONArray("bizIdNIn"));
            this.j = xk8.b(jSONObject.getJSONObject("bizArgsIn"));
            this.k = xk8.b(jSONObject.getJSONObject("bizArgsNIn"));
        }
    }

    public final JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string)) {
                jSONArray2.add(gwv.g(string));
            }
        }
        return jSONArray2;
    }

    public List<y7d> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3963004", new Object[]{this});
        }
        return this.f;
    }

    public List<y7d> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d08d884", new Object[]{this});
        }
        return this.g;
    }

    public List<y7d> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b722eb5", new Object[]{this});
        }
        return this.d;
    }

    public List<y7d> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0acaff3", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, List<y7d>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("26a54bdb", new Object[]{this});
        }
        return this.j;
    }

    public List<y7d> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7077f065", new Object[]{this});
        }
        return this.b;
    }

    public List<y7d> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c5f2443", new Object[]{this});
        }
        return this.c;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f17597a;
    }
}
