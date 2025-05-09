package com.alibaba.security.client.smart.core.algo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ClientAlgoResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String algoCode;
    @JSONField(serialize = false)
    public final SampleData mSampleData;
    public Object result;

    public ClientAlgoResult(String str, Object obj, SampleData sampleData) {
        this.algoCode = str;
        this.result = obj;
        this.mSampleData = sampleData;
    }

    public static ClientAlgoResult obtain(String str, Object obj, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientAlgoResult) ipChange.ipc$dispatch("b3c0b897", new Object[]{str, obj, cCRCRiskSample});
        }
        return new ClientAlgoResult(str, obj, SampleData.transform(cCRCRiskSample));
    }

    public Map<?, ?> convertMapResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b42ec122", new Object[]{this});
        }
        return JsonUtils.toMap(this.result);
    }
}
