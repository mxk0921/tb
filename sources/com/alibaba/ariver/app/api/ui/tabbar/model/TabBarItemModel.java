package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider;
import com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeModelTemplate;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TabBarItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ColorSchemeDecider colorSchemeDecider;
    private ColorSchemeModelTemplate<TabBarItemColorModel> colorSchemes;
    @JSONField
    private String launchParamsTag;
    @JSONField
    private String name;
    @JSONField
    private Integer selectedColor;
    @JSONField
    private String tag;
    @JSONField
    private Integer textColor;
    @JSONField
    private String url;

    public TabBarItemModel() {
        ColorSchemeModelTemplate<TabBarItemColorModel> colorSchemeModelTemplate = new ColorSchemeModelTemplate<>();
        this.colorSchemes = colorSchemeModelTemplate;
        colorSchemeModelTemplate.setDefault(new TabBarItemColorModel());
    }

    private static ColorSchemeModelTemplate<TabBarItemColorModel> generateTabBarItemColorScheme(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorSchemeModelTemplate) ipChange.ipc$dispatch("30b8981c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ColorSchemeModelTemplate<TabBarItemColorModel> colorSchemeModelTemplate = new ColorSchemeModelTemplate<>();
        TabBarItemColorModel tabBarItemColorModel = getTabBarItemColorModel(jSONObject, null);
        colorSchemeModelTemplate.setDefault(tabBarItemColorModel);
        JSONObject jSONObject2 = jSONObject.getJSONObject(ThemeUtils.KEY_COLOR_SCHEME);
        if (jSONObject2 != null) {
            colorSchemeModelTemplate.setLight(getTabBarItemColorModel(jSONObject2.getJSONObject("light"), tabBarItemColorModel));
            colorSchemeModelTemplate.setDark(getTabBarItemColorModel(jSONObject2.getJSONObject(ThemeUtils.COLOR_SCHEME_DARK), tabBarItemColorModel));
        }
        return colorSchemeModelTemplate;
    }

    private static TabBarItemColorModel getTabBarItemColorModel(JSONObject jSONObject, TabBarItemColorModel tabBarItemColorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItemColorModel) ipChange.ipc$dispatch("5b5d8f64", new Object[]{jSONObject, tabBarItemColorModel});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        TabBarItemColorModel tabBarItemColorModel2 = new TabBarItemColorModel();
        if (jSONObject.containsKey("icon")) {
            tabBarItemColorModel2.setIcon(JSONUtils.getString(jSONObject, "icon"));
        } else if (tabBarItemColorModel != null) {
            tabBarItemColorModel2.setIcon(tabBarItemColorModel.getIcon());
        }
        if (jSONObject.containsKey("activeIcon")) {
            tabBarItemColorModel2.setActiveIcon(JSONUtils.getString(jSONObject, "activeIcon"));
        } else if (tabBarItemColorModel != null) {
            tabBarItemColorModel2.setActiveIcon(tabBarItemColorModel.getActiveIcon());
        }
        return tabBarItemColorModel2;
    }

    public static TabBarItemModel inflateFromResource(JSONObject jSONObject, ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItemModel) ipChange.ipc$dispatch("dbf993db", new Object[]{jSONObject, colorSchemeDecider});
        }
        TabBarItemModel tabBarItemModel = new TabBarItemModel();
        tabBarItemModel.colorSchemes = generateTabBarItemColorScheme(jSONObject);
        tabBarItemModel.setSelectedColor(TypeUtils.parseColorInt(jSONObject.get("selectedColor")));
        tabBarItemModel.setTextColor(TypeUtils.parseColorInt(jSONObject.get("textColor")));
        tabBarItemModel.setName(JSONUtils.getString(jSONObject, "name"));
        if (jSONObject.containsKey("pagePath")) {
            String string = JSONUtils.getString(jSONObject, "pagePath");
            tabBarItemModel.setTag(string);
            tabBarItemModel.setUrl("index.html#" + string);
            tabBarItemModel.setLaunchParamsTag(string);
        } else {
            tabBarItemModel.setTag(JSONUtils.getString(jSONObject, "tag"));
            tabBarItemModel.setUrl(JSONUtils.getString(jSONObject, "url"));
            tabBarItemModel.setLaunchParamsTag(JSONUtils.getString(jSONObject, RVStartParams.KEY_LAUNCH_PARAMS_TAG));
        }
        tabBarItemModel.setColorSchemeDecider(colorSchemeDecider);
        return tabBarItemModel;
    }

    public static TabBarItemModel inflateFromTemplate(JSONObject jSONObject, ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItemModel) ipChange.ipc$dispatch("3b1f67ef", new Object[]{jSONObject, colorSchemeDecider});
        }
        TabBarItemModel tabBarItemModel = new TabBarItemModel();
        tabBarItemModel.colorSchemes = generateTabBarItemColorScheme(jSONObject);
        tabBarItemModel.setName(JSONUtils.getString(jSONObject, "name"));
        String string = JSONUtils.getString(jSONObject, "pagePath");
        tabBarItemModel.setUrl("index.html#" + string);
        tabBarItemModel.setTag(string);
        tabBarItemModel.setLaunchParamsTag(string);
        tabBarItemModel.setColorSchemeDecider(colorSchemeDecider);
        return tabBarItemModel;
    }

    private void setColorSchemeDecider(ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18146153", new Object[]{this, colorSchemeDecider});
            return;
        }
        this.colorSchemeDecider = colorSchemeDecider;
        this.colorSchemes.setColorSchemeDecider(colorSchemeDecider);
    }

    public String getActiveIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515984", new Object[]{this});
        }
        return this.colorSchemes.getTarget().getActiveIcon();
    }

    public String getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return this.colorSchemes.getTarget().getIcon();
    }

    public String getLaunchParamsTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7508044e", new Object[]{this});
        }
        return this.launchParamsTag;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public Integer getSelectedColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6a111840", new Object[]{this});
        }
        return this.selectedColor;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.tag;
    }

    public Integer getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.textColor;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void setActiveIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c35e72", new Object[]{this, str});
        } else {
            this.colorSchemes.getTarget().setActiveIcon(str);
        }
    }

    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.colorSchemes.getTarget().setIcon(str);
        }
    }

    public void setLaunchParamsTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6205a50", new Object[]{this, str});
        } else {
            this.launchParamsTag = str;
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setSelectedColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa86db8a", new Object[]{this, num});
        } else {
            this.selectedColor = num;
        }
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public void setTextColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ec901c", new Object[]{this, num});
        } else {
            this.textColor = num;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Item{name='" + this.name + "', url='" + this.url + "', textColor='" + this.textColor + "', selectedColor='" + this.selectedColor + "', launchParamsTag='" + this.launchParamsTag + "'}";
    }

    public TabBarItemModel(TabBarItemModel tabBarItemModel) {
        this.colorSchemes = tabBarItemModel.colorSchemes;
        this.name = tabBarItemModel.name;
        this.tag = tabBarItemModel.tag;
        this.url = tabBarItemModel.url;
        this.launchParamsTag = tabBarItemModel.launchParamsTag;
        this.textColor = tabBarItemModel.textColor;
        this.selectedColor = tabBarItemModel.selectedColor;
        this.colorSchemeDecider = tabBarItemModel.colorSchemeDecider;
    }
}
