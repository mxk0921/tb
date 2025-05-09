package com.alipay.security.mobile.module.http.v2;

import com.alipay.security.mobile.module.http.model.DeviceDataReponseModel;
import com.alipay.security.mobile.module.http.model.DeviceDataRequestModel;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IUploadV2 {
    boolean logCollect(String str);

    DeviceDataReponseModel updateStaticData(DeviceDataRequestModel deviceDataRequestModel);

    int uploadRiskData(ReportPbRequest reportPbRequest);
}
