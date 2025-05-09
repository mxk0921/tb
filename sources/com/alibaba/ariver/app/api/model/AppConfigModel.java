package com.alibaba.ariver.app.api.model;

import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.gbs;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AppConfigModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = pg1.ATOM_EXT_window)
    private JSONObject appLaunchParams;
    @JSONField(name = "includeFiles")
    private List<String> includeFiles;
    @JSONField(name = RVConstants.EXTRA_RES_LAUNCH_PARAMS)
    private JSONObject pageLaunchParams;
    @JSONField
    private List<String> pages;
    @JSONField
    private String useDynamicPlugins;

    public static AppConfigModel manualParseJson(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("f6d6bbe2", new Object[]{bArr});
        }
        return manualParseJsonObject(gbs.i(bArr));
    }

    public static AppConfigModel parseFromJSON(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("bd939232", new Object[]{bArr});
        }
        AppConfigModel appConfigModel = (AppConfigModel) gbs.j(bArr, AppConfigModel.class);
        if (appConfigModel != null) {
            return appConfigModel;
        }
        return manualParseJson(bArr);
    }

    public static AppConfigModel parseFromJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("2d4e31c4", new Object[]{jSONObject});
        }
        return manualParseJsonObject(jSONObject);
    }

    public JSONObject getAppLaunchParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dfe2ff4b", new Object[]{this});
        }
        return this.appLaunchParams;
    }

    public List<String> getIncludeFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("93c8799b", new Object[]{this});
        }
        return this.includeFiles;
    }

    public JSONObject getPageLaunchParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18184365", new Object[]{this});
        }
        return this.pageLaunchParams;
    }

    public List<String> getPages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("51843212", new Object[]{this});
        }
        return this.pages;
    }

    public String getUseDynamicPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee741327", new Object[]{this});
        }
        return this.useDynamicPlugins;
    }

    public void setAppLaunchParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b886b31", new Object[]{this, jSONObject});
        } else {
            this.appLaunchParams = jSONObject;
        }
    }

    public void setIncludeFiles(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9229cd29", new Object[]{this, list});
        } else {
            this.includeFiles = list;
        }
    }

    public void setPageLaunchParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58938dbf", new Object[]{this, jSONObject});
        } else {
            this.pageLaunchParams = jSONObject;
        }
    }

    public void setPages(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3887efa", new Object[]{this, list});
        } else {
            this.pages = list;
        }
    }

    public void setUseDynamicPlugins(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8d5997", new Object[]{this, str});
        } else {
            this.useDynamicPlugins = str;
        }
    }

    public static AppConfigModel manualParseJsonObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("b5cc5614", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AppConfigModel appConfigModel = new AppConfigModel();
        appConfigModel.appLaunchParams = gbs.c(jSONObject, pg1.ATOM_EXT_window, new JSONObject());
        appConfigModel.pageLaunchParams = gbs.c(jSONObject, RVConstants.EXTRA_RES_LAUNCH_PARAMS, new JSONObject());
        appConfigModel.useDynamicPlugins = gbs.d(jSONObject, RVStartParams.KEY_USE_DYNAMIC_PLUGIN);
        JSONArray b = gbs.b(jSONObject, "pages", null);
        if (b != null) {
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(b.getString(i));
            }
            appConfigModel.pages = arrayList;
        }
        return appConfigModel;
    }
}
