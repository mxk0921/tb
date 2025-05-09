package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.f  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1158f implements AbstractC1170j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2588a = "HttpCallbackWrapper";
    public final AbstractC1170j b;

    public C1158f(AbstractC1170j jVar) {
        this.b = jVar;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
            return;
        }
        AbstractC1170j jVar = this.b;
        if (jVar != null) {
            jVar.a(baseRequest, obj);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1170j
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        AbstractC1170j jVar = this.b;
        if (jVar != null) {
            jVar.a(baseRequest, str, str2);
        }
    }
}
