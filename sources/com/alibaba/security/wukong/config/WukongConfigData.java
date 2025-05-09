package com.alibaba.security.wukong.config;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongConfigData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ccrcCode;
    public String env;
    public String event;
    public List<String> eventCodes;
    public String featureSet;
    public long lastModifyTime;
    public int riskInfoVersion;
    public List<RiskSceneInfo> sceneList;
    public VersionInfo versionInfo;

    @JSONField(serialize = false)
    private List<Algo> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<RiskSceneInfo> list = this.sceneList;
        if (list != null) {
            for (RiskSceneInfo riskSceneInfo : list) {
                arrayList.addAll(riskSceneInfo.algoList);
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getAlgoConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e9178f1", new Object[]{this, str});
        }
        for (Algo algo : a()) {
            if (TextUtils.equals(algo.code, str)) {
                return algo.config;
            }
        }
        return null;
    }

    @JSONField(serialize = false)
    public List<Algo> getPythonList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7a6c550", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isPython()) {
                arrayList.add(algo);
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public boolean isAlgoListIsEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83d5973", new Object[]{this})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isPython() || algo.isCpp()) {
                arrayList.add(algo);
            }
        }
        return arrayList.isEmpty();
    }

    @JSONField(serialize = false)
    public boolean isHaveCppAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9c570f", new Object[]{this})).booleanValue();
        }
        List<RiskSceneInfo> list = this.sceneList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isCpp()) {
                arrayList.add(algo);
            }
        }
        return arrayList.isEmpty();
    }

    @JSONField(serialize = false)
    public boolean isValid(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(this.ccrcCode) || !this.ccrcCode.equals(str) || (list = this.eventCodes) == null || list.isEmpty() || this.sceneList == null || TextUtils.isEmpty(this.featureSet)) {
            return false;
        }
        return true;
    }
}
