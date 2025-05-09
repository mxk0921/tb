package com.taobao.android.searchbaseframe.datasource.impl.bean;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.a9u;
import tb.mf6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TabBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_IMAGE = "img";
    public static final String TYPE_TEXT = "text";
    public String activeImage;
    public int imageHeight;
    public int imageWidth;
    public boolean isSelected;
    public String normalImage;
    public Map<String, String> params;
    public String showType;
    public String templateImage;
    public String bizName = "";
    public String showText = "";
    public String textColor = "";
    public String type = "";
    public String param = "";
    public String url = "";
    public boolean isDefaultInitJump = false;

    static {
        t2o.a(993001782);
    }

    public static ArrayList<TabBean> createDefaultTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("44abcca4", new Object[0]);
        }
        ArrayList<TabBean> arrayList = new ArrayList<>();
        TabBean tabBean = new TabBean();
        tabBean.bizName = "default";
        tabBean.isSelected = true;
        tabBean.showText = Localization.q(R.string.sf_default);
        tabBean.type = "native";
        arrayList.add(tabBean);
        return arrayList;
    }

    public static ArrayList<TabBean> parseBean(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("71ae5d00", new Object[]{jSONObject}) : parseBean(jSONObject, null);
    }

    public static ArrayList<TabBean> parseBean(JSONObject jSONObject, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f858bae2", new Object[]{jSONObject, a9uVar});
        }
        if (jSONObject != null && (jSONObject.get("tabs") instanceof JSONArray)) {
            return parseTabs(jSONObject.getJSONArray("tabs"), a9uVar);
        }
        return null;
    }

    private static Map<String, String> parseParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cde7cb7d", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("key");
                String string2 = jSONObject.getString("value");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    hashMap.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    private static ArrayList<TabBean> parseTabs(JSONArray jSONArray, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab95dbbc", new Object[]{jSONArray, a9uVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<TabBean> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("show");
                TabBean tabBean = new TabBean();
                if (jSONObject2 != null) {
                    tabBean.showText = jSONObject2.getString("text");
                    tabBean.showType = jSONObject2.getString("type");
                    Object obj = jSONObject2.get("data");
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        tabBean.normalImage = jSONObject3.getString("img_normal");
                        tabBean.activeImage = jSONObject3.getString("img_active");
                        tabBean.templateImage = jSONObject3.getString("templateImage");
                        tabBean.imageWidth = jSONObject3.getIntValue("img_width");
                        tabBean.imageHeight = jSONObject3.getIntValue("img_height");
                    }
                }
                tabBean.bizName = jSONObject.getString("bizName");
                tabBean.isSelected = jSONObject.getBooleanValue(mf6.TYPE_SELECTED);
                JSONObject jSONObject4 = jSONObject.getJSONObject("tabAction");
                if (jSONObject4 != null) {
                    tabBean.type = jSONObject4.getString("type");
                    tabBean.param = jSONObject4.getString("param");
                    tabBean.url = jSONObject4.getString("url");
                    tabBean.params = parseParams(jSONObject4.getJSONArray("params"));
                }
                sb.append(tabBean.bizName);
                sb.append("/");
                arrayList.add(tabBean);
            }
        }
        if (a9uVar != null) {
            a9uVar.f15618a = sb.toString();
        }
        return arrayList;
    }
}
