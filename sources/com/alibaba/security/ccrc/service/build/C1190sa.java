package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.wukong.AlgoResultReporter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.sa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1190sa implements AbstractC1170j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2620a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AlgoResultReporter c;

    public C1190sa(AlgoResultReporter algoResultReporter, String str, String str2) {
        this.c = algoResultReporter;
        this.f2620a = str;
        this.b = str2;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
        } else {
            AlgoResultReporter.access$200(this.c, true, this.f2620a, this.b, obj, null);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
        } else {
            AlgoResultReporter.access$200(this.c, false, this.f2620a, this.b, null, str2);
        }
    }
}
