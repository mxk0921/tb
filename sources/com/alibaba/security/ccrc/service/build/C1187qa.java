package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.model.WukongRiskUploadResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.report.NativeRiskReporter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.qa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1187qa implements AbstractC1170j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f2616a;
    public final /* synthetic */ InferContext b;
    public final /* synthetic */ C1185pa c;
    public final /* synthetic */ List d;
    public final /* synthetic */ String e;

    public C1187qa(long j, InferContext inferContext, C1185pa paVar, List list, String str) {
        this.f2616a = j;
        this.b = inferContext;
        this.c = paVar;
        this.d = list;
        this.e = str;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f2616a;
        NativeRiskReporter.performRiskUploadCallback(true, WukongRiskUploadResult.WukongUploadType.WukongRiskUploadTypeAsync, this.b, this.c, this.d, "");
        NativeRiskReporter.reportRiskEnd(this.b, this.e, true, obj, null, "async", currentTimeMillis);
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        NativeRiskReporter.performRiskUploadCallback(false, WukongRiskUploadResult.WukongUploadType.WukongRiskUploadTypeAsync, this.b, this.c, this.d, str2);
        NativeRiskReporter.reportRiskEnd(this.b, this.e, false, null, str2, "async", System.currentTimeMillis() - this.f2616a);
    }
}
