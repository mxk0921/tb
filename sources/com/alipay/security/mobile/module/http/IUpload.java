package com.alipay.security.mobile.module.http;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IUpload {
    boolean logCollect(String str);

    DataReportResult updateStaticData(DataReportRequest dataReportRequest);

    int uploadRiskData(ReportPbRequest reportPbRequest);
}
