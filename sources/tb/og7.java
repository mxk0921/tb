package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class og7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f25371a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            if (obj2 != null) {
                jSONObject = JSON.parseObject(obj2.toString());
            } else {
                jSONObject = null;
            }
            og7.a(og7.this, jSONObject);
        }
    }

    static {
        t2o.a(912262649);
    }

    public og7(Context context, ze7 ze7Var) {
        this.f25371a = ze7Var;
        ze7Var.i().e("price_model", new a());
    }

    public static /* synthetic */ void a(og7 og7Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3711129", new Object[]{og7Var, jSONObject});
        } else {
            og7Var.d(jSONObject);
        }
    }

    public final Map<String, List<oa4>> b(List<String> list) {
        yns s;
        oa4 f;
        oa4 f2;
        String h;
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2452ca19", new Object[]{this, list});
        }
        HashMap hashMap = null;
        if (list != null && !list.isEmpty()) {
            jns jnsVar = (jns) this.f25371a.e().e(kns.PARSER_ID);
            if (jnsVar == null || (s = jnsVar.s()) == null) {
                return null;
            }
            hashMap = new HashMap();
            e1i q = s.q();
            if (q != null && q.l() > 0) {
                int l = q.l();
                for (int i = 0; i < l; i++) {
                    z4k k = q.k(i);
                    if (!(k == null || (f2 = k.f(this.f25371a.d())) == null || (h = f2.getComponentData().h()) == null || (parseArray = JSON.parseArray(h)) == null || parseArray.isEmpty())) {
                        for (String str : list) {
                            if (parseArray.contains(str)) {
                                List list2 = (List) hashMap.get(str);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    hashMap.put(str, list2);
                                }
                                if (!list2.contains(f2)) {
                                    list2.add(f2);
                                }
                            }
                        }
                    }
                }
            }
            xi2 o = s.o();
            if (!(o == null || (f = o.f(this.f25371a.d())) == null || !c(f.getComponentData().f(), list))) {
                List list3 = (List) hashMap.get("bottomBar");
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put("bottomBar", list3);
                }
                if (!list3.contains(f)) {
                    list3.add(f);
                }
            }
        }
        return hashMap;
    }

    public final boolean c(JSONObject jSONObject, List<String> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb101b", new Object[]{this, jSONObject, list})).booleanValue();
        }
        if (jSONObject != null && list.contains("bottomBar") && (obj = jSONObject.get("detail3")) != null && Boolean.parseBoolean(String.valueOf(obj))) {
            return true;
        }
        return false;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628a4fd3", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : jSONObject.keySet()) {
                if (!LightOffLayerManger.KEY_PRICE_SECTION.equals(str) && !"propPath".equals(str) && !q2q.KEY_SKU_ID.equals(str)) {
                    arrayList.add(str);
                }
            }
            for (Map.Entry<String, List<oa4>> entry : b(arrayList).entrySet()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(entry.getKey());
                for (oa4 oa4Var : entry.getValue()) {
                    JSONObject f = oa4Var.getComponentData().f();
                    if (f != null) {
                        f.putAll(jSONObject2);
                        oa4Var.updateComponent();
                    }
                }
            }
        }
    }
}
