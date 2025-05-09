package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792526);
    }

    public static void a(JSONObject jSONObject, List<IconBean> list, List<IconBean> list2, List<IconBean> list3, List<IconBean> list4, Map<String, SearchDomBean> map) {
        JSONArray optJSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72d468", new Object[]{jSONObject, list, list2, list3, list4, map});
        } else if (jSONObject != null && map != null && (optJSONArray = jSONObject.optJSONArray(m09.ICON_RENDER)) != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    IconBean iconBean = new IconBean();
                    iconBean.alias = optJSONObject.optString("alias");
                    iconBean.type = optJSONObject.optString("type");
                    iconBean.domClass = optJSONObject.optString("domClass");
                    iconBean.text = optJSONObject.optString("text");
                    iconBean.prefix = optJSONObject.optString("prefix");
                    iconBean.group = optJSONObject.optString("group");
                    iconBean.showType = optJSONObject.optInt("showType", 0);
                    SearchDomBean searchDomBean = map.get(iconBean.domClass);
                    iconBean.searchDomBean = searchDomBean;
                    if (searchDomBean != null) {
                        iconBean.darkDomBean = map.get(q1p.DARK_MODE_DOM_PREFIX + iconBean.domClass);
                        if ("1".equals(iconBean.group) && list != null) {
                            list.add(iconBean);
                        } else if ("2".equals(iconBean.group)) {
                            int i2 = iconBean.showType;
                            if (i2 == 1) {
                                if (list3 != null) {
                                    list3.add(iconBean);
                                }
                            } else if (i2 == 2) {
                                if (list2 != null) {
                                    list2.add(iconBean);
                                }
                            } else if (i2 == 0) {
                                if (list3 != null) {
                                    list3.add(iconBean);
                                }
                                if (list2 != null) {
                                    list2.add(iconBean);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
