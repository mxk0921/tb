package com.ut.userbehavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.bmv;
import tb.l5v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Component implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bc")
    private ArrayList<BehaviorRecord> behaviorChain;
    @JSONField(name = bmv.MSGTYPE_INTERVAL)
    private Map<String, String> info;
    @JSONField(name = at.k)
    private String key;
    @JSONField(serialize = false)
    private String lastStatus;
    @JSONField(name = "n")
    private String name;

    static {
        t2o.a(964689929);
    }

    public Component(String str, String str2) {
        this.info = null;
        this.behaviorChain = null;
        this.lastStatus = "u";
        this.key = str;
        this.name = str2;
        this.info = new HashMap();
        this.behaviorChain = new ArrayList<>();
        this.lastStatus = "u";
    }

    public void addBehaviorChain(BehaviorRecord behaviorRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b113be56", new Object[]{this, behaviorRecord});
        } else if (behaviorRecord != null) {
            this.behaviorChain.add(behaviorRecord);
            this.lastStatus = behaviorRecord.getType();
        }
    }

    public ArrayList<BehaviorRecord> getBehaviorChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e66b7ba", new Object[]{this});
        }
        return this.behaviorChain;
    }

    public Map<String, String> getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a42eaa0", new Object[]{this});
        }
        return this.info;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public String getLastStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b28f9b", new Object[]{this});
        }
        return this.lastStatus;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public void setInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0bf5ee", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.info.putAll(map);
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else if (l5v.c(str)) {
            this.name = str;
        }
    }
}
