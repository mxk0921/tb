package com.alibaba.security.ccrc.service.build;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class O implements L {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WVCallBackContext f2565a;
    public final /* synthetic */ P b;

    public O(P p, WVCallBackContext wVCallBackContext) {
        this.b = p;
        this.f2565a = wVCallBackContext;
    }

    @Override // com.alibaba.security.ccrc.service.build.L
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f2565a;
        P p = this.b;
        wVCallBackContext.error(P.$ipChange);
    }

    @Override // com.alibaba.security.ccrc.service.build.L
    public void onSuccess(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f2565a;
        P p = this.b;
        wVCallBackContext.success(P.$ipChange);
    }
}
