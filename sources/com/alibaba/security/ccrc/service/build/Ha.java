package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ha implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CCRCRiskSample f2556a;
    public final /* synthetic */ CcrcService.Config b;
    public final /* synthetic */ Ja c;

    public Ha(Ja ja, CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        this.c = ja;
        this.f2556a = cCRCRiskSample;
        this.b = config;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Ja ja = this.c;
        if (Ja.$ipChange.a()) {
            Ja.a(this.c, this.f2556a, this.b);
        }
    }
}
