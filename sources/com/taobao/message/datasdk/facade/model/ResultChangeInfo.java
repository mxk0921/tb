package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ResultChangeInfo<DATA, INDEX> implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ResultData<DATA>> allDatas;
    private Map<String, Object> context;
    private boolean newHasMore;
    private boolean oldHasMore;
    private List<Reason> reasons;
    private List<ResultChange<DATA, INDEX>> resultChanges;

    static {
        t2o.a(529530920);
    }

    public ResultChangeInfo(List<ResultData<DATA>> list, List<ResultChange<DATA, INDEX>> list2, List<Reason> list3, Map<String, Object> map, boolean z, boolean z2) {
        if (list != null) {
            this.allDatas = Collections.unmodifiableList(list);
        }
        if (list2 != null) {
            this.resultChanges = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.reasons = Collections.unmodifiableList(list3);
        }
        if (map != null) {
            this.context = Collections.unmodifiableMap(map);
        }
        this.newHasMore = z2;
        this.oldHasMore = z;
    }

    public List<ResultData<DATA>> getAllDatas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3df40fc2", new Object[]{this});
        }
        return this.allDatas;
    }

    public Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this});
        }
        return this.context;
    }

    public List<Reason> getReasons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("936eefc7", new Object[]{this});
        }
        return this.reasons;
    }

    public List<ResultChange<DATA, INDEX>> getResultChanges() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("752e7cb0", new Object[]{this});
        }
        return this.resultChanges;
    }

    public boolean isNewHasMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62dd0c24", new Object[]{this})).booleanValue();
        }
        return this.newHasMore;
    }

    public boolean isOldHasMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3820bd3d", new Object[]{this})).booleanValue();
        }
        return this.oldHasMore;
    }

    public String toString() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("ResultChangeInfo{allDatas size =");
        List<ResultData<DATA>> list = this.allDatas;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        sb.append(", resultChanges size =");
        List<ResultChange<DATA, INDEX>> list2 = this.resultChanges;
        if (list2 != null) {
            i2 = list2.size();
        }
        sb.append(i2);
        sb.append(", oldHasMore=");
        sb.append(this.oldHasMore);
        sb.append(", newHasMore=");
        sb.append(this.newHasMore);
        sb.append(", context=");
        sb.append(this.context);
        sb.append('}');
        return sb.toString();
    }
}
