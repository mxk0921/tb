package tb;

import androidx.appcompat.widget.ActivityChooserModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537943);
    }

    public final s3j a(iln ilnVar, JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3j) ipChange.ipc$dispatch("9630585d", new Object[]{this, ilnVar, jSONObject});
        }
        ckf.h(ilnVar, "reason");
        ckf.h(jSONObject, "mtopJson");
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        JSONObject jSONObject4 = null;
        if (!(jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray("hierarchy")) == null)) {
            JSONArray jSONArray2 = new JSONArray();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                jSONArray2.addAll(jSONArray.getJSONArray(i));
            }
            JSONObject jSONObject5 = jSONObject3.getJSONObject("hierarchyData");
            if (jSONObject5 != null) {
                s3j s3jVar = new s3j(jln.a(ilnVar));
                s3jVar.f(b(ilnVar, jSONArray2, jSONObject5));
                s3jVar.h(jSONObject3.getJSONObject("pagebackContext"));
                s3jVar.g(jSONObject3.getJSONObject("global"));
                JSONObject jSONObject6 = jSONObject5.getJSONObject("basementTip");
                if (!(jSONObject6 == null || (jSONObject2 = jSONObject6.getJSONObject("fields")) == null)) {
                    jSONObject4 = jSONObject2.getJSONObject("basementTip");
                }
                s3jVar.e(jSONObject4);
                return s3jVar;
            }
        }
        return null;
    }

    public final List<h3j> b(iln ilnVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9831faed", new Object[]{this, ilnVar, jSONArray, jSONObject});
        }
        ckf.h(ilnVar, "reason");
        ckf.h(jSONArray, "hierarchyList");
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
            JSONObject jSONObject3 = jSONObject != null ? jSONObject.getJSONObject(string) : null;
            ckf.c(string, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
            arrayList.add(c(ilnVar, string, jSONObject2, jSONObject3));
        }
        return arrayList;
    }

    public final h3j c(iln ilnVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3j) ipChange.ipc$dispatch("8771c0bd", new Object[]{this, ilnVar, str, jSONObject, jSONObject2});
        }
        ckf.h(ilnVar, "reason");
        ckf.h(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        ckf.h(jSONObject, "hierarchyItem");
        h3j h3jVar = new h3j(jln.a(ilnVar));
        Object obj = ilnVar.a().get("requestType");
        if ((obj instanceof Integer) && 2 == ((Integer) obj).intValue()) {
            h3jVar.l(true);
        }
        h3jVar.o(str);
        h3jVar.p(jSONObject2 == null ? null : JSON.parseObject(jSONObject2.toJSONString()));
        String string = jSONObject.getString("containerType");
        h3jVar.i(string);
        h3jVar.n(jSONObject.getFloat(ActivityChooserModel.ATTRIBUTE_WEIGHT));
        h3jVar.j(jSONObject.getString("diffLoadIdentify"));
        if (ckf.b(string, "dinamicx")) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = jSONObject.getString("name");
            Long l = jSONObject.getLong("version");
            ckf.c(l, "hierarchyItem.getLong(\"version\")");
            dXTemplateItem.b = l.longValue();
            dXTemplateItem.c = jSONObject.getString("url");
            h3jVar.k(dXTemplateItem);
        }
        return h3jVar;
    }
}
