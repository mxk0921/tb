package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ResultData<DATA> implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DATA mainData;
    private Map<String, Object> subData;

    static {
        t2o.a(529530921);
    }

    public ResultData(DATA data, Map<String, Object> map) {
        this.mainData = data;
        this.subData = Collections.unmodifiableMap(map);
    }

    public DATA getMainData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ipChange.ipc$dispatch("4874a4b2", new Object[]{this});
        }
        return this.mainData;
    }

    public Map<String, Object> getSubData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddcf8f50", new Object[]{this});
        }
        return this.subData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.subData.keySet()) {
            sb.append(str);
            sb.append("|");
            sb.append(this.subData.get(str));
        }
        return "ResultData{mainData=" + this.mainData + ", subData=" + sb.toString() + '}';
    }
}
