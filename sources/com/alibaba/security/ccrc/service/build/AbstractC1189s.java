package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.ccrc.service.model.AbsWukongRiskResult;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.s  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface AbstractC1189s {
    void a(CcrcService.Config config);

    void a(CcrcService.Config config, WukongActivateRiskResult wukongActivateRiskResult, Map<String, Object> map, long j, I i);

    void a(CcrcService.Config config, SampleData sampleData, String str);

    void a(CcrcService.Config config, InferContext inferContext);

    void a(CcrcService.Config config, InferContext inferContext, String str, WukongResultCode wukongResultCode);

    void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, String str);

    void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, boolean z, String str);

    void a(CcrcService.Config config, String str);

    void a(InferContext inferContext, AbsWukongActionRiskResult absWukongActionRiskResult);

    void a(InferContext inferContext, AbsWukongRiskResult absWukongRiskResult);

    void a(String str, String str2);

    void a(String str, String str2, boolean z, String str3, long j);
}
