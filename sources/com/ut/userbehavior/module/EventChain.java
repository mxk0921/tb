package com.ut.userbehavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.bmv;
import tb.mqv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class EventChain implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bt")
    private int beginTime;
    @JSONField(name = bmv.MSGTYPE_INTERVAL)
    private Map<String, String> info;
    @JSONField(name = at.k)
    private String key;
    @JSONField(name = "n")
    private String name;
    @JSONField(name = "t")
    private String type;

    static {
        t2o.a(964689930);
    }

    public EventChain(String str, String str2, String str3, Map<String, String> map) {
        this.beginTime = 0;
        this.type = "";
        this.info = null;
        this.key = str;
        this.name = str2;
        this.beginTime = mqv.n().m();
        this.type = str3;
        this.info = new HashMap();
        if (map != null && !map.isEmpty()) {
            this.info.putAll(map);
        }
    }

    public int getBeginTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c1f88da", new Object[]{this})).intValue();
        }
        return this.beginTime;
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

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }
}
