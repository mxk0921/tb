package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.testutils.log.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.o0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<BHRTaskConfig> b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<BHRTaskConfig>> f24131a = new ConcurrentHashMap();
    public String c = "";
    public final String d = "";
    public String e = "";

    static {
        t2o.a(404750362);
    }

    public static mm1 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm1) ipChange.ipc$dispatch("cd9bf0df", new Object[0]);
        }
        return new mm1();
    }

    public final List<BHRTaskConfig> a(Map<String, List<BHRTaskConfig>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(100);
        for (Map.Entry<String, List<BHRTaskConfig>> entry : map.entrySet()) {
            List<BHRTaskConfig> value = entry.getValue();
            if (value != null) {
                arrayList.addAll(value);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void c(String str, JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d6dd5a", new Object[]{this, str, jSONArray});
        } else if (jSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    try {
                        arrayList.add(new BHRTaskConfig(jSONObject));
                    } catch (Throwable unused) {
                    }
                }
            }
            e(str, arrayList);
        } else {
            throw new Exception("config array is empty.");
        }
    }

    public void d(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject != null) {
            c(str, parseObject.getJSONArray("BHRConfigEventRuleKey"));
            return;
        }
        throw new Exception("config json is null");
    }

    public void e(String str, List<BHRTaskConfig> list) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (list != null) {
            ((ConcurrentHashMap) this.f24131a).put(str, new ArrayList(list));
            this.b = a(this.f24131a);
        } else {
            throw new Exception("config array is empty.");
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h();
        g();
        i();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String l = v82.l(o0r.a.K_UT_EVENT_FILTERS, "");
        if (!TextUtils.equals(this.d, l)) {
            try {
                JSONObject parseObject = JSON.parseObject(l);
                if (parseObject != null) {
                    new JSONObject(parseObject);
                } else {
                    new JSONObject();
                }
            } catch (JSONException e) {
                om8.e("BHRTaskConfigCenter", e);
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String l = v82.l("uppConfig", "");
        if (!TextUtils.equals(this.c, l)) {
            try {
                JSONArray parseArray = JSON.parseArray(l);
                if (parseArray != null && parseArray.size() > 0) {
                    ArrayList arrayList = new ArrayList(parseArray.size());
                    for (int i = 0; i < parseArray.size(); i++) {
                        arrayList.add(new BHRTaskConfig(parseArray.getJSONObject(i)));
                    }
                    ((ConcurrentHashMap) this.f24131a).put("uppConfig", arrayList);
                }
                this.b = a(this.f24131a);
                this.c = l;
            } catch (JSONException e) {
                om8.e("BHRTaskConfigCenter", e);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String l = v82.l("uppPlanConfig", "");
        if (!TextUtils.equals(this.e, l)) {
            try {
                JSON.parseArray(l);
                this.e = l;
                LogUtils.e(LogUtils.BR_BIZ_NAME, "updateUPPPlanConfig", l);
            } catch (JSONException e) {
                om8.e("BHRTaskConfigCenter", e);
            }
        }
    }
}
