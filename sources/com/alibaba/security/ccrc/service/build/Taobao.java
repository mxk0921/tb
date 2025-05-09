package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.a  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Taobao implements AbstractC1170j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2579a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C1146b c;

    public Taobao(C1146b bVar, String str, String str2) {
        this.c = bVar;
        this.f2579a = str;
        this.b = str2;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
        } else {
            C1146b.a(this.c, true, obj, null, this.f2579a, this.b);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
        } else {
            C1146b.a(this.c, false, null, str2, this.f2579a, this.b);
        }
    }
}
