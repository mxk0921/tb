package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAInputData<DATA extends Serializable> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DATA mData;
    private final AURAFlowData mFlowData;
    private final AURAGlobalData mGlobalData;

    static {
        t2o.a(79691800);
    }

    public AURAInputData(DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        this.mData = data;
        this.mFlowData = aURAFlowData;
        this.mGlobalData = aURAGlobalData;
    }

    public DATA getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ((Serializable) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}));
        }
        return this.mData;
    }

    public AURAFlowData getFlowData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("7ff539a0", new Object[]{this});
        }
        return this.mFlowData;
    }

    public AURAGlobalData getGlobalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.mGlobalData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFInputData{mData=" + this.mData + ", mFlowData=" + this.mFlowData + ", mGlobalData=" + this.mGlobalData + '}';
    }
}
