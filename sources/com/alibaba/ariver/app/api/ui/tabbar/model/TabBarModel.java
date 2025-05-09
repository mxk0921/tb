package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider;
import com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeModelTemplate;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TabBarModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ColorSchemeModelTemplate<TabBarColorModel> colorSchemes;
    @JSONField
    private boolean disableOnInit;
    private List<TabBarItemModel> items;

    public TabBarModel() {
        ColorSchemeModelTemplate<TabBarColorModel> colorSchemeModelTemplate = new ColorSchemeModelTemplate<>();
        this.colorSchemes = colorSchemeModelTemplate;
        colorSchemeModelTemplate.setDefault(new TabBarColorModel());
    }

    private static TabBarColorModel generateTabBarColorModel(JSONObject jSONObject, TabBarColorModel tabBarColorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarColorModel) ipChange.ipc$dispatch("1df44376", new Object[]{jSONObject, tabBarColorModel});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        TabBarColorModel tabBarColorModel2 = new TabBarColorModel();
        Integer parseColorInt = TypeUtils.parseColorInt(jSONObject.get("textColor"));
        if (parseColorInt != null) {
            tabBarColorModel2.setTextColor(parseColorInt);
        } else if (tabBarColorModel != null) {
            tabBarColorModel2.setTextColor(tabBarColorModel.getTextColor());
        }
        Long parseColorLong = TypeUtils.parseColorLong(jSONObject.get("backgroundColor"));
        if (parseColorLong != null) {
            if (parseColorLong.longValue() <= 16777215) {
                parseColorLong = Long.valueOf(parseColorLong.longValue() | (-16777216));
            }
            tabBarColorModel2.setBackgroundColor(parseColorLong.longValue());
        }
        Integer parseColorInt2 = TypeUtils.parseColorInt(jSONObject.get("selectedColor"));
        if (parseColorInt2 != null) {
            tabBarColorModel2.setSelectedColor(parseColorInt2);
        }
        return tabBarColorModel2;
    }

    public static TabBarModel inflateFromResource(Resource resource, ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarModel) ipChange.ipc$dispatch("95406b1c", new Object[]{resource, colorSchemeDecider});
        }
        JSONObject parseObject = JSONUtils.parseObject(resource.getBytes());
        if (parseObject == null) {
            return null;
        }
        TabBarModel tabBarModel = new TabBarModel();
        tabBarModel.setColorSchemeDecider(colorSchemeDecider);
        initColorModels(tabBarModel, parseObject);
        tabBarModel.setDisableOnInit(JSONUtils.getBoolean(parseObject, "disableOnInit", false));
        JSONArray jSONArray = JSONUtils.getJSONArray(parseObject, "items", null);
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(TabBarItemModel.inflateFromResource(jSONArray.getJSONObject(i), colorSchemeDecider));
            }
            tabBarModel.setItems(arrayList);
        }
        return tabBarModel;
    }

    public static TabBarModel inflateFromTemplate(JSONObject jSONObject, ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarModel) ipChange.ipc$dispatch("b1d6cffc", new Object[]{jSONObject, colorSchemeDecider});
        }
        TabBarModel tabBarModel = new TabBarModel();
        JSONArray jSONArray = JSONUtils.getJSONArray(jSONObject, "items", null);
        if (jSONArray == null) {
            return null;
        }
        tabBarModel.setColorSchemeDecider(colorSchemeDecider);
        initColorModels(tabBarModel, jSONObject);
        try {
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(i, TabBarItemModel.inflateFromTemplate(jSONArray.getJSONObject(i), colorSchemeDecider));
            }
            tabBarModel.items = arrayList;
            return tabBarModel;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void initColorModels(TabBarModel tabBarModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b989786", new Object[]{tabBarModel, jSONObject});
            return;
        }
        TabBarColorModel generateTabBarColorModel = generateTabBarColorModel(jSONObject, null);
        tabBarModel.colorSchemes.setDefault(generateTabBarColorModel);
        JSONObject jSONObject2 = jSONObject.getJSONObject(ThemeUtils.KEY_COLOR_SCHEME);
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                if ("light".equalsIgnoreCase(str)) {
                    tabBarModel.colorSchemes.setLight(generateTabBarColorModel(jSONObject3, generateTabBarColorModel));
                } else if (ThemeUtils.COLOR_SCHEME_DARK.equalsIgnoreCase(str)) {
                    tabBarModel.colorSchemes.setDark(generateTabBarColorModel(jSONObject3, generateTabBarColorModel));
                }
            }
        }
    }

    public long getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe59a", new Object[]{this})).longValue();
        }
        return this.colorSchemes.getTarget().getBackgroundColor();
    }

    public List<TabBarItemModel> getItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return this.items;
    }

    public Integer getSelectedColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6a111840", new Object[]{this});
        }
        return this.colorSchemes.getTarget().getSelectedColor();
    }

    public Integer getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.colorSchemes.getTarget().getTextColor();
    }

    public boolean isDisableOnInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4266d98", new Object[]{this})).booleanValue();
        }
        return this.disableOnInit;
    }

    public void setBackgroundColor(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0474ea", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 16777215) {
            j |= -16777216;
        }
        this.colorSchemes.getTarget().setBackgroundColor(j);
    }

    public void setColorSchemeDecider(ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18146153", new Object[]{this, colorSchemeDecider});
        } else {
            this.colorSchemes.setColorSchemeDecider(colorSchemeDecider);
        }
    }

    public void setDisableOnInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588148f8", new Object[]{this, new Boolean(z)});
        } else {
            this.disableOnInit = z;
        }
    }

    public void setItems(List<TabBarItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public void setSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79ae2d6", new Object[]{this, new Integer(i)});
        } else {
            this.colorSchemes.getTarget().setSelectedColor(Integer.valueOf(i));
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.colorSchemes.getTarget().setTextColor(Integer.valueOf(i));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabBarModel{, items=" + this.items + ", colorSchemes=" + this.colorSchemes + ", disableOnInit=" + this.disableOnInit + ", textColor=" + getTextColor() + ", selectedColor=" + getSelectedColor() + '}';
    }
}
