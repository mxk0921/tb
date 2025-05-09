package tb;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vaj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARGS_TYPE_MAP = "argsTypeMap";
    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String BUBBLE = "bubble";
    public static final String BUBBLE_DARK_GIF = "bubbleDarkGif";
    public static final String BUBBLE_DARK_IMG = "bubbleDarkImg";
    public static final String BUBBLE_FATIGUE = "bubbleFatigue";
    public static final String BUBBLE_GIF = "bubbleGif";
    public static final String BUBBLE_IMG = "bubbleImg";
    public static final String BUSINESS_ID_GUIDE_POP = "guideTabPop";
    public static final String DARK_MODEL_GIF = "darkModelGif";
    public static final String DARK_MODEL_IMG = "darkModelImg";
    public static final String GIF = "gif";
    public static final String GIF_FATIGUE_COUNT = "gifFatigueCount";
    public static final String GIF_FATIGUE_PERIOD = "gifFatiguePeriod";
    public static final String IMG = "img";
    public static final String KEY_BG_COLOR = "bgColor";
    public static final String KEY_BG_IMG = "bgImg";
    public static final String KEY_CONTAINER_TYPE = "containerType";
    public static final String KEY_DARK_TAB_GIF_URL = "darkTabGif";
    public static final String KEY_DARK_TAB_IMG_URL = "darkTabImgUrl";
    public static final String KEY_DARK_TAB_SELECTED_IMG_URL = "darkTabSelectedImgUrl";
    public static final String KEY_DARK_TEXT_SELECT_COLOR = "darkTextSelectColor";
    public static final String KEY_DEFAULT_SELECTED = "isDefaultSelected";
    public static final String KEY_DOWN_PANEL_ANCHOR_Y = "panelAnchorY";
    public static final String KEY_DOWN_PANEL_DARK_DOWN_IMG = "darkModeDownArrowImg";
    public static final String KEY_DOWN_PANEL_DARK_UP_IMG = "darkModeUpArrowImg";
    public static final String KEY_DOWN_PANEL_DOWN_IMG = "downArrowImg";
    public static final String KEY_DOWN_PANEL_UP_IMG = "upArrowImg";
    public static final String KEY_EMBED_SEARCH_BAR = "embedSearchBar";
    public static final String KEY_FESTIVAL_DARK = "0";
    public static final String KEY_FESTIVAL_LIGHT = "1";
    public static final String KEY_IMAGE_TAB_HEIGHT_AP = "imageTabHeightAp";
    public static final String KEY_IMAGE_TAB_WIDTH_AP = "imageTabWidthAp";
    public static final String KEY_IS_DEEP_COLOR = "isDeepColor";
    public static final String KEY_IS_FESTIVAL = "isFestival";
    public static final String KEY_IS_RECOMMEND_TAB = "isRecommendTab";
    public static final String KEY_IS_STICKY_LEFT = "isStickyLeft";
    public static final String KEY_RIGHT_TOP_TAB_ICON = "rightTopTabIcon";
    public static final String KEY_SELECTED_IS_BOLD = "selectedIsBold";
    public static final String KEY_SELECTED_TAB_ID = "selectedTabId";
    public static final String KEY_SHOW_TAB_INDICATOR = "showTabIndicator";
    public static final String KEY_SMART_CONTENT = "smartContent";
    public static final String KEY_TABS = "tabs";
    public static final String KEY_TAB_DARK_TEXT_COLOR = "darkTextColor";
    public static final String KEY_TAB_GIF_DURATION = "gifDuration";
    public static final String KEY_TAB_GIF_URL = "tabGif";
    public static final String KEY_TAB_ID = "tabId";
    public static final String KEY_TAB_IMG_PADDING = "imgPadding";
    public static final String KEY_TAB_IMG_URL = "tabImgUrl";
    public static final String KEY_TAB_INDICATOR_COLOR = "tabIndicatorColor";
    public static final String KEY_TAB_INDICATOR_DARK_COLOR = "tabIndicatorDarkColor";
    public static final String KEY_TAB_LABEL_ASPECT_RATIO = "labelAspectRatio";
    public static final String KEY_TAB_LABEL_DARK_GIF = "labelDarkGif";
    public static final String KEY_TAB_LABEL_DARK_IMG = "labelDarkImg";
    public static final String KEY_TAB_LABEL_DARK_SELECT_GIF = "labelDarkSelectGif";
    public static final String KEY_TAB_LABEL_DARK_SELECT_IMG = "labelDarkSelectImg";
    public static final String KEY_TAB_LABEL_GIF = "labelGif";
    public static final String KEY_TAB_LABEL_IMG = "labelImg";
    public static final String KEY_TAB_LABEL_LOCATION = "labelLocation";
    public static final String KEY_TAB_LABEL_SELECT_ASPECT_RATIO = "labelSelectAspectRatio";
    public static final String KEY_TAB_LABEL_SELECT_GIF = "labelSelectGif";
    public static final String KEY_TAB_LABEL_SELECT_IMG = "labelSelectImg";
    public static final String KEY_TAB_MARGIN_LEFT = "tabMarginLeft";
    public static final String KEY_TAB_SECTION = "tabSection";
    public static final String KEY_TAB_SELECTED_IMG = "tabSelectedImgUrl";
    public static final String KEY_TAB_SPACE_CONFIG = "tabSpaceConfig";
    public static final String KEY_TAB_TEXT = "text";
    public static final String KEY_TEXT = "text";
    public static final String KEY_TEXT_COLOR = "textColor";
    public static final String KEY_TEXT_SELECT_COLOR = "textSelectColor";
    public static final String KEY_TEXT_SELECT_SIZE = "textSelectSize";
    public static final String KEY_TEXT_SIZE = "textSize";
    public static final String KEY_TOP_BAR_BG_COLOR = "topBarBgColor";
    public static final String KEY_TOP_BAR_BG_IMG = "topBarBgImg";
    public static final String KEY_UNSELECTED_IS_BOLD = "unSelectedIsBold";
    public static final String MULTI_TAB_SECTION_BIZ_CODE = "categoryTab";
    public static final String PATH_DOWN_PANEL_ARROW_CONFIG = "subSection.downPanel.item.0.smartContent.arrowConfig";
    public static final String PATH_DOWN_PANEL_ITEM = "subSection.downPanel.item.0";
    public static final String PATH_DOWN_PANEL_POP_CONFIG = "subSection.downPanel.item.0.smartContent.panelPopConfig";
    public static final String PATH_DOWN_PANEL_POP_SECTION = "subSection.downPanel.subSection.panelSection";
    public static final String SECTION_BIZ_CODE_TAB_GUIDE = "tabGuidePop";
    public static final String TEXT = "text";
    public static final String TYPE = "type";
    public static final String UNSELECTED_ASPECT_RATIO = "unSelectedAspectRatio";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends TypeReference<Map<String, String>> {
    }

    static {
        t2o.a(729809446);
    }

    public static boolean A(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a754a2c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return false;
        }
        return jSONObject2.getBooleanValue(KEY_EMBED_SEARCH_BAR);
    }

    public static boolean C(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0a7b8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return false;
        }
        return jSONObject2.getBooleanValue(KEY_IS_RECOMMEND_TAB);
    }

    public static int E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            fve.e("MultiTabDataParseUtils", "出现异常：" + e);
            return -1;
        }
    }

    public static String G(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a345ef3e", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static JSONObject H(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dac5631b", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_SMART_CONTENT);
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public static Map<String, String> I(Map<String, String> map, View view, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b9d906c", new Object[]{map, view, new Boolean(z), str});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        String str3 = map.get("text");
        String str4 = "args null";
        if (view instanceof LinearLayout) {
            if (TextUtils.isEmpty(str3)) {
                str3 = str4;
            }
            hashMap.put("type", str3);
        }
        if (view instanceof TUrlImageView) {
            if (TextUtils.isEmpty(str)) {
                hashMap.put("type", "tabImageUrl null");
            } else {
                if (str.endsWith("apng") || str.endsWith("gif")) {
                    str2 = GIF;
                } else {
                    str2 = IMG;
                }
                String str5 = map.get(str2);
                if (TextUtils.isEmpty(str5)) {
                    str5 = str4;
                }
                hashMap.put("type", str5);
            }
        }
        if (z) {
            String str6 = map.get("bubble");
            if (!TextUtils.isEmpty(str6)) {
                str4 = str6;
            }
            hashMap.put("bubble", str4);
        }
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f0c30fe", new Object[]{jSONObject, map});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        jSONObject3.putAll(map);
        jSONObject2.put("args", (Object) jSONObject3);
        jSONObject.put("clickParam", (Object) jSONObject2);
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33411c3", new Object[]{jSONObject, map});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            jSONObject3.putAll(map);
            jSONObject2.put("args", (Object) jSONObject3);
            jSONObject.put(i2b.TRACK_EXPOSURE_PARAM, (Object) jSONObject2);
        }
    }

    public static JSONObject c(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa610af8", new Object[]{jSONObject, str, str2});
        }
        JSONObject s = s(jSONObject);
        if (s == null || (jSONObject2 = s.getJSONObject("item")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return a(jSONObject3, hashMap);
    }

    public static JSONObject d(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("49e56fb7", new Object[]{jSONObject, str, str2});
        }
        JSONObject s = s(jSONObject);
        if (s == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        b(s, hashMap);
        return s;
    }

    public static boolean f(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75345744", new Object[]{list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i = 0;
        for (JSONObject jSONObject : list) {
            if (C(jSONObject)) {
                i++;
            }
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static String h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d63c25c", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        return jSONObject2.getString("containerType");
    }

    public static int i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc81856f", new Object[]{jSONObject})).intValue();
        }
        List<JSONObject> x = x(jSONObject);
        if (x != null && !x.isEmpty()) {
            for (int i = 0; i < x.size(); i++) {
                JSONObject jSONObject3 = x.get(i);
                if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("content")) == null || !jSONObject2.getBooleanValue(KEY_DEFAULT_SELECTED))) {
                    return i;
                }
            }
        }
        return -2;
    }

    public static JSONObject j(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9957bbd0", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public static JSONObject k() {
        AwesomeGetContainerData u;
        IContainerInnerDataModel<SectionModel> base;
        List<JSONObject> popData;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e29de9c", new Object[0]);
        }
        z4a z4aVar = z4a.NEW_FACE_PARENT;
        imn d = zza.d(z4aVar.f32522a);
        if (!(d == null || (u = d.u(z4aVar.f32522a)) == null || (base = u.getBase()) == null || (popData = base.getPopData()) == null || popData.isEmpty())) {
            Iterator<JSONObject> it = popData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jSONObject = null;
                    break;
                }
                jSONObject = it.next();
                if (TextUtils.equals(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), BUSINESS_ID_GUIDE_POP)) {
                    break;
                }
            }
            if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("sections")) == null || jSONArray.isEmpty())) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("sectionBizCode"), SECTION_BIZ_CODE_TAB_GUIDE)) {
                        return jSONObject2;
                    }
                }
                return jSONObject;
            }
        }
        return null;
    }

    public static JSONObject l(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a11dfba1", new Object[]{iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            return null;
        }
        return m(iContainerDataModel.getTotalData());
    }

    public static JSONObject m(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6c88d08b", new Object[]{list});
        }
        SectionModel sectionModel = null;
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (!(obj instanceof SectionModel)) {
                break;
            }
            SectionModel sectionModel2 = (SectionModel) obj;
            if (TextUtils.equals(sectionModel2.getSectionBizCode(), "categoryTab") && f(x(sectionModel2))) {
                sectionModel = sectionModel2;
            }
        }
        return sectionModel;
    }

    public static String n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc941121", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(KEY_SMART_CONTENT)) == null) {
            return null;
        }
        return jSONObject2.getString("ssrPageUrl");
    }

    public static JSONObject o(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a24e93", new Object[]{jSONObject});
        }
        JSONObject s = s(jSONObject);
        if (s == null || (jSONObject2 = s.getJSONObject("ext")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject(ARGS_TYPE_MAP);
    }

    public static String q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c81b648b", new Object[]{jSONObject});
        }
        JSONObject s = s(jSONObject);
        if (s == null) {
            return null;
        }
        JSONObject jSONObject2 = s.getJSONObject("ext");
        if (jSONObject2 != null) {
            return jSONObject2.getString("realtimeClickParam");
        }
        fve.e("MultiTabDataParseUtils", "getRealTimeClickParams ext == null");
        return null;
    }

    public static String r(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80e3db6a", new Object[]{jSONObject, str});
        }
        JSONObject s = s(jSONObject);
        if (s == null || (jSONObject2 = s.getJSONObject("item")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null || (jSONObject4 = jSONObject3.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject4.getString(str);
    }

    public static JSONObject s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("74dd1753", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(KEY_RIGHT_TOP_TAB_ICON);
    }

    public static String u(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1daae2d1", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        return jSONObject2.getString(KEY_TAB_ID);
    }

    public static String v(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dcf324c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            fve.e("MultiTabDataParseUtils", "getTabIdFromWV error：" + e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(KEY_TAB_ID);
    }

    public static String w(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c3553f0", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        String string = jSONObject2.getString("containerType");
        String string2 = jSONObject2.getString(KEY_TAB_ID);
        return string + "_" + string2;
    }

    public static String y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ad58027", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        String string = jSONObject2.getString("text");
        String string2 = jSONObject2.getString(KEY_TAB_ID);
        String string3 = jSONObject2.getString("content");
        return string + "_" + string2 + "_" + string3;
    }

    public static boolean z(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24a271c", new Object[]{list, list2})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && list2 != null && !list2.isEmpty()) {
            return true;
        }
        if (!(list == null || list2 == null)) {
            if (list.size() != list2.size()) {
                return true;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!TextUtils.equals(y(list.get(i)), y(list2.get(i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Map<String, String> p(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8fad772", new Object[]{jSONObject});
        }
        JSONObject s = s(jSONObject);
        if (s == null || (jSONObject2 = s.getJSONObject("item")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("passOnTrack");
        HashMap hashMap = new HashMap();
        try {
            return (Map) JSON.parseObject(jSONObject4.toJSONString(), new a(), new Feature[0]);
        } catch (Exception e) {
            d9j.d("MultiTabDataParseUtils", "getRightTopPassOnTrack error", e);
            return hashMap;
        }
    }

    public static Map<String, String> t(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6b81b8", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabs")) == null || (jSONObject4 = jSONObject3.getJSONObject("ext")) == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(jSONObject4.getJSONObject(ARGS_TYPE_MAP).toJSONString(), new b(), new Feature[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean B(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae41c61d", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return false;
        }
        String string = jSONObject2.getString("refreshSearchText");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    public static boolean D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73dc039", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        return (jSONObject2 == null || jSONObject2.getJSONObject(KEY_RIGHT_TOP_TAB_ICON) == null) ? false : true;
    }

    public static kkc F(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("ead25988", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null || jSONObject2 == null) {
            return null;
        }
        JSONObject H = H(jSONObject, "leftComponent");
        JSONObject H2 = H(jSONObject, "rightComponent");
        JSONObject jSONObject3 = jSONObject.getJSONObject("content");
        int E = E(G(jSONObject3, KEY_TOP_BAR_BG_COLOR));
        String G = G(jSONObject3, KEY_TOP_BAR_BG_IMG);
        boolean z = jSONObject3 != null && jSONObject3.getBooleanValue("isSearchBoxDataFromSelf");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
        return new wsg(H, H2, G, E, jSONObject4 != null && jSONObject4.getBooleanValue(KEY_IS_FESTIVAL), z);
    }

    public static void e(JSONObject jSONObject, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dcf39d", new Object[]{jSONObject, new Integer(i)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("spm");
            if (!TextUtils.isEmpty(string)) {
                Matcher matcher = Pattern.compile("(\\d+)$").matcher(string);
                if (matcher.find()) {
                    int length = string.length() - matcher.group(1).length();
                    str = string.substring(0, length) + i;
                } else {
                    str = string + i;
                }
                jSONObject2.put("spm", (Object) str);
            }
        }
    }

    public static boolean g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("900072e8", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return false;
        }
        return !TextUtils.isEmpty(jSONObject2.getString(KEY_TAB_ID)) && !TextUtils.isEmpty(jSONObject2.getString("containerType")) && !TextUtils.isEmpty(jSONObject2.getString("text"));
    }

    public static List<JSONObject> x(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b00eebd8", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabs")) == null || (jSONObject4 = jSONObject3.getJSONObject("item")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            JSONObject jSONObject5 = jSONObject4.getJSONObject(String.valueOf(i));
            if (jSONObject5 == null) {
                return arrayList;
            }
            if (g(jSONObject5)) {
                arrayList.add(jSONObject5);
            }
            i++;
        }
    }
}
