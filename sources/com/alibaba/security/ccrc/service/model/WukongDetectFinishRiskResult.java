package com.alibaba.security.ccrc.service.model;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongDetectFinishRiskResult extends AbsWukongRiskResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String metaId;
    public String sampleID;
    public WukongResultCode wuKongResultCode;

    public static WukongDetectFinishRiskResult createFinishResult(String str, SampleData sampleData, CcrcService.Config config, String str2, WukongResultCode wukongResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongDetectFinishRiskResult) ipChange.ipc$dispatch("4cba1f58", new Object[]{str, sampleData, config, str2, wukongResultCode});
        }
        WukongDetectFinishRiskResult wukongDetectFinishRiskResult = new WukongDetectFinishRiskResult();
        wukongDetectFinishRiskResult.metaId = sampleData.metaId;
        wukongDetectFinishRiskResult.sampleID = sampleData.sampleId;
        wukongDetectFinishRiskResult.pid = config.getPid();
        wukongDetectFinishRiskResult.ccrcCode = str;
        wukongDetectFinishRiskResult.errorMsg = str2;
        wukongDetectFinishRiskResult.wuKongResultCode = wukongResultCode;
        return wukongDetectFinishRiskResult;
    }

    public static /* synthetic */ Object ipc$super(WukongDetectFinishRiskResult wukongDetectFinishRiskResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/model/WukongDetectFinishRiskResult");
    }

    public static WukongDetectFinishRiskResult createFinishResult(String str, CCRCRiskSample cCRCRiskSample, CcrcService.Config config, String str2, WukongResultCode wukongResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongDetectFinishRiskResult) ipChange.ipc$dispatch("bbce76b2", new Object[]{str, cCRCRiskSample, config, str2, wukongResultCode});
        }
        WukongDetectFinishRiskResult wukongDetectFinishRiskResult = new WukongDetectFinishRiskResult();
        wukongDetectFinishRiskResult.metaId = cCRCRiskSample.getMetaId();
        wukongDetectFinishRiskResult.sampleID = cCRCRiskSample.getSampleID();
        wukongDetectFinishRiskResult.pid = config.getPid();
        wukongDetectFinishRiskResult.ccrcCode = str;
        wukongDetectFinishRiskResult.errorMsg = str2;
        wukongDetectFinishRiskResult.wuKongResultCode = wukongResultCode;
        return wukongDetectFinishRiskResult;
    }
}
