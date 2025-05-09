package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.wa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1198wa implements AbstractC1170j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f2632a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ AbstractC1145ab d;
    public final /* synthetic */ C1200xa e;

    public C1198wa(C1200xa xaVar, long j, String str, boolean z, AbstractC1145ab abVar) {
        this.e = xaVar;
        this.f2632a = j;
        this.b = str;
        this.c = z;
        this.d = abVar;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
        } else {
            C1200xa.a(this.e, obj, this.b, C1200xa.$ipChange, System.currentTimeMillis() - this.f2632a, this.c, this.d);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        C1200xa xaVar = this.e;
        String str3 = this.b;
        String str4 = C1200xa.$ipChange;
        C1200xa.a(xaVar, str3, str4, false, null, "biz callback fail: " + str2, System.currentTimeMillis() - this.f2632a, null, this.c, null);
        this.d.a(false, str2, null);
    }
}
