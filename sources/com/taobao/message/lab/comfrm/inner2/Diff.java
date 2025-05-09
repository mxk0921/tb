package com.taobao.message.lab.comfrm.inner2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.observable.RuntimeIncUpdateMap;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Diff implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, DeltaItem> jsRuntimeDiff;
    public final Map<String, DeltaItem> originalDiff;
    public final Map<String, DeltaItem> runtimeDiff;

    static {
        t2o.a(537919594);
    }

    public Diff() {
        this.originalDiff = new HashMap(0);
        this.runtimeDiff = new HashMap(0);
        this.jsRuntimeDiff = new HashMap(0);
    }

    public Diff autoRuntimeDiff(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("204cec1b", new Object[]{this, map});
        }
        Diff copy = copy();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof RuntimeIncUpdateMap) {
                Set<String> resetChangeKeySet = ((RuntimeIncUpdateMap) entry.getValue()).resetChangeKeySet();
                if (!resetChangeKeySet.isEmpty()) {
                    copy.runtimeDiff.put(entry.getKey(), new DeltaItem(2, resetChangeKeySet));
                }
            } else {
                copy.runtimeDiff.put(entry.getKey(), new DeltaItem(0, null));
            }
        }
        return copy;
    }

    public Diff copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("98243807", new Object[]{this});
        }
        return new Diff(this);
    }

    public int getJsRuntimeDiffSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2f1c559", new Object[]{this})).intValue();
        }
        return this.jsRuntimeDiff.size();
    }

    public DeltaItem getOriginalDiff(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeltaItem) ipChange.ipc$dispatch("8da067fe", new Object[]{this, str}) : this.originalDiff.get(str);
    }

    public int getOriginalDiffSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8398007", new Object[]{this})).intValue();
        }
        return this.originalDiff.size();
    }

    public DeltaItem getRuntimeDiff(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeltaItem) ipChange.ipc$dispatch("52033203", new Object[]{this, str}) : this.runtimeDiff.get(str);
    }

    public int getRuntimeDiffSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fb913e2", new Object[]{this})).intValue();
        }
        return this.runtimeDiff.size();
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (!this.originalDiff.isEmpty() || !this.runtimeDiff.isEmpty() || !this.jsRuntimeDiff.isEmpty()) {
            return false;
        }
        return true;
    }

    public Diff merge(Diff diff, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("db9e5419", new Object[]{this, diff, str, new Boolean(z)});
        }
        Diff copy = copy();
        for (Map.Entry<String, DeltaItem> entry : diff.originalDiff.entrySet()) {
            mergeDeltaItem(copy.originalDiff, entry.getKey(), entry.getValue(), str, z);
        }
        for (Map.Entry<String, DeltaItem> entry2 : diff.runtimeDiff.entrySet()) {
            mergeDeltaItem(copy.runtimeDiff, entry2.getKey(), entry2.getValue(), str, z);
        }
        for (Map.Entry<String, DeltaItem> entry3 : diff.jsRuntimeDiff.entrySet()) {
            mergeDeltaItem(copy.jsRuntimeDiff, entry3.getKey(), entry3.getValue(), str, z);
        }
        return copy;
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalDiff", (Object) this.originalDiff);
        jSONObject.put("runtimeDiff", (Object) this.runtimeDiff);
        jSONObject.put("jsRuntimeDiff", (Object) this.jsRuntimeDiff);
        return jSONObject;
    }

    public Diff updateOriginalDiff(Map<String, DeltaItem> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("64770faa", new Object[]{this, map});
        }
        Diff copy = copy();
        copy.originalDiff.putAll(map);
        return copy;
    }

    public Diff updateRuntimeDiff(Map<String, DeltaItem> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("de71bd35", new Object[]{this, map});
        }
        Diff copy = copy();
        copy.runtimeDiff.putAll(map);
        return copy;
    }

    public DeltaItem getOriginalDiff(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeltaItem) ipChange.ipc$dispatch("6b218634", new Object[]{this, str, str2}) : this.originalDiff.get(SharedState.getKey(str, str2));
    }

    public DeltaItem getRuntimeDiff(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeltaItem) ipChange.ipc$dispatch("1079b8f9", new Object[]{this, str, str2}) : this.runtimeDiff.get(SharedState.getKey(str, str2));
    }

    public Diff updateRuntimeDiff(String str, Map<String, DeltaItem> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("22cc036b", new Object[]{this, str, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, DeltaItem> entry : map.entrySet()) {
            hashMap.put(SharedState.getKey(str, entry.getKey()), entry.getValue());
        }
        Diff copy = copy();
        copy.runtimeDiff.putAll(hashMap);
        return copy;
    }

    public static void mergeDeltaItem(Map<String, DeltaItem> map, String str, DeltaItem deltaItem, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a4090", new Object[]{map, str, deltaItem, str2, new Boolean(z)});
            return;
        }
        DeltaItem deltaItem2 = map.get(str);
        if (deltaItem2 == null) {
            map.put(str, deltaItem);
        } else if (deltaItem.getDataType() != deltaItem2.getDataType()) {
            if (ApplicationUtil.isDebug() && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "diffErrorThrow", "1"))) {
                throw new IllegalArgumentException("mergeDeltaItem|key|" + str + "|oldDataType|" + JSON.toJSONString(deltaItem2) + "|newDataType|" + JSON.toJSONString(deltaItem));
            } else if (deltaItem.getDataType() != 0) {
                if (deltaItem2.getDataType() == 0) {
                    map.put(str, deltaItem);
                } else if ("1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "diffErrorThrow", "1"))) {
                    throw new IllegalArgumentException("mergeDeltaItem|key|" + str + "|oldDataType|" + JSON.toJSONString(deltaItem2) + "|newDataType|" + JSON.toJSONString(deltaItem));
                }
            }
        } else if (deltaItem.getDataType() == 0) {
            map.put(str, deltaItem);
        } else {
            if (1 == deltaItem.getDataType()) {
                str3 = "deltaItemMerger.message.common.list";
            } else if (2 == deltaItem.getDataType()) {
                str3 = "deltaItemMerger.message.common.map";
            } else if (101 == deltaItem.getDataType()) {
                str3 = "deltaItemMerger.message.custom.resource";
            } else if (102 == deltaItem.getDataType()) {
                str3 = "deltaItemMerger.message.custom.input";
            } else {
                throw new IllegalArgumentException("mergeDeltaItem|NOTFOUND|" + deltaItem.getDataType());
            }
            map.put(str, ((DeltaItemMerger) ClassPool.instance().getInstance(str3, DeltaItemMerger.class, str2, z)).merge(deltaItem2, deltaItem));
        }
    }

    public Diff(Diff diff) {
        this.originalDiff = new HashMap(diff.originalDiff);
        this.runtimeDiff = new HashMap(diff.runtimeDiff);
        this.jsRuntimeDiff = new HashMap(diff.jsRuntimeDiff);
    }
}
