package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b6z implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809367);
        t2o.a(729809365);
    }

    public final void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b99445", new Object[]{this, jSONObject, str});
            return;
        }
        for (String str2 : jSONObject.keySet()) {
            c(jSONObject, str2, str);
        }
    }

    public final void c(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f883231", new Object[]{this, jSONObject, str, str2});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject(str);
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("item")) != null && (jSONObject3 = jSONObject2.getJSONObject("0")) != null) {
            String string = jSONObject3.getString("targetUrl");
            if (!TextUtils.isEmpty(string)) {
                jSONObject3.put("targetUrl", (Object) (string + str2));
            }
            JSONObject jSONObject5 = jSONObject2.getJSONObject("1");
            if (jSONObject5 != null) {
                String string2 = jSONObject5.getString("targetUrl");
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject5.put("targetUrl", (Object) (string2 + str2));
                }
            }
        }
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41f9cf21", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature getElemeQueryParams params null ");
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : parseObject.keySet()) {
                stringBuffer.append("&");
                stringBuffer.append(str2);
                stringBuffer.append("=");
                stringBuffer.append(parseObject.getString(str2));
            }
            bqa.d("ElemeJsFeature", "ElemeJsFeature getElemeQueryParams queryParams: " + ((Object) stringBuffer));
            return stringBuffer.toString();
        } catch (Exception e) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature getElemeQueryParams error " + e);
            return null;
        }
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("eleme");
    }

    public final String h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8625954", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("track");
        if (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("searchText")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null || (jSONObject4 = jSONObject3.getJSONObject("commonArgs")) == null) {
            return null;
        }
        return jSONObject4.getString("multiTabId");
    }

    public final boolean i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b62bd1", new Object[]{this, jSONObject, str})).booleanValue();
        }
        String h = h(jSONObject);
        if (!TextUtils.equals(h, "eleme")) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature execute tabId 不匹配 " + h);
            return false;
        }
        String d = d(str);
        if (!TextUtils.isEmpty(d)) {
            return a(jSONObject, d);
        }
        bqa.d("ElemeJsFeature", "ElemeJsFeature execute elemeQueryParams null ");
        return false;
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!f4b.b("enableElemeSearchQueryParams", false)) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature execute 开关未打开 ");
            return false;
        }
        JSONObject d = e0p.d();
        if (d == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature execute searchBarSection null ");
            return false;
        } else if (d.getBooleanValue("slimSection")) {
            return i(d, str2);
        } else {
            return g(d, str2);
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b66237", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature isEleme controllerService null ");
            return false;
        }
        JSONObject subTabData = iHomeControllerService.getCurrentSubTabController().getSubTabData();
        if (subTabData == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature isEleme subTabData null ");
            return false;
        }
        JSONObject jSONObject = subTabData.getJSONObject("content");
        if (jSONObject != null) {
            return TextUtils.equals(jSONObject.getString(vaj.KEY_TAB_ID), "eleme");
        }
        bqa.d("ElemeJsFeature", "ElemeJsFeature isEleme content null ");
        return false;
    }

    public final boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a88e892a", new Object[]{this, jSONObject, str})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature getSearchBoxUrl content null");
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("searchText");
        if (jSONObject3 == null) {
            return false;
        }
        for (String str2 : jSONObject3.keySet()) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
            if (jSONObject4 != null) {
                String string = jSONObject4.getString("searchBoxUrl");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject4.put("searchBoxUrl", (Object) (string + str));
                }
                String string2 = jSONObject4.getString("searchButtonUrl");
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject4.put("searchButtonUrl", (Object) (string2 + str));
                }
            }
        }
        return true;
    }

    public final boolean g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da65a0bb", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (!f()) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox not eleme ");
            return false;
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox param null ");
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox subSection null ");
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("home");
        if (jSONObject3 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox home null ");
            return false;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("subSection");
        if (jSONObject4 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox homeSubSection null ");
            return false;
        }
        JSONObject jSONObject5 = jSONObject4.getJSONObject(cpj.SEARCH_BOX);
        if (jSONObject5 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox searchBox null ");
            return false;
        }
        JSONObject jSONObject6 = jSONObject5.getJSONObject("subSection");
        if (jSONObject6 == null) {
            bqa.d("ElemeJsFeature", "ElemeJsFeature oldSearchBox searchBoxSubSection null ");
            return false;
        }
        b(jSONObject6, d);
        return true;
    }
}
