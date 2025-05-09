package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.bridge.TryDecisionPassParam;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001923);
    }

    public static Map<String, TemplateBean> b(JSONArray jSONArray, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9dec02ea", new Object[]{jSONArray, ykoVar});
        }
        return c(jSONArray, null, ykoVar);
    }

    public static TemplateBean a(yko ykoVar, JSONObject jSONObject) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("162b9dff", new Object[]{ykoVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        TemplateBean templateBean = new TemplateBean();
        templateBean.templateName = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        templateBean.dItemType = jSONObject.getString("dItemType");
        templateBean.version = jSONObject.getString("version");
        templateBean.isGray = jSONObject.getString("isGray");
        String string = jSONObject.getString("url");
        String string2 = jSONObject.getString("lt_url");
        boolean z2 = TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2);
        ykoVar.f().h().getClass();
        if (z2) {
            string = string2;
        }
        templateBean.url = string;
        if (z2) {
            str = "lt_md5";
        } else {
            str = "md5";
        }
        templateBean.md5 = jSONObject.getString(str);
        templateBean.listHeight = k8x.c(jSONObject.getString("listHeight"));
        templateBean.midHeight = k8x.c(jSONObject.getString("midHeight"));
        JSONArray jSONArray = jSONObject.getJSONArray("supportedStyle");
        if (jSONArray != null && jSONArray.size() > 0) {
            templateBean.supportedStyle = new int[jSONArray.size()];
            int i = 0;
            while (true) {
                int[] iArr = templateBean.supportedStyle;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = jSONArray.getIntValue(i);
                i++;
            }
        }
        templateBean.required = wwf.a(jSONObject, TryDecisionPassParam.REQUIRED, 0);
        String g = g6p.g(templateBean.url);
        Map<String, String> f = g6p.f(templateBean.url);
        if (g != null && (g.endsWith(".wlasm") || g.endsWith(".wlm"))) {
            z = true;
        }
        templateBean.binary = z;
        if (TextUtils.equals("1", f.get("__cell_for_layout"))) {
            templateBean.cellBinary = true;
        }
        mit mitVar = ykoVar.f().h().h;
        if (mitVar != null) {
            ((w5p) mitVar).e(templateBean);
        }
        return templateBean;
    }

    public static Map<String, TemplateBean> c(JSONArray jSONArray, a9u a9uVar, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab4e6fcc", new Object[]{jSONArray, a9uVar, ykoVar});
        }
        if (jSONArray == null) {
            ykoVar.l().b("wx.TemplateConfigParser", "模板数组为空");
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            TemplateBean a2 = a(ykoVar, jSONArray.getJSONObject(i));
            if (a2 != null) {
                sb.append(a2.templateName);
                sb.append("/");
                hashMap.put(a2.templateName, a2);
            }
        }
        if (a9uVar != null) {
            a9uVar.f15618a = sb.toString();
        }
        return hashMap;
    }
}
