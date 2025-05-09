package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.weex_ability.mtop.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p6p implements a.AbstractC0516a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.b f25912a;
        public final /* synthetic */ XslDatasource b;
        public final /* synthetic */ JSONObject c;

        public a(a.b bVar, XslDatasource xslDatasource, JSONObject jSONObject) {
            this.f25912a = bVar;
            this.b = xslDatasource;
            this.c = jSONObject;
        }

        public void onEventMainThread(t2p t2pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            } else if (this.f25912a.a() == null) {
            } else {
                if (((XslSearchResult) this.b.getTotalSearchResult()).getCurrentData() != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", (Object) ((XslSearchResult) this.b.getTotalSearchResult()).getCurrentData());
                    p6p.a(p6p.this, jSONObject, this.c);
                    this.f25912a.a().a(jSONObject);
                    return;
                }
                this.f25912a.a().a(null);
            }
        }
    }

    static {
        t2o.a(815792300);
        t2o.a(980418635);
    }

    public static /* synthetic */ void a(p6p p6pVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ac3013", new Object[]{p6pVar, jSONObject, jSONObject2});
        } else {
            p6pVar.b(jSONObject, jSONObject2);
        }
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee15046", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        jSONObject.put("code", "200");
        jSONObject.put("v", (Object) jSONObject2.getString("v"));
        jSONObject.put("api", jSONObject2.get("api"));
        jSONObject.put("isPreload", "true");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("SUCCESS::调用成功");
        jSONObject.put(rb.RESULT_KEY, (Object) jSONArray);
    }

    public a.b c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("99f60f06", new Object[]{this, str, jSONObject});
        }
        a.b bVar = null;
        if (!TextUtils.isEmpty(str) && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && jSONObject2.containsKey("appId")) {
            HashMap hashMap = new HashMap();
            hashMap.put("appId", jSONObject2.getString("appId"));
            String string = jSONObject2.getString("params");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(string);
            HashMap hashMap2 = new HashMap();
            Map<String, Object> innerMap = parseObject.getInnerMap();
            if (innerMap == null) {
                return null;
            }
            for (Map.Entry<String, Object> entry : innerMap.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap2.put(entry.getKey(), (String) entry.getValue());
                }
            }
            XslDatasource c = mox.e().c(str, jSONObject.getString("api"), jSONObject.getString("v"), hashMap, hashMap2);
            if (c == null) {
                return null;
            }
            bVar = new a.b();
            if (c.getTotalSearchResult() == 0) {
                c.subscribe(new a(bVar, c, jSONObject));
            } else if (((XslSearchResult) c.getTotalSearchResult()).getCurrentData() != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("data", (Object) ((XslSearchResult) c.getTotalSearchResult()).getCurrentData());
                b(jSONObject3, jSONObject);
                bVar.f9944a = jSONObject3;
            }
        }
        return bVar;
    }
}
