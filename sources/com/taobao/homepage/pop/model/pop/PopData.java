package com.taobao.homepage.pop.model.pop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.ucp.UCPConfig;
import java.io.Serializable;
import java.util.List;
import tb.j3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopData implements IPopData<PopSectionModel>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String POP_KEY_CLIENT_CACHE = "clientCache";
    private String businessID;
    private JSONObject ext;
    private JSONObject passParam;
    private PopConfig popConfig;
    private List<PopSectionModel> sections;
    private UCPConfig ucpConfig;
    private JSONObject uploadData;
    private JSONObject clientParams = new JSONObject(16);
    private boolean isResetData = false;
    private int showCount = 0;

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public String getBusinessID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.businessID;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getClientParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("851ff3ce", new Object[]{this});
        }
        return this.clientParams;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return this.ext;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getPassParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d42f40ed", new Object[]{this});
        }
        return this.passParam;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public IPopConfig getPopConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopConfig) ipChange.ipc$dispatch("4702e6dc", new Object[]{this});
        }
        return this.popConfig;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public List<PopSectionModel> getSections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2802a8bc", new Object[]{this});
        }
        return this.sections;
    }

    public int getShowCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7a5c3d6", new Object[]{this})).intValue();
        }
        return this.showCount;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public j3e getUCPConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j3e) ipChange.ipc$dispatch("121a118d", new Object[]{this});
        }
        return this.ucpConfig;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getUploadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a14c868", new Object[]{this});
        }
        return this.uploadData;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isAllowShow() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78f9e67", new Object[]{this})).booleanValue();
        }
        PopConfig popConfig = this.popConfig;
        if (popConfig == null || popConfig.getShowMaxCount() == 0) {
            i = 1;
        } else {
            i = this.popConfig.getShowMaxCount();
        }
        if (this.showCount < i) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isDeltaRefreshWhiteList(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447743af", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        PopConfig popConfig = this.popConfig;
        if (popConfig == null) {
            list = null;
        } else {
            list = popConfig.getDeltaWhiteList();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(str);
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isFirstShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabe76ce", new Object[]{this})).booleanValue();
        }
        if (this.showCount == 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isResetShowCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9260558", new Object[]{this})).booleanValue();
        }
        return this.isResetData;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public void recordShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da578875", new Object[]{this});
        } else {
            this.showCount++;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public void resetShowCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d677728a", new Object[]{this});
            return;
        }
        this.showCount = 0;
        PopSectionModel fetchPopSection = fetchPopSection();
        this.clientParams.clear();
        fetchPopSection.getExt().remove("clientCache");
        PopSectionModel popSectionModel = new PopSectionModel(fetchPopSection);
        this.sections.remove(0);
        this.sections.add(0, popSectionModel);
        this.isResetData = true;
    }

    public void setBusinessID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ae5ae", new Object[]{this, str});
        } else {
            this.businessID = str;
        }
    }

    public void setClientParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d4476", new Object[]{this, jSONObject});
        } else {
            this.clientParams = jSONObject;
        }
    }

    public void setExt(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef4a04a", new Object[]{this, jSONObject});
        } else {
            this.ext = jSONObject;
        }
    }

    public void setPassParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4396cf", new Object[]{this, jSONObject});
        } else {
            this.passParam = jSONObject;
        }
    }

    public void setPopConfig(PopConfig popConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7f5f26", new Object[]{this, popConfig});
        } else {
            this.popConfig = popConfig;
        }
    }

    public void setSections(List<PopSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf5e828", new Object[]{this, list});
        } else {
            this.sections = list;
        }
    }

    public void setShowCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d509938c", new Object[]{this, new Integer(i)});
        } else {
            this.showCount = i;
        }
    }

    public void setUcpConfig(UCPConfig uCPConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeacdad", new Object[]{this, uCPConfig});
        } else {
            this.ucpConfig = uCPConfig;
        }
    }

    public void setUploadData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8f901c", new Object[]{this, jSONObject});
        } else {
            this.uploadData = jSONObject;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean valid() {
        PopConfig popConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdc1b687", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.businessID) || (popConfig = this.popConfig) == null) {
            return false;
        }
        if (popConfig.getPopContentType() == 1 && fetchPopSection() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public PopSectionModel fetchPopSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSectionModel) ipChange.ipc$dispatch("c85c4eed", new Object[]{this});
        }
        List<PopSectionModel> list = this.sections;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.sections.get(0);
    }
}
