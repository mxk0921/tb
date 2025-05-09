package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class E {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static CcrcDetectResult a(String str, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcDetectResult) ipChange.ipc$dispatch("6a501945", new Object[]{str, sampleData});
        }
        String str2 = null;
        String str3 = sampleData != null ? sampleData.sampleId : null;
        if (sampleData != null) {
            str2 = sampleData.metaId;
        }
        CcrcDetectResult ccrcDetectResult = new CcrcDetectResult(str3, str2, false, false, str, null, null);
        if (sampleData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("extras", sampleData.extras);
            ccrcDetectResult.setAlgoResults(hashMap);
        }
        return ccrcDetectResult;
    }

    public static CcrcDetectResult a(String str, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcDetectResult) ipChange.ipc$dispatch("8bd4cddf", new Object[]{str, cCRCRiskSample});
        }
        CcrcDetectResult ccrcDetectResult = new CcrcDetectResult(cCRCRiskSample.getSampleID(), cCRCRiskSample.getMetaId(), false, false, str, null, null);
        HashMap hashMap = new HashMap();
        hashMap.put("extras", cCRCRiskSample.getExtras());
        ccrcDetectResult.setAlgoResults(hashMap);
        return ccrcDetectResult;
    }

    public static RiskShowCustomizedResult a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RiskShowCustomizedResult) ipChange.ipc$dispatch("fb8913f", new Object[]{str}) : new RiskShowCustomizedResult(false, true, str);
    }

    public static CcrcDetectResult a(SampleData sampleData, boolean z, List<Label> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcDetectResult) ipChange.ipc$dispatch("7b619a2f", new Object[]{sampleData, new Boolean(z), list, map});
        }
        return new CcrcDetectResult(sampleData != null ? sampleData.sampleId : null, sampleData != null ? sampleData.metaId : null, z, true, null, list, map);
    }
}
