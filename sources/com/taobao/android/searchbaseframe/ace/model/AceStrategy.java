package com.taobao.android.searchbaseframe.ace.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AceStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int id;
    private String name;
    private Map<String, String> params;
    private Map<String, AceSubStrategy> strategyMap = new HashMap();

    static {
        t2o.a(993001588);
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.id;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.params;
    }

    public Map<String, AceSubStrategy> getStrategyMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("139d6f6f", new Object[]{this});
        }
        return this.strategyMap;
    }

    public AceSubStrategy getSubStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AceSubStrategy) ipChange.ipc$dispatch("f87e578f", new Object[]{this, str});
        }
        return this.strategyMap.get(str);
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.id = i;
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

    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.params = map;
        }
    }

    public void setStrategyMap(Map<String, AceSubStrategy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3deef597", new Object[]{this, map});
        } else {
            this.strategyMap = map;
        }
    }
}
