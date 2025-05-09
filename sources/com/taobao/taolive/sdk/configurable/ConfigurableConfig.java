package com.taobao.taolive.sdk.configurable;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ConfigurableConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ITaoLiveComponent> componentMap = new HashMap();
    private Map<String, ITaoLiveComponentConfig> configMap;

    static {
        t2o.a(806356047);
    }

    public Map<String, ITaoLiveComponent> getComponentMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this});
        }
        return this.componentMap;
    }

    public Map<String, ITaoLiveComponentConfig> getConfigMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
        }
        return this.configMap;
    }

    public void setComponentMap(Map<String, ITaoLiveComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642889dd", new Object[]{this, map});
        } else {
            this.componentMap = map;
        }
    }

    public void setConfigMap(Map<String, ITaoLiveComponentConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e4d8a6", new Object[]{this, map});
        } else {
            this.configMap = map;
        }
    }

    public String toString() {
        ITaoLiveComponentConfig value;
        List<ITaoLiveComponentConfig> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        for (Map.Entry<String, ITaoLiveComponentConfig> entry : this.configMap.entrySet()) {
            if (!(entry == null || (value = entry.getValue()) == null || (list = value.cList) == null || list.isEmpty())) {
                for (ITaoLiveComponentConfig iTaoLiveComponentConfig : value.cList) {
                    iTaoLiveComponentConfig.toString();
                }
            }
        }
        return super.toString() + "{configMap = " + this.configMap + '}';
    }
}
