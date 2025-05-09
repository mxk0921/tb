package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ResultChange<DATA, INDEX> implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ExtData> diffMap;
    private INDEX index;
    private INDEX lastIndex;
    private ResultData<DATA> resultData;
    private int type;

    static {
        t2o.a(529530919);
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
    }

    private int getSubDataSize(ResultChange resultChange) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63c23070", new Object[]{this, resultChange})).intValue();
        }
        if (resultChange.resultData.getSubData() == null) {
            return 0;
        }
        return resultChange.resultData.getSubData().size();
    }

    public boolean equals(ResultChange resultChange) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f78f7cb", new Object[]{this, resultChange})).booleanValue();
        }
        if (this == resultChange) {
            return true;
        }
        if (resultChange != null && getSubDataSize(this) == getSubDataSize(resultChange) && this.type == resultChange.getType() && resultChange.resultData.getMainData().equals(this.resultData.getMainData()) && this.index == resultChange.index) {
            return true;
        }
        return false;
    }

    public Map<String, ExtData> getDiffMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35772b1d", new Object[]{this});
        }
        return this.diffMap;
    }

    public INDEX getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INDEX) ipChange.ipc$dispatch("77774bef", new Object[]{this});
        }
        return this.index;
    }

    public INDEX getLastIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INDEX) ipChange.ipc$dispatch("b499e025", new Object[]{this});
        }
        return this.lastIndex;
    }

    public ResultData<DATA> getResultData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultData) ipChange.ipc$dispatch("78bbdaf9", new Object[]{this});
        }
        return this.resultData;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.resultData.getMainData().hashCode() + this.index.hashCode() + this.type;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResultChange{type=" + this.type + ", index=" + this.index + ", resultData=" + this.resultData + '}';
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index, Map<String, ExtData> map) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
        if (map != null) {
            this.diffMap = Collections.unmodifiableMap(map);
        }
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index, INDEX index2, Map<String, ExtData> map) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
        this.lastIndex = index2;
        if (map != null) {
            this.diffMap = Collections.unmodifiableMap(map);
        }
    }
}
