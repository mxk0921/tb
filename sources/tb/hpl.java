package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubSectionModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_ADDED_TEXT = "allAddedText";
    public static final String ALL_ADDED_TEXT_COLOR = "allAddedTextColor";
    public static final String ARROW_IMG = "arrowImg";
    public static final String CURRENT_MENU_CODE = "currentMenuCode";
    public static final String DEFAULT_TITLE_TAG = "defaultTitleTag";
    public static final String DOWN_PANEL = "downPanel";
    public static final String EDIT_INTRODUCER_TEXT = "editIntroducerText";
    public static final String INTRODUCER_TEXT = "introducerText";
    public static final String INTRODUCER_TEXT_COLOR = "introducerTextColor";
    public static final String IS_CATEGORY_SELECT = "isCategorySelect";
    public static final String IS_CLICK = "isClick";
    public static final String IS_EDITABLE = "isEditable";
    public static final String ITEM_IV_TAG = "editIvTag";
    public static final String ITEM_PARENT_TAG = "itemParentTag";
    public static final String ITEM_TV_TAG = "itemTvTag";
    public static final String MENU_CODE = "menuCode";
    public static final String MIN_NUMS_WARNING = "minNumsWarning";
    public static final String MY_CHANNEL = "myChannel";
    public static final String MY_CHANNEL_MIN_NUMS = "myChannelMInNums";
    public static final String PANEL_GUIDE_CLOSE_IMG = "closeImg";
    public static final String PANEL_SECTION = "panelSection";
    public static final String SECTION_NAME = "sectionName";
    public static final String TABS = "tabs";
    public static final String TAB_SECTION_CODE = "categoryTab";
    public static final String TITLE_MAIN_TAG = "mainTitleTag";
    public static final String TITLE_SUB_TAG = "subTitleTag";
    public static final String VIEW_TYPE = "viewType";
    public static final int VIEW_TYPE_CATEGORY = 2;
    public static final int VIEW_TYPE_DEFAULT_NULL_TITLE = 3;
    public static final int VIEW_TYPE_TITLE = 1;

    static {
        t2o.a(729809553);
    }

    public static List<JSONObject> d(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f603a03b", new Object[]{jSONObject, new Integer(i)});
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        JSONObject o = o(jSONObject);
        if (o == null) {
            return copyOnWriteArrayList;
        }
        for (int i2 = 0; i2 < o.size(); i2++) {
            JSONObject jSONObject2 = o.getJSONObject(String.valueOf(i2));
            if (jSONObject2 != null) {
                b(jSONObject2, copyOnWriteArrayList);
                a(jSONObject2, copyOnWriteArrayList, i);
            }
        }
        return copyOnWriteArrayList;
    }

    public static int e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd026bb", new Object[]{str, str2})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Color.parseColor(str2);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    public static String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("115f49c4", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject2.getString(vaj.KEY_TAB_ID);
    }

    public static String g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6a1d586", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject2.getString(CURRENT_MENU_CODE);
    }

    public static JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("460de9ab", new Object[0]);
        }
        for (SectionModel sectionModel : yyj.e().c().r(yyj.e().f())) {
            if (TextUtils.equals("categoryTab", sectionModel.getSectionBizCode())) {
                return sectionModel;
            }
        }
        return null;
    }

    public static PanelStyleModel i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelStyleModel) ipChange.ipc$dispatch("6bddf6ba", new Object[]{jSONObject});
        }
        JSONObject j = j(jSONObject);
        if (j == null || (jSONObject2 = j.getJSONObject("ext")) == null) {
            return null;
        }
        try {
            return (PanelStyleModel) JSON.parseObject(JSON.toJSONString(jSONObject2), PanelStyleModel.class);
        } catch (Exception e) {
            d9j.d("PanelDataUtils", "getPanelData error", e);
            return null;
        }
    }

    public static JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e392a12", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject(DOWN_PANEL)) == null || (jSONObject4 = jSONObject3.getJSONObject("subSection")) == null) {
            return null;
        }
        return jSONObject4.getJSONObject(PANEL_SECTION);
    }

    public static SectionModel l(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("7ba9859b", new Object[]{list});
        }
        SectionModel sectionModel = null;
        for (SectionModel sectionModel2 : list) {
            if (TextUtils.equals("categoryTab", sectionModel2.getSectionBizCode())) {
                sectionModel = sectionModel2;
            }
        }
        return sectionModel;
    }

    public static void m(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce51dd1", new Object[]{jSONObject, new Boolean(z)});
        } else if (z) {
            jSONObject.remove(MY_CHANNEL);
        } else {
            ArrayList arrayList = new ArrayList();
            JSONObject k = k(h());
            if (k != null) {
                for (int i = 0; i < k.size(); i++) {
                    String f = f(k.getJSONObject(String.valueOf(i)));
                    if (!TextUtils.isEmpty(f)) {
                        arrayList.add(f);
                    }
                }
                jSONObject.put(MY_CHANNEL, (Object) JSON.toJSONString(arrayList));
            }
        }
    }

    public static boolean n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a37bd79", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject j = j(jSONObject);
        if (j == null || (jSONObject2 = j.getJSONObject("ext")) == null) {
            return false;
        }
        return jSONObject2.getBooleanValue("customizable");
    }

    public static JSONObject o(JSONObject jSONObject) {
        JSONObject j;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("488d8775", new Object[]{jSONObject});
        }
        JSONObject k = k(jSONObject);
        if (k == null || (j = j(jSONObject)) == null || (jSONObject2 = j.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null) {
            return null;
        }
        jSONObject3.remove("item");
        jSONObject3.put("item", (Object) k);
        return jSONObject2;
    }

    public static void b(JSONObject jSONObject, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74641b", new Object[]{jSONObject, list});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            jSONObject2.put(VIEW_TYPE, (Object) 1);
            list.add(jSONObject2);
        }
    }

    public static boolean c(Map<String, List<JSONObject>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a52d80", new Object[]{map})).booleanValue();
        }
        if (map != null && !map.isEmpty()) {
            imn c = yyj.e().c();
            String f = yyj.e().f();
            AwesomeGetContainerData u = c.u(f);
            if (!p(l(u.base.sections), map)) {
                return false;
            }
            AwesomeGetContainerInnerData clone = u.base.clone();
            try {
                List<SectionModel> parseArray = JSON.parseArray(JSON.toJSONString(JSON.toJSON(clone.sections)), SectionModel.class);
                clone.sections = parseArray;
                SectionModel l = l(parseArray);
                if (l == null) {
                    return false;
                }
                SubSectionModel subSection = l.getSubSection();
                for (Map.Entry<String, List<JSONObject>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<JSONObject> value = entry.getValue();
                    if (TextUtils.equals(key, MY_CHANNEL)) {
                        r(subSection, value);
                    } else {
                        q(l, key, value);
                    }
                }
                c.l(clone, f, "base");
                u.base = clone;
                return true;
            } catch (Exception e) {
                d9j.d("PanelDataUtils", "updateTabDataSource parseArray error", e);
            }
        }
        return false;
    }

    public static JSONObject k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d9f89d97", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabs")) == null) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("item");
        for (int i = 0; i < jSONObject5.size(); i++) {
            JSONObject jSONObject6 = jSONObject5.getJSONObject(String.valueOf(i));
            if (!(jSONObject6 == null || (jSONObject4 = jSONObject6.getJSONObject("content")) == null)) {
                jSONObject4.put(CURRENT_MENU_CODE, MY_CHANNEL);
            }
        }
        return jSONObject5;
    }

    public static boolean p(SectionModel sectionModel, Map<String, List<JSONObject>> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61ac7835", new Object[]{sectionModel, map})).booleanValue();
        }
        if (sectionModel == null || sectionModel.getSubSection() == null || (jSONObject = sectionModel.getSubSection().getJSONObject("tabs")) == null || (jSONObject2 = jSONObject.getJSONObject("item")) == null) {
            return true;
        }
        List<JSONObject> list = map.get(MY_CHANNEL);
        if (list == null) {
            return false;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < jSONObject2.size(); i++) {
            copyOnWriteArrayList.add(jSONObject2.getJSONObject(String.valueOf(i)));
        }
        return !list.equals(copyOnWriteArrayList);
    }

    public static void q(SectionModel sectionModel, String str, List<JSONObject> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd2c9ae", new Object[]{sectionModel, str, list});
            return;
        }
        JSONObject j = j(sectionModel);
        if (!(j == null || (jSONObject = j.getJSONObject("subSection")) == null)) {
            for (int i = 0; i < jSONObject.size() && (jSONObject2 = jSONObject.getJSONObject(String.valueOf(i))) != null && (jSONObject3 = jSONObject2.getJSONObject("ext")) != null; i++) {
                JSONObject jSONObject4 = new JSONObject();
                if (TextUtils.equals(str, jSONObject3.getString(MENU_CODE))) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        jSONObject4.put(String.valueOf(i2), (Object) list.get(i2));
                    }
                    jSONObject2.put("item", (Object) jSONObject4);
                }
            }
        }
    }

    public static void r(SubSectionModel subSectionModel, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983c1fd2", new Object[]{subSectionModel, list});
            return;
        }
        JSONObject jSONObject = subSectionModel.getJSONObject("tabs");
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            for (int i = 0; i < list.size(); i++) {
                jSONObject2.put(String.valueOf(i), (Object) list.get(i));
            }
            jSONObject.put("item", (Object) jSONObject2);
        }
    }

    public static void a(JSONObject jSONObject, List<JSONObject> list, int i) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d15d14", new Object[]{jSONObject, list, new Integer(i)});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        if (jSONObject3 != null) {
            int i2 = 0;
            while (i2 < jSONObject3.size()) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(String.valueOf(i2));
                if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("content")) == null)) {
                    String string = jSONObject2.getString(MENU_CODE);
                    String string2 = jSONObject2.getString(CURRENT_MENU_CODE);
                    jSONObject2.put(IS_CATEGORY_SELECT, (Object) Boolean.valueOf(i == i2 && TextUtils.equals(string2, MY_CHANNEL)));
                    if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    }
                    jSONObject2.put(CURRENT_MENU_CODE, (Object) string);
                    jSONObject4.put(VIEW_TYPE, (Object) Integer.valueOf(jSONObject4.containsKey(VIEW_TYPE) ? jSONObject4.getIntValue(VIEW_TYPE) : 2));
                    list.add(jSONObject4);
                }
                i2++;
            }
        }
    }
}
